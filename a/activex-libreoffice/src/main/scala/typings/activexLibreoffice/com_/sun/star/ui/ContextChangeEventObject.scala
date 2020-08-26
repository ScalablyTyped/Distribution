package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextChangeEventObject extends EventObject {
  /** Return the name of the application. */
  var ApplicationName: String = js.native
  /** Return the application specific context name. */
  var ContextName: String = js.native
}

object ContextChangeEventObject {
  @scala.inline
  def apply(ApplicationName: String, ContextName: String, Source: XInterface): ContextChangeEventObject = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], ContextName = ContextName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextChangeEventObject]
  }
  @scala.inline
  implicit class ContextChangeEventObjectOps[Self <: ContextChangeEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationName(value: String): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextName(value: String): Self = this.set("ContextName", value.asInstanceOf[js.Any])
  }
  
}


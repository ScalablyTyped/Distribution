package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is invoked in case of fired database exception triggered by a database object. */
@js.native
trait SQLErrorEvent extends EventObject {
  
  /** contains the exception that is going to be fired. */
  var Reason: js.Any = js.native
}
object SQLErrorEvent {
  
  @scala.inline
  def apply(Reason: js.Any, Source: XInterface): SQLErrorEvent = {
    val __obj = js.Dynamic.literal(Reason = Reason.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLErrorEvent]
  }
  
  @scala.inline
  implicit class SQLErrorEventOps[Self <: SQLErrorEvent] (val x: Self) extends AnyVal {
    
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
    def setReason(value: js.Any): Self = this.set("Reason", value.asInstanceOf[js.Any])
  }
}

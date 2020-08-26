package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Is used for interaction handle in case password protected modules exceed the size that can be stored in OpenOffice 2.x, 1.x formats */
@js.native
trait ModuleSizeExceededRequest extends Exception {
  /** The name of the modules that exceed size that can be stored */
  var Names: SafeArray[String] = js.native
}

object ModuleSizeExceededRequest {
  @scala.inline
  def apply(Context: XInterface, Message: String, Names: SafeArray[String]): ModuleSizeExceededRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSizeExceededRequest]
  }
  @scala.inline
  implicit class ModuleSizeExceededRequestOps[Self <: ModuleSizeExceededRequest] (val x: Self) extends AnyVal {
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
    def setNames(value: SafeArray[String]): Self = this.set("Names", value.asInstanceOf[js.Any])
  }
  
}


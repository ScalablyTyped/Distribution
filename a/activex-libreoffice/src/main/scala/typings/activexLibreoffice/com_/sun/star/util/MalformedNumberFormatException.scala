package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is thrown when a {@link NumberFormat} string is syntactically incorrect. */
@js.native
trait MalformedNumberFormatException extends Exception {
  
  /** contains the character position in the string where the malformation begins. */
  var CheckPos: Double = js.native
}
object MalformedNumberFormatException {
  
  @scala.inline
  def apply(CheckPos: Double, Context: XInterface, Message: String): MalformedNumberFormatException = {
    val __obj = js.Dynamic.literal(CheckPos = CheckPos.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MalformedNumberFormatException]
  }
  
  @scala.inline
  implicit class MalformedNumberFormatExceptionOps[Self <: MalformedNumberFormatException] (val x: Self) extends AnyVal {
    
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
    def setCheckPos(value: Double): Self = this.set("CheckPos", value.asInstanceOf[js.Any])
  }
}

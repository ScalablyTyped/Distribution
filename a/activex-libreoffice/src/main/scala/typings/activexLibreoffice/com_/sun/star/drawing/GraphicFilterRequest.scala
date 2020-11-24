package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a general error graphic filter exception. It can be used to transport the error code information. E.g. that can be useful for interactions.
  * @since OOo 3.0
  */
@js.native
trait GraphicFilterRequest extends Exception {
  
  /** specifies the error code. */
  var ErrCode: Double = js.native
}
object GraphicFilterRequest {
  
  @scala.inline
  def apply(Context: XInterface, ErrCode: Double, Message: String): GraphicFilterRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrCode = ErrCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicFilterRequest]
  }
  
  @scala.inline
  implicit class GraphicFilterRequestOps[Self <: GraphicFilterRequest] (val x: Self) extends AnyVal {
    
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
    def setErrCode(value: Double): Self = this.set("ErrCode", value.asInstanceOf[js.Any])
  }
}

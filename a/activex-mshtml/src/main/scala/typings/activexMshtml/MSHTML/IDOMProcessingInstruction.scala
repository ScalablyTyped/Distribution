package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDOMProcessingInstruction extends StObject {
  
  @JSName("MSHTML.IDOMProcessingInstruction_typekey")
  var MSHTMLDotIDOMProcessingInstruction_typekey: IDOMProcessingInstruction = js.native
  
  var data: String = js.native
  
  val target: String = js.native
}
object IDOMProcessingInstruction {
  
  @scala.inline
  def apply(
    MSHTMLDotIDOMProcessingInstruction_typekey: IDOMProcessingInstruction,
    data: String,
    target: String
  ): IDOMProcessingInstruction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMProcessingInstruction_typekey")(MSHTMLDotIDOMProcessingInstruction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMProcessingInstruction]
  }
  
  @scala.inline
  implicit class IDOMProcessingInstructionMutableBuilder[Self <: IDOMProcessingInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIDOMProcessingInstruction_typekey(value: IDOMProcessingInstruction): Self = StObject.set(x, "MSHTML.IDOMProcessingInstruction_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}

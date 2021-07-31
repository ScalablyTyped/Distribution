package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnSingle extends StObject {
  
  @JSName("MSForms.ReturnSingle_typekey")
  var MSFormsDotReturnSingle_typekey: ReturnSingle
  
  var Value: Double
}
object ReturnSingle {
  
  @scala.inline
  def apply(MSFormsDotReturnSingle_typekey: ReturnSingle, Value: Double): ReturnSingle = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnSingle_typekey")(MSFormsDotReturnSingle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnSingle]
  }
  
  @scala.inline
  implicit class ReturnSingleMutableBuilder[Self <: ReturnSingle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSFormsDotReturnSingle_typekey(value: ReturnSingle): Self = StObject.set(x, "MSForms.ReturnSingle_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}

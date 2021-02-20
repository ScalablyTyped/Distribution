package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnEffect extends StObject {
  
  @JSName("MSForms.ReturnEffect_typekey")
  var MSFormsDotReturnEffect_typekey: ReturnEffect = js.native
  
  var Value: fmDropEffect = js.native
}
object ReturnEffect {
  
  @scala.inline
  def apply(MSFormsDotReturnEffect_typekey: ReturnEffect, Value: fmDropEffect): ReturnEffect = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnEffect_typekey")(MSFormsDotReturnEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnEffect]
  }
  
  @scala.inline
  implicit class ReturnEffectMutableBuilder[Self <: ReturnEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSFormsDotReturnEffect_typekey(value: ReturnEffect): Self = StObject.set(x, "MSForms.ReturnEffect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: fmDropEffect): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}

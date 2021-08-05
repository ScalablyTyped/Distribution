package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnEffect extends StObject {
  
  /* private */ @JSName("MSForms.ReturnEffect_typekey")
  var MSFormsDotReturnEffect_typekey: ReturnEffect
  
  var Value: fmDropEffect
}
object ReturnEffect {
  
  inline def apply(MSFormsDotReturnEffect_typekey: ReturnEffect, Value: fmDropEffect): ReturnEffect = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnEffect_typekey")(MSFormsDotReturnEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnEffect]
  }
  
  extension [Self <: ReturnEffect](x: Self) {
    
    inline def setMSFormsDotReturnEffect_typekey(value: ReturnEffect): Self = StObject.set(x, "MSForms.ReturnEffect_typekey", value.asInstanceOf[js.Any])
    
    inline def setValue(value: fmDropEffect): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}

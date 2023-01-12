package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterNameValue extends StObject {
  
  /**
    * The name of the parameter
    */
  var ParameterName: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the parameter
    */
  var ParameterValue: js.UndefOr[String] = js.undefined
}
object ParameterNameValue {
  
  inline def apply(): ParameterNameValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterNameValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterNameValue] (val x: Self) extends AnyVal {
    
    inline def setParameterName(value: String): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
    
    inline def setParameterValue(value: String): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
    
    inline def setParameterValueUndefined: Self = StObject.set(x, "ParameterValue", js.undefined)
  }
}

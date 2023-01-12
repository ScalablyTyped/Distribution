package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimumEngineVersionPerAllowedValue extends StObject {
  
  /**
    * The allowed value for an option setting.
    */
  var AllowedValue: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum DB engine version required for the allowed value.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.undefined
}
object MinimumEngineVersionPerAllowedValue {
  
  inline def apply(): MinimumEngineVersionPerAllowedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumEngineVersionPerAllowedValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinimumEngineVersionPerAllowedValue] (val x: Self) extends AnyVal {
    
    inline def setAllowedValue(value: String): Self = StObject.set(x, "AllowedValue", value.asInstanceOf[js.Any])
    
    inline def setAllowedValueUndefined: Self = StObject.set(x, "AllowedValue", js.undefined)
    
    inline def setMinimumEngineVersion(value: String): Self = StObject.set(x, "MinimumEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumEngineVersionUndefined: Self = StObject.set(x, "MinimumEngineVersion", js.undefined)
  }
}

package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAdditionalInfo extends StObject {
  
  /**
    * Describes the type of the additional information.
    */
  var Type: js.UndefOr[String] = js.undefined
  
  /**
    * This field specifies the value of the additional information.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object ServiceAdditionalInfo {
  
  inline def apply(): ServiceAdditionalInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAdditionalInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceAdditionalInfo] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}

package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectorAdditionalConfigurationResult extends StObject {
  
  /**
    * Name of the additional configuration.
    */
  var Name: js.UndefOr[FeatureAdditionalConfiguration] = js.undefined
  
  /**
    * Status of the additional configuration.
    */
  var Status: js.UndefOr[FeatureStatus] = js.undefined
  
  /**
    * The timestamp at which the additional configuration was last updated. This is in UTC format.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object DetectorAdditionalConfigurationResult {
  
  inline def apply(): DetectorAdditionalConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorAdditionalConfigurationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectorAdditionalConfigurationResult] (val x: Self) extends AnyVal {
    
    inline def setName(value: FeatureAdditionalConfiguration): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: FeatureStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}

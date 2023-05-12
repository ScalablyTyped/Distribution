package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAutomatedDiscoveryConfigurationResponse extends StObject {
  
  /**
    * The unique identifier for the classification scope that's used when performing automated sensitive data discovery for the account. The classification scope specifies S3 buckets to exclude from automated sensitive data discovery.
    */
  var classificationScopeId: js.UndefOr[ClassificationScopeId] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most recently disabled for the account. This value is null if automated sensitive data discovery wasn't enabled and subsequently disabled for the account.
    */
  var disabledAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was initially enabled for the account. This value is null if automated sensitive data discovery has never been enabled for the account.
    */
  var firstEnabledAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most recently enabled or disabled for the account.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier for the sensitivity inspection template that's used when performing automated sensitive data discovery for the account. The template specifies which allow lists, custom data identifiers, and managed data identifiers to use when analyzing data.
    */
  var sensitivityInspectionTemplateId: js.UndefOr[SensitivityInspectionTemplateId] = js.undefined
  
  /**
    * The current status of the automated sensitive data discovery configuration for the account. Possible values are: ENABLED, use the specified settings to perform automated sensitive data discovery activities for the account; and, DISABLED, don't perform automated sensitive data discovery activities for the account.
    */
  var status: js.UndefOr[AutomatedDiscoveryStatus] = js.undefined
}
object GetAutomatedDiscoveryConfigurationResponse {
  
  inline def apply(): GetAutomatedDiscoveryConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutomatedDiscoveryConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAutomatedDiscoveryConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setClassificationScopeId(value: ClassificationScopeId): Self = StObject.set(x, "classificationScopeId", value.asInstanceOf[js.Any])
    
    inline def setClassificationScopeIdUndefined: Self = StObject.set(x, "classificationScopeId", js.undefined)
    
    inline def setDisabledAt(value: js.Date): Self = StObject.set(x, "disabledAt", value.asInstanceOf[js.Any])
    
    inline def setDisabledAtUndefined: Self = StObject.set(x, "disabledAt", js.undefined)
    
    inline def setFirstEnabledAt(value: js.Date): Self = StObject.set(x, "firstEnabledAt", value.asInstanceOf[js.Any])
    
    inline def setFirstEnabledAtUndefined: Self = StObject.set(x, "firstEnabledAt", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setSensitivityInspectionTemplateId(value: SensitivityInspectionTemplateId): Self = StObject.set(x, "sensitivityInspectionTemplateId", value.asInstanceOf[js.Any])
    
    inline def setSensitivityInspectionTemplateIdUndefined: Self = StObject.set(x, "sensitivityInspectionTemplateId", js.undefined)
    
    inline def setStatus(value: AutomatedDiscoveryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDetectorResponse extends StObject {
  
  /**
    * The timestamp of when the detector was created.
    */
  var CreatedAt: js.UndefOr[String] = js.undefined
  
  /**
    * Describes which data sources are enabled for the detector.
    */
  var DataSources: js.UndefOr[DataSourceConfigurationsResult] = js.undefined
  
  /**
    * The publishing frequency of the finding.
    */
  var FindingPublishingFrequency: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.FindingPublishingFrequency] = js.undefined
  
  /**
    * The GuardDuty service role.
    */
  var ServiceRole: String
  
  /**
    * The detector status.
    */
  var Status: DetectorStatus
  
  /**
    * The tags of the detector resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The last-updated timestamp for the detector.
    */
  var UpdatedAt: js.UndefOr[String] = js.undefined
}
object GetDetectorResponse {
  
  inline def apply(ServiceRole: String, Status: DetectorStatus): GetDetectorResponse = {
    val __obj = js.Dynamic.literal(ServiceRole = ServiceRole.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDetectorResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDataSources(value: DataSourceConfigurationsResult): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    inline def setFindingPublishingFrequency(value: FindingPublishingFrequency): Self = StObject.set(x, "FindingPublishingFrequency", value.asInstanceOf[js.Any])
    
    inline def setFindingPublishingFrequencyUndefined: Self = StObject.set(x, "FindingPublishingFrequency", js.undefined)
    
    inline def setServiceRole(value: String): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DetectorStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUpdatedAt(value: String): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}

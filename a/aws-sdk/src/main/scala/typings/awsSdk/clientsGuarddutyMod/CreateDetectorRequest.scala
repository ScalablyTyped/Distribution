package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDetectorRequest extends StObject {
  
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.ClientToken] = js.undefined
  
  /**
    * Describes which data sources will be enabled for the detector. There might be regional differences because some data sources might not be available in all the Amazon Web Services Regions where GuardDuty is presently supported. For more information, see Regions and endpoints.
    */
  var DataSources: js.UndefOr[DataSourceConfigurations] = js.undefined
  
  /**
    * A Boolean value that specifies whether the detector is to be enabled.
    */
  var Enable: Boolean
  
  /**
    * A list of features that will be configured for the detector.
    */
  var Features: js.UndefOr[DetectorFeatureConfigurations] = js.undefined
  
  /**
    * A value that specifies how frequently updated findings are exported.
    */
  var FindingPublishingFrequency: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.FindingPublishingFrequency] = js.undefined
  
  /**
    * The tags to be added to a new detector resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateDetectorRequest {
  
  inline def apply(Enable: Boolean): CreateDetectorRequest = {
    val __obj = js.Dynamic.literal(Enable = Enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDetectorRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDataSources(value: DataSourceConfigurations): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "Enable", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: DetectorFeatureConfigurations): Self = StObject.set(x, "Features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "Features", js.undefined)
    
    inline def setFeaturesVarargs(value: DetectorFeatureConfiguration*): Self = StObject.set(x, "Features", js.Array(value*))
    
    inline def setFindingPublishingFrequency(value: FindingPublishingFrequency): Self = StObject.set(x, "FindingPublishingFrequency", value.asInstanceOf[js.Any])
    
    inline def setFindingPublishingFrequencyUndefined: Self = StObject.set(x, "FindingPublishingFrequency", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}

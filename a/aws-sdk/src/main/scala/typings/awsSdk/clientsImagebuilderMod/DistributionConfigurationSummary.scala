package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionConfigurationSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * The date on which the distribution configuration was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The date on which the distribution configuration was updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The description of the distribution configuration.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the distribution configuration.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * A list of Regions where the container image is distributed to.
    */
  var regions: js.UndefOr[RegionList] = js.undefined
  
  /**
    * The tags associated with the distribution configuration.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object DistributionConfigurationSummary {
  
  inline def apply(): DistributionConfigurationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionConfigurationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistributionConfigurationSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setDateUpdated(value: DateTime): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegions(value: RegionList): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "regions", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}

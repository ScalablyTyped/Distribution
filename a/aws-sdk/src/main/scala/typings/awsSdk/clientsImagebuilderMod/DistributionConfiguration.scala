package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * The date on which this distribution configuration was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The date on which this distribution configuration was last updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The description of the distribution configuration.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The distribution objects that apply Region-specific settings for the deployment of the image to targeted Regions.
    */
  var distributions: js.UndefOr[DistributionList] = js.undefined
  
  /**
    * The name of the distribution configuration.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The tags of the distribution configuration.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The maximum duration in minutes for this distribution configuration.
    */
  var timeoutMinutes: DistributionTimeoutMinutes
}
object DistributionConfiguration {
  
  inline def apply(timeoutMinutes: DistributionTimeoutMinutes): DistributionConfiguration = {
    val __obj = js.Dynamic.literal(timeoutMinutes = timeoutMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistributionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setDateUpdated(value: DateTime): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDistributions(value: DistributionList): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    inline def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
    
    inline def setDistributionsVarargs(value: Distribution*): Self = StObject.set(x, "distributions", js.Array(value*))
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTimeoutMinutes(value: DistributionTimeoutMinutes): Self = StObject.set(x, "timeoutMinutes", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageRecipe extends StObject {
  
  /**
    * Before you create a new AMI, Image Builder launches temporary Amazon EC2 instances to build and test your image configuration. Instance configuration adds a layer of control over those instances. You can define settings and add scripts to run when an instance is launched from your AMI.
    */
  var additionalInstanceConfiguration: js.UndefOr[AdditionalInstanceConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * The block device mappings to apply when creating images from this recipe.
    */
  var blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappings] = js.undefined
  
  /**
    * The components that are included in the image recipe. Recipes require a minimum of one build component, and can have a maximum of 20 build and test components in any combination.
    */
  var components: js.UndefOr[ComponentConfigurationList] = js.undefined
  
  /**
    * The date on which this image recipe was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The description of the image recipe.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the image recipe.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The owner of the image recipe.
    */
  var owner: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The base image of the image recipe.
    */
  var parentImage: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The platform of the image recipe.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * The tags of the image recipe.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Specifies which type of image is created by the recipe - an AMI or a container image.
    */
  var `type`: js.UndefOr[ImageType] = js.undefined
  
  /**
    * The version of the image recipe.
    */
  var version: js.UndefOr[VersionNumber] = js.undefined
  
  /**
    * The working directory to be used during build and test workflows.
    */
  var workingDirectory: js.UndefOr[NonEmptyString] = js.undefined
}
object ImageRecipe {
  
  inline def apply(): ImageRecipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageRecipe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageRecipe] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInstanceConfiguration(value: AdditionalInstanceConfiguration): Self = StObject.set(x, "additionalInstanceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInstanceConfigurationUndefined: Self = StObject.set(x, "additionalInstanceConfiguration", js.undefined)
    
    inline def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setBlockDeviceMappings(value: InstanceBlockDeviceMappings): Self = StObject.set(x, "blockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "blockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: InstanceBlockDeviceMapping*): Self = StObject.set(x, "blockDeviceMappings", js.Array(value*))
    
    inline def setComponents(value: ComponentConfigurationList): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: ComponentConfiguration*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: NonEmptyString): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setParentImage(value: NonEmptyString): Self = StObject.set(x, "parentImage", value.asInstanceOf[js.Any])
    
    inline def setParentImageUndefined: Self = StObject.set(x, "parentImage", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: ImageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWorkingDirectory(value: NonEmptyString): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}

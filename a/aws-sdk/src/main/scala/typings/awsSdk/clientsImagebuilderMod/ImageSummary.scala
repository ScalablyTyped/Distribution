package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * Indicates the type of build that created this image. The build can be initiated in the following ways:    USER_INITIATED – A manual pipeline build request.    SCHEDULED – A pipeline build initiated by a cron expression in the Image Builder pipeline, or from EventBridge.    IMPORT – A VM import created the image to use as the base image for the recipe.  
    */
  var buildType: js.UndefOr[BuildType] = js.undefined
  
  /**
    * The date on which Image Builder created this image.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The origin of the base image that Image Builder used to build this image.
    */
  var imageSource: js.UndefOr[ImageSource] = js.undefined
  
  /**
    * The name of the image.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The operating system version of the instances that launch from this image. For example, Amazon Linux 2, Ubuntu 18, or Microsoft Windows Server 2019.
    */
  var osVersion: js.UndefOr[OsVersion] = js.undefined
  
  /**
    * The output resources that Image Builder produced when it created this image.
    */
  var outputResources: js.UndefOr[OutputResources] = js.undefined
  
  /**
    * The owner of the image.
    */
  var owner: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The image operating system platform, such as Linux or Windows.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * The state of the image.
    */
  var state: js.UndefOr[ImageState] = js.undefined
  
  /**
    * The tags that apply to this image.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Specifies whether this image produces an AMI or a container image.
    */
  var `type`: js.UndefOr[ImageType] = js.undefined
  
  /**
    * The version of the image.
    */
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object ImageSummary {
  
  inline def apply(): ImageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setBuildType(value: BuildType): Self = StObject.set(x, "buildType", value.asInstanceOf[js.Any])
    
    inline def setBuildTypeUndefined: Self = StObject.set(x, "buildType", js.undefined)
    
    inline def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setImageSource(value: ImageSource): Self = StObject.set(x, "imageSource", value.asInstanceOf[js.Any])
    
    inline def setImageSourceUndefined: Self = StObject.set(x, "imageSource", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOsVersion(value: OsVersion): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setOutputResources(value: OutputResources): Self = StObject.set(x, "outputResources", value.asInstanceOf[js.Any])
    
    inline def setOutputResourcesUndefined: Self = StObject.set(x, "outputResources", js.undefined)
    
    inline def setOwner(value: NonEmptyString): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setState(value: ImageState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: ImageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

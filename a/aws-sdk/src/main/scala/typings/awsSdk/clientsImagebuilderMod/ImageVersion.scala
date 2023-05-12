package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageVersion extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a specific version of an Image Builder image.  Semantic versioning is included in each object's Amazon Resource Name (ARN), at the level that applies to that object as follows:   Versionless ARNs and Name ARNs do not include specific values in any of the nodes. The nodes are either left off entirely, or they are specified as wildcards, for example: x.x.x.   Version ARNs have only the first three nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;   Build version ARNs have all four nodes, and point to a specific build for a specific version of an object.   
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * Indicates the type of build that created this image. The build can be initiated in the following ways:    USER_INITIATED – A manual pipeline build request.    SCHEDULED – A pipeline build initiated by a cron expression in the Image Builder pipeline, or from EventBridge.    IMPORT – A VM import created the image to use as the base image for the recipe.  
    */
  var buildType: js.UndefOr[BuildType] = js.undefined
  
  /**
    * The date on which this specific version of the Image Builder image was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The origin of the base image that Image Builder used to build this image.
    */
  var imageSource: js.UndefOr[ImageSource] = js.undefined
  
  /**
    * The name of this specific version of an Image Builder image.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The operating system version of the Amazon EC2 build instance. For example, Amazon Linux 2, Ubuntu 18, or Microsoft Windows Server 2019.
    */
  var osVersion: js.UndefOr[OsVersion] = js.undefined
  
  /**
    * The owner of the image version.
    */
  var owner: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The operating system platform of the image version, for example "Windows" or "Linux".
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * Specifies whether this image produces an AMI or a container image.
    */
  var `type`: js.UndefOr[ImageType] = js.undefined
  
  /**
    * Details for a specific version of an Image Builder image. This version follows the semantic version syntax.  The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign values for the first three, and can filter on all of them.  Assignment: For the first three nodes you can assign any positive integer value, including zero, with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build number to the fourth node.  Patterns: You can use any numeric pattern that adheres to the assignment requirements for the nodes that you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date, such as 2021.01.01.  Filtering: With semantic versioning, you have the flexibility to use wildcards (x) to specify the most recent versions or nodes when selecting the base image or components for your recipe. When you use a wildcard in any node, all nodes to the right of the first wildcard must also be wildcards. 
    */
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object ImageVersion {
  
  inline def apply(): ImageVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageVersion] (val x: Self) extends AnyVal {
    
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
    
    inline def setOwner(value: NonEmptyString): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setType(value: ImageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

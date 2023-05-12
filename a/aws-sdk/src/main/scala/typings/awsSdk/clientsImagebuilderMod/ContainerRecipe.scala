package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerRecipe extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the container recipe.  Semantic versioning is included in each object's Amazon Resource Name (ARN), at the level that applies to that object as follows:   Versionless ARNs and Name ARNs do not include specific values in any of the nodes. The nodes are either left off entirely, or they are specified as wildcards, for example: x.x.x.   Version ARNs have only the first three nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;   Build version ARNs have all four nodes, and point to a specific build for a specific version of an object.   
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * Build and test components that are included in the container recipe. Recipes require a minimum of one build component, and can have a maximum of 20 build and test components in any combination.
    */
  var components: js.UndefOr[ComponentConfigurationList] = js.undefined
  
  /**
    * Specifies the type of container, such as Docker.
    */
  var containerType: js.UndefOr[ContainerType] = js.undefined
  
  /**
    * The date when this container recipe was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The description of the container recipe.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Dockerfiles are text documents that are used to build Docker containers, and ensure that they contain all of the elements required by the application running inside. The template data consists of contextual variables where Image Builder places build information or scripts, based on your container image recipe.
    */
  var dockerfileTemplateData: js.UndefOr[DockerFileTemplate] = js.undefined
  
  /**
    * A flag that indicates if the target container is encrypted.
    */
  var encrypted: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * A group of options that can be used to configure an instance for building and testing container images.
    */
  var instanceConfiguration: js.UndefOr[InstanceConfiguration] = js.undefined
  
  /**
    * Identifies which KMS key is used to encrypt the container image for distribution to the target Region.
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the container recipe.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The owner of the container recipe.
    */
  var owner: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The base image for the container recipe.
    */
  var parentImage: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The system platform for the container, such as Windows or Linux.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * Tags that are attached to the container recipe.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The destination repository for the container image.
    */
  var targetRepository: js.UndefOr[TargetContainerRepository] = js.undefined
  
  /**
    * The semantic version of the container recipe.  The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign values for the first three, and can filter on all of them.  Assignment: For the first three nodes you can assign any positive integer value, including zero, with an upper limit of 2^30-1, or 1073741823 for each node. Image Builder automatically assigns the build number to the fourth node.  Patterns: You can use any numeric pattern that adheres to the assignment requirements for the nodes that you can assign. For example, you might choose a software version pattern, such as 1.0.0, or a date, such as 2021.01.01.  Filtering: With semantic versioning, you have the flexibility to use wildcards (x) to specify the most recent versions or nodes when selecting the base image or components for your recipe. When you use a wildcard in any node, all nodes to the right of the first wildcard must also be wildcards. 
    */
  var version: js.UndefOr[VersionNumber] = js.undefined
  
  /**
    * The working directory for use during build and test workflows.
    */
  var workingDirectory: js.UndefOr[NonEmptyString] = js.undefined
}
object ContainerRecipe {
  
  inline def apply(): ContainerRecipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerRecipe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerRecipe] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setComponents(value: ComponentConfigurationList): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: ComponentConfiguration*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setContainerType(value: ContainerType): Self = StObject.set(x, "containerType", value.asInstanceOf[js.Any])
    
    inline def setContainerTypeUndefined: Self = StObject.set(x, "containerType", js.undefined)
    
    inline def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDockerfileTemplateData(value: DockerFileTemplate): Self = StObject.set(x, "dockerfileTemplateData", value.asInstanceOf[js.Any])
    
    inline def setDockerfileTemplateDataUndefined: Self = StObject.set(x, "dockerfileTemplateData", js.undefined)
    
    inline def setEncrypted(value: NullableBoolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    inline def setInstanceConfiguration(value: InstanceConfiguration): Self = StObject.set(x, "instanceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInstanceConfigurationUndefined: Self = StObject.set(x, "instanceConfiguration", js.undefined)
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
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
    
    inline def setTargetRepository(value: TargetContainerRepository): Self = StObject.set(x, "targetRepository", value.asInstanceOf[js.Any])
    
    inline def setTargetRepositoryUndefined: Self = StObject.set(x, "targetRepository", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWorkingDirectory(value: NonEmptyString): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}

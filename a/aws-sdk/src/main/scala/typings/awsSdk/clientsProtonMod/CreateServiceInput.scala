package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceInput extends StObject {
  
  /**
    * The name of the code repository branch that holds the code that's deployed in Proton. Don't include this parameter if your service template doesn't include a service pipeline.
    */
  var branchName: js.UndefOr[GitBranchName] = js.undefined
  
  /**
    * A description of the Proton service.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The service name.
    */
  var name: ResourceName
  
  /**
    * The Amazon Resource Name (ARN) of the repository connection. For more information, see Setting up an AWS CodeStar connection in the Proton User Guide. Don't include this parameter if your service template doesn't include a service pipeline.
    */
  var repositoryConnectionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the code repository. Don't include this parameter if your service template doesn't include a service pipeline.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.undefined
  
  /**
    * A link to a spec file that provides inputs as defined in the service template bundle schema file. The spec file is in YAML format. Don’t include pipeline inputs in the spec if your service template doesn’t include a service pipeline. For more information, see Create a service in the Proton User Guide.
    */
  var spec: SpecContents
  
  /**
    * An optional list of metadata items that you can associate with the Proton service. A tag is a key-value pair. For more information, see Proton resources and tagging in the Proton User Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The major version of the service template that was used to create the service.
    */
  var templateMajorVersion: TemplateVersionPart
  
  /**
    * The minor version of the service template that was used to create the service.
    */
  var templateMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
  
  /**
    * The name of the service template that's used to create the service.
    */
  var templateName: ResourceName
}
object CreateServiceInput {
  
  inline def apply(
    name: ResourceName,
    spec: SpecContents,
    templateMajorVersion: TemplateVersionPart,
    templateName: ResourceName
  ): CreateServiceInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], templateMajorVersion = templateMajorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceInput]
  }
  
  extension [Self <: CreateServiceInput](x: Self) {
    
    inline def setBranchName(value: GitBranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRepositoryConnectionArn(value: Arn): Self = StObject.set(x, "repositoryConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setRepositoryConnectionArnUndefined: Self = StObject.set(x, "repositoryConnectionArn", js.undefined)
    
    inline def setRepositoryId(value: RepositoryId): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    inline def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
    
    inline def setSpec(value: SpecContents): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTemplateMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersionUndefined: Self = StObject.set(x, "templateMinorVersion", js.undefined)
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}

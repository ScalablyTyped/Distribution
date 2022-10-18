package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectRequest extends StObject {
  
  /**
    * A user- or system-generated token that identifies the entity that requested project creation. This token can be used to repeat the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * The description of the project, if any.
    */
  var description: js.UndefOr[ProjectDescription] = js.undefined
  
  /**
    * The ID of the project to be created in AWS CodeStar.
    */
  var id: ProjectId
  
  /**
    * The display name for the project to be created in AWS CodeStar.
    */
  var name: ProjectName
  
  /**
    * A list of the Code objects submitted with the project request. If this parameter is specified, the request must also include the toolchain parameter.
    */
  var sourceCode: js.UndefOr[SourceCode] = js.undefined
  
  /**
    * The tags created for the project.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The name of the toolchain template file submitted with the project request. If this parameter is specified, the request must also include the sourceCode parameter.
    */
  var toolchain: js.UndefOr[Toolchain] = js.undefined
}
object CreateProjectRequest {
  
  inline def apply(id: ProjectId, name: ProjectName): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  extension [Self <: CreateProjectRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setDescription(value: ProjectDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: ProjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSourceCode(value: SourceCode): Self = StObject.set(x, "sourceCode", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeUndefined: Self = StObject.set(x, "sourceCode", js.undefined)
    
    inline def setSourceCodeVarargs(value: Code*): Self = StObject.set(x, "sourceCode", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setToolchain(value: Toolchain): Self = StObject.set(x, "toolchain", value.asInstanceOf[js.Any])
    
    inline def setToolchainUndefined: Self = StObject.set(x, "toolchain", js.undefined)
  }
}

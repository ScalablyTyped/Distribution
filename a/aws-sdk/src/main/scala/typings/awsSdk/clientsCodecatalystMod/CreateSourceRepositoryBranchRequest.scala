package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSourceRepositoryBranchRequest extends StObject {
  
  /**
    * The commit ID in an existing branch from which you want to create the new branch.
    */
  var headCommitId: js.UndefOr[String] = js.undefined
  
  /**
    * The name for the branch you're creating.
    */
  var name: SourceRepositoryBranchString
  
  /**
    * The name of the project in the space.
    */
  var projectName: NameString
  
  /**
    * The name of the repository where you want to create a branch.
    */
  var sourceRepositoryName: SourceRepositoryNameString
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
}
object CreateSourceRepositoryBranchRequest {
  
  inline def apply(
    name: SourceRepositoryBranchString,
    projectName: NameString,
    sourceRepositoryName: SourceRepositoryNameString,
    spaceName: NameString
  ): CreateSourceRepositoryBranchRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], sourceRepositoryName = sourceRepositoryName.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSourceRepositoryBranchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSourceRepositoryBranchRequest] (val x: Self) extends AnyVal {
    
    inline def setHeadCommitId(value: String): Self = StObject.set(x, "headCommitId", value.asInstanceOf[js.Any])
    
    inline def setHeadCommitIdUndefined: Self = StObject.set(x, "headCommitId", js.undefined)
    
    inline def setName(value: SourceRepositoryBranchString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: NameString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setSourceRepositoryName(value: SourceRepositoryNameString): Self = StObject.set(x, "sourceRepositoryName", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}

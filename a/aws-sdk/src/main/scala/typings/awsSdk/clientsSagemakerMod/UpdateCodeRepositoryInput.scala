package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCodeRepositoryInput extends StObject {
  
  /**
    * The name of the Git repository to update.
    */
  var CodeRepositoryName: EntityName
  
  /**
    * The configuration of the git repository, including the URL and the Amazon Resource Name (ARN) of the Amazon Web Services Secrets Manager secret that contains the credentials used to access the repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
    */
  var GitConfig: js.UndefOr[GitConfigForUpdate] = js.undefined
}
object UpdateCodeRepositoryInput {
  
  inline def apply(CodeRepositoryName: EntityName): UpdateCodeRepositoryInput = {
    val __obj = js.Dynamic.literal(CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCodeRepositoryInput]
  }
  
  extension [Self <: UpdateCodeRepositoryInput](x: Self) {
    
    inline def setCodeRepositoryName(value: EntityName): Self = StObject.set(x, "CodeRepositoryName", value.asInstanceOf[js.Any])
    
    inline def setGitConfig(value: GitConfigForUpdate): Self = StObject.set(x, "GitConfig", value.asInstanceOf[js.Any])
    
    inline def setGitConfigUndefined: Self = StObject.set(x, "GitConfig", js.undefined)
  }
}

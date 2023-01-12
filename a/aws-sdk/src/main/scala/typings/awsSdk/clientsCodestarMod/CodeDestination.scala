package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeDestination extends StObject {
  
  /**
    * Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.
    */
  var codeCommit: js.UndefOr[CodeCommitCodeDestination] = js.undefined
  
  /**
    * Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.
    */
  var gitHub: js.UndefOr[GitHubCodeDestination] = js.undefined
}
object CodeDestination {
  
  inline def apply(): CodeDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeDestination] (val x: Self) extends AnyVal {
    
    inline def setCodeCommit(value: CodeCommitCodeDestination): Self = StObject.set(x, "codeCommit", value.asInstanceOf[js.Any])
    
    inline def setCodeCommitUndefined: Self = StObject.set(x, "codeCommit", js.undefined)
    
    inline def setGitHub(value: GitHubCodeDestination): Self = StObject.set(x, "gitHub", value.asInstanceOf[js.Any])
    
    inline def setGitHubUndefined: Self = StObject.set(x, "gitHub", js.undefined)
  }
}

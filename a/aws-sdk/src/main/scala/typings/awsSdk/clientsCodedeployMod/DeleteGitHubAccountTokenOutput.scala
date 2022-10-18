package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGitHubAccountTokenOutput extends StObject {
  
  /**
    * The name of the GitHub account connection that was deleted.
    */
  var tokenName: js.UndefOr[GitHubAccountTokenName] = js.undefined
}
object DeleteGitHubAccountTokenOutput {
  
  inline def apply(): DeleteGitHubAccountTokenOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGitHubAccountTokenOutput]
  }
  
  extension [Self <: DeleteGitHubAccountTokenOutput](x: Self) {
    
    inline def setTokenName(value: GitHubAccountTokenName): Self = StObject.set(x, "tokenName", value.asInstanceOf[js.Any])
    
    inline def setTokenNameUndefined: Self = StObject.set(x, "tokenName", js.undefined)
  }
}

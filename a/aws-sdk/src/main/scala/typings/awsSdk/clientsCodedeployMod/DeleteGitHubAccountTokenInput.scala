package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGitHubAccountTokenInput extends StObject {
  
  /**
    * The name of the GitHub account connection to delete.
    */
  var tokenName: js.UndefOr[GitHubAccountTokenName] = js.undefined
}
object DeleteGitHubAccountTokenInput {
  
  inline def apply(): DeleteGitHubAccountTokenInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGitHubAccountTokenInput]
  }
  
  extension [Self <: DeleteGitHubAccountTokenInput](x: Self) {
    
    inline def setTokenName(value: GitHubAccountTokenName): Self = StObject.set(x, "tokenName", value.asInstanceOf[js.Any])
    
    inline def setTokenNameUndefined: Self = StObject.set(x, "tokenName", js.undefined)
  }
}

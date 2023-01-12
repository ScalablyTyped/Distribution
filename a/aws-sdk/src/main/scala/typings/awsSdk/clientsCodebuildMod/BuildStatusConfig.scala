package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildStatusConfig extends StObject {
  
  /**
    * Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.  Bitbucket  This parameter is used for the name parameter in the Bitbucket commit status. For more information, see build in the Bitbucket API documentation.  GitHub/GitHub Enterprise Server  This parameter is used for the context parameter in the GitHub commit status. For more information, see Create a commit status in the GitHub developer guide.  
    */
  var context: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.  Bitbucket  This parameter is used for the url parameter in the Bitbucket commit status. For more information, see build in the Bitbucket API documentation.  GitHub/GitHub Enterprise Server  This parameter is used for the target_url parameter in the GitHub commit status. For more information, see Create a commit status in the GitHub developer guide.  
    */
  var targetUrl: js.UndefOr[String] = js.undefined
}
object BuildStatusConfig {
  
  inline def apply(): BuildStatusConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildStatusConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildStatusConfig] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setTargetUrl(value: String): Self = StObject.set(x, "targetUrl", value.asInstanceOf[js.Any])
    
    inline def setTargetUrlUndefined: Self = StObject.set(x, "targetUrl", js.undefined)
  }
}

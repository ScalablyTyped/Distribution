package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppSpecContent extends StObject {
  
  /**
    *  The YAML-formatted or JSON-formatted revision string.   For an Lambda deployment, the content includes a Lambda function name, the alias for its original version, and the alias for its replacement version. The deployment shifts traffic from the original version of the Lambda function to the replacement version.   For an Amazon ECS deployment, the content includes the task name, information about the load balancer that serves traffic to the container, and more.   For both types of deployments, the content can specify Lambda functions that run at specified hooks, such as BeforeInstall, during a deployment. 
    */
  var content: js.UndefOr[RawStringContent] = js.undefined
  
  /**
    *  The SHA256 hash value of the revision content. 
    */
  var sha256: js.UndefOr[RawStringSha256] = js.undefined
}
object AppSpecContent {
  
  inline def apply(): AppSpecContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppSpecContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppSpecContent] (val x: Self) extends AnyVal {
    
    inline def setContent(value: RawStringContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setSha256(value: RawStringSha256): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}

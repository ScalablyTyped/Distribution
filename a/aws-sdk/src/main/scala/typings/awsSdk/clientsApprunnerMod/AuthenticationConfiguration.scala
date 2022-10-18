package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants the App Runner service access to a source repository. It's required for ECR image repositories (but not for ECR Public repositories).
    */
  var AccessRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner connection that enables the App Runner service to connect to a source repository. It's required for GitHub code repositories.
    */
  var ConnectionArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
}
object AuthenticationConfiguration {
  
  inline def apply(): AuthenticationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationConfiguration]
  }
  
  extension [Self <: AuthenticationConfiguration](x: Self) {
    
    inline def setAccessRoleArn(value: RoleArn): Self = StObject.set(x, "AccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setAccessRoleArnUndefined: Self = StObject.set(x, "AccessRoleArn", js.undefined)
    
    inline def setConnectionArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setConnectionArnUndefined: Self = StObject.set(x, "ConnectionArn", js.undefined)
  }
}

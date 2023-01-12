package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentGroupsInput extends StObject {
  
  /**
    * The name of an CodeDeploy application associated with the IAM user or Amazon Web Services account.
    */
  var applicationName: ApplicationName
  
  /**
    * An identifier returned from the previous list deployment groups call. It can be used to return the next set of deployment groups in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDeploymentGroupsInput {
  
  inline def apply(applicationName: ApplicationName): ListDeploymentGroupsInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentGroupsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDeploymentGroupsInput] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

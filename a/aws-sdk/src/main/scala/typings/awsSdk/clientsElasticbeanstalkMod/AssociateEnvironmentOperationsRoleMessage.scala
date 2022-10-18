package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateEnvironmentOperationsRoleMessage extends StObject {
  
  /**
    * The name of the environment to which to set the operations role.
    */
  var EnvironmentName: typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentName
  
  /**
    * The Amazon Resource Name (ARN) of an existing IAM role to be used as the environment's operations role.
    */
  var OperationsRole: typings.awsSdk.clientsElasticbeanstalkMod.OperationsRole
}
object AssociateEnvironmentOperationsRoleMessage {
  
  inline def apply(EnvironmentName: EnvironmentName, OperationsRole: OperationsRole): AssociateEnvironmentOperationsRoleMessage = {
    val __obj = js.Dynamic.literal(EnvironmentName = EnvironmentName.asInstanceOf[js.Any], OperationsRole = OperationsRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateEnvironmentOperationsRoleMessage]
  }
  
  extension [Self <: AssociateEnvironmentOperationsRoleMessage](x: Self) {
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setOperationsRole(value: OperationsRole): Self = StObject.set(x, "OperationsRole", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateEnvironmentOperationsRoleMessage extends StObject {
  
  /**
    * The name of the environment from which to disassociate the operations role.
    */
  var EnvironmentName: typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentName
}
object DisassociateEnvironmentOperationsRoleMessage {
  
  inline def apply(EnvironmentName: EnvironmentName): DisassociateEnvironmentOperationsRoleMessage = {
    val __obj = js.Dynamic.literal(EnvironmentName = EnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateEnvironmentOperationsRoleMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateEnvironmentOperationsRoleMessage] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
  }
}

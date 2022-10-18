package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationMessage extends StObject {
  
  /**
    * The name of the application to delete.
    */
  var ApplicationName: typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName
  
  /**
    * When set to true, running environments will be terminated before deleting the application.
    */
  var TerminateEnvByForce: js.UndefOr[TerminateEnvForce] = js.undefined
}
object DeleteApplicationMessage {
  
  inline def apply(ApplicationName: ApplicationName): DeleteApplicationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationMessage]
  }
  
  extension [Self <: DeleteApplicationMessage](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setTerminateEnvByForce(value: TerminateEnvForce): Self = StObject.set(x, "TerminateEnvByForce", value.asInstanceOf[js.Any])
    
    inline def setTerminateEnvByForceUndefined: Self = StObject.set(x, "TerminateEnvByForce", js.undefined)
  }
}

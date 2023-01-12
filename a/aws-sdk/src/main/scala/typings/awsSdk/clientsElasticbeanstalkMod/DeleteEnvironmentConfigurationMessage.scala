package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentConfigurationMessage extends StObject {
  
  /**
    * The name of the application the environment is associated with.
    */
  var ApplicationName: typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName
  
  /**
    * The name of the environment to delete the draft configuration from.
    */
  var EnvironmentName: typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentName
}
object DeleteEnvironmentConfigurationMessage {
  
  inline def apply(ApplicationName: ApplicationName, EnvironmentName: EnvironmentName): DeleteEnvironmentConfigurationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], EnvironmentName = EnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentConfigurationMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEnvironmentConfigurationMessage] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
  }
}

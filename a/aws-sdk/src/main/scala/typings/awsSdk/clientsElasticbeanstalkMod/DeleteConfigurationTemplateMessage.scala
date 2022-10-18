package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationTemplateMessage extends StObject {
  
  /**
    * The name of the application to delete the configuration template from.
    */
  var ApplicationName: typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName
  
  /**
    * The name of the configuration template to delete.
    */
  var TemplateName: ConfigurationTemplateName
}
object DeleteConfigurationTemplateMessage {
  
  inline def apply(ApplicationName: ApplicationName, TemplateName: ConfigurationTemplateName): DeleteConfigurationTemplateMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationTemplateMessage]
  }
  
  extension [Self <: DeleteConfigurationTemplateMessage](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: ConfigurationTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}

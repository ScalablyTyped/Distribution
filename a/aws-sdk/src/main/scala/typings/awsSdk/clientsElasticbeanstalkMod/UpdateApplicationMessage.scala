package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationMessage extends StObject {
  
  /**
    * The name of the application to update. If no such application is found, UpdateApplication returns an InvalidParameterValue error. 
    */
  var ApplicationName: typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName
  
  /**
    * A new description for the application. Default: If not specified, AWS Elastic Beanstalk does not update the description.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.Description] = js.undefined
}
object UpdateApplicationMessage {
  
  inline def apply(ApplicationName: ApplicationName): UpdateApplicationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationMessage]
  }
  
  extension [Self <: UpdateApplicationMessage](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}

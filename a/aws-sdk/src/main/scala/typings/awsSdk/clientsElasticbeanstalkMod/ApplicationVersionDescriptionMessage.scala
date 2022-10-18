package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationVersionDescriptionMessage extends StObject {
  
  /**
    *  The ApplicationVersionDescription of the application version. 
    */
  var ApplicationVersion: js.UndefOr[ApplicationVersionDescription] = js.undefined
}
object ApplicationVersionDescriptionMessage {
  
  inline def apply(): ApplicationVersionDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVersionDescriptionMessage]
  }
  
  extension [Self <: ApplicationVersionDescriptionMessage](x: Self) {
    
    inline def setApplicationVersion(value: ApplicationVersionDescription): Self = StObject.set(x, "ApplicationVersion", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionUndefined: Self = StObject.set(x, "ApplicationVersion", js.undefined)
  }
}

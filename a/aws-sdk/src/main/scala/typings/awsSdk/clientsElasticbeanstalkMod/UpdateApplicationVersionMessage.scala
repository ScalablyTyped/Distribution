package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationVersionMessage extends StObject {
  
  /**
    * The name of the application associated with this version.  If no application is found with this name, UpdateApplication returns an InvalidParameterValue error.
    */
  var ApplicationName: typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName
  
  /**
    * A new description for this version.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.Description] = js.undefined
  
  /**
    * The name of the version to update. If no application version is found with this label, UpdateApplication returns an InvalidParameterValue error. 
    */
  var VersionLabel: typings.awsSdk.clientsElasticbeanstalkMod.VersionLabel
}
object UpdateApplicationVersionMessage {
  
  inline def apply(ApplicationName: ApplicationName, VersionLabel: VersionLabel): UpdateApplicationVersionMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], VersionLabel = VersionLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationVersionMessage]
  }
  
  extension [Self <: UpdateApplicationVersionMessage](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setVersionLabel(value: VersionLabel): Self = StObject.set(x, "VersionLabel", value.asInstanceOf[js.Any])
  }
}

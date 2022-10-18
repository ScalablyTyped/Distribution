package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationInput extends StObject {
  
  /**
    * The name of an CodeDeploy application associated with the IAM user or Amazon Web Services account.
    */
  var applicationName: ApplicationName
}
object GetApplicationInput {
  
  inline def apply(applicationName: ApplicationName): GetApplicationInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationInput]
  }
  
  extension [Self <: GetApplicationInput](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
  }
}

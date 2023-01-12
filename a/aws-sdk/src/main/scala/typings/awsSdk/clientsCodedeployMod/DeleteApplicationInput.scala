package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationInput extends StObject {
  
  /**
    * The name of an CodeDeploy application associated with the IAM user or Amazon Web Services account.
    */
  var applicationName: ApplicationName
}
object DeleteApplicationInput {
  
  inline def apply(applicationName: ApplicationName): DeleteApplicationInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteApplicationInput] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
  }
}

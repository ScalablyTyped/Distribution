package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentRequest extends StObject {
  
  /**
    * The ID of the environment. 
    */
  var EnvironmentIdentifier: EnvironmentId
}
object DeleteEnvironmentRequest {
  
  inline def apply(EnvironmentIdentifier: EnvironmentId): DeleteEnvironmentRequest = {
    val __obj = js.Dynamic.literal(EnvironmentIdentifier = EnvironmentIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEnvironmentRequest] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentIdentifier(value: EnvironmentId): Self = StObject.set(x, "EnvironmentIdentifier", value.asInstanceOf[js.Any])
  }
}

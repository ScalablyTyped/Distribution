package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentRequest extends StObject {
  
  /**
    * The ID of the environment.
    */
  var EnvironmentIdentifier: EnvironmentId
}
object GetEnvironmentRequest {
  
  inline def apply(EnvironmentIdentifier: EnvironmentId): GetEnvironmentRequest = {
    val __obj = js.Dynamic.literal(EnvironmentIdentifier = EnvironmentIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEnvironmentRequest] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentIdentifier(value: EnvironmentId): Self = StObject.set(x, "EnvironmentIdentifier", value.asInstanceOf[js.Any])
  }
}

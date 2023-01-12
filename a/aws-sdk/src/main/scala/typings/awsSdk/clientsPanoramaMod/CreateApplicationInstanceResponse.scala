package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationInstanceResponse extends StObject {
  
  /**
    * The application instance's ID.
    */
  var ApplicationInstanceId: typings.awsSdk.clientsPanoramaMod.ApplicationInstanceId
}
object CreateApplicationInstanceResponse {
  
  inline def apply(ApplicationInstanceId: ApplicationInstanceId): CreateApplicationInstanceResponse = {
    val __obj = js.Dynamic.literal(ApplicationInstanceId = ApplicationInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationInstanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApplicationInstanceResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationInstanceId(value: ApplicationInstanceId): Self = StObject.set(x, "ApplicationInstanceId", value.asInstanceOf[js.Any])
  }
}

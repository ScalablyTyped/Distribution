package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopApplicationRequest extends StObject {
  
  /**
    * Name of the running application to stop.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsMod.ApplicationName
}
object StopApplicationRequest {
  
  inline def apply(ApplicationName: ApplicationName): StopApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
  }
}

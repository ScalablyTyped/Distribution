package typings.awsSdk.clientsCloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourceOutput extends StObject {
  
  /**
    * Represents the current status of the resource creation request. After you have initiated a resource creation request, you can monitor the progress of your request by calling GetResourceRequestStatus using the RequestToken of the ProgressEvent returned by CreateResource.
    */
  var ProgressEvent: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.ProgressEvent] = js.undefined
}
object CreateResourceOutput {
  
  inline def apply(): CreateResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResourceOutput]
  }
  
  extension [Self <: CreateResourceOutput](x: Self) {
    
    inline def setProgressEvent(value: ProgressEvent): Self = StObject.set(x, "ProgressEvent", value.asInstanceOf[js.Any])
    
    inline def setProgressEventUndefined: Self = StObject.set(x, "ProgressEvent", js.undefined)
  }
}

package typings.awsSdk.clientsCloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceRequestStatusOutput extends StObject {
  
  /**
    * Represents the current status of the resource operation request.
    */
  var ProgressEvent: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.ProgressEvent] = js.undefined
}
object GetResourceRequestStatusOutput {
  
  inline def apply(): GetResourceRequestStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceRequestStatusOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourceRequestStatusOutput] (val x: Self) extends AnyVal {
    
    inline def setProgressEvent(value: ProgressEvent): Self = StObject.set(x, "ProgressEvent", value.asInstanceOf[js.Any])
    
    inline def setProgressEventUndefined: Self = StObject.set(x, "ProgressEvent", js.undefined)
  }
}

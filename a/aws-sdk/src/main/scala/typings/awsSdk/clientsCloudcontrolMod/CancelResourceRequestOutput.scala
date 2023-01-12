package typings.awsSdk.clientsCloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelResourceRequestOutput extends StObject {
  
  var ProgressEvent: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.ProgressEvent] = js.undefined
}
object CancelResourceRequestOutput {
  
  inline def apply(): CancelResourceRequestOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelResourceRequestOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelResourceRequestOutput] (val x: Self) extends AnyVal {
    
    inline def setProgressEvent(value: ProgressEvent): Self = StObject.set(x, "ProgressEvent", value.asInstanceOf[js.Any])
    
    inline def setProgressEventUndefined: Self = StObject.set(x, "ProgressEvent", js.undefined)
  }
}

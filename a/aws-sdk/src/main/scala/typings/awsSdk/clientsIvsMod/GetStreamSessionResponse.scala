package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamSessionResponse extends StObject {
  
  /**
    * List of stream details.
    */
  var streamSession: js.UndefOr[StreamSession] = js.undefined
}
object GetStreamSessionResponse {
  
  inline def apply(): GetStreamSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStreamSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setStreamSession(value: StreamSession): Self = StObject.set(x, "streamSession", value.asInstanceOf[js.Any])
    
    inline def setStreamSessionUndefined: Self = StObject.set(x, "streamSession", js.undefined)
  }
}

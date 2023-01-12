package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamKeyResponse extends StObject {
  
  /**
    * 
    */
  var streamKey: js.UndefOr[StreamKey] = js.undefined
}
object GetStreamKeyResponse {
  
  inline def apply(): GetStreamKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStreamKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setStreamKey(value: StreamKey): Self = StObject.set(x, "streamKey", value.asInstanceOf[js.Any])
    
    inline def setStreamKeyUndefined: Self = StObject.set(x, "streamKey", js.undefined)
  }
}

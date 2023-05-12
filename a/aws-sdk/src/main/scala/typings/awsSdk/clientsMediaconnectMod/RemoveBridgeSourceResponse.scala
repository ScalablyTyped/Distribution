package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveBridgeSourceResponse extends StObject {
  
  var BridgeArn: js.UndefOr[string] = js.undefined
  
  var SourceName: js.UndefOr[string] = js.undefined
}
object RemoveBridgeSourceResponse {
  
  inline def apply(): RemoveBridgeSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveBridgeSourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveBridgeSourceResponse] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setBridgeArnUndefined: Self = StObject.set(x, "BridgeArn", js.undefined)
    
    inline def setSourceName(value: string): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameUndefined: Self = StObject.set(x, "SourceName", js.undefined)
  }
}

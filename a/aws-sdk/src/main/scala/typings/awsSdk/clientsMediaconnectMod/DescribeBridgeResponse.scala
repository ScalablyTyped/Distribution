package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBridgeResponse extends StObject {
  
  var Bridge: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Bridge] = js.undefined
}
object DescribeBridgeResponse {
  
  inline def apply(): DescribeBridgeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBridgeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBridgeResponse] (val x: Self) extends AnyVal {
    
    inline def setBridge(value: Bridge): Self = StObject.set(x, "Bridge", value.asInstanceOf[js.Any])
    
    inline def setBridgeUndefined: Self = StObject.set(x, "Bridge", js.undefined)
  }
}

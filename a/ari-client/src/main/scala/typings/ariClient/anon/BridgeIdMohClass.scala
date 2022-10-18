package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeIdMohClass extends StObject {
  
  var bridgeId: String
  
  var mohClass: js.UndefOr[String] = js.undefined
}
object BridgeIdMohClass {
  
  inline def apply(bridgeId: String): BridgeIdMohClass = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeIdMohClass]
  }
  
  extension [Self <: BridgeIdMohClass](x: Self) {
    
    inline def setBridgeId(value: String): Self = StObject.set(x, "bridgeId", value.asInstanceOf[js.Any])
    
    inline def setMohClass(value: String): Self = StObject.set(x, "mohClass", value.asInstanceOf[js.Any])
    
    inline def setMohClassUndefined: Self = StObject.set(x, "mohClass", js.undefined)
  }
}

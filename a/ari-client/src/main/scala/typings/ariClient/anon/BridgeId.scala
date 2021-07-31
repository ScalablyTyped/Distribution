package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeId extends StObject {
  
  var bridgeId: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object BridgeId {
  
  @scala.inline
  def apply(): BridgeId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BridgeId]
  }
  
  @scala.inline
  implicit class BridgeIdMutableBuilder[Self <: BridgeId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBridgeId(value: String): Self = StObject.set(x, "bridgeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBridgeIdUndefined: Self = StObject.set(x, "bridgeId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

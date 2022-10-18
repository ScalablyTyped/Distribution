package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginGroupMember extends StObject {
  
  /**
    * The ID for an origin in an origin group.
    */
  var OriginId: String
}
object OriginGroupMember {
  
  inline def apply(OriginId: String): OriginGroupMember = {
    val __obj = js.Dynamic.literal(OriginId = OriginId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroupMember]
  }
  
  extension [Self <: OriginGroupMember](x: Self) {
    
    inline def setOriginId(value: String): Self = StObject.set(x, "OriginId", value.asInstanceOf[js.Any])
  }
}

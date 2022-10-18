package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BgpOptions extends StObject {
  
  /**
    * The Peer ASN of the BGP.
    */
  var PeerAsn: js.UndefOr[Long] = js.undefined
}
object BgpOptions {
  
  inline def apply(): BgpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BgpOptions]
  }
  
  extension [Self <: BgpOptions](x: Self) {
    
    inline def setPeerAsn(value: Long): Self = StObject.set(x, "PeerAsn", value.asInstanceOf[js.Any])
    
    inline def setPeerAsnUndefined: Self = StObject.set(x, "PeerAsn", js.undefined)
  }
}

package typings.awsSdk.clientsCloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestStatus extends StObject {
  
  /**
    * The encrypted resource ID for the request.
    */
  var rid: js.UndefOr[String] = js.undefined
  
  /**
    * How long it took to process the request, in milliseconds.
    */
  var timems: js.UndefOr[Long] = js.undefined
}
object SuggestStatus {
  
  inline def apply(): SuggestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestStatus]
  }
  
  extension [Self <: SuggestStatus](x: Self) {
    
    inline def setRid(value: String): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    inline def setRidUndefined: Self = StObject.set(x, "rid", js.undefined)
    
    inline def setTimems(value: Long): Self = StObject.set(x, "timems", value.asInstanceOf[js.Any])
    
    inline def setTimemsUndefined: Self = StObject.set(x, "timems", js.undefined)
  }
}

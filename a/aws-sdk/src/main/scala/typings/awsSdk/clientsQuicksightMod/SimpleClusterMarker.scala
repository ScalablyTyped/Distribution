package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleClusterMarker extends StObject {
  
  /**
    * The color of the simple cluster marker.
    */
  var Color: js.UndefOr[HexColor] = js.undefined
}
object SimpleClusterMarker {
  
  inline def apply(): SimpleClusterMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleClusterMarker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleClusterMarker] (val x: Self) extends AnyVal {
    
    inline def setColor(value: HexColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
  }
}

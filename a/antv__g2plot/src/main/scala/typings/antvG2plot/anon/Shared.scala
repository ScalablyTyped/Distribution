package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shared extends StObject {
  
  var shared: Boolean
  
  var showMarkers: Boolean
  
  var showTitle: Boolean
}
object Shared {
  
  inline def apply(shared: Boolean, showMarkers: Boolean, showTitle: Boolean): Shared = {
    val __obj = js.Dynamic.literal(shared = shared.asInstanceOf[js.Any], showMarkers = showMarkers.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shared]
  }
  
  extension [Self <: Shared](x: Self) {
    
    inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setShowMarkers(value: Boolean): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
  }
}

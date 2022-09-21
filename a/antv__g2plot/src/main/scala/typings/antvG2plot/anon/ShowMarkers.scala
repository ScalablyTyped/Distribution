package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowMarkers extends StObject {
  
  var showMarkers: Boolean
  
  var showTitle: Boolean
}
object ShowMarkers {
  
  inline def apply(showMarkers: Boolean, showTitle: Boolean): ShowMarkers = {
    val __obj = js.Dynamic.literal(showMarkers = showMarkers.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowMarkers]
  }
  
  extension [Self <: ShowMarkers](x: Self) {
    
    inline def setShowMarkers(value: Boolean): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
  }
}

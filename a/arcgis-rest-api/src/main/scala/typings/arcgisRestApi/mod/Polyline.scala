package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polyline
  extends StObject
     with HasZM
     with Geometry {
  
  var paths: js.Array[js.Array[Position]]
}
object Polyline {
  
  inline def apply(paths: js.Array[js.Array[Position]]): Polyline = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polyline]
  }
  
  extension [Self <: Polyline](x: Self) {
    
    inline def setPaths(value: js.Array[js.Array[Position]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: js.Array[Position]*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}

package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.treemapSquarify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tile extends StObject {
  
  var tile: treemapSquarify
}
object Tile {
  
  inline def apply(): Tile = {
    val __obj = js.Dynamic.literal(tile = "treemapSquarify")
    __obj.asInstanceOf[Tile]
  }
  
  extension [Self <: Tile](x: Self) {
    
    inline def setTile(value: treemapSquarify): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetStyle extends StObject {
  
  /**
    * The display options for tiles.
    */
  var Tile: js.UndefOr[TileStyle] = js.undefined
  
  /**
    * The layout options for tiles.
    */
  var TileLayout: js.UndefOr[TileLayoutStyle] = js.undefined
}
object SheetStyle {
  
  inline def apply(): SheetStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetStyle]
  }
  
  extension [Self <: SheetStyle](x: Self) {
    
    inline def setTile(value: TileStyle): Self = StObject.set(x, "Tile", value.asInstanceOf[js.Any])
    
    inline def setTileLayout(value: TileLayoutStyle): Self = StObject.set(x, "TileLayout", value.asInstanceOf[js.Any])
    
    inline def setTileLayoutUndefined: Self = StObject.set(x, "TileLayout", js.undefined)
    
    inline def setTileUndefined: Self = StObject.set(x, "Tile", js.undefined)
  }
}

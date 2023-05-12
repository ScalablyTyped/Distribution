package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLayoutCanvasSizeOptions extends StObject {
  
  /**
    * The options that determine the sizing of the canvas used in a grid layout.
    */
  var ScreenCanvasSizeOptions: js.UndefOr[GridLayoutScreenCanvasSizeOptions] = js.undefined
}
object GridLayoutCanvasSizeOptions {
  
  inline def apply(): GridLayoutCanvasSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridLayoutCanvasSizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridLayoutCanvasSizeOptions] (val x: Self) extends AnyVal {
    
    inline def setScreenCanvasSizeOptions(value: GridLayoutScreenCanvasSizeOptions): Self = StObject.set(x, "ScreenCanvasSizeOptions", value.asInstanceOf[js.Any])
    
    inline def setScreenCanvasSizeOptionsUndefined: Self = StObject.set(x, "ScreenCanvasSizeOptions", js.undefined)
  }
}

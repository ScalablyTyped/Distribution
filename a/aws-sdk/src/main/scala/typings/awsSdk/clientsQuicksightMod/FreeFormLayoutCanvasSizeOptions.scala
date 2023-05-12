package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeFormLayoutCanvasSizeOptions extends StObject {
  
  /**
    * The options that determine the sizing of the canvas used in a free-form layout.
    */
  var ScreenCanvasSizeOptions: js.UndefOr[FreeFormLayoutScreenCanvasSizeOptions] = js.undefined
}
object FreeFormLayoutCanvasSizeOptions {
  
  inline def apply(): FreeFormLayoutCanvasSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeFormLayoutCanvasSizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreeFormLayoutCanvasSizeOptions] (val x: Self) extends AnyVal {
    
    inline def setScreenCanvasSizeOptions(value: FreeFormLayoutScreenCanvasSizeOptions): Self = StObject.set(x, "ScreenCanvasSizeOptions", value.asInstanceOf[js.Any])
    
    inline def setScreenCanvasSizeOptionsUndefined: Self = StObject.set(x, "ScreenCanvasSizeOptions", js.undefined)
  }
}

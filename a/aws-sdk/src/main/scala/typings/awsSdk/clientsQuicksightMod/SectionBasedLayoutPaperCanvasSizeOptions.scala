package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionBasedLayoutPaperCanvasSizeOptions extends StObject {
  
  /**
    * Defines the spacing between the canvas content and the top, bottom, left, and right edges.
    */
  var PaperMargin: js.UndefOr[Spacing] = js.undefined
  
  /**
    * The paper orientation that is used to define canvas dimensions. Choose one of the following options:   PORTRAIT   LANDSCAPE  
    */
  var PaperOrientation: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PaperOrientation] = js.undefined
  
  /**
    * The paper size that is used to define canvas dimensions.
    */
  var PaperSize: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PaperSize] = js.undefined
}
object SectionBasedLayoutPaperCanvasSizeOptions {
  
  inline def apply(): SectionBasedLayoutPaperCanvasSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionBasedLayoutPaperCanvasSizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SectionBasedLayoutPaperCanvasSizeOptions] (val x: Self) extends AnyVal {
    
    inline def setPaperMargin(value: Spacing): Self = StObject.set(x, "PaperMargin", value.asInstanceOf[js.Any])
    
    inline def setPaperMarginUndefined: Self = StObject.set(x, "PaperMargin", js.undefined)
    
    inline def setPaperOrientation(value: PaperOrientation): Self = StObject.set(x, "PaperOrientation", value.asInstanceOf[js.Any])
    
    inline def setPaperOrientationUndefined: Self = StObject.set(x, "PaperOrientation", js.undefined)
    
    inline def setPaperSize(value: PaperSize): Self = StObject.set(x, "PaperSize", value.asInstanceOf[js.Any])
    
    inline def setPaperSizeUndefined: Self = StObject.set(x, "PaperSize", js.undefined)
  }
}

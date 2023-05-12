package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionBasedLayoutCanvasSizeOptions extends StObject {
  
  /**
    * The options for a paper canvas of a section-based layout.
    */
  var PaperCanvasSizeOptions: js.UndefOr[SectionBasedLayoutPaperCanvasSizeOptions] = js.undefined
}
object SectionBasedLayoutCanvasSizeOptions {
  
  inline def apply(): SectionBasedLayoutCanvasSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionBasedLayoutCanvasSizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SectionBasedLayoutCanvasSizeOptions] (val x: Self) extends AnyVal {
    
    inline def setPaperCanvasSizeOptions(value: SectionBasedLayoutPaperCanvasSizeOptions): Self = StObject.set(x, "PaperCanvasSizeOptions", value.asInstanceOf[js.Any])
    
    inline def setPaperCanvasSizeOptionsUndefined: Self = StObject.set(x, "PaperCanvasSizeOptions", js.undefined)
  }
}

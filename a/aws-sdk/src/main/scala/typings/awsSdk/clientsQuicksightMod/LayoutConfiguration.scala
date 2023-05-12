package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutConfiguration extends StObject {
  
  /**
    * A free-form is optimized for a fixed width and has more control over the exact placement of layout elements.
    */
  var FreeFormLayout: js.UndefOr[FreeFormLayoutConfiguration] = js.undefined
  
  /**
    * A type of layout that can be used on a sheet. In a grid layout, visuals snap to a grid with standard spacing and alignment. Dashboards are displayed as designed, with options to fit to screen or view at actual size. A grid layout can be configured to behave in one of two ways when the viewport is resized: FIXED or RESPONSIVE.
    */
  var GridLayout: js.UndefOr[GridLayoutConfiguration] = js.undefined
  
  /**
    * A section based layout organizes visuals into multiple sections and has customized header, footer and page break.
    */
  var SectionBasedLayout: js.UndefOr[SectionBasedLayoutConfiguration] = js.undefined
}
object LayoutConfiguration {
  
  inline def apply(): LayoutConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayoutConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFreeFormLayout(value: FreeFormLayoutConfiguration): Self = StObject.set(x, "FreeFormLayout", value.asInstanceOf[js.Any])
    
    inline def setFreeFormLayoutUndefined: Self = StObject.set(x, "FreeFormLayout", js.undefined)
    
    inline def setGridLayout(value: GridLayoutConfiguration): Self = StObject.set(x, "GridLayout", value.asInstanceOf[js.Any])
    
    inline def setGridLayoutUndefined: Self = StObject.set(x, "GridLayout", js.undefined)
    
    inline def setSectionBasedLayout(value: SectionBasedLayoutConfiguration): Self = StObject.set(x, "SectionBasedLayout", value.asInstanceOf[js.Any])
    
    inline def setSectionBasedLayoutUndefined: Self = StObject.set(x, "SectionBasedLayout", js.undefined)
  }
}

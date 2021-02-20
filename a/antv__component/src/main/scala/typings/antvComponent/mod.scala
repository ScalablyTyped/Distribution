package typings.antvComponent

import typings.antvComponent.componentMod.default
import typings.antvComponent.typesMod.AxisBaseCfg
import typings.antvComponent.typesMod.ComponentCfg
import typings.antvComponent.typesMod.CrosshairBaseCfg
import typings.antvComponent.typesMod.GroupComponentCfg
import typings.antvComponent.typesMod.HtmlCrossHairCfg
import typings.antvComponent.typesMod.LegendBaseCfg
import typings.antvComponent.typesMod.TooltipCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Annotation {
    
    @JSImport("@antv/component", "Annotation.Arc")
    @js.native
    class Arc ()
      extends typings.antvComponent.annotationMod.Arc
    
    @JSImport("@antv/component", "Annotation.DataMarker")
    @js.native
    class DataMarker ()
      extends typings.antvComponent.annotationMod.DataMarker
    
    @JSImport("@antv/component", "Annotation.DataRegion")
    @js.native
    class DataRegion ()
      extends typings.antvComponent.annotationMod.DataRegion
    
    @JSImport("@antv/component", "Annotation.Html")
    @js.native
    class Html ()
      extends typings.antvComponent.annotationMod.Html
    
    @JSImport("@antv/component", "Annotation.Image")
    @js.native
    class Image ()
      extends typings.antvComponent.annotationMod.Image
    
    @JSImport("@antv/component", "Annotation.Line")
    @js.native
    class Line ()
      extends typings.antvComponent.annotationMod.Line
    
    @JSImport("@antv/component", "Annotation.Region")
    @js.native
    class Region ()
      extends typings.antvComponent.annotationMod.Region
    
    @JSImport("@antv/component", "Annotation.RegionFilter")
    @js.native
    class RegionFilter ()
      extends typings.antvComponent.annotationMod.RegionFilter
    
    @JSImport("@antv/component", "Annotation.Shape")
    @js.native
    class Shape ()
      extends typings.antvComponent.annotationMod.Shape
    
    @JSImport("@antv/component", "Annotation.Text")
    @js.native
    class Text ()
      extends typings.antvComponent.annotationMod.Text
  }
  
  object Axis {
    
    @JSImport("@antv/component", "Axis.Base")
    @js.native
    abstract class Base[T /* <: AxisBaseCfg */] ()
      extends typings.antvComponent.axisMod.Base[T]
    
    @JSImport("@antv/component", "Axis.Circle")
    @js.native
    class Circle ()
      extends typings.antvComponent.axisMod.Circle
    
    @JSImport("@antv/component", "Axis.Line")
    @js.native
    class Line ()
      extends typings.antvComponent.axisMod.Line
  }
  
  @JSImport("@antv/component", "Component")
  @js.native
  abstract class Component[T /* <: ComponentCfg */] protected () extends default[T] {
    def this(cfg: T) = this()
  }
  
  object Crosshair {
    
    @JSImport("@antv/component", "Crosshair.Base")
    @js.native
    abstract class Base[T /* <: CrosshairBaseCfg */] ()
      extends typings.antvComponent.crosshairMod.Base[T]
    
    @JSImport("@antv/component", "Crosshair.Circle")
    @js.native
    class Circle ()
      extends typings.antvComponent.crosshairMod.Circle
    
    @JSImport("@antv/component", "Crosshair.Html")
    @js.native
    class Html[T /* <: HtmlCrossHairCfg */] ()
      extends typings.antvComponent.crosshairMod.Html[T]
    
    @JSImport("@antv/component", "Crosshair.Line")
    @js.native
    class Line ()
      extends typings.antvComponent.crosshairMod.Line
  }
  
  object Grid {
    
    @JSImport("@antv/component", "Grid.Base")
    @js.native
    abstract class Base[T /* <: GroupComponentCfg */] ()
      extends typings.antvComponent.gridMod.Base[T]
    
    @JSImport("@antv/component", "Grid.Circle")
    @js.native
    class Circle ()
      extends typings.antvComponent.gridMod.Circle
    
    @JSImport("@antv/component", "Grid.Line")
    @js.native
    class Line ()
      extends typings.antvComponent.gridMod.Line
  }
  
  @JSImport("@antv/component", "GroupComponent")
  @js.native
  abstract class GroupComponent[T /* <: GroupComponentCfg */] ()
    extends typings.antvComponent.groupComponentMod.default[T]
  
  @JSImport("@antv/component", "HtmlComponent")
  @js.native
  abstract class HtmlComponent[T /* <: ComponentCfg */] ()
    extends typings.antvComponent.htmlComponentMod.default[T]
  
  object Legend {
    
    @JSImport("@antv/component", "Legend.Base")
    @js.native
    abstract class Base[T /* <: LegendBaseCfg */] ()
      extends typings.antvComponent.legendMod.Base[T]
    
    @JSImport("@antv/component", "Legend.Category")
    @js.native
    class Category ()
      extends typings.antvComponent.legendMod.Category
    
    @JSImport("@antv/component", "Legend.Continuous")
    @js.native
    class Continuous ()
      extends typings.antvComponent.legendMod.Continuous
  }
  
  @JSImport("@antv/component", "Scrollbar")
  @js.native
  class Scrollbar ()
    extends typings.antvComponent.scrollbarMod.Scrollbar
  
  @JSImport("@antv/component", "Slider")
  @js.native
  class Slider ()
    extends typings.antvComponent.sliderMod.Slider
  
  object Tooltip {
    
    @JSImport("@antv/component", "Tooltip.Html")
    @js.native
    class Html[T /* <: TooltipCfg */] ()
      extends typings.antvComponent.tooltipMod.Html[T]
  }
}

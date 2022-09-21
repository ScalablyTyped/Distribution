package typings.antvComponent

import typings.antvComponent.componentMod.default
import typings.antvComponent.typesMod.AxisBaseCfg
import typings.antvComponent.typesMod.ComponentCfg
import typings.antvComponent.typesMod.CrosshairBaseCfg
import typings.antvComponent.typesMod.GroupComponentCfg
import typings.antvComponent.typesMod.HtmlCrossHairCfg
import typings.antvComponent.typesMod.LegendBaseCfg
import typings.antvComponent.typesMod.LooseObject
import typings.antvComponent.typesMod.TooltipCfg
import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Annotation {
    
    @JSImport("@antv/component", "Annotation.Arc")
    @js.native
    open class Arc ()
      extends typings.antvComponent.annotationMod.Arc
    
    @JSImport("@antv/component", "Annotation.DataMarker")
    @js.native
    open class DataMarker ()
      extends typings.antvComponent.annotationMod.DataMarker
    
    @JSImport("@antv/component", "Annotation.DataRegion")
    @js.native
    open class DataRegion ()
      extends typings.antvComponent.annotationMod.DataRegion
    
    @JSImport("@antv/component", "Annotation.Html")
    @js.native
    open class Html ()
      extends typings.antvComponent.annotationMod.Html
    
    @JSImport("@antv/component", "Annotation.Image")
    @js.native
    open class Image ()
      extends typings.antvComponent.annotationMod.Image
    
    @JSImport("@antv/component", "Annotation.Line")
    @js.native
    open class Line ()
      extends typings.antvComponent.annotationMod.Line
    
    @JSImport("@antv/component", "Annotation.Region")
    @js.native
    open class Region ()
      extends typings.antvComponent.annotationMod.Region
    
    @JSImport("@antv/component", "Annotation.RegionFilter")
    @js.native
    open class RegionFilter ()
      extends typings.antvComponent.annotationMod.RegionFilter
    
    @JSImport("@antv/component", "Annotation.Shape")
    @js.native
    open class Shape ()
      extends typings.antvComponent.annotationMod.Shape
    
    @JSImport("@antv/component", "Annotation.Text")
    @js.native
    open class Text ()
      extends typings.antvComponent.annotationMod.Text
  }
  
  object Axis {
    
    @JSImport("@antv/component", "Axis.Base")
    @js.native
    abstract class Base[T /* <: AxisBaseCfg */] ()
      extends typings.antvComponent.axisMod.Base[T]
    
    @JSImport("@antv/component", "Axis.Circle")
    @js.native
    open class Circle ()
      extends typings.antvComponent.axisMod.Circle
    
    @JSImport("@antv/component", "Axis.Line")
    @js.native
    open class Line ()
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
    open class Circle ()
      extends typings.antvComponent.crosshairMod.Circle
    
    @JSImport("@antv/component", "Crosshair.Html")
    @js.native
    open class Html[T /* <: HtmlCrossHairCfg */] ()
      extends typings.antvComponent.crosshairMod.Html[T]
    
    @JSImport("@antv/component", "Crosshair.Line")
    @js.native
    open class Line ()
      extends typings.antvComponent.crosshairMod.Line
  }
  
  object Grid {
    
    @JSImport("@antv/component", "Grid.Base")
    @js.native
    abstract class Base[T /* <: GroupComponentCfg */] ()
      extends typings.antvComponent.gridMod.Base[T]
    
    @JSImport("@antv/component", "Grid.Circle")
    @js.native
    open class Circle ()
      extends typings.antvComponent.gridMod.Circle
    
    @JSImport("@antv/component", "Grid.Line")
    @js.native
    open class Line ()
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
    open class Category ()
      extends typings.antvComponent.legendMod.Category
    
    @JSImport("@antv/component", "Legend.Continuous")
    @js.native
    open class Continuous ()
      extends typings.antvComponent.legendMod.Continuous
  }
  
  @JSImport("@antv/component", "Scrollbar")
  @js.native
  open class Scrollbar ()
    extends typings.antvComponent.scrollbarMod.Scrollbar
  
  @JSImport("@antv/component", "Slider")
  @js.native
  open class Slider ()
    extends typings.antvComponent.sliderMod.Slider
  
  object TOOLTIP_CSS_CONST {
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.CONTAINER_CLASS")
    @js.native
    val CONTAINER_CLASS: /* "g2-tooltip" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.CROSSHAIR_X")
    @js.native
    val CROSSHAIR_X: /* "g2-tooltip-crosshair-x" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.CROSSHAIR_Y")
    @js.native
    val CROSSHAIR_Y: /* "g2-tooltip-crosshair-y" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.LIST_CLASS")
    @js.native
    val LIST_CLASS: /* "g2-tooltip-list" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.LIST_ITEM_CLASS")
    @js.native
    val LIST_ITEM_CLASS: /* "g2-tooltip-list-item" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.MARKER_CLASS")
    @js.native
    val MARKER_CLASS: /* "g2-tooltip-marker" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.NAME_CLASS")
    @js.native
    val NAME_CLASS: /* "g2-tooltip-name" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.TITLE_CLASS")
    @js.native
    val TITLE_CLASS: /* "g2-tooltip-title" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.VALUE_CLASS")
    @js.native
    val VALUE_CLASS: /* "g2-tooltip-value" */ String = js.native
  }
  
  object Tooltip {
    
    @JSImport("@antv/component", "Tooltip.Html")
    @js.native
    open class Html[T /* <: TooltipCfg */] ()
      extends typings.antvComponent.tooltipMod.Html[T]
  }
  
  inline def propagationDelegate(group: IGroup, eventName: String, eventObject: LooseObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propagationDelegate")(group.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

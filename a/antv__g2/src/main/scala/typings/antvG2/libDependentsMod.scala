package typings.antvG2

import typings.antvAdjust.anon.AdjustCfgdimValuesMapDimV
import typings.antvAdjust.libAdjustsAdjustMod.AdjustConstructor
import typings.antvAttr.libInterfaceMod.AttributeCfg
import typings.antvComponent.libTypesMod.ComponentCfg
import typings.antvComponent.libTypesMod.CrosshairBaseCfg
import typings.antvComponent.libTypesMod.GroupComponentCfg
import typings.antvComponent.libTypesMod.HtmlCrossHairCfg
import typings.antvComponent.libTypesMod.TooltipCfg
import typings.antvComponent.mod.Axis.Line
import typings.antvComponent.mod.Legend.Category
import typings.antvComponent.mod.Tooltip.Html
import typings.antvCoord.anon.PartialOptions
import typings.antvGBase.libTypesMod.ShapeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDependentsMod {
  
  @JSImport("@antv/g2/lib/dependents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@antv/g2/lib/dependents", "AbstractGroup")
  @js.native
  open class AbstractGroup ()
    extends typings.antvGBase.mod.AbstractGroup
  
  /* note: abstract class */ @JSImport("@antv/g2/lib/dependents", "AbstractShape")
  @js.native
  open class AbstractShape protected ()
    extends typings.antvGBase.mod.AbstractShape {
    def this(cfg: ShapeCfg) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g2/lib/dependents", "Adjust")
  @js.native
  open class Adjust protected ()
    extends typings.antvAdjust.mod.Adjust {
    def this(cfg: AdjustCfgdimValuesMapDimV) = this()
  }
  
  object Annotation {
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.Arc")
    @js.native
    open class Arc ()
      extends typings.antvComponent.mod.Annotation.Arc
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.DataMarker")
    @js.native
    open class DataMarker ()
      extends typings.antvComponent.mod.Annotation.DataMarker
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.DataRegion")
    @js.native
    open class DataRegion ()
      extends typings.antvComponent.mod.Annotation.DataRegion
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.Html")
    @js.native
    open class Html ()
      extends typings.antvComponent.mod.Annotation.Html
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.Image")
    @js.native
    open class Image ()
      extends typings.antvComponent.mod.Annotation.Image
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.Line")
    @js.native
    open class Line ()
      extends typings.antvComponent.mod.Annotation.Line
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.Region")
    @js.native
    open class Region ()
      extends typings.antvComponent.mod.Annotation.Region
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.RegionFilter")
    @js.native
    open class RegionFilter ()
      extends typings.antvComponent.mod.Annotation.RegionFilter
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.Shape")
    @js.native
    open class Shape ()
      extends typings.antvComponent.mod.Annotation.Shape
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.Text")
    @js.native
    open class Text ()
      extends typings.antvComponent.mod.Annotation.Text
  }
  
  @JSImport("@antv/g2/lib/dependents", "Attribute")
  @js.native
  open class Attribute protected ()
    extends typings.antvAttr.mod.Attribute {
    def this(cfg: AttributeCfg) = this()
  }
  
  /* was `typeof Legend.Category` */
  @JSImport("@antv/g2/lib/dependents", "CategoryLegend")
  @js.native
  open class CategoryLegend () extends Category
  
  @JSImport("@antv/g2/lib/dependents", "Color")
  @js.native
  open class Color protected ()
    extends typings.antvAttr.mod.Color {
    def this(cfg: AttributeCfg) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g2/lib/dependents", "Component")
  @js.native
  open class Component[T /* <: ComponentCfg */] protected ()
    extends typings.antvComponent.mod.Component[T] {
    def this(cfg: T) = this()
  }
  
  @JSImport("@antv/g2/lib/dependents", "Coordinate")
  @js.native
  /**
    * Create a new Coordinate Object.
    * @param options Custom options
    */
  open class Coordinate ()
    extends typings.antvCoord.mod.Coordinate {
    def this(options: PartialOptions) = this()
  }
  
  object Crosshair {
    
    /* note: abstract class */ @JSImport("@antv/g2/lib/dependents", "Crosshair.Base")
    @js.native
    open class Base[T /* <: CrosshairBaseCfg */] ()
      extends typings.antvComponent.mod.Crosshair.Base[T]
    
    @JSImport("@antv/g2/lib/dependents", "Crosshair.Circle")
    @js.native
    open class Circle ()
      extends typings.antvComponent.mod.Crosshair.Circle
    
    @JSImport("@antv/g2/lib/dependents", "Crosshair.Html")
    @js.native
    open class Html[T /* <: HtmlCrossHairCfg */] ()
      extends typings.antvComponent.mod.Crosshair.Html[T]
    
    @JSImport("@antv/g2/lib/dependents", "Crosshair.Line")
    @js.native
    open class Line ()
      extends typings.antvComponent.mod.Crosshair.Line
  }
  
  @JSImport("@antv/g2/lib/dependents", "Event")
  @js.native
  open class Event protected ()
    extends typings.antvGBase.mod.Event {
    def this(`type`: Any, event: Any) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g2/lib/dependents", "GroupComponent")
  @js.native
  open class GroupComponent[T /* <: GroupComponentCfg */] ()
    extends typings.antvComponent.mod.GroupComponent[T]
  
  /* note: abstract class */ @JSImport("@antv/g2/lib/dependents", "HtmlComponent")
  @js.native
  open class HtmlComponent[T /* <: ComponentCfg */] ()
    extends typings.antvComponent.mod.HtmlComponent[T]
  
  /* was `typeof Tooltip.Html` */
  @JSImport("@antv/g2/lib/dependents", "HtmlTooltip")
  @js.native
  open class HtmlTooltip[T /* <: TooltipCfg */] () extends Html[T]
  
  /* was `typeof Axis.Line` */
  @JSImport("@antv/g2/lib/dependents", "LineAxis")
  @js.native
  open class LineAxis () extends Line
  
  /* was `typeof Grid.Line` */
  @JSImport("@antv/g2/lib/dependents", "LineGrid")
  @js.native
  open class LineGrid ()
    extends typings.antvComponent.mod.Grid.Line
  
  @JSImport("@antv/g2/lib/dependents", "Scrollbar")
  @js.native
  open class Scrollbar ()
    extends typings.antvComponent.mod.Scrollbar
  
  @JSImport("@antv/g2/lib/dependents", "Slider")
  @js.native
  open class Slider ()
    extends typings.antvComponent.mod.Slider
  
  /**
    * 根据类型获取 Adjust 类
    * @param type
    */
  inline def getAdjust(`type`: String): AdjustConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjust")(`type`.asInstanceOf[js.Any]).asInstanceOf[AdjustConstructor]
  
  /**
    * 通过类型获得 Attribute 类
    * @param type
    */
  inline def getAttribute(`type`: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttribute")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * 注册自定义 Adjust
    * @param type
    * @param ctor
    */
  inline def registerAdjust(`type`: String, ctor: AdjustConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAdjust")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type IG = Any
}

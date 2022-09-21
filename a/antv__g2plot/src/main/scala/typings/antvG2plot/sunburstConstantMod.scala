package typings.antvG2plot

import typings.antvG2.libInterfaceMod.SyncViewPaddingFn
import typings.antvG2plot.animationMod.Animation
import typings.antvG2plot.annotationMod.Annotation
import typings.antvG2plot.anon.OmitHierarchyOptionastype
import typings.antvG2plot.antvG2plotStrings.auto
import typings.antvG2plot.antvG2plotStrings.canvas
import typings.antvG2plot.antvG2plotStrings.svg
import typings.antvG2plot.antvG2plotStrings.x
import typings.antvG2plot.antvG2plotStrings.y
import typings.antvG2plot.attrMod.ColorAttr
import typings.antvG2plot.attrMod.PatternAttr
import typings.antvG2plot.attrMod.StyleAttr
import typings.antvG2plot.interactionMod.Interaction
import typings.antvG2plot.metaMod.Meta
import typings.antvG2plot.stateMod.State
import typings.antvG2plot.tooltipMod.Tooltip
import typings.antvG2plot.typesDrillDownMod.DrillDownCfg
import typings.antvG2plot.typesLabelMod.Label
import typings.antvG2plot.typesLegendMod.Legend
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sunburstConstantMod {
  
  /* Inlined std.Partial<@antv/g2plot.@antv/g2plot/lib/plots/sunburst/types.SunburstOptions> */
  object DEFAULT_OPTIONS {
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.animation")
    @js.native
    def animation: js.UndefOr[Animation] = js.native
    inline def animation_=(x: js.UndefOr[Animation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animation")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.annotations")
    @js.native
    def annotations: js.UndefOr[js.Array[Annotation]] = js.native
    inline def annotations_=(x: js.UndefOr[js.Array[Annotation]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotations")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.appendPadding")
    @js.native
    def appendPadding: js.UndefOr[js.Array[Double] | Double] = js.native
    inline def appendPadding_=(x: js.UndefOr[js.Array[Double] | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.autoFit")
    @js.native
    def autoFit: js.UndefOr[Boolean] = js.native
    inline def autoFit_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFit")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.color")
    @js.native
    def color: js.UndefOr[ColorAttr] = js.native
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.colorField")
    @js.native
    def colorField: js.UndefOr[String] = js.native
    inline def colorField_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorField")(x.asInstanceOf[js.Any])
    
    inline def color_=(x: js.UndefOr[ColorAttr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.data")
    @js.native
    def data: js.UndefOr[Any] = js.native
    inline def data_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.defaultInteractions")
    @js.native
    def defaultInteractions: js.UndefOr[js.Array[String]] = js.native
    inline def defaultInteractions_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInteractions")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.drilldown")
    @js.native
    def drilldown: js.UndefOr[DrillDownCfg] = js.native
    inline def drilldown_=(x: js.UndefOr[DrillDownCfg]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drilldown")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.height")
    @js.native
    def height: js.UndefOr[Double] = js.native
    inline def height_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.hierarchyConfig")
    @js.native
    def hierarchyConfig: js.UndefOr[OmitHierarchyOptionastype] = js.native
    inline def hierarchyConfig_=(x: js.UndefOr[OmitHierarchyOptionastype]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hierarchyConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.innerRadius")
    @js.native
    def innerRadius: js.UndefOr[Double] = js.native
    inline def innerRadius_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.interactions")
    @js.native
    def interactions: js.UndefOr[js.Array[Interaction]] = js.native
    inline def interactions_=(x: js.UndefOr[js.Array[Interaction]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interactions")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.label")
    @js.native
    def label: js.UndefOr[Label] = js.native
    inline def label_=(x: js.UndefOr[Label]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.legend")
    @js.native
    def legend: js.UndefOr[Legend] = js.native
    inline def legend_=(x: js.UndefOr[Legend]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legend")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.limitInPlot")
    @js.native
    def limitInPlot: js.UndefOr[Boolean] = js.native
    inline def limitInPlot_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("limitInPlot")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.localRefresh")
    @js.native
    def localRefresh: js.UndefOr[Boolean] = js.native
    inline def localRefresh_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localRefresh")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.locale")
    @js.native
    def locale: js.UndefOr[String] = js.native
    inline def locale_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.meta")
    @js.native
    def meta: js.UndefOr[Record[String, Meta]] = js.native
    inline def meta_=(x: js.UndefOr[Record[String, Meta]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("meta")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.padding")
    @js.native
    def padding: js.UndefOr[js.Array[Double] | Double | auto] = js.native
    inline def padding_=(x: js.UndefOr[js.Array[Double] | Double | auto]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.pattern")
    @js.native
    def pattern: js.UndefOr[PatternAttr] = js.native
    inline def pattern_=(x: js.UndefOr[PatternAttr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pattern")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.pixelRatio")
    @js.native
    def pixelRatio: js.UndefOr[Double] = js.native
    inline def pixelRatio_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.radius")
    @js.native
    def radius: js.UndefOr[Double] = js.native
    inline def radius_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radius")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.rawFields")
    @js.native
    def rawFields: js.UndefOr[js.Array[String]] = js.native
    inline def rawFields_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rawFields")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.reflect")
    @js.native
    def reflect: js.UndefOr[x | y] = js.native
    inline def reflect_=(x: js.UndefOr[x | y]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reflect")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.renderer")
    @js.native
    def renderer: js.UndefOr[svg | canvas] = js.native
    inline def renderer_=(x: js.UndefOr[svg | canvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderer")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.state")
    @js.native
    def state: js.UndefOr[State] = js.native
    inline def state_=(x: js.UndefOr[State]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.sunburstStyle")
    @js.native
    def sunburstStyle: js.UndefOr[StyleAttr] = js.native
    inline def sunburstStyle_=(x: js.UndefOr[StyleAttr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sunburstStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.supportCSSTransform")
    @js.native
    def supportCSSTransform: js.UndefOr[Boolean] = js.native
    inline def supportCSSTransform_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportCSSTransform")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.syncViewPadding")
    @js.native
    def syncViewPadding: js.UndefOr[Boolean | SyncViewPaddingFn] = js.native
    inline def syncViewPadding_=(x: js.UndefOr[Boolean | SyncViewPaddingFn]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("syncViewPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.theme")
    @js.native
    def theme: js.UndefOr[String | js.Object] = js.native
    inline def theme_=(x: js.UndefOr[String | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.tooltip")
    @js.native
    def tooltip: js.UndefOr[Tooltip] = js.native
    inline def tooltip_=(x: js.UndefOr[Tooltip]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.useDeferredLabel")
    @js.native
    def useDeferredLabel: js.UndefOr[Boolean | Double] = js.native
    inline def useDeferredLabel_=(x: js.UndefOr[Boolean | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useDeferredLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "DEFAULT_OPTIONS.width")
    @js.native
    def width: js.UndefOr[Double] = js.native
    inline def width_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "RAW_FIELDS")
  @js.native
  val RAW_FIELDS: js.Array[String] = js.native
  
  @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "SUNBURST_ANCESTOR_FIELD")
  @js.native
  val SUNBURST_ANCESTOR_FIELD: /* "ancestor-node" */ String = js.native
  
  @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "SUNBURST_PATH_FIELD")
  @js.native
  val SUNBURST_PATH_FIELD: /* "path" */ String = js.native
  
  @JSImport("@antv/g2plot/lib/plots/sunburst/constant", "SUNBURST_Y_FIELD")
  @js.native
  val SUNBURST_Y_FIELD: /* "value" */ String = js.native
}

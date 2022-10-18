package typings.antvG2

import typings.antvG2.libChartChartMod.default
import typings.antvG2.libChartControllerBaseMod.ControllerCtor
import typings.antvG2.libInterfaceMod.ChartCfg
import typings.antvG2.libInterfaceMod.Datum
import typings.antvG2.libInterfaceMod.ViewCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartMod {
  
  @JSImport("@antv/g2/lib/chart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g2/lib/chart", "Chart")
  @js.native
  open class Chart protected () extends default {
    def this(props: ChartCfg) = this()
  }
  
  @JSImport("@antv/g2/lib/chart", "Event")
  @js.native
  open class Event protected ()
    extends typings.antvG2.libChartEventMod.default {
    def this(view: typings.antvG2.libChartViewMod.View, gEvent: typings.antvG2.libDependentsMod.Event) = this()
    def this(
      view: typings.antvG2.libChartViewMod.View,
      gEvent: typings.antvG2.libDependentsMod.Event,
      data: Datum
    ) = this()
  }
  /* static members */
  object Event {
    
    @JSImport("@antv/g2/lib/chart", "Event")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 非交互产生的事件
      * @param view
      * @param type
      * @param data
      */
    inline def fromData(view: typings.antvG2.libChartViewMod.View, `type`: String, data: Datum): typings.antvG2.libChartEventMod.Event = (^.asInstanceOf[js.Dynamic].applyDynamic("fromData")(view.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.antvG2.libChartEventMod.Event]
  }
  
  @JSImport("@antv/g2/lib/chart", "View")
  @js.native
  open class View protected ()
    extends typings.antvG2.libChartViewMod.View {
    def this(props: ViewCfg) = this()
  }
  
  inline def registerComponentController(name: String, plugin: ControllerCtor[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerComponentController")(name.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerGeometry(name: String, Ctor: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGeometry")(name.asInstanceOf[js.Any], Ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

package typings.antvG2plot

import typings.antvG2plot.anon.PartialCSSStyleDeclaratio
import typings.antvG2plot.anon.PlotType
import typings.antvG2plot.anon.Statistic
import typings.antvG2plot.statisticMod.CSSStyle
import typings.antvG2plot.typesCommonMod.Datum
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsStatisticMod {
  
  @JSImport("@antv/g2plot/lib/utils/statistic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adapteStyle(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("adapteStyle")().asInstanceOf[js.Object]
  inline def adapteStyle(style: js.UndefOr[CSSStyle | (js.Function1[/* datum */ Datum, CSSStyle])]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("adapteStyle")(style.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def renderGaugeStatistic(
    chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    options: Statistic
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGaugeStatistic")(chart.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderGaugeStatistic(
    chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    options: Statistic,
    datum: Datum
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGaugeStatistic")(chart.asInstanceOf[js.Any], options.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderStatistic(
    chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    options: PlotType
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderStatistic")(chart.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderStatistic(
    chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    options: PlotType,
    datum: Datum
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderStatistic")(chart.asInstanceOf[js.Any], options.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setStatisticContainerStyle(container: HTMLElement, style: PartialCSSStyleDeclaratio): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatisticContainerStyle")(container.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

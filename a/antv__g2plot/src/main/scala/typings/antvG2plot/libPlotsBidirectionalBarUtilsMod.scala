package typings.antvG2plot

import typings.antvG2.libInterfaceMod.Data
import typings.antvG2plot.antvG2plotStrings.horizontal
import typings.antvG2plot.antvG2plotStrings.vertical
import typings.antvG2plot.libTypesCommonMod.Datum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsBidirectionalBarUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/bidirectional-bar/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isHorizontal(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHorizontal")().asInstanceOf[Boolean]
  inline def isHorizontal(layout: horizontal | vertical): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHorizontal")(layout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def syncViewPadding(chart: Any, views: Any, p: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncViewPadding")(chart.asInstanceOf[js.Any], views.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transformData(xField: String, yField: js.Array[String], seriesField: String, data: Datum): js.Array[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformData")(xField.asInstanceOf[js.Any], yField.asInstanceOf[js.Any], seriesField.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[Data]]
  inline def transformData(xField: String, yField: js.Array[String], seriesField: String, data: Datum, reverse: Boolean): js.Array[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformData")(xField.asInstanceOf[js.Any], yField.asInstanceOf[js.Any], seriesField.asInstanceOf[js.Any], data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[js.Array[Data]]
}

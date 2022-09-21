package typings.antvG2plot

import typings.antvG2plot.axisMod.Axis
import typings.antvG2plot.dualAxesTypesMod.AxisType
import typings.antvG2plot.dualAxesTypesMod.GeometryOption
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionMod {
  
  @JSImport("@antv/g2plot/lib/plots/dual-axes/util/option", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGeometryOption(xField: String, yField: String, geometryOption: GeometryOption): GeometryOption = (^.asInstanceOf[js.Dynamic].applyDynamic("getGeometryOption")(xField.asInstanceOf[js.Any], yField.asInstanceOf[js.Any], geometryOption.asInstanceOf[js.Any])).asInstanceOf[GeometryOption]
  
  inline def getYAxisWithDefault(yAxis: Axis, axisType: AxisType): Axis = (^.asInstanceOf[js.Dynamic].applyDynamic("getYAxisWithDefault")(yAxis.asInstanceOf[js.Any], axisType.asInstanceOf[js.Any])).asInstanceOf[Axis]
  
  inline def isColumn(geometryOption: GeometryOption): /* is @antv/g2plot.@antv/g2plot/lib/plots/dual-axes/types.GeometryColumnOption */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isColumn")(geometryOption.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g2plot.@antv/g2plot/lib/plots/dual-axes/types.GeometryColumnOption */ Boolean]
  
  inline def isLine(geometryOption: GeometryOption): /* is @antv/g2plot.@antv/g2plot/lib/plots/dual-axes/types.GeometryLineOption */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLine")(geometryOption.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g2plot.@antv/g2plot/lib/plots/dual-axes/types.GeometryLineOption */ Boolean]
  
  inline def transformObjectToArray(yField: js.Array[String], transformAttribute: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformObjectToArray")(yField.asInstanceOf[js.Any], transformAttribute.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def transformObjectToArray(yField: js.Array[String], transformAttribute: Record[String, Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformObjectToArray")(yField.asInstanceOf[js.Any], transformAttribute.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}

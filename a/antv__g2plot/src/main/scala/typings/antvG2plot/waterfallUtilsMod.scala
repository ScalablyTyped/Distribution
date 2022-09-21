package typings.antvG2plot

import typings.antvG2plot.anon.Label
import typings.antvG2plot.antvG2plotBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waterfallUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/waterfall/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processData(data: js.Array[Record[String, Any]], xField: String, yField: String, newYField: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("processData")(data.asInstanceOf[js.Any], xField.asInstanceOf[js.Any], yField.asInstanceOf[js.Any], newYField.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def processData(
    data: js.Array[Record[String, Any]],
    xField: String,
    yField: String,
    newYField: String,
    total: Label
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("processData")(data.asInstanceOf[js.Any], xField.asInstanceOf[js.Any], yField.asInstanceOf[js.Any], newYField.asInstanceOf[js.Any], total.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def processData_false(
    data: js.Array[Record[String, Any]],
    xField: String,
    yField: String,
    newYField: String,
    total: `false`
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("processData")(data.asInstanceOf[js.Any], xField.asInstanceOf[js.Any], yField.asInstanceOf[js.Any], newYField.asInstanceOf[js.Any], total.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def transformData(data: js.Array[Record[String, Any]], xField: String, yField: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformData")(data.asInstanceOf[js.Any], xField.asInstanceOf[js.Any], yField.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def transformData(data: js.Array[Record[String, Any]], xField: String, yField: String, total: Label): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformData")(data.asInstanceOf[js.Any], xField.asInstanceOf[js.Any], yField.asInstanceOf[js.Any], total.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def transformData_false(data: js.Array[Record[String, Any]], xField: String, yField: String, total: `false`): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformData")(data.asInstanceOf[js.Any], xField.asInstanceOf[js.Any], yField.asInstanceOf[js.Any], total.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}

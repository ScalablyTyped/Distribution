package typings.antvG2plot

import org.scalablytyped.runtime.StringDictionary
import typings.antvG2plot.typesCommonMod.Data
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object percentMod {
  
  @JSImport("@antv/g2plot/lib/utils/transform/percent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDataWhetherPercentage(data: js.Array[Record[String, Any]], yField: String, groupField: String, asField: String): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataWhetherPercentage")(data.asInstanceOf[js.Any], yField.asInstanceOf[js.Any], groupField.asInstanceOf[js.Any], asField.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def getDataWhetherPercentage(
    data: js.Array[Record[String, Any]],
    yField: String,
    groupField: String,
    asField: String,
    isPercent: Boolean
  ): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataWhetherPercentage")(data.asInstanceOf[js.Any], yField.asInstanceOf[js.Any], groupField.asInstanceOf[js.Any], asField.asInstanceOf[js.Any], isPercent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  
  inline def getDeepPercent(data: js.Array[Record[String, Any]], measure: String, fields: js.Array[String], percent: String): js.Array[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepPercent")(data.asInstanceOf[js.Any], measure.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Array[StringDictionary[Any]]]
  
  inline def percent(data: Data, measure: String, groupField: String, as: String): js.Array[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("percent")(data.asInstanceOf[js.Any], measure.asInstanceOf[js.Any], groupField.asInstanceOf[js.Any], as.asInstanceOf[js.Any])).asInstanceOf[js.Array[StringDictionary[Any]]]
}

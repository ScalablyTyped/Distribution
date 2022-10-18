package typings.antvG2plot

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsBoxUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/box/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformData(data: js.Array[Record[String, Any]], yField: String): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformData")(data.asInstanceOf[js.Any], yField.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def transformData(
    data: js.Array[Record[String, Any]],
    yField: js.Tuple5[
      js.UndefOr[String], 
      js.UndefOr[String], 
      js.UndefOr[String], 
      js.UndefOr[String], 
      js.UndefOr[String]
    ]
  ): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformData")(data.asInstanceOf[js.Any], yField.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
}

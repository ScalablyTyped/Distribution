package typings.antvG2plot

import typings.antvG2plot.typesCommonMod.Data
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pieUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/pie/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptOffset(`type`: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptOffset")(`type`.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  inline def adaptOffset(`type`: String, offset: String): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("adaptOffset")(`type`.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  inline def adaptOffset(`type`: String, offset: Double): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("adaptOffset")(`type`.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  inline def getTotalValue(data: Data, field: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTotalValue")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isAllZero(data: js.Array[Record[String, Any]], angleField: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAllZero")(data.asInstanceOf[js.Any], angleField.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

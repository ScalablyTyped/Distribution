package typings.antvG2plot

import typings.antvG2plot.libTypesCommonMod.Data
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsSankeyCircleMod {
  
  @JSImport("@antv/g2plot/lib/plots/sankey/circle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cutoffCircle(edges: Data, sourceField: String, targetField: String): Data = (^.asInstanceOf[js.Dynamic].applyDynamic("cutoffCircle")(edges.asInstanceOf[js.Any], sourceField.asInstanceOf[js.Any], targetField.asInstanceOf[js.Any])).asInstanceOf[Data]
  
  inline def getMatrix(edges: Data, nodes: js.Array[String], sourceField: String, targetField: String): Record[String, Record[String, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatrix")(edges.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], sourceField.asInstanceOf[js.Any], targetField.asInstanceOf[js.Any])).asInstanceOf[Record[String, Record[String, Double]]]
  
  inline def getNodes(edges: Data, sourceField: String, targetField: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodes")(edges.asInstanceOf[js.Any], sourceField.asInstanceOf[js.Any], targetField.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}

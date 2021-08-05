package typings.agGrid

import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("ag-grid/dist/lib/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultGroupComparator(valueA: js.Any, valueB: js.Any, nodeA: RowNode, nodeB: RowNode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultGroupComparator")(valueA.asInstanceOf[js.Any], valueB.asInstanceOf[js.Any], nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def defaultGroupComparator(valueA: js.Any, valueB: js.Any, nodeA: RowNode, nodeB: RowNode, accentedCompare: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultGroupComparator")(valueA.asInstanceOf[js.Any], valueB.asInstanceOf[js.Any], nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any], accentedCompare.asInstanceOf[js.Any])).asInstanceOf[Double]
}

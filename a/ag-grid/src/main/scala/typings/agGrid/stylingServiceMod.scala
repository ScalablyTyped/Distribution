package typings.agGrid

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.colDefMod.CellClassParams
import typings.agGrid.colDefMod.ColDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylingServiceMod {
  
  @JSImport("ag-grid/dist/lib/styling/stylingService", "StylingService")
  @js.native
  class StylingService () extends StObject {
    
    var expressionService: js.Any = js.native
    
    def processAllCellClasses(colDef: ColDef, params: js.Any, onApplicableClass: js.Function1[/* className */ String, Unit]): Unit = js.native
    def processAllCellClasses(
      colDef: ColDef,
      params: js.Any,
      onApplicableClass: js.Function1[/* className */ String, Unit],
      onNotApplicableClass: js.Function1[/* className */ String, Unit]
    ): Unit = js.native
    
    def processClassRules(
      classRules: StringDictionary[js.Function | String],
      params: CellClassParams,
      onApplicableClass: js.Function1[/* className */ String, Unit]
    ): Unit = js.native
    def processClassRules(
      classRules: StringDictionary[js.Function | String],
      params: CellClassParams,
      onApplicableClass: js.Function1[/* className */ String, Unit],
      onNotApplicableClass: js.Function1[/* className */ String, Unit]
    ): Unit = js.native
    
    def processStaticCellClasses(
      colDef: ColDef,
      params: CellClassParams,
      onApplicableClass: js.Function1[/* className */ String, Unit]
    ): Unit = js.native
  }
}

package typings
package agDashGridLib.distLibStylingStylingServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/styling/stylingService", "StylingService")
@js.native
class StylingService () extends js.Object {
  var expressionService: js.Any = js.native
  def processAllCellClasses(
    colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef,
    params: js.Any,
    onApplicableClass: js.Function1[/* className */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def processAllCellClasses(
    colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef,
    params: js.Any,
    onApplicableClass: js.Function1[/* className */ java.lang.String, scala.Unit],
    onNotApplicableClass: js.Function1[/* className */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def processClassRules(
    classRules: org.scalablytyped.runtime.StringDictionary[js.Function | java.lang.String],
    params: agDashGridLib.distLibEntitiesColDefMod.CellClassParams,
    onApplicableClass: js.Function1[/* className */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def processClassRules(
    classRules: org.scalablytyped.runtime.StringDictionary[js.Function | java.lang.String],
    params: agDashGridLib.distLibEntitiesColDefMod.CellClassParams,
    onApplicableClass: js.Function1[/* className */ java.lang.String, scala.Unit],
    onNotApplicableClass: js.Function1[/* className */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def processStaticCellClasses(
    colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef,
    params: agDashGridLib.distLibEntitiesColDefMod.CellClassParams,
    onApplicableClass: js.Function1[/* className */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}


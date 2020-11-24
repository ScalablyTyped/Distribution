package typings.agGrid.mod

import typings.agGrid.beansMod.Beans
import typings.agGrid.columnGroupChildMod.ColumnGroupChild
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "SetLeftFeature")
@js.native
class SetLeftFeature protected ()
  extends typings.agGrid.setLeftFeatureMod.SetLeftFeature {
  def this(columnOrGroup: ColumnGroupChild, eCell: HTMLElement, beans: Beans) = this()
  def this(
    columnOrGroup: ColumnGroupChild,
    eCell: HTMLElement,
    beans: Beans,
    colsSpanning: js.Array[typings.agGrid.columnMod.Column]
  ) = this()
}

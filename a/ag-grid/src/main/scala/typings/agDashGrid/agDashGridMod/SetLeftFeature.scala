package typings.agDashGrid.agDashGridMod

import typings.agDashGrid.distLibEntitiesColumnGroupChildMod.ColumnGroupChild
import typings.agDashGrid.distLibRenderingBeansMod.Beans
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "SetLeftFeature")
@js.native
class SetLeftFeature protected ()
  extends typings.agDashGrid.distLibRenderingFeaturesSetLeftFeatureMod.SetLeftFeature {
  def this(columnOrGroup: ColumnGroupChild, eCell: HTMLElement, beans: Beans) = this()
  def this(
    columnOrGroup: ColumnGroupChild,
    eCell: HTMLElement,
    beans: Beans,
    colsSpanning: js.Array[typings.agDashGrid.distLibEntitiesColumnMod.Column]
  ) = this()
}


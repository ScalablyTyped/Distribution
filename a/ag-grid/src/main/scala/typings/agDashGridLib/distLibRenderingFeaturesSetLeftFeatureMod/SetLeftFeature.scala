package typings
package agDashGridLib.distLibRenderingFeaturesSetLeftFeatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/features/setLeftFeature", "SetLeftFeature")
@js.native
class SetLeftFeature protected ()
  extends agDashGridLib.distLibContextBeanStubMod.BeanStub {
  def this(columnOrGroup: agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild, eCell: stdLib.HTMLElement, beans: agDashGridLib.distLibRenderingBeansMod.Beans) = this()
  def this(columnOrGroup: agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild, eCell: stdLib.HTMLElement, beans: agDashGridLib.distLibRenderingBeansMod.Beans, colsSpanning: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column]) = this()
  var actualLeft: js.Any = js.native
  var beans: js.Any = js.native
  var colsSpanning: js.Any = js.native
  var columnOrGroup: js.Any = js.native
  var eCell: js.Any = js.native
  /* private */ def animateInLeft(): js.Any = js.native
  def getColumnOrGroup(): agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild = js.native
  def init(): scala.Unit = js.native
  /* private */ def onLeftChanged(): js.Any = js.native
  def setColsSpanning(colsSpanning: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  /* private */ def setLeft(value: js.Any): js.Any = js.native
  /* private */ def setLeftFirstTime(): js.Any = js.native
}


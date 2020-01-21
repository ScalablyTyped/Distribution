package typings.agGrid.csvCreatorMod

import typings.agGrid.exportParamsMod.ExportParams
import typings.agGrid.gridSerializerMod.GridSerializingSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/csvCreator", "BaseCreator")
@js.native
abstract class BaseCreator[T, S /* <: GridSerializingSession[T] */, P /* <: ExportParams[T] */] () extends js.Object {
  var beans: js.Any = js.native
  def createSerializingSession(): S = js.native
  def createSerializingSession(params: P): S = js.native
  def export(): String = js.native
  def export(userParams: P): String = js.native
  def getData(params: P): String = js.native
  def getDefaultFileExtension(): String = js.native
  def getDefaultFileName(): String = js.native
  /* private */ def getMergedParamsAndData(userParams: js.Any): js.Any = js.native
  def getMimeType(): String = js.native
  def isExportSuppressed(): Boolean = js.native
  /* private */ def mergeDefaultParams(userParams: js.Any): js.Any = js.native
  /* protected */ def setBeans(beans: BaseCreatorBeans): Unit = js.native
}


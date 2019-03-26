package typings
package agDashGridLib.distLibCsvCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/csvCreator", "BaseCreator")
@js.native
abstract class BaseCreator[T, S /* <: agDashGridLib.distLibGridSerializerMod.GridSerializingSession[T] */, P /* <: agDashGridLib.distLibExportParamsMod.ExportParams[T] */] () extends js.Object {
  var beans: js.Any = js.native
  def createSerializingSession(): S = js.native
  def createSerializingSession(params: P): S = js.native
  def export(): java.lang.String = js.native
  def export(userParams: P): java.lang.String = js.native
  def getData(params: P): java.lang.String = js.native
  def getDefaultFileExtension(): java.lang.String = js.native
  def getDefaultFileName(): java.lang.String = js.native
  /* private */ def getMergedParamsAndData(userParams: js.Any): js.Any = js.native
  def getMimeType(): java.lang.String = js.native
  def isExportSuppressed(): scala.Boolean = js.native
  /* private */ def mergeDefaultParams(userParams: js.Any): js.Any = js.native
  /* protected */ def setBeans(beans: BaseCreatorBeans): scala.Unit = js.native
}


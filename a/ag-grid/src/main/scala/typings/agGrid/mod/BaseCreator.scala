package typings.agGrid.mod

import typings.agGrid.exportParamsMod.ExportParams
import typings.agGrid.gridSerializerMod.GridSerializingSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "BaseCreator")
@js.native
abstract class BaseCreator[T, S /* <: GridSerializingSession[T] */, P /* <: ExportParams[T] */] ()
  extends typings.agGrid.csvCreatorMod.BaseCreator[T, S, P]


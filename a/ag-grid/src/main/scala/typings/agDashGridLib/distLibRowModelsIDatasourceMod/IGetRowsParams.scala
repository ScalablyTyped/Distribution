package typings
package agDashGridLib.distLibRowModelsIDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGetRowsParams extends js.Object {
  /** The grid context object */
  var context: js.Any = js.native
  /** The first row index to NOT get. */
  var endRow: scala.Double = js.native
  /** If doing server side filtering, contains the filter model */
  var filterModel: js.Any = js.native
  /** If doing server side sorting, contains the sort model */
  var sortModel: js.Any = js.native
  /** The first row index to get. */
  var startRow: scala.Double = js.native
  /** Callback to call when the request fails. */
  def failCallback(): scala.Unit = js.native
  /** Callback to call for the result when successful. */
  def successCallback(rowsThisBlock: js.Array[_]): scala.Unit = js.native
  def successCallback(rowsThisBlock: js.Array[_], lastRow: scala.Double): scala.Unit = js.native
}


package typings
package apostropheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  var all: js.Array[_]
  var depth: scala.Double
  var initialized: scala.Boolean
  var stack: js.Array[_]
  def cancelTopModal(): scala.Unit
  def closeTopModal(): scala.Unit
  def getLatestModal(): scala.Null | java.lang.String
  def getTopModalOrBody(): java.lang.String
}

object Anon_All {
  @scala.inline
  def apply(
    all: js.Array[_],
    cancelTopModal: js.Function0[scala.Unit],
    closeTopModal: js.Function0[scala.Unit],
    depth: scala.Double,
    getLatestModal: js.Function0[scala.Null | java.lang.String],
    getTopModalOrBody: js.Function0[java.lang.String],
    initialized: scala.Boolean,
    stack: js.Array[_]
  ): Anon_All = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("cancelTopModal")(cancelTopModal)
    __obj.updateDynamic("closeTopModal")(closeTopModal)
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("getLatestModal")(getLatestModal)
    __obj.updateDynamic("getTopModalOrBody")(getTopModalOrBody)
    __obj.updateDynamic("initialized")(initialized)
    __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[Anon_All]
  }
}


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
    cancelTopModal: () => scala.Unit,
    closeTopModal: () => scala.Unit,
    depth: scala.Double,
    getLatestModal: () => scala.Null | java.lang.String,
    getTopModalOrBody: () => java.lang.String,
    initialized: scala.Boolean,
    stack: js.Array[_]
  ): Anon_All = {
    val __obj = js.Dynamic.literal(all = all, cancelTopModal = js.Any.fromFunction0(cancelTopModal), closeTopModal = js.Any.fromFunction0(closeTopModal), depth = depth, getLatestModal = js.Any.fromFunction0(getLatestModal), getTopModalOrBody = js.Any.fromFunction0(getTopModalOrBody), initialized = initialized, stack = stack)
  
    __obj.asInstanceOf[Anon_All]
  }
}


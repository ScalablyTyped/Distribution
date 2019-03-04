package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ABCompare extends js.Object {
  def compare(a: nodeLib.Buffer, b: nodeLib.Buffer): scala.Boolean
  def create(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer
  def eq(a: nodeLib.Buffer, b: nodeLib.Buffer): scala.Boolean
  def gt(a: nodeLib.Buffer, b: nodeLib.Buffer): scala.Boolean
  def lt(a: nodeLib.Buffer, b: nodeLib.Buffer): scala.Boolean
}

object Anon_ABCompare {
  @scala.inline
  def apply(
    compare: js.Function2[nodeLib.Buffer, nodeLib.Buffer, scala.Boolean],
    create: js.Function2[nodeLib.Buffer, nodeLib.Buffer, nodeLib.Buffer],
    eq: js.Function2[nodeLib.Buffer, nodeLib.Buffer, scala.Boolean],
    gt: js.Function2[nodeLib.Buffer, nodeLib.Buffer, scala.Boolean],
    lt: js.Function2[nodeLib.Buffer, nodeLib.Buffer, scala.Boolean]
  ): Anon_ABCompare = {
    val __obj = js.Dynamic.literal(compare = compare, create = create, eq = eq, gt = gt, lt = lt)
  
    __obj.asInstanceOf[Anon_ABCompare]
  }
}


package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofxorDistance extends js.Object {
  def compare(a: nodeLib.Buffer, b: nodeLib.Buffer): scala.Boolean
  def create(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer
  def eq(a: nodeLib.Buffer, b: nodeLib.Buffer): scala.Boolean
  def gt(a: nodeLib.Buffer, b: nodeLib.Buffer): scala.Boolean
  def lt(a: nodeLib.Buffer, b: nodeLib.Buffer): scala.Boolean
}

object TypeofxorDistance {
  @scala.inline
  def apply(
    compare: (nodeLib.Buffer, nodeLib.Buffer) => scala.Boolean,
    create: (nodeLib.Buffer, nodeLib.Buffer) => nodeLib.Buffer,
    eq: (nodeLib.Buffer, nodeLib.Buffer) => scala.Boolean,
    gt: (nodeLib.Buffer, nodeLib.Buffer) => scala.Boolean,
    lt: (nodeLib.Buffer, nodeLib.Buffer) => scala.Boolean
  ): TypeofxorDistance = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), create = js.Any.fromFunction2(create), eq = js.Any.fromFunction2(eq), gt = js.Any.fromFunction2(gt), lt = js.Any.fromFunction2(lt))
  
    __obj.asInstanceOf[TypeofxorDistance]
  }
}


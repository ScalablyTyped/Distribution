package typings.adone

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofxorDistance extends js.Object {
  def compare(a: Buffer, b: Buffer): Boolean
  def create(a: Buffer, b: Buffer): Buffer
  def eq(a: Buffer, b: Buffer): Boolean
  def gt(a: Buffer, b: Buffer): Boolean
  def lt(a: Buffer, b: Buffer): Boolean
}

object TypeofxorDistance {
  @scala.inline
  def apply(
    compare: (Buffer, Buffer) => Boolean,
    create: (Buffer, Buffer) => Buffer,
    eq: (Buffer, Buffer) => Boolean,
    gt: (Buffer, Buffer) => Boolean,
    lt: (Buffer, Buffer) => Boolean
  ): TypeofxorDistance = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), create = js.Any.fromFunction2(create), eq = js.Any.fromFunction2(eq), gt = js.Any.fromFunction2(gt), lt = js.Any.fromFunction2(lt))
  
    __obj.asInstanceOf[TypeofxorDistance]
  }
}


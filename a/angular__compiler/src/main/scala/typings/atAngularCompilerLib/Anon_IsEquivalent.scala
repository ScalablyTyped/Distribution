package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsEquivalent[T /* <: /* import warning: ImportType.apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */] extends js.Object {
  def isEquivalent(other: T): scala.Boolean
}

object Anon_IsEquivalent {
  @scala.inline
  def apply[T /* <: /* import warning: ImportType.apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */](isEquivalent: js.Function1[T, scala.Boolean]): Anon_IsEquivalent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isEquivalent")(isEquivalent)
    __obj.asInstanceOf[Anon_IsEquivalent[T]]
  }
}


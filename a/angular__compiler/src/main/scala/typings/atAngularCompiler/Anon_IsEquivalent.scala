package typings.atAngularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsEquivalent[T /* <: /* import warning: ImportType.apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */] extends js.Object {
  def isEquivalent(other: T): Boolean
}

object Anon_IsEquivalent {
  @scala.inline
  def apply[T /* <: /* import warning: ImportType.apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */](isEquivalent: T => Boolean): Anon_IsEquivalent[T] = {
    val __obj = js.Dynamic.literal(isEquivalent = js.Any.fromFunction1(isEquivalent))
  
    __obj.asInstanceOf[Anon_IsEquivalent[T]]
  }
}


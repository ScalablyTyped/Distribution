package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsEquivalent[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */] extends js.Object {
  def isEquivalent(other: T): Boolean
}

object AnonIsEquivalent {
  @scala.inline
  def apply[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */](isEquivalent: T => Boolean): AnonIsEquivalent[T] = {
    val __obj = js.Dynamic.literal(isEquivalent = js.Any.fromFunction1(isEquivalent))
    __obj.asInstanceOf[AnonIsEquivalent[T]]
  }
}


package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", "Disposable")
@js.native
class Disposable () extends DisposableLike {
  /** Construct a Disposable. */
  def this(disposableAction: js.Function0[scala.Unit]) = this()
  /** A callback which will be called within dispose(). */
  var disposalAction: js.UndefOr[js.Function0[scala.Unit]] = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
}

@JSImport("atom", "Disposable")
@js.native
object Disposable extends js.Object {
  /** Ensure that Object correctly implements the Disposable contract. */
  def isDisposable(`object`: js.Object): scala.Boolean = js.native
}


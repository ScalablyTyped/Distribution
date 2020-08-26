package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", "Disposable")
@js.native
/** Construct a Disposable. */
class Disposable () extends DisposableLike {
  def this(disposableAction: js.Function0[Unit]) = this()
  /** A callback which will be called within dispose(). */
  var disposalAction: js.UndefOr[js.Function0[Unit]] = js.native
}

/* static members */
@JSImport("atom", "Disposable")
@js.native
object Disposable extends js.Object {
  /** Ensure that Object correctly implements the Disposable contract. */
  def isDisposable(`object`: js.Object): Boolean = js.native
}


package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atom", "Disposable")
@js.native
/** Construct a Disposable. */
class Disposable () extends DisposableLike {
  def this(disposableAction: js.Function0[Unit]) = this()
  
  /** A callback which will be called within dispose(). */
  var disposalAction: js.UndefOr[js.Function0[Unit]] = js.native
}
/* static members */
object Disposable {
  
  /** Ensure that Object correctly implements the Disposable contract. */
  @JSImport("atom", "Disposable.isDisposable")
  @js.native
  def isDisposable(`object`: js.Object): Boolean = js.native
}

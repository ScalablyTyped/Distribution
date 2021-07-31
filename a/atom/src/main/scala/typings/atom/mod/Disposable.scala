package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atom", "Disposable")
@js.native
/** Construct a Disposable. */
class Disposable ()
  extends StObject
     with DisposableLike {
  def this(disposableAction: js.Function0[Unit]) = this()
  
  /** A callback which will be called within dispose(). */
  var disposalAction: js.UndefOr[js.Function0[Unit]] = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object Disposable {
  
  @JSImport("atom", "Disposable")
  @js.native
  val ^ : js.Any = js.native
  
  /** Ensure that Object correctly implements the Disposable contract. */
  @scala.inline
  def isDisposable(`object`: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisposable")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

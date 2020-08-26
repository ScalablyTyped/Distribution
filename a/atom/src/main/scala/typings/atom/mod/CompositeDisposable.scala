package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", "CompositeDisposable")
@js.native
class CompositeDisposable protected () extends DisposableLike {
  /** Construct an instance, optionally with one or more disposables. */
  def this(disposables: DisposableLike*) = this()
  // Managing Disposables
  /**
    *  Add disposables to be disposed when the composite is disposed.
    *  If this object has already been disposed, this method has no effect.
    */
  def add(disposables: DisposableLike*): Unit = js.native
  /**
    *  Clear all disposables. They will not be disposed by the next call to
    *  dispose.
    */
  def clear(): Unit = js.native
  /** Alias to CompositeDisposable::remove. */
  def delete(disposable: DisposableLike): Unit = js.native
  /** Remove a previously added disposable. */
  def remove(disposable: DisposableLike): Unit = js.native
}


package typings.atom.atomMod

import typings.atom.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  /** The name of the Package. */
  val name: String
  /** The path to the Package on disk. */
  val path: String
  /** If a previous rebuild failed, get the contents of stderr. */
  def getBuildFailureOutput(): String | Null
  // Native Module Compatibility
  /**
    *  Are all native modules depended on by this package correctly compiled
    *  against the current version of Atom?
    */
  def isCompatible(): Boolean
  // Event Subscription
  /** Invoke the given callback when all packages have been activated. */
  def onDidDeactivate(callback: js.Function0[Unit]): Disposable
  /**
    *  Rebuild native modules in this package's dependencies for the current
    *  version of Atom.
    */
  def rebuild(): js.Promise[Anon_Code]
}

object Package {
  @scala.inline
  def apply(
    getBuildFailureOutput: () => String | Null,
    isCompatible: () => Boolean,
    name: String,
    onDidDeactivate: js.Function0[Unit] => Disposable,
    path: String,
    rebuild: () => js.Promise[Anon_Code]
  ): Package = {
    val __obj = js.Dynamic.literal(getBuildFailureOutput = js.Any.fromFunction0(getBuildFailureOutput), isCompatible = js.Any.fromFunction0(isCompatible), name = name.asInstanceOf[js.Any], onDidDeactivate = js.Any.fromFunction1(onDidDeactivate), path = path.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild))
  
    __obj.asInstanceOf[Package]
  }
}


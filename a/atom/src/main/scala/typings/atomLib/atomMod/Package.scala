package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  /** The name of the Package. */
  val name: java.lang.String
  /** The path to the Package on disk. */
  val path: java.lang.String
  /** If a previous rebuild failed, get the contents of stderr. */
  def getBuildFailureOutput(): java.lang.String | scala.Null
  // Native Module Compatibility
  /**
    *  Are all native modules depended on by this package correctly compiled
    *  against the current version of Atom?
    */
  def isCompatible(): scala.Boolean
  // Event Subscription
  /** Invoke the given callback when all packages have been activated. */
  def onDidDeactivate(callback: js.Function0[scala.Unit]): Disposable
  /**
    *  Rebuild native modules in this package's dependencies for the current
    *  version of Atom.
    */
  def rebuild(): js.Promise[atomLib.Anon_Code]
}

object Package {
  @scala.inline
  def apply(
    getBuildFailureOutput: () => java.lang.String | scala.Null,
    isCompatible: () => scala.Boolean,
    name: java.lang.String,
    onDidDeactivate: js.Function0[scala.Unit] => Disposable,
    path: java.lang.String,
    rebuild: () => js.Promise[atomLib.Anon_Code]
  ): Package = {
    val __obj = js.Dynamic.literal(getBuildFailureOutput = js.Any.fromFunction0(getBuildFailureOutput), isCompatible = js.Any.fromFunction0(isCompatible), name = name, onDidDeactivate = js.Any.fromFunction1(onDidDeactivate), path = path, rebuild = js.Any.fromFunction0(rebuild))
  
    __obj.asInstanceOf[Package]
  }
}


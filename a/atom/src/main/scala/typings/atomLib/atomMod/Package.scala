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
    getBuildFailureOutput: js.Function0[java.lang.String | scala.Null],
    isCompatible: js.Function0[scala.Boolean],
    name: java.lang.String,
    onDidDeactivate: js.Function1[js.Function0[scala.Unit], Disposable],
    path: java.lang.String,
    rebuild: js.Function0[js.Promise[atomLib.Anon_Code]]
  ): Package = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBuildFailureOutput")(getBuildFailureOutput)
    __obj.updateDynamic("isCompatible")(isCompatible)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("onDidDeactivate")(onDidDeactivate)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("rebuild")(rebuild)
    __obj.asInstanceOf[Package]
  }
}


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


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows transacted access to an object. */
trait XTransactedObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** commits the changes made for object. */
  def commit(): scala.Unit
  /** removes all the changes made for the object after last commit or loading. */
  def revert(): scala.Unit
}


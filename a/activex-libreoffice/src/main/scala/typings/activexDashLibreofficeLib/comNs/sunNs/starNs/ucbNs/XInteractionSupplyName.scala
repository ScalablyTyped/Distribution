package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an interaction continuation used to hand back a new name for something.
  *
  * For example, this continuation can be selected when handling a {@link NameClashResolveRequest} in order to supply a new name for a clashing resource.
  * @author Kai Sommerfeld
  * @version 1.0
  */
trait XInteractionSupplyName
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionContinuation {
  /**
    * sets the name to supply.
    * @param Name contains the name to supply.
    */
  def setName(Name: java.lang.String): scala.Unit
}


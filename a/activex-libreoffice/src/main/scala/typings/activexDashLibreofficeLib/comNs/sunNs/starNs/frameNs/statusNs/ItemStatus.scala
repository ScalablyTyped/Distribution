package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.statusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a state of a property.
  * @since OOo 2.0
  */
trait ItemStatus extends js.Object {
  /**
    * numerical value which describes the current state of an item.
    * @see ItemState
    */
  var State: scala.Double
  /** optional data which can be used by an implementation to send additional information. The content is dependent on the specific implementation. */
  var aStateData: js.Any
}


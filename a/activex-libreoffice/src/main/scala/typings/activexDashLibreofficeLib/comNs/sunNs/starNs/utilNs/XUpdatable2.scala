package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface extends {@link XUpdatable} in order to provide more fine-tuned update modes. When performing a **soft** update, the implementor may
  * decide not to update in certain cases, such as when the controller is locked. When performing a **hard** update, on the other hand, the implementor
  * should perform update more aggressively even when the controller is locked.
  */
trait XUpdatable2 extends XUpdatable {
  /** Perform update, even when the controller is locked. */
  def updateHard(): scala.Unit
  /** Perform update, but update may not always be performed especially when the controller is locked. */
  def updateSoft(): scala.Unit
}


package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
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
  def updateHard(): Unit
  /** Perform update, but update may not always be performed especially when the controller is locked. */
  def updateSoft(): Unit
}

object XUpdatable2 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    update: () => Unit,
    updateHard: () => Unit,
    updateSoft: () => Unit
  ): XUpdatable2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), update = js.Any.fromFunction0(update), updateHard = js.Any.fromFunction0(updateHard), updateSoft = js.Any.fromFunction0(updateSoft))
    __obj.asInstanceOf[XUpdatable2]
  }
}


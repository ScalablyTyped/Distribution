package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ResourceActivationMode specifies, for example for the {@link com.sun.star.drawing.framework.XConfigurationController.requestResourceActivation()}
  * , whether a requested resource is to replace an existing resource of the same class or is to be activated additionally.
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait ResourceActivationMode extends js.Object

object ResourceActivationMode {
  /** A resource is requested in addition to already existing ones. This is used for example for panes. */
  @scala.inline
  def ADD: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** A resource is requested to replace an already existing one of the same class. This is used for example for views. */
  @scala.inline
  def REPLACE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


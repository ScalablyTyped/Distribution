package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResourceActivationMode extends js.Object

/**
  * The ResourceActivationMode specifies, for example for the {@link com.sun.star.drawing.framework.XConfigurationController.requestResourceActivation()}
  * , whether a requested resource is to replace an existing resource of the same class or is to be activated additionally.
  */
@JSGlobal("com.sun.star.drawing.framework.ResourceActivationMode")
@js.native
object ResourceActivationMode extends js.Object {
  /** A resource is requested in addition to already existing ones. This is used for example for panes. */
  @js.native
  sealed trait ADD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.ResourceActivationMode
  
  /** A resource is requested to replace an already existing one of the same class. This is used for example for views. */
  @js.native
  sealed trait REPLACE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.ResourceActivationMode
  
  /* 0 */ val ADD: ADD with scala.Double = js.native
  /* 1 */ val REPLACE: REPLACE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.ResourceActivationMode with scala.Double
  ] = js.native
}


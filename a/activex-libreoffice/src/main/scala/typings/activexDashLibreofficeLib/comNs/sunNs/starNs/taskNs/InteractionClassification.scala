package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InteractionClassification extends js.Object

/**
  * A classification of interaction requests.
  * @see com.sun.star.task.ClassifiedInteractionRequest This is the base of classified interaction requests.
  */
@JSGlobal("com.sun.star.task.InteractionClassification")
@js.native
object InteractionClassification extends js.Object {
  /** An error. */
  @js.native
  sealed trait ERROR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification
  
  /** Some information for the client/user (which will typically lead to the selection of an {@link com.sun.star.task.XInteractionApprove} continuation). */
  @js.native
  sealed trait INFO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification
  
  /**
    * A query for the client/user (which will typically lead to the selection of an {@link com.sun.star.task.XInteractionApprove} or {@link
    * com.sun.star.task.XInteractionDisapprove} continuation).
    */
  @js.native
  sealed trait QUERY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification
  
  /** A warning, less severe than an error. */
  @js.native
  sealed trait WARNING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification
  
  /* 0 */ val ERROR: ERROR with scala.Double = js.native
  /* 2 */ val INFO: INFO with scala.Double = js.native
  /* 3 */ val QUERY: QUERY with scala.Double = js.native
  /* 1 */ val WARNING: WARNING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification with scala.Double
  ] = js.native
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintableState extends js.Object

/**
  * specifies the print progress of an {@link XPrintable} .
  *
  * Printing consists of two abstract phases: rendering the document for the printer and then sending it to the printer (spooling). PrintableState
  * describes which phase is currently progressing or has failed.
  * @see PrintableStateEvent
  */
@JSGlobal("com.sun.star.view.PrintableState")
@js.native
object PrintableState extends js.Object {
  /** printing was aborted (e.g., by the user) while either printing or spooling. */
  @js.native
  sealed trait JOB_ABORTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PrintableState
  
  /** printing (rendering the document) has finished, spooling has begun */
  @js.native
  sealed trait JOB_COMPLETED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PrintableState
  
  /** printing ran into an error. */
  @js.native
  sealed trait JOB_FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PrintableState
  
  /** spooling has finished successfully. This is the only state that can be considered as "success" for a print job. */
  @js.native
  sealed trait JOB_SPOOLED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PrintableState
  
  /** the document could be printed but not spooled. */
  @js.native
  sealed trait JOB_SPOOLING_FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PrintableState
  
  /** printing (rendering the document) has begun */
  @js.native
  sealed trait JOB_STARTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PrintableState
  
  /* 3 */ val JOB_ABORTED: JOB_ABORTED with scala.Double = js.native
  /* 1 */ val JOB_COMPLETED: JOB_COMPLETED with scala.Double = js.native
  /* 4 */ val JOB_FAILED: JOB_FAILED with scala.Double = js.native
  /* 2 */ val JOB_SPOOLED: JOB_SPOOLED with scala.Double = js.native
  /* 5 */ val JOB_SPOOLING_FAILED: JOB_SPOOLING_FAILED with scala.Double = js.native
  /* 0 */ val JOB_STARTED: JOB_STARTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PrintableState with scala.Double
  ] = js.native
}


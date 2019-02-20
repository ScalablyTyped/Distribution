package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PresentationRange extends js.Object

/** specifies which part of the presentation is to show. */
@JSGlobal("com.sun.star.presentation.PresentationRange")
@js.native
object PresentationRange extends js.Object {
  /** use all slides. */
  @js.native
  sealed trait PRESENTATIONRANGE_ALL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.PresentationRange
  
  /** use only the active slide. */
  @js.native
  sealed trait PRESENTATIONRANGE_FROM_PAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.PresentationRange
  
  /** use an individual choice of slides. */
  @js.native
  sealed trait PRESENTATIONRANGE_INDIVIDUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.PresentationRange
  
  /* 0 */ val PRESENTATIONRANGE_ALL: PRESENTATIONRANGE_ALL with scala.Double = js.native
  /* 1 */ val PRESENTATIONRANGE_FROM_PAGE: PRESENTATIONRANGE_FROM_PAGE with scala.Double = js.native
  /* 2 */ val PRESENTATIONRANGE_INDIVIDUAL: PRESENTATIONRANGE_INDIVIDUAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.PresentationRange with scala.Double
  ] = js.native
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZoomLevel extends js.Object

@JSGlobal("com.sun.star.media.ZoomLevel")
@js.native
object ZoomLevel extends js.Object {
  /** specifies that the video should be zoomed to window size */
  @js.native
  sealed trait FIT_TO_WINDOW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs.ZoomLevel
  
  /** specifies that the video should be zoomed to window size with using a fixed aspect ratio */
  @js.native
  sealed trait FIT_TO_WINDOW_FIXED_ASPECT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs.ZoomLevel
  
  /** specifies that the video should be displayed in fullscreen mode, if available */
  @js.native
  sealed trait FULLSCREEN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs.ZoomLevel
  
  /** specifies that the video window itself is not available at all, e.g. in cases of pure audio playback */
  @js.native
  sealed trait NOT_AVAILABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs.ZoomLevel
  
  /** specifies that the video should be displayed with its original size */
  @js.native
  sealed trait ORIGINAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs.ZoomLevel
  
  /** specifies that the video should be zoomed to a factor of 1:2 */
  @js.native
  sealed trait ZOOM_1_TO_2
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs.ZoomLevel
  
  /** specifies that the video should be zoomed to a factor of 1:4 */
  @js.native
  sealed trait ZOOM_1_TO_4
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs.ZoomLevel
  
  /** specifies that the video should be zoomed to a factor of 2:1 */
  @js.native
  sealed trait ZOOM_2_TO_1
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs.ZoomLevel
  
  /** specifies that the video should be zoomed to a factor of 4:1 */
  @js.native
  sealed trait ZOOM_4_TO_1
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs.ZoomLevel
  
  /* 2 */ val FIT_TO_WINDOW: FIT_TO_WINDOW with scala.Double = js.native
  /* 3 */ val FIT_TO_WINDOW_FIXED_ASPECT: FIT_TO_WINDOW_FIXED_ASPECT with scala.Double = js.native
  /* 4 */ val FULLSCREEN: FULLSCREEN with scala.Double = js.native
  /* 0 */ val NOT_AVAILABLE: NOT_AVAILABLE with scala.Double = js.native
  /* 1 */ val ORIGINAL: ORIGINAL with scala.Double = js.native
  /* 6 */ val ZOOM_1_TO_2: ZOOM_1_TO_2 with scala.Double = js.native
  /* 5 */ val ZOOM_1_TO_4: ZOOM_1_TO_4 with scala.Double = js.native
  /* 7 */ val ZOOM_2_TO_1: ZOOM_2_TO_1 with scala.Double = js.native
  /* 8 */ val ZOOM_4_TO_1: ZOOM_4_TO_1 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs.ZoomLevel with scala.Double] = js.native
}


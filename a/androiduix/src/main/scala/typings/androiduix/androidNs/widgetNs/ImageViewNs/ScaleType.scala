package typings.androiduix.androidNs.widgetNs.ImageViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleType extends js.Object

@JSGlobal("android.widget.ImageView.ScaleType")
@js.native
object ScaleType extends js.Object {
  @js.native
  sealed trait CENTER extends ScaleType
  
  @js.native
  sealed trait CENTER_CROP extends ScaleType
  
  @js.native
  sealed trait CENTER_INSIDE extends ScaleType
  
  @js.native
  sealed trait FIT_CENTER extends ScaleType
  
  @js.native
  sealed trait FIT_END extends ScaleType
  
  @js.native
  sealed trait FIT_START extends ScaleType
  
  @js.native
  sealed trait FIT_XY extends ScaleType
  
  @js.native
  sealed trait MATRIX extends ScaleType
  
  /* 5 */ val CENTER: typings.androiduix.androidNs.widgetNs.ImageViewNs.ScaleType.CENTER with Double = js.native
  /* 6 */ val CENTER_CROP: typings.androiduix.androidNs.widgetNs.ImageViewNs.ScaleType.CENTER_CROP with Double = js.native
  /* 7 */ val CENTER_INSIDE: typings.androiduix.androidNs.widgetNs.ImageViewNs.ScaleType.CENTER_INSIDE with Double = js.native
  /* 3 */ val FIT_CENTER: typings.androiduix.androidNs.widgetNs.ImageViewNs.ScaleType.FIT_CENTER with Double = js.native
  /* 4 */ val FIT_END: typings.androiduix.androidNs.widgetNs.ImageViewNs.ScaleType.FIT_END with Double = js.native
  /* 2 */ val FIT_START: typings.androiduix.androidNs.widgetNs.ImageViewNs.ScaleType.FIT_START with Double = js.native
  /* 1 */ val FIT_XY: typings.androiduix.androidNs.widgetNs.ImageViewNs.ScaleType.FIT_XY with Double = js.native
  /* 0 */ val MATRIX: typings.androiduix.androidNs.widgetNs.ImageViewNs.ScaleType.MATRIX with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScaleType with Double] = js.native
}


package typings
package androiduixLib.androidNs.widgetNs.ImageViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleType extends js.Object

@JSGlobal("android.widget.ImageView.ScaleType")
@js.native
object ScaleType extends js.Object {
  @js.native
  sealed trait CENTER
    extends androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType
  
  @js.native
  sealed trait CENTER_CROP
    extends androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType
  
  @js.native
  sealed trait CENTER_INSIDE
    extends androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType
  
  @js.native
  sealed trait FIT_CENTER
    extends androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType
  
  @js.native
  sealed trait FIT_END
    extends androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType
  
  @js.native
  sealed trait FIT_START
    extends androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType
  
  @js.native
  sealed trait FIT_XY
    extends androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType
  
  @js.native
  sealed trait MATRIX
    extends androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType
  
  /* 5 */ val CENTER: CENTER with scala.Double = js.native
  /* 6 */ val CENTER_CROP: CENTER_CROP with scala.Double = js.native
  /* 7 */ val CENTER_INSIDE: CENTER_INSIDE with scala.Double = js.native
  /* 3 */ val FIT_CENTER: FIT_CENTER with scala.Double = js.native
  /* 4 */ val FIT_END: FIT_END with scala.Double = js.native
  /* 2 */ val FIT_START: FIT_START with scala.Double = js.native
  /* 1 */ val FIT_XY: FIT_XY with scala.Double = js.native
  /* 0 */ val MATRIX: MATRIX with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType with scala.Double] = js.native
}


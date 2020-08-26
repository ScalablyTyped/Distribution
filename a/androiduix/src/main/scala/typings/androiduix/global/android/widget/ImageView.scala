package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.widget.ImageView.ScaleType
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ImageView")
@js.native
class ImageView protected ()
  extends typings.androiduix.android.widget.ImageView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}

/* static members */
@JSGlobal("android.widget.ImageView")
@js.native
object ImageView extends js.Object {
  var sS2FArray: js.Any = js.native
  def parseScaleType(s: String, defaultType: ScaleType): ScaleType = js.native
  /* private */ def scaleTypeToScaleToFit(st: js.Any): js.Any = js.native
  @js.native
  object ScaleType extends js.Object {
    /* 5 */ val CENTER: typings.androiduix.android.widget.ImageView.ScaleType.CENTER with Double = js.native
    /* 6 */ val CENTER_CROP: typings.androiduix.android.widget.ImageView.ScaleType.CENTER_CROP with Double = js.native
    /* 7 */ val CENTER_INSIDE: typings.androiduix.android.widget.ImageView.ScaleType.CENTER_INSIDE with Double = js.native
    /* 3 */ val FIT_CENTER: typings.androiduix.android.widget.ImageView.ScaleType.FIT_CENTER with Double = js.native
    /* 4 */ val FIT_END: typings.androiduix.android.widget.ImageView.ScaleType.FIT_END with Double = js.native
    /* 2 */ val FIT_START: typings.androiduix.android.widget.ImageView.ScaleType.FIT_START with Double = js.native
    /* 1 */ val FIT_XY: typings.androiduix.android.widget.ImageView.ScaleType.FIT_XY with Double = js.native
    /* 0 */ val MATRIX: typings.androiduix.android.widget.ImageView.ScaleType.MATRIX with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.androiduix.android.widget.ImageView.ScaleType with Double] = js.native
  }
  
}


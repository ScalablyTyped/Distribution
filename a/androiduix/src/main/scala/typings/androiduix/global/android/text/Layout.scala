package typings.androiduix.global.android.text

import typings.androiduix.android.text.Layout.Alignment
import typings.androiduix.android.text.TextDirectionHeuristic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.text.Layout")
@js.native
abstract class Layout protected ()
  extends typings.androiduix.android.text.Layout {
  def this(text: String, paint: typings.androiduix.android.text.TextPaint, width: Double, align: Alignment) = this()
  def this(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    width: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic
  ) = this()
  def this(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    width: Double,
    align: Alignment,
    textDir: js.UndefOr[scala.Nothing],
    spacingMult: Double
  ) = this()
  def this(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    width: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingMult: Double
  ) = this()
  def this(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    width: Double,
    align: Alignment,
    textDir: js.UndefOr[scala.Nothing],
    spacingMult: js.UndefOr[scala.Nothing],
    spacingAdd: Double
  ) = this()
  def this(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    width: Double,
    align: Alignment,
    textDir: js.UndefOr[scala.Nothing],
    spacingMult: Double,
    spacingAdd: Double
  ) = this()
  def this(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    width: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingMult: js.UndefOr[scala.Nothing],
    spacingAdd: Double
  ) = this()
  def this(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    width: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingMult: Double,
    spacingAdd: Double
  ) = this()
}
object Layout {
  
  @JSGlobal("android.text.Layout")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("android.text.Layout.Alignment")
  @js.native
  object Alignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.androiduix.android.text.Layout.Alignment with Double] = js.native
    
    /* 2 */ val ALIGN_CENTER: typings.androiduix.android.text.Layout.Alignment.ALIGN_CENTER with Double = js.native
    
    /* 3 */ val ALIGN_LEFT: typings.androiduix.android.text.Layout.Alignment.ALIGN_LEFT with Double = js.native
    
    /* 0 */ val ALIGN_NORMAL: typings.androiduix.android.text.Layout.Alignment.ALIGN_NORMAL with Double = js.native
    
    /* 1 */ val ALIGN_OPPOSITE: typings.androiduix.android.text.Layout.Alignment.ALIGN_OPPOSITE with Double = js.native
    
    /* 4 */ val ALIGN_RIGHT: typings.androiduix.android.text.Layout.Alignment.ALIGN_RIGHT with Double = js.native
  }
  
  /* static member */
  @JSGlobal("android.text.Layout.DIRS_ALL_LEFT_TO_RIGHT")
  @js.native
  def DIRS_ALL_LEFT_TO_RIGHT: typings.androiduix.android.text.Layout.Directions = js.native
  @scala.inline
  def DIRS_ALL_LEFT_TO_RIGHT_=(x: typings.androiduix.android.text.Layout.Directions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRS_ALL_LEFT_TO_RIGHT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.Layout.DIRS_ALL_RIGHT_TO_LEFT")
  @js.native
  def DIRS_ALL_RIGHT_TO_LEFT: typings.androiduix.android.text.Layout.Directions = js.native
  @scala.inline
  def DIRS_ALL_RIGHT_TO_LEFT_=(x: typings.androiduix.android.text.Layout.Directions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRS_ALL_RIGHT_TO_LEFT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.Layout.DIR_LEFT_TO_RIGHT")
  @js.native
  def DIR_LEFT_TO_RIGHT: Double = js.native
  @scala.inline
  def DIR_LEFT_TO_RIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIR_LEFT_TO_RIGHT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.Layout.DIR_REQUEST_DEFAULT_LTR")
  @js.native
  def DIR_REQUEST_DEFAULT_LTR: Double = js.native
  @scala.inline
  def DIR_REQUEST_DEFAULT_LTR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIR_REQUEST_DEFAULT_LTR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.Layout.DIR_REQUEST_DEFAULT_RTL")
  @js.native
  def DIR_REQUEST_DEFAULT_RTL: Double = js.native
  @scala.inline
  def DIR_REQUEST_DEFAULT_RTL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIR_REQUEST_DEFAULT_RTL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.Layout.DIR_REQUEST_LTR")
  @js.native
  def DIR_REQUEST_LTR: Double = js.native
  @scala.inline
  def DIR_REQUEST_LTR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIR_REQUEST_LTR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.Layout.DIR_REQUEST_RTL")
  @js.native
  def DIR_REQUEST_RTL: Double = js.native
  @scala.inline
  def DIR_REQUEST_RTL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIR_REQUEST_RTL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.Layout.DIR_RIGHT_TO_LEFT")
  @js.native
  def DIR_RIGHT_TO_LEFT: Double = js.native
  @scala.inline
  def DIR_RIGHT_TO_LEFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIR_RIGHT_TO_LEFT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.text.Layout.Directions")
  @js.native
  class Directions protected ()
    extends typings.androiduix.android.text.Layout.Directions {
    def this(dirs: js.Array[Double]) = this()
  }
  
  /* static member */
  @JSGlobal("android.text.Layout.ELLIPSIS_NORMAL")
  @js.native
  def ELLIPSIS_NORMAL: js.Array[String] = js.native
  @scala.inline
  def ELLIPSIS_NORMAL_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELLIPSIS_NORMAL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.Layout.ELLIPSIS_TWO_DOTS")
  @js.native
  def ELLIPSIS_TWO_DOTS: js.Array[String] = js.native
  @scala.inline
  def ELLIPSIS_TWO_DOTS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELLIPSIS_TWO_DOTS")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.text.Layout.Ellipsizer")
  @js.native
  class Ellipsizer protected ()
    extends typings.androiduix.android.text.Layout.Ellipsizer {
    def this(s: String) = this()
  }
  
  /* static member */
  @JSGlobal("android.text.Layout.NO_PARA_SPANS")
  @js.native
  def NO_PARA_SPANS: js.Any = js.native
  @scala.inline
  def NO_PARA_SPANS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_PARA_SPANS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.Layout.RUN_LENGTH_MASK")
  @js.native
  def RUN_LENGTH_MASK: Double = js.native
  @scala.inline
  def RUN_LENGTH_MASK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUN_LENGTH_MASK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.Layout.RUN_LEVEL_MASK")
  @js.native
  def RUN_LEVEL_MASK: Double = js.native
  @scala.inline
  def RUN_LEVEL_MASK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUN_LEVEL_MASK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.Layout.RUN_LEVEL_SHIFT")
  @js.native
  def RUN_LEVEL_SHIFT: Double = js.native
  @scala.inline
  def RUN_LEVEL_SHIFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUN_LEVEL_SHIFT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.Layout.RUN_RTL_FLAG")
  @js.native
  def RUN_RTL_FLAG: Double = js.native
  @scala.inline
  def RUN_RTL_FLAG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUN_RTL_FLAG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.text.Layout.SpannedEllipsizer")
  @js.native
  class SpannedEllipsizer protected ()
    extends typings.androiduix.android.text.Layout.SpannedEllipsizer {
    def this(display: String) = this()
  }
  
  /* static member */
  @JSGlobal("android.text.Layout.TAB_INCREMENT")
  @js.native
  def TAB_INCREMENT: js.Any = js.native
  @scala.inline
  def TAB_INCREMENT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_INCREMENT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.text.Layout.TabStops")
  @js.native
  class TabStops protected ()
    extends typings.androiduix.android.text.Layout.TabStops {
    def this(increment: Double, spans: js.Array[_]) = this()
  }
  object TabStops {
    
    /* static member */
    @JSGlobal("android.text.Layout.TabStops.nextDefaultStop")
    @js.native
    def nextDefaultStop(h: Double, inc: Double): Double = js.native
  }
  
  /* static member */
  @JSGlobal("android.text.Layout.getDesiredWidth")
  @js.native
  def getDesiredWidth(source: String, paint: typings.androiduix.android.text.TextPaint): Double = js.native
  /* static member */
  @JSGlobal("android.text.Layout.getDesiredWidth")
  @js.native
  def getDesiredWidth(source: String, start: Double, end: Double, paint: typings.androiduix.android.text.TextPaint): Double = js.native
  
  /* static member */
  @JSGlobal("android.text.Layout.getDesiredWidth_2")
  @js.native
  def getDesiredWidth2(source: js.Any, paint: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.text.Layout.getDesiredWidth_4")
  @js.native
  def getDesiredWidth4(source: js.Any, start: js.Any, end: js.Any, paint: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.text.Layout.getParagraphSpans")
  @js.native
  def getParagraphSpans[T](text: typings.androiduix.android.text.Spanned, start: Double, end: Double, `type`: js.Any): js.Array[T] = js.native
  
  /* static member */
  @JSGlobal("android.text.Layout.measurePara")
  @js.native
  def measurePara(paint: typings.androiduix.android.text.TextPaint, text: String, start: Double, end: Double): Double = js.native
  
  /* static member */
  @JSGlobal("android.text.Layout.nextTab")
  @js.native
  def nextTab(text: String, start: Double, end: Double, h: Double, tabs: js.Array[_]): Double = js.native
  
  /* static member */
  @JSGlobal("android.text.Layout.sTempRect")
  @js.native
  def sTempRect: js.Any = js.native
  @scala.inline
  def sTempRect_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sTempRect")(x.asInstanceOf[js.Any])
}

package typings.androiduix.global.android.text

import typings.androiduix.android.text.Layout.Alignment
import typings.androiduix.android.text.TextDirectionHeuristic
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
/* static members */
@JSGlobal("android.text.Layout")
@js.native
object Layout extends js.Object {
  
  var DIRS_ALL_LEFT_TO_RIGHT: typings.androiduix.android.text.Layout.Directions = js.native
  
  var DIRS_ALL_RIGHT_TO_LEFT: typings.androiduix.android.text.Layout.Directions = js.native
  
  var DIR_LEFT_TO_RIGHT: Double = js.native
  
  var DIR_REQUEST_DEFAULT_LTR: Double = js.native
  
  var DIR_REQUEST_DEFAULT_RTL: Double = js.native
  
  var DIR_REQUEST_LTR: Double = js.native
  
  var DIR_REQUEST_RTL: Double = js.native
  
  var DIR_RIGHT_TO_LEFT: Double = js.native
  
  var ELLIPSIS_NORMAL: js.Array[String] = js.native
  
  var ELLIPSIS_TWO_DOTS: js.Array[String] = js.native
  
  var NO_PARA_SPANS: js.Any = js.native
  
  var RUN_LENGTH_MASK: Double = js.native
  
  var RUN_LEVEL_MASK: Double = js.native
  
  var RUN_LEVEL_SHIFT: Double = js.native
  
  var RUN_RTL_FLAG: Double = js.native
  
  var TAB_INCREMENT: js.Any = js.native
  
  def getDesiredWidth(source: String, paint: typings.androiduix.android.text.TextPaint): Double = js.native
  def getDesiredWidth(source: String, start: Double, end: Double, paint: typings.androiduix.android.text.TextPaint): Double = js.native
  
  /* private */ def getDesiredWidth_2(source: js.Any, paint: js.Any): js.Any = js.native
  
  /* private */ def getDesiredWidth_4(source: js.Any, start: js.Any, end: js.Any, paint: js.Any): js.Any = js.native
  
  def getParagraphSpans[T](text: typings.androiduix.android.text.Spanned, start: Double, end: Double, `type`: js.Any): js.Array[T] = js.native
  
  def measurePara(paint: typings.androiduix.android.text.TextPaint, text: String, start: Double, end: Double): Double = js.native
  
  def nextTab(text: String, start: Double, end: Double, h: Double, tabs: js.Array[_]): Double = js.native
  
  var sTempRect: js.Any = js.native
  
  @js.native
  object Alignment extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.androiduix.android.text.Layout.Alignment with Double] = js.native
    
    /* 2 */ val ALIGN_CENTER: typings.androiduix.android.text.Layout.Alignment.ALIGN_CENTER with Double = js.native
    
    /* 3 */ val ALIGN_LEFT: typings.androiduix.android.text.Layout.Alignment.ALIGN_LEFT with Double = js.native
    
    /* 0 */ val ALIGN_NORMAL: typings.androiduix.android.text.Layout.Alignment.ALIGN_NORMAL with Double = js.native
    
    /* 1 */ val ALIGN_OPPOSITE: typings.androiduix.android.text.Layout.Alignment.ALIGN_OPPOSITE with Double = js.native
    
    /* 4 */ val ALIGN_RIGHT: typings.androiduix.android.text.Layout.Alignment.ALIGN_RIGHT with Double = js.native
  }
  
  @js.native
  class Directions protected ()
    extends typings.androiduix.android.text.Layout.Directions {
    def this(dirs: js.Array[Double]) = this()
  }
  
  @js.native
  class Ellipsizer protected ()
    extends typings.androiduix.android.text.Layout.Ellipsizer {
    def this(s: String) = this()
  }
  
  @js.native
  class SpannedEllipsizer protected ()
    extends typings.androiduix.android.text.Layout.SpannedEllipsizer {
    def this(display: String) = this()
  }
  
  @js.native
  class TabStops protected ()
    extends typings.androiduix.android.text.Layout.TabStops {
    def this(increment: Double, spans: js.Array[_]) = this()
  }
  /* static members */
  @js.native
  object TabStops extends js.Object {
    
    def nextDefaultStop(h: Double, inc: Double): Double = js.native
  }
}

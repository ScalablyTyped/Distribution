package typings.androiduix.global.android.text

import typings.androiduix.android.graphics.Paint.FontMetricsInt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.text.TextLine")
@js.native
class TextLine ()
  extends typings.androiduix.android.text.TextLine
object TextLine {
  
  @JSGlobal("android.text.TextLine")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.text.TextLine.DEBUG")
  @js.native
  def DEBUG: js.Any = js.native
  @scala.inline
  def DEBUG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextLine.TAB_INCREMENT")
  @js.native
  def TAB_INCREMENT: js.Any = js.native
  @scala.inline
  def TAB_INCREMENT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_INCREMENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextLine.expandMetricsFromPaint")
  @js.native
  def expandMetricsFromPaint(fmi: js.Any, wp: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.text.TextLine.obtain")
  @js.native
  def obtain(): typings.androiduix.android.text.TextLine = js.native
  
  /* static member */
  @JSGlobal("android.text.TextLine.recycle")
  @js.native
  def recycle(tl: typings.androiduix.android.text.TextLine): typings.androiduix.android.text.TextLine = js.native
  
  /* static member */
  @JSGlobal("android.text.TextLine.sCached")
  @js.native
  def sCached: js.Any = js.native
  @scala.inline
  def sCached_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sCached")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.text.TextLine.updateMetrics")
  @js.native
  def updateMetrics(
    fmi: FontMetricsInt,
    previousTop: Double,
    previousAscent: Double,
    previousDescent: Double,
    previousBottom: Double,
    previousLeading: Double
  ): Unit = js.native
}

package typings.androiduix.android.text

import typings.androiduix.android.text.TextUtils.TruncateAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticLayout extends Layout {
  
  /* private */ def calculateEllipsis(
    lineStart: js.Any,
    lineEnd: js.Any,
    widths: js.Any,
    widthStart: js.Any,
    avail: js.Any,
    where: js.Any,
    line: js.Any,
    textWidth: js.Any,
    paint: js.Any,
    forceEllipsis: js.Any
  ): js.Any = js.native
  
  def finish(): Unit = js.native
  
  def generate(
    source: String,
    bufStart: Double,
    bufEnd: Double,
    paint: TextPaint,
    outerWidth: Double,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    trackpad: Boolean,
    ellipsizedWidth: Double,
    ellipsize: TruncateAt
  ): Unit = js.native
  
  var mBottomPadding: js.Any = js.native
  
  var mColumns: js.Any = js.native
  
  var mEllipsizedWidth: js.Any = js.native
  
  var mFontMetricsInt: js.Any = js.native
  
  var mLineCount: js.Any = js.native
  
  var mLineDirections: js.Any = js.native
  
  var mLines: js.Any = js.native
  
  var mMaximumVisibleLineCount: js.Any = js.native
  
  var mMeasured: js.Any = js.native
  
  var mTopPadding: js.Any = js.native
  
  /* private */ def out(
    text: js.Any,
    start: js.Any,
    end: js.Any,
    above: js.Any,
    below: js.Any,
    top: js.Any,
    bottom: js.Any,
    v: js.Any,
    spacingmult: js.Any,
    spacingadd: js.Any,
    chooseHt: js.Any,
    chooseHtv: js.Any,
    fm: js.Any,
    hasTabOrEmoji: js.Any,
    needMultiply: js.Any,
    chdirs: js.Any,
    dir: js.Any,
    easy: js.Any,
    bufEnd: js.Any,
    includePad: js.Any,
    trackPad: js.Any,
    chs: js.Any,
    widths: js.Any,
    widthStart: js.Any,
    ellipsize: js.Any,
    ellipsisWidth: js.Any,
    textWidth: js.Any,
    paint: js.Any,
    moreChars: js.Any
  ): js.Any = js.native
  
  def prepare(): Unit = js.native
}

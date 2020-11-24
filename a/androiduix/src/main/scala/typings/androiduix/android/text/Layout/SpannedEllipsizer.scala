package typings.androiduix.android.text.Layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.NumberDictionary because Already inherited
- typings.std.String because Already inherited
- typings.androiduix.android.text.Spanned because var conflicts: iterator. Inlined getSpans, getSpanStart, getSpanEnd, getSpanFlags, nextSpanTransition */ @js.native
trait SpannedEllipsizer extends Ellipsizer {
  
  def getSpanEnd(tag: js.Any): Double = js.native
  
  def getSpanFlags(tag: js.Any): Double = js.native
  
  def getSpanStart(tag: js.Any): Double = js.native
  
  def getSpans[T](start: Double, end: Double, `type`: js.Any): js.Array[T] = js.native
  
  var mSpanned: js.Any = js.native
  
  def nextSpanTransition(start: Double, limit: Double, `type`: js.Any): Double = js.native
}

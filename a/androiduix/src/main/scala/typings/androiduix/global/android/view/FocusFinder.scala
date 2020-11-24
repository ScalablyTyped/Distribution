package typings.androiduix.global.android.view

import typings.androiduix.android.graphics.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.view.FocusFinder")
@js.native
class FocusFinder ()
  extends typings.androiduix.android.view.FocusFinder
/* static members */
@JSGlobal("android.view.FocusFinder")
@js.native
object FocusFinder extends js.Object {
  
  def getInstance(): typings.androiduix.android.view.FocusFinder = js.native
  
  /* private */ def getNextFocusable(focused: js.Any, focusables: js.Any, count: js.Any): js.Any = js.native
  
  /* private */ def getPreviousFocusable(focused: js.Any, focusables: js.Any, count: js.Any): js.Any = js.native
  
  def majorAxisDistance(direction: Double, source: Rect, dest: Rect): Double = js.native
  
  def majorAxisDistanceRaw(direction: Double, source: Rect, dest: Rect): Double = js.native
  
  def majorAxisDistanceToFarEdge(direction: Double, source: Rect, dest: Rect): Double = js.native
  
  def majorAxisDistanceToFarEdgeRaw(direction: Double, source: Rect, dest: Rect): Double = js.native
  
  def minorAxisDistance(direction: Double, source: Rect, dest: Rect): Double = js.native
  
  var sFocusFinder: js.Any = js.native
}

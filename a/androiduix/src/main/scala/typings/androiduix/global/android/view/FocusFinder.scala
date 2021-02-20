package typings.androiduix.global.android.view

import typings.androiduix.android.graphics.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.view.FocusFinder")
@js.native
class FocusFinder ()
  extends typings.androiduix.android.view.FocusFinder
object FocusFinder {
  
  @JSGlobal("android.view.FocusFinder")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.view.FocusFinder.getInstance")
  @js.native
  def getInstance(): typings.androiduix.android.view.FocusFinder = js.native
  
  /* static member */
  @JSGlobal("android.view.FocusFinder.getNextFocusable")
  @js.native
  def getNextFocusable(focused: js.Any, focusables: js.Any, count: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.view.FocusFinder.getPreviousFocusable")
  @js.native
  def getPreviousFocusable(focused: js.Any, focusables: js.Any, count: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.view.FocusFinder.majorAxisDistance")
  @js.native
  def majorAxisDistance(direction: Double, source: Rect, dest: Rect): Double = js.native
  
  /* static member */
  @JSGlobal("android.view.FocusFinder.majorAxisDistanceRaw")
  @js.native
  def majorAxisDistanceRaw(direction: Double, source: Rect, dest: Rect): Double = js.native
  
  /* static member */
  @JSGlobal("android.view.FocusFinder.majorAxisDistanceToFarEdge")
  @js.native
  def majorAxisDistanceToFarEdge(direction: Double, source: Rect, dest: Rect): Double = js.native
  
  /* static member */
  @JSGlobal("android.view.FocusFinder.majorAxisDistanceToFarEdgeRaw")
  @js.native
  def majorAxisDistanceToFarEdgeRaw(direction: Double, source: Rect, dest: Rect): Double = js.native
  
  /* static member */
  @JSGlobal("android.view.FocusFinder.minorAxisDistance")
  @js.native
  def minorAxisDistance(direction: Double, source: Rect, dest: Rect): Double = js.native
  
  /* static member */
  @JSGlobal("android.view.FocusFinder.sFocusFinder")
  @js.native
  def sFocusFinder: js.Any = js.native
  @scala.inline
  def sFocusFinder_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sFocusFinder")(x.asInstanceOf[js.Any])
}

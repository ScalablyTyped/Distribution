package typings.androiduix.android.text

import typings.std.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spanned extends String {
  
  def getSpanEnd(tag: js.Any): Double = js.native
  
  def getSpanFlags(tag: js.Any): Double = js.native
  
  def getSpanStart(tag: js.Any): Double = js.native
  
  def getSpans[T](start: Double, end: Double, `type`: js.Any): js.Array[T] = js.native
  
  def nextSpanTransition(start: Double, limit: Double, `type`: js.Any): Double = js.native
}

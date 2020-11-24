package typings.androiduix.android.graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends js.Object {
  
  def equals(o: js.Any): Boolean = js.native
  def equals(x: Double, y: Double): Boolean = js.native
  
  def negate(): Unit = js.native
  
  def offset(dx: Double, dy: Double): Unit = js.native
  
  def set(x: Double, y: Double): Unit = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}

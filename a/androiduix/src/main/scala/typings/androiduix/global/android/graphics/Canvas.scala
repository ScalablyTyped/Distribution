package typings.androiduix.global.android.graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.graphics.Canvas")
@js.native
class Canvas protected ()
  extends typings.androiduix.android.graphics.Canvas {
  def this(width: Double, height: Double) = this()
}
/* static members */
@JSGlobal("android.graphics.Canvas")
@js.native
object Canvas extends js.Object {
  
  var DIRECTION_LTR: Double = js.native
  
  var DIRECTION_RTL: Double = js.native
  
  var TempMatrixValue: js.Array[Double] = js.native
  
  var _measureCacheMap: js.Any = js.native
  
  var _measureCacheTextSize: js.Any = js.native
  
  var _measureTextContext: js.Any = js.native
  
  var _static: js.Any = js.native
  
  /* protected */ def getMeasureTextFontFamily(): String = js.native
  
  def measureText(text: String, textSize: Double): Double = js.native
  
  /* protected */ def measureTextImpl(text: String, textSize: Double): Double = js.native
  
  /* private */ def obtainRect(copy: js.Any): js.Any = js.native
  
  /* private */ def recycleRect(rect: js.Any): js.Any = js.native
  
  var sRectPool: js.Any = js.native
}

package typings.androiduix.global.android.graphics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.graphics.Canvas")
@js.native
class Canvas protected ()
  extends typings.androiduix.android.graphics.Canvas {
  def this(width: Double, height: Double) = this()
}
object Canvas {
  
  @JSGlobal("android.graphics.Canvas")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Canvas.DIRECTION_LTR")
  @js.native
  def DIRECTION_LTR: Double = js.native
  @scala.inline
  def DIRECTION_LTR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_LTR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Canvas.DIRECTION_RTL")
  @js.native
  def DIRECTION_RTL: Double = js.native
  @scala.inline
  def DIRECTION_RTL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_RTL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Canvas.TempMatrixValue")
  @js.native
  def TempMatrixValue: js.Array[Double] = js.native
  @scala.inline
  def TempMatrixValue_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TempMatrixValue")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Canvas.getMeasureTextFontFamily")
  @js.native
  def getMeasureTextFontFamily(): String = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Canvas._measureCacheMap")
  @js.native
  def measureCacheMap: js.Any = js.native
  
  @scala.inline
  def measureCacheMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_measureCacheMap")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Canvas._measureCacheTextSize")
  @js.native
  def measureCacheTextSize: js.Any = js.native
  
  @scala.inline
  def measureCacheTextSize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_measureCacheTextSize")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Canvas.measureText")
  @js.native
  def measureText(text: String, textSize: Double): Double = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Canvas._measureTextContext")
  @js.native
  def measureTextContext: js.Any = js.native
  
  @scala.inline
  def measureTextContext_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_measureTextContext")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Canvas.measureTextImpl")
  @js.native
  def measureTextImpl(text: String, textSize: Double): Double = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Canvas.obtainRect")
  @js.native
  def obtainRect(copy: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Canvas.recycleRect")
  @js.native
  def recycleRect(rect: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.graphics.Canvas.sRectPool")
  @js.native
  def sRectPool: js.Any = js.native
  @scala.inline
  def sRectPool_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sRectPool")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.graphics.Canvas._static")
  @js.native
  def static: js.Any = js.native
  
  @scala.inline
  def static_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_static")(x.asInstanceOf[js.Any])
}

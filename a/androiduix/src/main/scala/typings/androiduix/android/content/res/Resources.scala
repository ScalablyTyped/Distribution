package typings.androiduix.android.content.res

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.util.DisplayMetrics
import typings.androiduix.android.util.Pools.SynchronizedPool
import typings.androiduix.android.view.animation.Animation
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resources extends js.Object {
  
  var context: js.Any = js.native
  
  var displayMetrics: js.Any = js.native
  
  /* private */ def fillDisplayMetrics(displayMetrics: js.Any): js.Any = js.native
  
  def getAnimation(refString: String): Animation = js.native
  
  def getBoolean(refString: String): Boolean = js.native
  
  def getColor(refString: String): Double = js.native
  
  def getColorStateList(refString: String): ColorStateList = js.native
  
  def getDefStyle(refString: String): js.Any = js.native
  
  def getDimension(refString: String): Double = js.native
  def getDimension(refString: String, baseValue: Double): Double = js.native
  
  def getDimensionPixelOffset(refString: String): Double = js.native
  def getDimensionPixelOffset(refString: String, baseValue: Double): Double = js.native
  
  def getDimensionPixelSize(refString: String): Double = js.native
  def getDimensionPixelSize(refString: String, baseValue: Double): Double = js.native
  
  def getDisplayMetrics(): DisplayMetrics = js.native
  
  def getDrawable(refString: String): Drawable = js.native
  
  def getFloat(refString: String): Double = js.native
  
  def getIntArray(refString: String): js.Array[Double] = js.native
  
  def getInteger(refString: String): Double = js.native
  
  def getLayout(refString: String): HTMLElement = js.native
  
  def getString(refString: String): String = js.native
  
  def getStringArray(refString: String): js.Array[String] = js.native
  
  /* private */ def getStyleAsMap(refString: js.Any): js.Any = js.native
  
  def getValue(refString: String): HTMLElement = js.native
  def getValue(refString: String, resolveRefs: Boolean): HTMLElement = js.native
  
  def getXml(refString: String): HTMLElement = js.native
  
  var mTypedArrayPool: SynchronizedPool[TypedArray] = js.native
  
  def obtainAttributes(attrs: HTMLElement): TypedArray = js.native
  
  def obtainStyledAttributes(attrs: HTMLElement, defStyleAttr: Map[String, String]): TypedArray = js.native
}

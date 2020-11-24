package typings.androiduix.androidui.attr

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.res.ColorStateList
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup.LayoutParams
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrBinder extends js.Object {
  
  def addAttr(attrName: String, onAttrChange: js.Function1[/* newValue */ js.Any, Unit]): Unit = js.native
  def addAttr(
    attrName: String,
    onAttrChange: js.Function1[/* newValue */ js.Any, Unit],
    stashAttrValueWhenStateChange: js.Function0[_]
  ): Unit = js.native
  
  var attrChangeMap: js.Any = js.native
  
  var attrStashMap: js.Any = js.native
  
  var classAttrBindMap: js.Any = js.native
  
  def getAttrValue(attrName: String): String = js.native
  
  /* private */ def getRefObject(ref: js.Any): js.Any = js.native
  
  var host: js.Any = js.native
  
  var mContext: js.Any = js.native
  
  var objectRefs: js.Any = js.native
  
  def onAttrChange(attrName: String, attrValue: js.Any, context: Context): Unit = js.native
  
  def parseBoolean(value: js.Any): Boolean = js.native
  def parseBoolean(value: js.Any, defaultValue: Boolean): Boolean = js.native
  
  def parseColor(value: String): Double = js.native
  def parseColor(value: String, defaultValue: Double): Double = js.native
  
  def parseColorList(value: String): ColorStateList = js.native
  
  def parseDimension(value: js.Any): Double = js.native
  def parseDimension(value: js.Any, defaultValue: js.UndefOr[scala.Nothing], baseValue: Double): Double = js.native
  def parseDimension(value: js.Any, defaultValue: Double): Double = js.native
  def parseDimension(value: js.Any, defaultValue: Double, baseValue: Double): Double = js.native
  
  def parseDrawable(s: String): Drawable = js.native
  
  def parseEnum(value: js.Any, enumMap: Map[String, Double], defaultValue: Double): Double = js.native
  
  def parseFloat(value: js.Any): Double = js.native
  def parseFloat(value: js.Any, defaultValue: Double): Double = js.native
  
  def parseGravity(s: String): Double = js.native
  def parseGravity(s: String, defaultValue: Double): Double = js.native
  
  def parseInt(value: js.Any): Double = js.native
  def parseInt(value: js.Any, defaultValue: Double): Double = js.native
  
  def parseNumberPixelOffset(value: js.Any): Double = js.native
  def parseNumberPixelOffset(value: js.Any, defaultValue: js.UndefOr[scala.Nothing], baseValue: Double): Double = js.native
  def parseNumberPixelOffset(value: js.Any, defaultValue: Double): Double = js.native
  def parseNumberPixelOffset(value: js.Any, defaultValue: Double, baseValue: Double): Double = js.native
  
  def parseNumberPixelSize(value: js.Any): Double = js.native
  def parseNumberPixelSize(value: js.Any, defaultValue: js.UndefOr[scala.Nothing], baseValue: Double): Double = js.native
  def parseNumberPixelSize(value: js.Any, defaultValue: Double): Double = js.native
  def parseNumberPixelSize(value: js.Any, defaultValue: Double, baseValue: Double): Double = js.native
  
  def parsePaddingMarginTRBL(value: js.Any): js.Array[Double] = js.native
  
  def parseString(value: js.Any): String = js.native
  def parseString(value: js.Any, defaultValue: String): String = js.native
  
  def parseStringArray(value: js.Any): js.Array[String] = js.native
  
  def setClassAttrBind(classAttrBind: ClassBinderMap): Unit = js.native
  
  /* private */ def setRefObject(obj: js.Any): js.Any = js.native
}
@JSGlobal("androidui.attr.AttrBinder")
@js.native
object AttrBinder extends js.Object {
  
  @js.native
  trait ClassBinderMap extends js.Object {
    
    var binderMap: Map[String, ClassBinderValue] = js.native
    
    /* private */ def callGetter(attrName: js.Any, host: js.Any): js.Any = js.native
    
    /* private */ def callSetter(attrName: js.Any, host: js.Any, attrValue: js.Any, attrBinder: js.Any): js.Any = js.native
    
    def get(key: String): ClassBinderValue = js.native
    
    def set(key: String): ClassBinderMap = js.native
    def set(key: String, value: ClassBinderValue): ClassBinderMap = js.native
  }
  
  @js.native
  trait ClassBinderValue extends js.Object {
    
    var getter: js.UndefOr[js.Function1[/* host */ View | LayoutParams, _]] = js.native
    
    def setter(host: LayoutParams, attrValue: js.Any, attrBinder: AttrBinder): Unit = js.native
    def setter(host: View, attrValue: js.Any, attrBinder: AttrBinder): Unit = js.native
  }
}

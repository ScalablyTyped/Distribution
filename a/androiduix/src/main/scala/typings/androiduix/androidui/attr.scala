package typings.androiduix.androidui

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.res.ColorStateList
import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup.LayoutParams
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderValue
import typings.androiduix.androidui.attr.StateAttr
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.attr")
@js.native
object attr extends js.Object {
  @js.native
  class AttrBinder protected () extends js.Object {
    def this(host: View) = this()
    def this(host: LayoutParams) = this()
    var attrChangeMap: js.Any = js.native
    var attrStashMap: js.Any = js.native
    var classAttrBindMap: js.Any = js.native
    var host: js.Any = js.native
    var mContext: js.Any = js.native
    var objectRefs: js.Any = js.native
    def addAttr(attrName: String, onAttrChange: js.Function1[/* newValue */ js.Any, Unit]): Unit = js.native
    def addAttr(
      attrName: String,
      onAttrChange: js.Function1[/* newValue */ js.Any, Unit],
      stashAttrValueWhenStateChange: js.Function0[_]
    ): Unit = js.native
    def getAttrValue(attrName: String): String = js.native
    /* private */ def getRefObject(ref: js.Any): js.Any = js.native
    def onAttrChange(attrName: String, attrValue: js.Any, context: Context): Unit = js.native
    def parseBoolean(value: js.Any): Boolean = js.native
    def parseBoolean(value: js.Any, defaultValue: Boolean): Boolean = js.native
    def parseColor(value: String): Double = js.native
    def parseColor(value: String, defaultValue: Double): Double = js.native
    def parseColorList(value: String): ColorStateList = js.native
    def parseDimension(value: js.Any): Double = js.native
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
    def parseNumberPixelOffset(value: js.Any, defaultValue: Double): Double = js.native
    def parseNumberPixelOffset(value: js.Any, defaultValue: Double, baseValue: Double): Double = js.native
    def parseNumberPixelSize(value: js.Any): Double = js.native
    def parseNumberPixelSize(value: js.Any, defaultValue: Double): Double = js.native
    def parseNumberPixelSize(value: js.Any, defaultValue: Double, baseValue: Double): Double = js.native
    def parsePaddingMarginTRBL(value: js.Any): js.Array[Double] = js.native
    def parseString(value: js.Any): String = js.native
    def parseString(value: js.Any, defaultValue: String): String = js.native
    def parseStringArray(value: js.Any): js.Array[String] = js.native
    def setClassAttrBind(classAttrBind: ClassBinderMap): Unit = js.native
    /* private */ def setRefObject(obj: js.Any): js.Any = js.native
  }
  
  @js.native
  class AttrValueParser () extends js.Object
  
  @js.native
  class StateAttr protected () extends js.Object {
    def this(state: js.Array[Double]) = this()
    var attributes: js.Any = js.native
    var stateSpec: js.Any = js.native
    def createDiffKeyAsNullValueAttrMap(another: StateAttr): Map[String, String] = js.native
    def getAttrMap(): Map[String, String] = js.native
    def hasAttr(name: String): Boolean = js.native
    def isDefaultState(): Boolean = js.native
    def isStateEquals(state: js.Array[Double]): Boolean = js.native
    def isStateMatch(state: js.Array[Double]): Boolean = js.native
    def putAll(stateAttr: StateAttr): Unit = js.native
    def setAttr(name: String, value: String): Unit = js.native
  }
  
  @js.native
  class StateAttrList protected () extends js.Object {
    def this(view: View) = this()
    var mView: js.Any = js.native
    var matchedStateAttrList: js.Any = js.native
    var originStateAttrList: js.Any = js.native
    def addStatedAttr(attrName: String, attrValue: String): Unit = js.native
    /* private */ def addStatedAttrImpl(attrName: js.Any, attrValue: js.Any, inParseState: js.Any): js.Any = js.native
    def getMatchedStateAttr(state: js.Array[Double]): StateAttr = js.native
    /* private */ def getOrCreateStateAttr(state: js.Any): js.Any = js.native
    /* private */ def getStateAttr(state: js.Any): js.Any = js.native
    def removeAttrAllState(attrName: String): Unit = js.native
  }
  
  @js.native
  object AttrBinder extends js.Object {
    @js.native
    class ClassBinderMap () extends js.Object {
      def this(copyBinderMap: Map[String, ClassBinderValue]) = this()
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
  
  /* static members */
  @js.native
  object AttrValueParser extends js.Object {
    def parseBoolean(r: Resources, value: String, defValue: Boolean): Boolean = js.native
    def parseColor(r: Resources, value: String, defValue: Double): Double = js.native
    def parseColorStateList(r: Resources, value: String): ColorStateList = js.native
    def parseDimension(r: Resources, value: String, defValue: Double): Double = js.native
    def parseDimension(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
    def parseDimensionPixelOffset(r: Resources, value: String, defValue: Double): Double = js.native
    def parseDimensionPixelOffset(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
    def parseDimensionPixelSize(r: Resources, value: String, defValue: Double): Double = js.native
    def parseDimensionPixelSize(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
    def parseDrawable(r: Resources, value: String): Drawable = js.native
    def parseFloat(r: Resources, value: String, defValue: Double): Double = js.native
    def parseInt(r: Resources, value: String, defValue: Double): Double = js.native
    def parseString(r: Resources, value: String): String = js.native
    def parseString(r: Resources, value: String, defValue: String): String = js.native
    def parseTextArray(r: Resources, value: String): js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object StateAttrList extends js.Object {
    def getViewStateValue(attrName: String): Double = js.native
  }
  
}


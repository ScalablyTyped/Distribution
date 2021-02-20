package typings.androiduix.androidui

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.res.ColorStateList
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup.LayoutParams
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attr {
  
  @js.native
  trait AttrBinder extends StObject {
    
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
  object AttrBinder {
    
    @js.native
    trait ClassBinderMap extends StObject {
      
      var binderMap: Map[String, ClassBinderValue] = js.native
      
      /* private */ def callGetter(attrName: js.Any, host: js.Any): js.Any = js.native
      
      /* private */ def callSetter(attrName: js.Any, host: js.Any, attrValue: js.Any, attrBinder: js.Any): js.Any = js.native
      
      def get(key: String): ClassBinderValue = js.native
      
      def set(key: String): ClassBinderMap = js.native
      def set(key: String, value: ClassBinderValue): ClassBinderMap = js.native
    }
    
    @js.native
    trait ClassBinderValue extends StObject {
      
      var getter: js.UndefOr[js.Function1[/* host */ View | LayoutParams, _]] = js.native
      
      def setter(host: LayoutParams, attrValue: js.Any, attrBinder: AttrBinder): Unit = js.native
      def setter(host: View, attrValue: js.Any, attrBinder: AttrBinder): Unit = js.native
    }
  }
  
  @js.native
  trait AttrValueParser extends StObject
  
  @js.native
  trait StateAttr extends StObject {
    
    var attributes: js.Any = js.native
    
    def createDiffKeyAsNullValueAttrMap(another: StateAttr): Map[String, String] = js.native
    
    def getAttrMap(): Map[String, String] = js.native
    
    def hasAttr(name: String): Boolean = js.native
    
    def isDefaultState(): Boolean = js.native
    
    def isStateEquals(state: js.Array[Double]): Boolean = js.native
    
    def isStateMatch(state: js.Array[Double]): Boolean = js.native
    
    def putAll(stateAttr: StateAttr): Unit = js.native
    
    def setAttr(name: String, value: String): Unit = js.native
    
    var stateSpec: js.Any = js.native
  }
  object StateAttr {
    
    @scala.inline
    def apply(
      attributes: js.Any,
      createDiffKeyAsNullValueAttrMap: StateAttr => Map[String, String],
      getAttrMap: () => Map[String, String],
      hasAttr: String => Boolean,
      isDefaultState: () => Boolean,
      isStateEquals: js.Array[Double] => Boolean,
      isStateMatch: js.Array[Double] => Boolean,
      putAll: StateAttr => Unit,
      setAttr: (String, String) => Unit,
      stateSpec: js.Any
    ): StateAttr = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], createDiffKeyAsNullValueAttrMap = js.Any.fromFunction1(createDiffKeyAsNullValueAttrMap), getAttrMap = js.Any.fromFunction0(getAttrMap), hasAttr = js.Any.fromFunction1(hasAttr), isDefaultState = js.Any.fromFunction0(isDefaultState), isStateEquals = js.Any.fromFunction1(isStateEquals), isStateMatch = js.Any.fromFunction1(isStateMatch), putAll = js.Any.fromFunction1(putAll), setAttr = js.Any.fromFunction2(setAttr), stateSpec = stateSpec.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateAttr]
    }
    
    @scala.inline
    implicit class StateAttrMutableBuilder[Self <: StateAttr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDiffKeyAsNullValueAttrMap(value: StateAttr => Map[String, String]): Self = StObject.set(x, "createDiffKeyAsNullValueAttrMap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAttrMap(value: () => Map[String, String]): Self = StObject.set(x, "getAttrMap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasAttr(value: String => Boolean): Self = StObject.set(x, "hasAttr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsDefaultState(value: () => Boolean): Self = StObject.set(x, "isDefaultState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsStateEquals(value: js.Array[Double] => Boolean): Self = StObject.set(x, "isStateEquals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsStateMatch(value: js.Array[Double] => Boolean): Self = StObject.set(x, "isStateMatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPutAll(value: StateAttr => Unit): Self = StObject.set(x, "putAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAttr(value: (String, String) => Unit): Self = StObject.set(x, "setAttr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStateSpec(value: js.Any): Self = StObject.set(x, "stateSpec", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StateAttrList extends StObject {
    
    def addStatedAttr(attrName: String, attrValue: String): Unit = js.native
    
    /* private */ def addStatedAttrImpl(attrName: js.Any, attrValue: js.Any, inParseState: js.Any): js.Any = js.native
    
    def getMatchedStateAttr(state: js.Array[Double]): StateAttr = js.native
    
    /* private */ def getOrCreateStateAttr(state: js.Any): js.Any = js.native
    
    /* private */ def getStateAttr(state: js.Any): js.Any = js.native
    
    var mView: js.Any = js.native
    
    var matchedStateAttrList: js.Any = js.native
    
    var originStateAttrList: js.Any = js.native
    
    def removeAttrAllState(attrName: String): Unit = js.native
  }
  object StateAttrList {
    
    @scala.inline
    def apply(
      addStatedAttr: (String, String) => Unit,
      addStatedAttrImpl: (js.Any, js.Any, js.Any) => js.Any,
      getMatchedStateAttr: js.Array[Double] => StateAttr,
      getOrCreateStateAttr: js.Any => js.Any,
      getStateAttr: js.Any => js.Any,
      mView: js.Any,
      matchedStateAttrList: js.Any,
      originStateAttrList: js.Any,
      removeAttrAllState: String => Unit
    ): StateAttrList = {
      val __obj = js.Dynamic.literal(addStatedAttr = js.Any.fromFunction2(addStatedAttr), addStatedAttrImpl = js.Any.fromFunction3(addStatedAttrImpl), getMatchedStateAttr = js.Any.fromFunction1(getMatchedStateAttr), getOrCreateStateAttr = js.Any.fromFunction1(getOrCreateStateAttr), getStateAttr = js.Any.fromFunction1(getStateAttr), mView = mView.asInstanceOf[js.Any], matchedStateAttrList = matchedStateAttrList.asInstanceOf[js.Any], originStateAttrList = originStateAttrList.asInstanceOf[js.Any], removeAttrAllState = js.Any.fromFunction1(removeAttrAllState))
      __obj.asInstanceOf[StateAttrList]
    }
    
    @scala.inline
    implicit class StateAttrListMutableBuilder[Self <: StateAttrList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddStatedAttr(value: (String, String) => Unit): Self = StObject.set(x, "addStatedAttr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddStatedAttrImpl(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "addStatedAttrImpl", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetMatchedStateAttr(value: js.Array[Double] => StateAttr): Self = StObject.set(x, "getMatchedStateAttr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOrCreateStateAttr(value: js.Any => js.Any): Self = StObject.set(x, "getOrCreateStateAttr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetStateAttr(value: js.Any => js.Any): Self = StObject.set(x, "getStateAttr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMView(value: js.Any): Self = StObject.set(x, "mView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchedStateAttrList(value: js.Any): Self = StObject.set(x, "matchedStateAttrList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginStateAttrList(value: js.Any): Self = StObject.set(x, "originStateAttrList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAttrAllState(value: String => Unit): Self = StObject.set(x, "removeAttrAllState", js.Any.fromFunction1(value))
    }
  }
}

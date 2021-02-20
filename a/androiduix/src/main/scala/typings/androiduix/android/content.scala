package typings.androiduix.android

import typings.androiduix.android.app.Application
import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.os.Bundle
import typings.androiduix.android.util.DisplayMetrics
import typings.androiduix.android.util.Pools.SynchronizedPool
import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.LayoutInflater
import typings.androiduix.android.view.WindowManager
import typings.androiduix.android.view.animation.Animation
import typings.androiduix.androidui.AndroidUI
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object content {
  
  @js.native
  trait Context extends StObject {
    
    var androidUI: AndroidUI = js.native
    
    def getApplicationContext(): Application = js.native
    
    def getLayoutInflater(): LayoutInflater = js.native
    
    def getResources(): Resources = js.native
    
    def getWindowManager(): WindowManager = js.native
    
    var mLayoutInflater: js.Any = js.native
    
    var mResources: js.Any = js.native
    
    def obtainStyledAttributes(attrs: HTMLElement): TypedArray = js.native
    def obtainStyledAttributes(attrs: HTMLElement, defStyleAttr: Map[String, String]): TypedArray = js.native
  }
  
  @js.native
  trait DialogInterface extends StObject {
    
    def cancel(): Unit = js.native
    
    def dismiss(): Unit = js.native
  }
  object DialogInterface {
    
    @scala.inline
    def apply(cancel: () => Unit, dismiss: () => Unit): DialogInterface = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), dismiss = js.Any.fromFunction0(dismiss))
      __obj.asInstanceOf[DialogInterface]
    }
    
    @scala.inline
    implicit class DialogInterfaceMutableBuilder[Self <: DialogInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDismiss(value: () => Unit): Self = StObject.set(x, "dismiss", js.Any.fromFunction0(value))
    }
    
    @js.native
    trait OnCancelListener extends StObject {
      
      def onCancel(dialog: DialogInterface): Unit = js.native
    }
    object OnCancelListener {
      
      @scala.inline
      def apply(onCancel: DialogInterface => Unit): OnCancelListener = {
        val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction1(onCancel))
        __obj.asInstanceOf[OnCancelListener]
      }
      
      @scala.inline
      implicit class OnCancelListenerMutableBuilder[Self <: OnCancelListener] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnCancel(value: DialogInterface => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait OnClickListener extends StObject {
      
      def onClick(dialog: DialogInterface, which: Double): Unit = js.native
    }
    object OnClickListener {
      
      @scala.inline
      def apply(onClick: (DialogInterface, Double) => Unit): OnClickListener = {
        val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick))
        __obj.asInstanceOf[OnClickListener]
      }
      
      @scala.inline
      implicit class OnClickListenerMutableBuilder[Self <: OnClickListener] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnClick(value: (DialogInterface, Double) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait OnDismissListener extends StObject {
      
      def onDismiss(dialog: DialogInterface): Unit = js.native
    }
    object OnDismissListener {
      
      @scala.inline
      def apply(onDismiss: DialogInterface => Unit): OnDismissListener = {
        val __obj = js.Dynamic.literal(onDismiss = js.Any.fromFunction1(onDismiss))
        __obj.asInstanceOf[OnDismissListener]
      }
      
      @scala.inline
      implicit class OnDismissListenerMutableBuilder[Self <: OnDismissListener] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnDismiss(value: DialogInterface => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait OnKeyListener extends StObject {
      
      def onKey(dialog: DialogInterface, keyCode: Double, event: KeyEvent): Boolean = js.native
    }
    object OnKeyListener {
      
      @scala.inline
      def apply(onKey: (DialogInterface, Double, KeyEvent) => Boolean): OnKeyListener = {
        val __obj = js.Dynamic.literal(onKey = js.Any.fromFunction3(onKey))
        __obj.asInstanceOf[OnKeyListener]
      }
      
      @scala.inline
      implicit class OnKeyListenerMutableBuilder[Self <: OnKeyListener] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnKey(value: (DialogInterface, Double, KeyEvent) => Boolean): Self = StObject.set(x, "onKey", js.Any.fromFunction3(value))
      }
    }
    
    @js.native
    trait OnMultiChoiceClickListener extends StObject {
      
      def onClick(dialog: DialogInterface, which: Double, isChecked: Boolean): Unit = js.native
    }
    object OnMultiChoiceClickListener {
      
      @scala.inline
      def apply(onClick: (DialogInterface, Double, Boolean) => Unit): OnMultiChoiceClickListener = {
        val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction3(onClick))
        __obj.asInstanceOf[OnMultiChoiceClickListener]
      }
      
      @scala.inline
      implicit class OnMultiChoiceClickListenerMutableBuilder[Self <: OnMultiChoiceClickListener] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnClick(value: (DialogInterface, Double, Boolean) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
      }
    }
    
    @js.native
    trait OnShowListener extends StObject {
      
      def onShow(dialog: DialogInterface): Unit = js.native
    }
    object OnShowListener {
      
      @scala.inline
      def apply(onShow: DialogInterface => Unit): OnShowListener = {
        val __obj = js.Dynamic.literal(onShow = js.Any.fromFunction1(onShow))
        __obj.asInstanceOf[OnShowListener]
      }
      
      @scala.inline
      implicit class OnShowListenerMutableBuilder[Self <: OnShowListener] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnShow(value: DialogInterface => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      }
    }
  }
  
  @js.native
  trait Intent extends StObject {
    
    var activityName: js.Any = js.native
    
    def addFlags(flags: Double): Intent = js.native
    
    def getBooleanArrayExtra(name: String): js.Array[Boolean] = js.native
    def getBooleanArrayExtra(name: String, defaultValue: js.Array[Boolean]): js.Array[Boolean] = js.native
    
    def getBooleanExtra(name: String, defaultValue: Boolean): Boolean = js.native
    
    def getDoubleArrayExtra(name: String): js.Array[Double] = js.native
    def getDoubleArrayExtra(name: String, defaultValue: js.Array[Double]): js.Array[Double] = js.native
    
    def getDoubleExtra(name: String, defaultValue: Double): Double = js.native
    
    def getExtras(): Bundle = js.native
    
    def getFlags(): Double = js.native
    
    def getFloatArrayExtra(name: String): js.Array[Double] = js.native
    def getFloatArrayExtra(name: String, defaultValue: js.Array[Double]): js.Array[Double] = js.native
    
    def getFloatExtra(name: String, defaultValue: Double): Double = js.native
    
    def getIntExtra(name: String, defaultValue: Double): Double = js.native
    
    def getIntegerArrayExtra(name: String): js.Array[Double] = js.native
    def getIntegerArrayExtra(name: String, defaultValue: js.Array[Double]): js.Array[Double] = js.native
    
    def getLongArrayExtra(name: String): js.Array[Double] = js.native
    def getLongArrayExtra(name: String, defaultValue: js.Array[Double]): js.Array[Double] = js.native
    
    def getLongExtra(name: String, defaultValue: Double): Double = js.native
    
    def getStringArrayExtra(name: String): js.Array[String] = js.native
    def getStringArrayExtra(name: String, defaultValue: js.Array[String]): js.Array[String] = js.native
    
    def getStringExtra(name: String): String = js.native
    def getStringExtra(name: String, defaultValue: String): String = js.native
    
    def hasExtra(name: String): Boolean = js.native
    
    var mExtras: js.Any = js.native
    
    var mFlags: js.Any = js.native
    
    var mRequestCode: js.Any = js.native
    
    def putExtra(name: String, value: js.Any): Intent = js.native
    
    def setFlags(flags: Double): Intent = js.native
  }
  
  object res {
    
    @js.native
    trait ColorStateList extends StObject {
      
      def getColorForState(stateSet: js.Array[Double], defaultColor: Double): Double = js.native
      
      def getDefaultColor(): Double = js.native
      
      def isStateful(): Boolean = js.native
      
      var mColors: js.Array[Double] = js.native
      
      var mDefaultColor: Double = js.native
      
      var mStateSpecs: js.Array[js.Array[Double]] = js.native
      
      def withAlpha(alpha: Double): ColorStateList = js.native
    }
    object ColorStateList {
      
      @scala.inline
      def apply(
        getColorForState: (js.Array[Double], Double) => Double,
        getDefaultColor: () => Double,
        isStateful: () => Boolean,
        mColors: js.Array[Double],
        mDefaultColor: Double,
        mStateSpecs: js.Array[js.Array[Double]],
        withAlpha: Double => ColorStateList
      ): ColorStateList = {
        val __obj = js.Dynamic.literal(getColorForState = js.Any.fromFunction2(getColorForState), getDefaultColor = js.Any.fromFunction0(getDefaultColor), isStateful = js.Any.fromFunction0(isStateful), mColors = mColors.asInstanceOf[js.Any], mDefaultColor = mDefaultColor.asInstanceOf[js.Any], mStateSpecs = mStateSpecs.asInstanceOf[js.Any], withAlpha = js.Any.fromFunction1(withAlpha))
        __obj.asInstanceOf[ColorStateList]
      }
      
      @scala.inline
      implicit class ColorStateListMutableBuilder[Self <: ColorStateList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetColorForState(value: (js.Array[Double], Double) => Double): Self = StObject.set(x, "getColorForState", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetDefaultColor(value: () => Double): Self = StObject.set(x, "getDefaultColor", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsStateful(value: () => Boolean): Self = StObject.set(x, "isStateful", js.Any.fromFunction0(value))
        
        @scala.inline
        def setMColors(value: js.Array[Double]): Self = StObject.set(x, "mColors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMColorsVarargs(value: Double*): Self = StObject.set(x, "mColors", js.Array(value :_*))
        
        @scala.inline
        def setMDefaultColor(value: Double): Self = StObject.set(x, "mDefaultColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMStateSpecs(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "mStateSpecs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMStateSpecsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "mStateSpecs", js.Array(value :_*))
        
        @scala.inline
        def setWithAlpha(value: Double => ColorStateList): Self = StObject.set(x, "withAlpha", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait Resources extends StObject {
      
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
    
    @js.native
    trait TypedArray extends StObject {
      
      var attrMap: js.Any = js.native
      
      var attrMapKeysCache: js.Any = js.native
      
      /* private */ def checkRecycled(): js.Any = js.native
      
      def getAttrValue(attrName: String): String = js.native
      
      def getBoolean(attrName: String, defValue: Boolean): Boolean = js.native
      
      def getColor(attrName: String, defValue: Double): Double = js.native
      
      def getColorStateList(attrName: String): ColorStateList = js.native
      
      def getDimension(attrName: String, defValue: Double): Double = js.native
      
      def getDimensionPixelOffset(attrName: String, defValue: Double): Double = js.native
      
      def getDimensionPixelSize(attrName: String, defValue: Double): Double = js.native
      
      def getDrawable(attrName: String): Drawable = js.native
      
      def getFloat(attrName: String, defValue: Double): Double = js.native
      
      def getIndex(keyIndex: Double): String = js.native
      
      def getInt(attrName: String, defValue: Double): Double = js.native
      
      def getInteger(attrName: String, defValue: Double): Double = js.native
      
      def getLayoutDimension(attrName: String, defValue: Double): Double = js.native
      
      def getLowerCaseNoNamespaceAttrNames(): js.Array[String] = js.native
      
      def getResourceId(attrName: String, defaultResourceId: String): String = js.native
      
      def getResources(): Resources = js.native
      
      def getString(attrName: String): String = js.native
      
      def getText(attrName: String): String = js.native
      
      def getTextArray(attrName: String): js.Array[String] = js.native
      
      def hasValue(attrName: String): Boolean = js.native
      
      def hasValueOrEmpty(attrName: String): Boolean = js.native
      
      def length(): Double = js.native
      
      var mRecycled: js.Any = js.native
      
      var mResources: js.Any = js.native
      
      def recycle(): Unit = js.native
    }
    object TypedArray {
      
      @scala.inline
      def apply(
        attrMap: js.Any,
        attrMapKeysCache: js.Any,
        checkRecycled: () => js.Any,
        getAttrValue: String => String,
        getBoolean: (String, Boolean) => Boolean,
        getColor: (String, Double) => Double,
        getColorStateList: String => ColorStateList,
        getDimension: (String, Double) => Double,
        getDimensionPixelOffset: (String, Double) => Double,
        getDimensionPixelSize: (String, Double) => Double,
        getDrawable: String => Drawable,
        getFloat: (String, Double) => Double,
        getIndex: Double => String,
        getInt: (String, Double) => Double,
        getInteger: (String, Double) => Double,
        getLayoutDimension: (String, Double) => Double,
        getLowerCaseNoNamespaceAttrNames: () => js.Array[String],
        getResourceId: (String, String) => String,
        getResources: () => Resources,
        getString: String => String,
        getText: String => String,
        getTextArray: String => js.Array[String],
        hasValue: String => Boolean,
        hasValueOrEmpty: String => Boolean,
        length: () => Double,
        mRecycled: js.Any,
        mResources: js.Any,
        recycle: () => Unit
      ): TypedArray = {
        val __obj = js.Dynamic.literal(attrMap = attrMap.asInstanceOf[js.Any], attrMapKeysCache = attrMapKeysCache.asInstanceOf[js.Any], checkRecycled = js.Any.fromFunction0(checkRecycled), getAttrValue = js.Any.fromFunction1(getAttrValue), getBoolean = js.Any.fromFunction2(getBoolean), getColor = js.Any.fromFunction2(getColor), getColorStateList = js.Any.fromFunction1(getColorStateList), getDimension = js.Any.fromFunction2(getDimension), getDimensionPixelOffset = js.Any.fromFunction2(getDimensionPixelOffset), getDimensionPixelSize = js.Any.fromFunction2(getDimensionPixelSize), getDrawable = js.Any.fromFunction1(getDrawable), getFloat = js.Any.fromFunction2(getFloat), getIndex = js.Any.fromFunction1(getIndex), getInt = js.Any.fromFunction2(getInt), getInteger = js.Any.fromFunction2(getInteger), getLayoutDimension = js.Any.fromFunction2(getLayoutDimension), getLowerCaseNoNamespaceAttrNames = js.Any.fromFunction0(getLowerCaseNoNamespaceAttrNames), getResourceId = js.Any.fromFunction2(getResourceId), getResources = js.Any.fromFunction0(getResources), getString = js.Any.fromFunction1(getString), getText = js.Any.fromFunction1(getText), getTextArray = js.Any.fromFunction1(getTextArray), hasValue = js.Any.fromFunction1(hasValue), hasValueOrEmpty = js.Any.fromFunction1(hasValueOrEmpty), length = js.Any.fromFunction0(length), mRecycled = mRecycled.asInstanceOf[js.Any], mResources = mResources.asInstanceOf[js.Any], recycle = js.Any.fromFunction0(recycle))
        __obj.asInstanceOf[TypedArray]
      }
      
      @scala.inline
      implicit class TypedArrayMutableBuilder[Self <: TypedArray] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttrMap(value: js.Any): Self = StObject.set(x, "attrMap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttrMapKeysCache(value: js.Any): Self = StObject.set(x, "attrMapKeysCache", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCheckRecycled(value: () => js.Any): Self = StObject.set(x, "checkRecycled", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetAttrValue(value: String => String): Self = StObject.set(x, "getAttrValue", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetBoolean(value: (String, Boolean) => Boolean): Self = StObject.set(x, "getBoolean", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetColor(value: (String, Double) => Double): Self = StObject.set(x, "getColor", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetColorStateList(value: String => ColorStateList): Self = StObject.set(x, "getColorStateList", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetDimension(value: (String, Double) => Double): Self = StObject.set(x, "getDimension", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetDimensionPixelOffset(value: (String, Double) => Double): Self = StObject.set(x, "getDimensionPixelOffset", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetDimensionPixelSize(value: (String, Double) => Double): Self = StObject.set(x, "getDimensionPixelSize", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetDrawable(value: String => Drawable): Self = StObject.set(x, "getDrawable", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetFloat(value: (String, Double) => Double): Self = StObject.set(x, "getFloat", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetIndex(value: Double => String): Self = StObject.set(x, "getIndex", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetInt(value: (String, Double) => Double): Self = StObject.set(x, "getInt", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetInteger(value: (String, Double) => Double): Self = StObject.set(x, "getInteger", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetLayoutDimension(value: (String, Double) => Double): Self = StObject.set(x, "getLayoutDimension", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetLowerCaseNoNamespaceAttrNames(value: () => js.Array[String]): Self = StObject.set(x, "getLowerCaseNoNamespaceAttrNames", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetResourceId(value: (String, String) => String): Self = StObject.set(x, "getResourceId", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetResources(value: () => Resources): Self = StObject.set(x, "getResources", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetString(value: String => String): Self = StObject.set(x, "getString", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetText(value: String => String): Self = StObject.set(x, "getText", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetTextArray(value: String => js.Array[String]): Self = StObject.set(x, "getTextArray", js.Any.fromFunction1(value))
        
        @scala.inline
        def setHasValue(value: String => Boolean): Self = StObject.set(x, "hasValue", js.Any.fromFunction1(value))
        
        @scala.inline
        def setHasValueOrEmpty(value: String => Boolean): Self = StObject.set(x, "hasValueOrEmpty", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
        
        @scala.inline
        def setMRecycled(value: js.Any): Self = StObject.set(x, "mRecycled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMResources(value: js.Any): Self = StObject.set(x, "mResources", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRecycle(value: () => Unit): Self = StObject.set(x, "recycle", js.Any.fromFunction0(value))
      }
    }
  }
}

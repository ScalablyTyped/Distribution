package typings.androiduix.android.text

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.View
import typings.androiduix.android.widget.TextView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object method {
  
  @js.native
  trait AllCapsTransformationMethod extends TransformationMethod2 {
    
    var mEnabled: js.Any = js.native
  }
  object AllCapsTransformationMethod {
    
    @scala.inline
    def apply(
      getTransformation: (String, View) => String,
      mEnabled: js.Any,
      onFocusChanged: (View, String, Boolean, Double, Rect) => Unit,
      setLengthChangesAllowed: Boolean => Unit
    ): AllCapsTransformationMethod = {
      val __obj = js.Dynamic.literal(getTransformation = js.Any.fromFunction2(getTransformation), mEnabled = mEnabled.asInstanceOf[js.Any], onFocusChanged = js.Any.fromFunction5(onFocusChanged), setLengthChangesAllowed = js.Any.fromFunction1(setLengthChangesAllowed))
      __obj.asInstanceOf[AllCapsTransformationMethod]
    }
    
    @scala.inline
    implicit class AllCapsTransformationMethodMutableBuilder[Self <: AllCapsTransformationMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMEnabled(value: js.Any): Self = StObject.set(x, "mEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MovementMethod extends StObject {
    
    def canSelectArbitrarily(): Boolean = js.native
    
    def initialize(widget: TextView, text: Spannable): Unit = js.native
    
    def onGenericMotionEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean = js.native
    
    def onKeyDown(widget: TextView, text: Spannable, keyCode: Double, event: KeyEvent): Boolean = js.native
    
    def onKeyOther(view: TextView, text: Spannable, event: KeyEvent): Boolean = js.native
    
    def onKeyUp(widget: TextView, text: Spannable, keyCode: Double, event: KeyEvent): Boolean = js.native
    
    def onTakeFocus(widget: TextView, text: Spannable, direction: Double): Unit = js.native
    
    def onTouchEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean = js.native
    
    def onTrackballEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean = js.native
  }
  object MovementMethod {
    
    @scala.inline
    def apply(
      canSelectArbitrarily: () => Boolean,
      initialize: (TextView, Spannable) => Unit,
      onGenericMotionEvent: (TextView, Spannable, MotionEvent) => Boolean,
      onKeyDown: (TextView, Spannable, Double, KeyEvent) => Boolean,
      onKeyOther: (TextView, Spannable, KeyEvent) => Boolean,
      onKeyUp: (TextView, Spannable, Double, KeyEvent) => Boolean,
      onTakeFocus: (TextView, Spannable, Double) => Unit,
      onTouchEvent: (TextView, Spannable, MotionEvent) => Boolean,
      onTrackballEvent: (TextView, Spannable, MotionEvent) => Boolean
    ): MovementMethod = {
      val __obj = js.Dynamic.literal(canSelectArbitrarily = js.Any.fromFunction0(canSelectArbitrarily), initialize = js.Any.fromFunction2(initialize), onGenericMotionEvent = js.Any.fromFunction3(onGenericMotionEvent), onKeyDown = js.Any.fromFunction4(onKeyDown), onKeyOther = js.Any.fromFunction3(onKeyOther), onKeyUp = js.Any.fromFunction4(onKeyUp), onTakeFocus = js.Any.fromFunction3(onTakeFocus), onTouchEvent = js.Any.fromFunction3(onTouchEvent), onTrackballEvent = js.Any.fromFunction3(onTrackballEvent))
      __obj.asInstanceOf[MovementMethod]
    }
    
    @scala.inline
    implicit class MovementMethodMutableBuilder[Self <: MovementMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanSelectArbitrarily(value: () => Boolean): Self = StObject.set(x, "canSelectArbitrarily", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitialize(value: (TextView, Spannable) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnGenericMotionEvent(value: (TextView, Spannable, MotionEvent) => Boolean): Self = StObject.set(x, "onGenericMotionEvent", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnKeyDown(value: (TextView, Spannable, Double, KeyEvent) => Boolean): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnKeyOther(value: (TextView, Spannable, KeyEvent) => Boolean): Self = StObject.set(x, "onKeyOther", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnKeyUp(value: (TextView, Spannable, Double, KeyEvent) => Boolean): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnTakeFocus(value: (TextView, Spannable, Double) => Unit): Self = StObject.set(x, "onTakeFocus", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnTouchEvent(value: (TextView, Spannable, MotionEvent) => Boolean): Self = StObject.set(x, "onTouchEvent", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnTrackballEvent(value: (TextView, Spannable, MotionEvent) => Boolean): Self = StObject.set(x, "onTrackballEvent", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait PasswordTransformationMethod extends SingleLineTransformationMethod
  object PasswordTransformationMethod {
    
    @scala.inline
    def apply(
      getOriginal: () => js.Array[String],
      getReplacement: () => js.Array[String],
      getTransformation: (String, View) => String,
      onFocusChanged: (View, String, Boolean, Double, Rect) => Unit
    ): PasswordTransformationMethod = {
      val __obj = js.Dynamic.literal(getOriginal = js.Any.fromFunction0(getOriginal), getReplacement = js.Any.fromFunction0(getReplacement), getTransformation = js.Any.fromFunction2(getTransformation), onFocusChanged = js.Any.fromFunction5(onFocusChanged))
      __obj.asInstanceOf[PasswordTransformationMethod]
    }
  }
  
  @js.native
  trait ReplacementTransformationMethod extends TransformationMethod {
    
    /* protected */ def getOriginal(): js.Array[String] = js.native
    
    /* protected */ def getReplacement(): js.Array[String] = js.native
  }
  object ReplacementTransformationMethod {
    
    @scala.inline
    def apply(
      getOriginal: () => js.Array[String],
      getReplacement: () => js.Array[String],
      getTransformation: (String, View) => String,
      onFocusChanged: (View, String, Boolean, Double, Rect) => Unit
    ): ReplacementTransformationMethod = {
      val __obj = js.Dynamic.literal(getOriginal = js.Any.fromFunction0(getOriginal), getReplacement = js.Any.fromFunction0(getReplacement), getTransformation = js.Any.fromFunction2(getTransformation), onFocusChanged = js.Any.fromFunction5(onFocusChanged))
      __obj.asInstanceOf[ReplacementTransformationMethod]
    }
    
    @js.native
    trait ReplacementCharSequence
      extends typings.std.String {
      
      var mOriginal: js.Any = js.native
      
      var mReplacement: js.Any = js.native
      
      var mSource: js.Any = js.native
      
      def startReplace(start: Double, end: Double): String = js.native
    }
    
    @scala.inline
    implicit class ReplacementTransformationMethodMutableBuilder[Self <: ReplacementTransformationMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetOriginal(value: () => js.Array[String]): Self = StObject.set(x, "getOriginal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetReplacement(value: () => js.Array[String]): Self = StObject.set(x, "getReplacement", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait SingleLineTransformationMethod extends ReplacementTransformationMethod
  object SingleLineTransformationMethod {
    
    @scala.inline
    def apply(
      getOriginal: () => js.Array[String],
      getReplacement: () => js.Array[String],
      getTransformation: (String, View) => String,
      onFocusChanged: (View, String, Boolean, Double, Rect) => Unit
    ): SingleLineTransformationMethod = {
      val __obj = js.Dynamic.literal(getOriginal = js.Any.fromFunction0(getOriginal), getReplacement = js.Any.fromFunction0(getReplacement), getTransformation = js.Any.fromFunction2(getTransformation), onFocusChanged = js.Any.fromFunction5(onFocusChanged))
      __obj.asInstanceOf[SingleLineTransformationMethod]
    }
  }
  
  @js.native
  trait TransformationMethod extends StObject {
    
    def getTransformation(source: String, view: View): String = js.native
    
    def onFocusChanged(view: View, sourceText: String, focused: Boolean, direction: Double, previouslyFocusedRect: Rect): Unit = js.native
  }
  object TransformationMethod {
    
    @scala.inline
    def apply(
      getTransformation: (String, View) => String,
      onFocusChanged: (View, String, Boolean, Double, Rect) => Unit
    ): TransformationMethod = {
      val __obj = js.Dynamic.literal(getTransformation = js.Any.fromFunction2(getTransformation), onFocusChanged = js.Any.fromFunction5(onFocusChanged))
      __obj.asInstanceOf[TransformationMethod]
    }
    
    @scala.inline
    implicit class TransformationMethodMutableBuilder[Self <: TransformationMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTransformation(value: (String, View) => String): Self = StObject.set(x, "getTransformation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFocusChanged(value: (View, String, Boolean, Double, Rect) => Unit): Self = StObject.set(x, "onFocusChanged", js.Any.fromFunction5(value))
    }
  }
  
  @js.native
  trait TransformationMethod2 extends TransformationMethod {
    
    def setLengthChangesAllowed(allowLengthChanges: Boolean): Unit = js.native
  }
  object TransformationMethod2 {
    
    @scala.inline
    def apply(
      getTransformation: (String, View) => String,
      onFocusChanged: (View, String, Boolean, Double, Rect) => Unit,
      setLengthChangesAllowed: Boolean => Unit
    ): TransformationMethod2 = {
      val __obj = js.Dynamic.literal(getTransformation = js.Any.fromFunction2(getTransformation), onFocusChanged = js.Any.fromFunction5(onFocusChanged), setLengthChangesAllowed = js.Any.fromFunction1(setLengthChangesAllowed))
      __obj.asInstanceOf[TransformationMethod2]
    }
    
    @scala.inline
    implicit class TransformationMethod2MutableBuilder[Self <: TransformationMethod2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetLengthChangesAllowed(value: Boolean => Unit): Self = StObject.set(x, "setLengthChangesAllowed", js.Any.fromFunction1(value))
    }
  }
}

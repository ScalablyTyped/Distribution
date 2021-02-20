package typings.androiduix.android.widget

import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup.OnHierarchyChangeListener
import typings.androiduix.android.widget.RadioGroup.OnCheckedChangeListener
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioGroup extends LinearLayout {
  
  def check(id: String): Unit = js.native
  
  def clearCheck(): Unit = js.native
  
  def getCheckedRadioButtonId(): String = js.native
  
  /* private */ def init(): js.Any = js.native
  
  var mCheckedId: js.Any = js.native
  
  var mChildOnCheckedChangeListener: js.Any = js.native
  
  var mOnCheckedChangeListener: js.Any = js.native
  
  var mPassThroughListener: js.Any = js.native
  
  var mProtectFromCheckedChange: js.Any = js.native
  
  /* private */ def setCheckedId(id: js.Any): js.Any = js.native
  
  /* private */ def setCheckedStateForView(viewId: js.Any, checked: js.Any): js.Any = js.native
  
  def setOnCheckedChangeListener(listener: OnCheckedChangeListener): Unit = js.native
}
object RadioGroup {
  
  @js.native
  trait CheckedStateTracker
    extends typings.androiduix.android.widget.CompoundButton.OnCheckedChangeListener {
    
    var _RadioGroup_this: RadioGroup = js.native
  }
  object CheckedStateTracker {
    
    @scala.inline
    def apply(_RadioGroup_this: RadioGroup, onCheckedChanged: (CompoundButton, Boolean) => Unit): CheckedStateTracker = {
      val __obj = js.Dynamic.literal(_RadioGroup_this = _RadioGroup_this.asInstanceOf[js.Any], onCheckedChanged = js.Any.fromFunction2(onCheckedChanged))
      __obj.asInstanceOf[CheckedStateTracker]
    }
    
    @scala.inline
    implicit class CheckedStateTrackerMutableBuilder[Self <: CheckedStateTracker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_RadioGroup_this(value: RadioGroup): Self = StObject.set(x, "_RadioGroup_this", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LayoutParams
    extends typings.androiduix.android.widget.LinearLayout.LayoutParams
  object LayoutParams {
    
    @scala.inline
    def apply(
      _attrBinder: js.Any,
      bottomMargin: Double,
      createClassAttrBinder: () => ClassBinderMap,
      equals_ : js.Any => Boolean,
      getAttrBinder: () => AttrBinder,
      getLayoutDirection: () => Double,
      gravity: Double,
      hash: js.Any,
      height: Double,
      initBindAttr: () => js.Any,
      isLayoutRtl: () => Boolean,
      leftMargin: Double,
      resolveLayoutDirection: Double => Unit,
      rightMargin: Double,
      setBaseAttributes: (TypedArray, String, String) => Unit,
      setLayoutDirection: Double => Unit,
      setMargins: (Double, Double, Double, Double) => Unit,
      topMargin: Double,
      weight: Double,
      width: Double
    ): LayoutParams = {
      val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], bottomMargin = bottomMargin.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), getAttrBinder = js.Any.fromFunction0(getAttrBinder), getLayoutDirection = js.Any.fromFunction0(getLayoutDirection), gravity = gravity.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), isLayoutRtl = js.Any.fromFunction0(isLayoutRtl), leftMargin = leftMargin.asInstanceOf[js.Any], resolveLayoutDirection = js.Any.fromFunction1(resolveLayoutDirection), rightMargin = rightMargin.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), setLayoutDirection = js.Any.fromFunction1(setLayoutDirection), setMargins = js.Any.fromFunction4(setMargins), topMargin = topMargin.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[LayoutParams]
    }
  }
  
  @js.native
  trait OnCheckedChangeListener extends StObject {
    
    def onCheckedChanged(group: RadioGroup, checkedId: String): Unit = js.native
  }
  object OnCheckedChangeListener {
    
    @scala.inline
    def apply(onCheckedChanged: (RadioGroup, String) => Unit): OnCheckedChangeListener = {
      val __obj = js.Dynamic.literal(onCheckedChanged = js.Any.fromFunction2(onCheckedChanged))
      __obj.asInstanceOf[OnCheckedChangeListener]
    }
    
    @scala.inline
    implicit class OnCheckedChangeListenerMutableBuilder[Self <: OnCheckedChangeListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCheckedChanged(value: (RadioGroup, String) => Unit): Self = StObject.set(x, "onCheckedChanged", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait PassThroughHierarchyChangeListener extends OnHierarchyChangeListener {
    
    var _RadioGroup_this: RadioGroup = js.native
    
    var mOnHierarchyChangeListener: js.Any = js.native
  }
  object PassThroughHierarchyChangeListener {
    
    @scala.inline
    def apply(
      _RadioGroup_this: RadioGroup,
      mOnHierarchyChangeListener: js.Any,
      onChildViewAdded: (View, View) => js.Any,
      onChildViewRemoved: (View, View) => js.Any
    ): PassThroughHierarchyChangeListener = {
      val __obj = js.Dynamic.literal(_RadioGroup_this = _RadioGroup_this.asInstanceOf[js.Any], mOnHierarchyChangeListener = mOnHierarchyChangeListener.asInstanceOf[js.Any], onChildViewAdded = js.Any.fromFunction2(onChildViewAdded), onChildViewRemoved = js.Any.fromFunction2(onChildViewRemoved))
      __obj.asInstanceOf[PassThroughHierarchyChangeListener]
    }
    
    @scala.inline
    implicit class PassThroughHierarchyChangeListenerMutableBuilder[Self <: PassThroughHierarchyChangeListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMOnHierarchyChangeListener(value: js.Any): Self = StObject.set(x, "mOnHierarchyChangeListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_RadioGroup_this(value: RadioGroup): Self = StObject.set(x, "_RadioGroup_this", value.asInstanceOf[js.Any])
    }
  }
}

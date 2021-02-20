package typings.androiduix.android.widget

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.widget.CompoundButton.OnCheckedChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompoundButton
  extends TextView
     with Checkable {
  
  @JSName("drawableSizeChange")
  def drawableSizeChange_MCompoundButton(d: Drawable): Unit = js.native
  
  var mBroadcasting: js.Any = js.native
  
  var mButtonDrawable: js.Any = js.native
  
  var mButtonResource: js.Any = js.native
  
  var mChecked: js.Any = js.native
  
  var mOnCheckedChangeListener: js.Any = js.native
  
  var mOnCheckedChangeWidgetListener: js.Any = js.native
  
  def setButtonDrawable(d: Drawable): Unit = js.native
  
  def setOnCheckedChangeListener(listener: OnCheckedChangeListener): Unit = js.native
  
  def setOnCheckedChangeWidgetListener(listener: OnCheckedChangeListener): Unit = js.native
}
object CompoundButton {
  
  @js.native
  trait OnCheckedChangeListener extends StObject {
    
    def onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean): Unit = js.native
  }
  object OnCheckedChangeListener {
    
    @scala.inline
    def apply(onCheckedChanged: (CompoundButton, Boolean) => Unit): OnCheckedChangeListener = {
      val __obj = js.Dynamic.literal(onCheckedChanged = js.Any.fromFunction2(onCheckedChanged))
      __obj.asInstanceOf[OnCheckedChangeListener]
    }
    
    @scala.inline
    implicit class OnCheckedChangeListenerMutableBuilder[Self <: OnCheckedChangeListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCheckedChanged(value: (CompoundButton, Boolean) => Unit): Self = StObject.set(x, "onCheckedChanged", js.Any.fromFunction2(value))
    }
  }
}

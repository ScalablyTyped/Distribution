package typings.androiduix.android.widget

import typings.androiduix.android.widget.SeekBar.OnSeekBarChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeekBar extends AbsSeekBar {
  
  var mOnSeekBarChangeListener: js.Any = js.native
  
  def setOnSeekBarChangeListener(l: OnSeekBarChangeListener): Unit = js.native
}
object SeekBar {
  
  @js.native
  trait OnSeekBarChangeListener extends StObject {
    
    def onProgressChanged(seekBar: SeekBar, progress: Double, fromUser: Boolean): Unit = js.native
    
    def onStartTrackingTouch(seekBar: SeekBar): Unit = js.native
    
    def onStopTrackingTouch(seekBar: SeekBar): Unit = js.native
  }
  object OnSeekBarChangeListener {
    
    @scala.inline
    def apply(
      onProgressChanged: (SeekBar, Double, Boolean) => Unit,
      onStartTrackingTouch: SeekBar => Unit,
      onStopTrackingTouch: SeekBar => Unit
    ): OnSeekBarChangeListener = {
      val __obj = js.Dynamic.literal(onProgressChanged = js.Any.fromFunction3(onProgressChanged), onStartTrackingTouch = js.Any.fromFunction1(onStartTrackingTouch), onStopTrackingTouch = js.Any.fromFunction1(onStopTrackingTouch))
      __obj.asInstanceOf[OnSeekBarChangeListener]
    }
    
    @scala.inline
    implicit class OnSeekBarChangeListenerMutableBuilder[Self <: OnSeekBarChangeListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnProgressChanged(value: (SeekBar, Double, Boolean) => Unit): Self = StObject.set(x, "onProgressChanged", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnStartTrackingTouch(value: SeekBar => Unit): Self = StObject.set(x, "onStartTrackingTouch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStopTrackingTouch(value: SeekBar => Unit): Self = StObject.set(x, "onStopTrackingTouch", js.Any.fromFunction1(value))
    }
  }
}

package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceHolder extends StObject {
  
  /**
    * PlaceHolder.cancel()
    * TODO
    **/
  def cancel(): Unit = js.native
  
  /**
    * PlaceHolder.detach()
    * TODO
    **/
  def detach(): Unit = js.native
  
  /**
    * PlaceHolder.hideOtherMarkers()
    * Hides all over markers in the [[EditSession `EditSession`]] that are not the currently selected one.
    **/
  def hideOtherMarkers(): Unit = js.native
  
  def on(event: String, fn: js.Function1[/* e */ js.Any, _]): Unit = js.native
  
  /**
    * PlaceHolder@onCursorChange(e)
    * Emitted when the cursor changes.
    **/
  def onCursorChange(): Unit = js.native
  
  /**
    * PlaceHolder@onUpdate(e)
    * Emitted when the place holder updates.
    **/
  def onUpdate(): Unit = js.native
  
  /**
    * PlaceHolder.setup()
    * TODO
    **/
  def setup(): Unit = js.native
  
  /**
    * PlaceHolder.showOtherMarkers()
    * TODO
    **/
  def showOtherMarkers(): Unit = js.native
}
object PlaceHolder {
  
  @scala.inline
  def apply(
    cancel: () => Unit,
    detach: () => Unit,
    hideOtherMarkers: () => Unit,
    on: (String, js.Function1[/* e */ js.Any, _]) => Unit,
    onCursorChange: () => Unit,
    onUpdate: () => Unit,
    setup: () => Unit,
    showOtherMarkers: () => Unit
  ): PlaceHolder = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), detach = js.Any.fromFunction0(detach), hideOtherMarkers = js.Any.fromFunction0(hideOtherMarkers), on = js.Any.fromFunction2(on), onCursorChange = js.Any.fromFunction0(onCursorChange), onUpdate = js.Any.fromFunction0(onUpdate), setup = js.Any.fromFunction0(setup), showOtherMarkers = js.Any.fromFunction0(showOtherMarkers))
    __obj.asInstanceOf[PlaceHolder]
  }
  
  @scala.inline
  implicit class PlaceHolderMutableBuilder[Self <: PlaceHolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideOtherMarkers(value: () => Unit): Self = StObject.set(x, "hideOtherMarkers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: (String, js.Function1[/* e */ js.Any, _]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCursorChange(value: () => Unit): Self = StObject.set(x, "onCursorChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnUpdate(value: () => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetup(value: () => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowOtherMarkers(value: () => Unit): Self = StObject.set(x, "showOtherMarkers", js.Any.fromFunction0(value))
  }
}

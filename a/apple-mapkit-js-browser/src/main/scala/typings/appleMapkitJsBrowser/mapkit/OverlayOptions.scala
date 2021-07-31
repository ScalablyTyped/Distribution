package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayOptions extends StObject {
  
  /**
    * Custom data to associate with this overlay.
    */
  var data: js.UndefOr[js.Object] = js.undefined
  
  /**
    * A Boolean value that determines whether the overlay responds to user
    * interaction.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that indicates whether the overlay is selected.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that determines if an overlay is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object OverlayOptions {
  
  @scala.inline
  def apply(): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayOptions]
  }
  
  @scala.inline
  implicit class OverlayOptionsMutableBuilder[Self <: OverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

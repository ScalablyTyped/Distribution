package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideButtonConfiguration extends StObject {
  
  /**
    * Action triggered by the button.
    */
  var ButtonAction: typings.awsSdk.clientsPinpointMod.ButtonAction
  
  /**
    * Button destination.
    */
  var Link: js.UndefOr[string] = js.undefined
}
object OverrideButtonConfiguration {
  
  inline def apply(ButtonAction: ButtonAction): OverrideButtonConfiguration = {
    val __obj = js.Dynamic.literal(ButtonAction = ButtonAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideButtonConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverrideButtonConfiguration] (val x: Self) extends AnyVal {
    
    inline def setButtonAction(value: ButtonAction): Self = StObject.set(x, "ButtonAction", value.asInstanceOf[js.Any])
    
    inline def setLink(value: string): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "Link", js.undefined)
  }
}

package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2AppRequest extends StObject {
  
  /**
    * Surfaces available for cross surface handoff.
    */
  var availableSurfaces: js.UndefOr[js.Array[GoogleActionsV2Surface]] = js.undefined
  
  /**
    * Holds session data like the conversation ID and conversation token.
    */
  var conversation: js.UndefOr[GoogleActionsV2Conversation] = js.undefined
  
  /**
    * Information about the device the user is using to interact with the Action.
    */
  var device: js.UndefOr[GoogleActionsV2Device] = js.undefined
  
  /**
    * List of inputs corresponding to the expected inputs specified by the
    * Action. For the initial conversation trigger, the input contains
    * information on how the user triggered the conversation.
    */
  var inputs: js.UndefOr[js.Array[GoogleActionsV2Input]] = js.undefined
  
  /**
    * Indicates whether the request should be handled in sandbox mode.
    */
  var isInSandbox: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the surface the user is interacting with, e.g. whether it
    * can output audio or has a screen.
    */
  var surface: js.UndefOr[GoogleActionsV2Surface] = js.undefined
  
  /**
    * User who initiated the conversation.
    */
  var user: js.UndefOr[GoogleActionsV2User] = js.undefined
}
object GoogleActionsV2AppRequest {
  
  inline def apply(): GoogleActionsV2AppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2AppRequest]
  }
  
  extension [Self <: GoogleActionsV2AppRequest](x: Self) {
    
    inline def setAvailableSurfaces(value: js.Array[GoogleActionsV2Surface]): Self = StObject.set(x, "availableSurfaces", value.asInstanceOf[js.Any])
    
    inline def setAvailableSurfacesUndefined: Self = StObject.set(x, "availableSurfaces", js.undefined)
    
    inline def setAvailableSurfacesVarargs(value: GoogleActionsV2Surface*): Self = StObject.set(x, "availableSurfaces", js.Array(value*))
    
    inline def setConversation(value: GoogleActionsV2Conversation): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
    
    inline def setConversationUndefined: Self = StObject.set(x, "conversation", js.undefined)
    
    inline def setDevice(value: GoogleActionsV2Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setInputs(value: js.Array[GoogleActionsV2Input]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: GoogleActionsV2Input*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setIsInSandbox(value: Boolean): Self = StObject.set(x, "isInSandbox", value.asInstanceOf[js.Any])
    
    inline def setIsInSandboxUndefined: Self = StObject.set(x, "isInSandbox", js.undefined)
    
    inline def setSurface(value: GoogleActionsV2Surface): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
    
    inline def setSurfaceUndefined: Self = StObject.set(x, "surface", js.undefined)
    
    inline def setUser(value: GoogleActionsV2User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}

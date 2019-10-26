package typings.actionsDashOnDashGoogle

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Capability
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Surface
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationSurfaceMod.AvailableSurfaces
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationSurfaceMod.AvailableSurfacesCapabilities
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationSurfaceMod.Capabilities
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationSurfaceMod.Surface
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationSurfaceMod.SurfaceCapability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/surface", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationSurfaceMod extends js.Object {
  @js.native
  /** @hidden */
  class Available () extends js.Object {
    def this(surfaces: js.Array[GoogleActionsV2Surface]) = this()
    /** @public */
    var surfaces: AvailableSurfaces = js.native
  }
  
  @js.native
  class AvailableSurfaces protected () extends js.Object {
    /** @hidden */
    def this(list: js.Array[GoogleActionsV2Surface]) = this()
    /** @public */
    var capabilities: AvailableSurfacesCapabilities = js.native
    /** @public */
    var list: js.Array[Surface] = js.native
    /**
      * Checks if available surfaces has an attribute like a capability
      *
      * @example
      * ```javascript
      *
      * app.intent('Default Welcome Intent', conv => {
      *   if (conv.available.surfaces.has('actions.capability.SCREEN_OUTPUT')) {
      *     conv.ask('You have a device that can view images! How are you?')
      *   } else {
      *     conv.ask('You do not have a device that can view images! How are you?')
      *   }
      * })
      * ```
      *
      * @param attribute An attribute like SurfaceCapability
      * @public
      */
    def has(attribute: SurfaceCapability): Boolean = js.native
  }
  
  @js.native
  class AvailableSurfacesCapabilities protected () extends js.Object {
    /** @hidden */
    def this(surfaces: js.Array[Surface]) = this()
    /** @public */
    var surfaces: js.Array[Surface] = js.native
    /**
      * Returns true if user has an available surface which includes all given
      * capabilities. Available surfaces capabilities may exist on surfaces other
      * than that used for an ongoing conversation.
      * @public
      */
    def has(capability: SurfaceCapability): Boolean = js.native
  }
  
  @js.native
  /** @hidden */
  class Capabilities () extends js.Object {
    def this(list: js.Array[GoogleActionsV2Capability]) = this()
    /**
      * List of surface capabilities of user device.
      * @public
      */
    var list: js.Array[GoogleActionsV2Capability] = js.native
    /**
      * Returns true if user device has a given surface capability.
      * @public
      */
    def has(capability: SurfaceCapability): Boolean = js.native
  }
  
  @js.native
  /** @hidden */
  class Surface () extends js.Object {
    def this(surface: GoogleActionsV2Surface) = this()
    /** @public */
    var capabilities: Capabilities = js.native
    /**
      * Checks if surface has an attribute like a capability
      *
      * @example
      * ```javascript
      *
      * app.intent('Default Welcome Intent', conv => {
      *   if (conv.surface.has('actions.capability.AUDIO_OUTPUT')) {
      *     conv.ask('You can hear me! How are you?')
      *   } else {
      *     conv.ask('You can read this! How are you?')
      *   }
      * })
      * ```
      *
      * @param attribute An attribute like SurfaceCapability
      * @public
      */
    def has(attribute: SurfaceCapability): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.actionsDOTcapabilityDOTAUDIO_OUTPUT
    - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.actionsDOTcapabilityDOTSCREEN_OUTPUT
    - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.actionsDOTcapabilityDOTMEDIA_RESPONSE_AUDIO
    - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.actionsDOTcapabilityDOTWEB_BROWSER
    - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.actionsDOTcapabilityDOTINTERACTIVE_CANVAS
  */
  trait SurfaceCapability extends js.Object
  
}


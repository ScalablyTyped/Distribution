package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects of this class are used for notifying changes of the configuration.
  *
  * They are broadcasted by the configuration controller which maintains the configuration. The set of types of configuration changes is not fixed and is
  * not maintained or documented in one place.
  *
  * The set of used members and the exact meaning of their values is not the same for all types. Therefore, the descriptions of the members are just
  * general guidelines. See {@link XConfigurationController} for a list of event types used by the basic drawing framework.
  */
trait ConfigurationChangeEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** The current configuration, depending on the event type, either before or after the change. May be an empty reference. */
  var Configuration: XConfiguration
  /** The resource id that is part of the configuration change. */
  var ResourceId: XResourceId
  /** The resource object that corresponds to the {@link ResourceId} . May be an empty reference. */
  var ResourceObject: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * The type of configuration change is a free-form string. This is the only member that is always set. The values of the other members depend on the
    * configuration change type and may or may not be set.
    */
  var Type: java.lang.String
  /** Each listener is called with exactly the {@link UserData} that was given when the listener was registered. */
  var UserData: js.Any
}

object ConfigurationChangeEvent {
  @scala.inline
  def apply(
    Configuration: XConfiguration,
    ResourceId: XResourceId,
    ResourceObject: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Type: java.lang.String,
    UserData: js.Any
  ): ConfigurationChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Configuration")(Configuration)
    __obj.updateDynamic("ResourceId")(ResourceId)
    __obj.updateDynamic("ResourceObject")(ResourceObject)
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("UserData")(UserData)
    __obj.asInstanceOf[ConfigurationChangeEvent]
  }
}


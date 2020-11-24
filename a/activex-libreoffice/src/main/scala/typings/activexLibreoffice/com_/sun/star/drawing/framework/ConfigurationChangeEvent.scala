package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Objects of this class are used for notifying changes of the configuration.
  *
  * They are broadcasted by the configuration controller which maintains the configuration. The set of types of configuration changes is not fixed and is
  * not maintained or documented in one place.
  *
  * The set of used members and the exact meaning of their values is not the same for all types. Therefore, the descriptions of the members are just
  * general guidelines. See {@link XConfigurationController} for a list of event types used by the basic drawing framework.
  */
@js.native
trait ConfigurationChangeEvent extends EventObject {
  
  /** The current configuration, depending on the event type, either before or after the change. May be an empty reference. */
  var Configuration: XConfiguration = js.native
  
  /** The resource id that is part of the configuration change. */
  var ResourceId: XResourceId = js.native
  
  /** The resource object that corresponds to the {@link ResourceId} . May be an empty reference. */
  var ResourceObject: XInterface = js.native
  
  /**
    * The type of configuration change is a free-form string. This is the only member that is always set. The values of the other members depend on the
    * configuration change type and may or may not be set.
    */
  var Type: String = js.native
  
  /** Each listener is called with exactly the {@link UserData} that was given when the listener was registered. */
  var UserData: js.Any = js.native
}
object ConfigurationChangeEvent {
  
  @scala.inline
  def apply(
    Configuration: XConfiguration,
    ResourceId: XResourceId,
    ResourceObject: XInterface,
    Source: XInterface,
    Type: String,
    UserData: js.Any
  ): ConfigurationChangeEvent = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceObject = ResourceObject.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationChangeEvent]
  }
  
  @scala.inline
  implicit class ConfigurationChangeEventOps[Self <: ConfigurationChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfiguration(value: XConfiguration): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: XResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceObject(value: XInterface): Self = this.set("ResourceObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserData(value: js.Any): Self = this.set("UserData", value.asInstanceOf[js.Any])
  }
}

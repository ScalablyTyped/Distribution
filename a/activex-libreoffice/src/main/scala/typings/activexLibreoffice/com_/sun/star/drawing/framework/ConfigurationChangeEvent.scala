package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait ConfigurationChangeEvent
  extends StObject
     with EventObject {
  
  /** The current configuration, depending on the event type, either before or after the change. May be an empty reference. */
  var Configuration: XConfiguration
  
  /** The resource id that is part of the configuration change. */
  var ResourceId: XResourceId
  
  /** The resource object that corresponds to the {@link ResourceId} . May be an empty reference. */
  var ResourceObject: XInterface
  
  /**
    * The type of configuration change is a free-form string. This is the only member that is always set. The values of the other members depend on the
    * configuration change type and may or may not be set.
    */
  var Type: String
  
  /** Each listener is called with exactly the {@link UserData} that was given when the listener was registered. */
  var UserData: js.Any
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
  implicit class ConfigurationChangeEventMutableBuilder[Self <: ConfigurationChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: XConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: XResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceObject(value: XInterface): Self = StObject.set(x, "ResourceObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserData(value: js.Any): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
  }
}

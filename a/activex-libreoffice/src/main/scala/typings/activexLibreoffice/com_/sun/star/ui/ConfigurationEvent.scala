package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.com_.sun.star.container.ContainerEvent
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this event is broadcasted by a configuration manager whenever the state of user interface element has changed.
  * @since OOo 2.0
  */
@js.native
trait ConfigurationEvent extends ContainerEvent {
  
  /** contains the resource URL of the user interface element or a configuration manager, which has been changed, inserted or replaced. */
  var ResourceURL: String = js.native
  
  /** contains additional information about this configuration event. The type depends on the specific implementation. */
  var aInfo: js.Any = js.native
}
object ConfigurationEvent {
  
  @scala.inline
  def apply(
    Accessor: js.Any,
    Element: js.Any,
    ReplacedElement: js.Any,
    ResourceURL: String,
    Source: XInterface,
    aInfo: js.Any
  ): ConfigurationEvent = {
    val __obj = js.Dynamic.literal(Accessor = Accessor.asInstanceOf[js.Any], Element = Element.asInstanceOf[js.Any], ReplacedElement = ReplacedElement.asInstanceOf[js.Any], ResourceURL = ResourceURL.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], aInfo = aInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationEvent]
  }
  
  @scala.inline
  implicit class ConfigurationEventMutableBuilder[Self <: ConfigurationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAInfo(value: js.Any): Self = StObject.set(x, "aInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceURL(value: String): Self = StObject.set(x, "ResourceURL", value.asInstanceOf[js.Any])
  }
}

package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.ContainerEvent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this event is broadcasted by a configuration manager whenever the state of user interface element has changed.
  * @since OOo 2.0
  */
trait ConfigurationEvent extends ContainerEvent {
  /** contains the resource URL of the user interface element or a configuration manager, which has been changed, inserted or replaced. */
  var ResourceURL: String
  /** contains additional information about this configuration event. The type depends on the specific implementation. */
  var aInfo: js.Any
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
    val __obj = js.Dynamic.literal(Accessor = Accessor, Element = Element, ReplacedElement = ReplacedElement, ResourceURL = ResourceURL, Source = Source, aInfo = aInfo)
  
    __obj.asInstanceOf[ConfigurationEvent]
  }
}


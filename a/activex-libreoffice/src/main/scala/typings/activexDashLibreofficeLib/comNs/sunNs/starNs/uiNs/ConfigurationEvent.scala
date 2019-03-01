package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this event is broadcasted by a configuration manager whenever the state of user interface element has changed.
  * @since OOo 2.0
  */
trait ConfigurationEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.ContainerEvent {
  /** contains the resource URL of the user interface element or a configuration manager, which has been changed, inserted or replaced. */
  var ResourceURL: java.lang.String
  /** contains additional information about this configuration event. The type depends on the specific implementation. */
  var aInfo: js.Any
}

object ConfigurationEvent {
  @scala.inline
  def apply(
    Accessor: js.Any,
    Element: js.Any,
    ReplacedElement: js.Any,
    ResourceURL: java.lang.String,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    aInfo: js.Any
  ): ConfigurationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Accessor")(Accessor)
    __obj.updateDynamic("Element")(Element)
    __obj.updateDynamic("ReplacedElement")(ReplacedElement)
    __obj.updateDynamic("ResourceURL")(ResourceURL)
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("aInfo")(aInfo)
    __obj.asInstanceOf[ConfigurationEvent]
  }
}


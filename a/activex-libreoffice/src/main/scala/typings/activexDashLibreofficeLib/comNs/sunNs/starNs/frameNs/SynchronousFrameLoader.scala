package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * derivations of this abstract service are used to load components into Frames of the environment
  *
  * Concrete implementations of this service register, for example, for file name extensions or MIME types to load appropriate components. The components
  * loaded are at least {@link Controller} . Instead of service {@link FrameLoader} this one use synchronous processes to load the component.
  * @see FrameLoader
  */
trait SynchronousFrameLoader
  extends XSynchronousFrameLoader
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed

object SynchronousFrameLoader {
  @scala.inline
  def apply(
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    getName: js.Function0[java.lang.String],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    load: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      XFrame, 
      scala.Boolean
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit]
  ): SynchronousFrameLoader = {
    val __obj = js.Dynamic.literal(Name = Name, acquire = acquire, cancel = cancel, getName = getName, initialize = initialize, load = load, queryInterface = queryInterface, release = release, setName = setName)
  
    __obj.asInstanceOf[SynchronousFrameLoader]
  }
}


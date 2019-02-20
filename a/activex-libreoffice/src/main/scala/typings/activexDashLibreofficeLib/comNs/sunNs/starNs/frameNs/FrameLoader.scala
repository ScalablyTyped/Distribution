package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * derivations of this abstract service are used to load components into Frames of the environment
  *
  * Concrete implementations of this service register, for example, for file name extensions or MIME types to load appropriate components. The components
  * loaded are at least {@link Controller} . Instead of {@link SynchronousFrameLoader} this one use asynchronous processes to load the component.
  * @see SynchronousFrameLoader
  */
trait FrameLoader
  extends XFrameLoader
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed


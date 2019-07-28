package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.URL
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides {@link XDispatch} interfaces for certain functions which are useful at the UI.
  * @see XDispatch
  */
trait XDispatchProvider extends XInterface {
  /**
    * searches for an {@link XDispatch} for the specified URL within the specified target frame.
    * @param URL describe the feature which should be supported by returned dispatch object
    * @param TargetFrameName specify the frame which should be the target for this request
    * @param SearchFlags optional search parameter for finding the frame if no special **TargetFrameName** was used
    * @returns the dispatch object which provides queried functionality ;  or `NULL` if no dispatch object is available
    * @see XFrame.findFrame()
    * @see XDispatchProvider.queryDispatches()
    */
  def queryDispatch(URL: URL, TargetFrameName: String, SearchFlags: Double): XDispatch
  /**
    * actually this method is redundant to {@link XDispatchProvider.queryDispatch()} to avoid multiple remote calls.
    * @param Requests list of dispatch requests
    * @returns multiple dispatch interfaces for the specified descriptors at once  It's not allowed to pack it - because every request must match to his real re
    */
  def queryDispatches(Requests: SeqEquiv[DispatchDescriptor]): SafeArray[XDispatch]
}

object XDispatchProvider {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDispatchProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDispatchProvider]
  }
}


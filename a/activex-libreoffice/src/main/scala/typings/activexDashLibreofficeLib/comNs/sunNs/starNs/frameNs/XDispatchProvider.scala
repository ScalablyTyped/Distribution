package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides {@link XDispatch} interfaces for certain functions which are useful at the UI.
  * @see XDispatch
  */
trait XDispatchProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * searches for an {@link XDispatch} for the specified URL within the specified target frame.
    * @param URL describe the feature which should be supported by returned dispatch object
    * @param TargetFrameName specify the frame which should be the target for this request
    * @param SearchFlags optional search parameter for finding the frame if no special **TargetFrameName** was used
    * @returns the dispatch object which provides queried functionality ;  or `NULL` if no dispatch object is available
    * @see XFrame.findFrame()
    * @see XDispatchProvider.queryDispatches()
    */
  def queryDispatch(
    URL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL,
    TargetFrameName: java.lang.String,
    SearchFlags: scala.Double
  ): XDispatch
  /**
    * actually this method is redundant to {@link XDispatchProvider.queryDispatch()} to avoid multiple remote calls.
    * @param Requests list of dispatch requests
    * @returns multiple dispatch interfaces for the specified descriptors at once  It's not allowed to pack it - because every request must match to his real re
    */
  def queryDispatches(Requests: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DispatchDescriptor]): activexDashInteropLib.SafeArray[XDispatch]
}

object XDispatchProvider {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryDispatch: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      java.lang.String, 
      scala.Double, 
      XDispatch
    ],
    queryDispatches: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DispatchDescriptor], 
      activexDashInteropLib.SafeArray[XDispatch]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDispatchProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryDispatch = queryDispatch, queryDispatches = queryDispatches, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDispatchProvider]
  }
}


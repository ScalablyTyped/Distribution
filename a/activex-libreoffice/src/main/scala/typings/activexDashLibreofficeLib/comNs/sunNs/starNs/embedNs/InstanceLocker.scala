package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The main task of this service is to prevent closing, terminating and/or etc. of controlled object.
  *
  * After creation the service adds a listener of requested type ( close, terminate and/or etc. ) to the controlled object and let the listener throw
  * related veto exception until the service is disposed.
  */
trait InstanceLocker
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * is used to initialize the object on it's creation.
    * @param xInstance the controlled object. Must implement the related to the requested actions broadcaster interface.
    * @param nActions specifies the actions that should be done ( prevent closing, prevent termination and/or etc. ). It must not be empty and can currently c
    */
  def InstanceLockerCtor1(xInstance: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, nActions: scala.Double): scala.Unit
  /**
    * is used to initialize the object on it's creation.
    * @param xInstance the controlled object. Must implement the related to the requested actions broadcaster interface.
    * @param nActions specifies the actions that should be done ( prevent closing, prevent termination and/or etc. ). It must not be empty and can currently c
    * @param xApprove The object implementing {@link XActionsApproval} interface. If this parameter is an empty reference the object will proceed with the spe
    */
  def InstanceLockerCtor2(
    xInstance: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    nActions: scala.Double,
    xApprove: XActionsApproval
  ): scala.Unit
}

object InstanceLocker {
  @scala.inline
  def apply(
    InstanceLockerCtor1: (activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Double) => scala.Unit,
    InstanceLockerCtor2: (activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Double, XActionsApproval) => scala.Unit,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    dispose: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit
  ): InstanceLocker = {
    val __obj = js.Dynamic.literal(InstanceLockerCtor1 = js.Any.fromFunction2(InstanceLockerCtor1), InstanceLockerCtor2 = js.Any.fromFunction3(InstanceLockerCtor2), acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[InstanceLocker]
  }
}


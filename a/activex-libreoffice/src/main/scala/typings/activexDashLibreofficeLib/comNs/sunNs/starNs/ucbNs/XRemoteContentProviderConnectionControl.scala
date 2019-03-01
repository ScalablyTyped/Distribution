package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple mechanism to find out if the connection between a remote content provider distributor and acceptor gets lost.
  *
  * This interface should be supported by the **DoneListener** parameter of {@link XRemoteContentProviderAcceptor.addRemoteContentProvider()} .
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderConnectionControl
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Enable connection control, using as a token some object implemented on the remote content provider acceptor's side.
    *
    * The implementation of this interface must hold a reference to the supplied token. If the connection gets lost, the reference count of the token will
    * drop, which the remote content provider acceptor can observe.
    * @param Acceptor The remote content provider acceptor on the other side of the connection.
    * @param Token Some object implemented on the remote content provider acceptor's side of the connection.
    */
  def enableConnectionControl(
    Acceptor: XRemoteContentProviderAcceptor,
    Token: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): scala.Unit
}

object XRemoteContentProviderConnectionControl {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    enableConnectionControl: js.Function2[
      XRemoteContentProviderAcceptor, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XRemoteContentProviderConnectionControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("enableConnectionControl")(enableConnectionControl)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XRemoteContentProviderConnectionControl]
  }
}


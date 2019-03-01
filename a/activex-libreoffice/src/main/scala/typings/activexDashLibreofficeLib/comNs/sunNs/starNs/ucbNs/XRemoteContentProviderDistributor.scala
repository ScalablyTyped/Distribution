package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Distribute a content broker to various XRemoteContentProviderAcceptors.
  * @author Stephan Bergmann
  * @see XRemoteContentProviderAcceptor
  * @version 1.0
  */
trait XRemoteContentProviderDistributor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Offer the local content broker to a remote content provider acceptor.
    *
    * The Uno Url is handed to the {@link com.sun.star.bridge.UnoUrlResolver} service, which is responsible for raising any of the advertised exceptions.
    * @param Url A Uno Url to address the {@link XRemoteContentProviderAcceptor} .
    * @param Identifier An identifier handed to the {@link XRemoteContentProviderAcceptor} .
    * @returns success indicator. Especially, if there's already a connection to the given Url, the call will fail, no matter whether that connection uses the s
    */
  def connectToRemoteAcceptor(Url: java.lang.String, Identifier: java.lang.String): scala.Boolean
  /** Undo the offering of the local content broker to all remote content provider acceptors. */
  def disconnectFromAll(): scala.Unit
  /**
    * Undo the offering of the local content broker to a specific remote content provider acceptor.
    * @param Url A Uno Url to address the {@link XRemoteContentProviderAcceptor} .
    * @returns success indicator.
    */
  def disconnectFromRemoteAcceptor(Url: java.lang.String): scala.Boolean
}

object XRemoteContentProviderDistributor {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    connectToRemoteAcceptor: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    disconnectFromAll: js.Function0[scala.Unit],
    disconnectFromRemoteAcceptor: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XRemoteContentProviderDistributor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("connectToRemoteAcceptor")(connectToRemoteAcceptor)
    __obj.updateDynamic("disconnectFromAll")(disconnectFromAll)
    __obj.updateDynamic("disconnectFromRemoteAcceptor")(disconnectFromRemoteAcceptor)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XRemoteContentProviderDistributor]
  }
}


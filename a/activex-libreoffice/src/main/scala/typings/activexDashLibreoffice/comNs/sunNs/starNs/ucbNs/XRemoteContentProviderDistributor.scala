package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Distribute a content broker to various XRemoteContentProviderAcceptors.
  * @author Stephan Bergmann
  * @see XRemoteContentProviderAcceptor
  * @version 1.0
  */
trait XRemoteContentProviderDistributor extends XInterface {
  /**
    * Offer the local content broker to a remote content provider acceptor.
    *
    * The Uno Url is handed to the {@link com.sun.star.bridge.UnoUrlResolver} service, which is responsible for raising any of the advertised exceptions.
    * @param Url A Uno Url to address the {@link XRemoteContentProviderAcceptor} .
    * @param Identifier An identifier handed to the {@link XRemoteContentProviderAcceptor} .
    * @returns success indicator. Especially, if there's already a connection to the given Url, the call will fail, no matter whether that connection uses the s
    */
  def connectToRemoteAcceptor(Url: String, Identifier: String): Boolean
  /** Undo the offering of the local content broker to all remote content provider acceptors. */
  def disconnectFromAll(): Unit
  /**
    * Undo the offering of the local content broker to a specific remote content provider acceptor.
    * @param Url A Uno Url to address the {@link XRemoteContentProviderAcceptor} .
    * @returns success indicator.
    */
  def disconnectFromRemoteAcceptor(Url: String): Boolean
}

object XRemoteContentProviderDistributor {
  @scala.inline
  def apply(
    acquire: () => Unit,
    connectToRemoteAcceptor: (String, String) => Boolean,
    disconnectFromAll: () => Unit,
    disconnectFromRemoteAcceptor: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XRemoteContentProviderDistributor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), connectToRemoteAcceptor = js.Any.fromFunction2(connectToRemoteAcceptor), disconnectFromAll = js.Any.fromFunction0(disconnectFromAll), disconnectFromRemoteAcceptor = js.Any.fromFunction1(disconnectFromRemoteAcceptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XRemoteContentProviderDistributor]
  }
}


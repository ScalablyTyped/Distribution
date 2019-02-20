package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents common functionality for embedded objects. */
trait XEmbeddedObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable
     with XVisualObject
     with XClassifiedObject
     with XComponentSupplier
     with XStateChangeBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventBroadcaster {
  /**
    * provides access to the internal link to the container client.
    * @returns a reference to related container client if any is set
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  var ClientSite: XEmbeddedClient
  /**
    * returns the current state of the object.
    * @returns the current state of the object
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    */
  val CurrentState: scala.Double
  /**
    * returns supported states for the object.
    * @returns the sequence of states the object can be set to
    * @throws com::sun::star::embed::NeedsRunnignStateException means that the object is in loaded state now and can be switched to running state, other possib
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    */
  val ReachableStates: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * returns supported verbs for the object.
    * @returns the sequence of verbs the object supports
    * @throws com::sun::star::embed::NeedsRunnignStateException means that the object is in loaded state now and can be switched to running state, acceptable v
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state to call the function
    */
  val SupportedVerbs: activexDashInteropLib.SafeArray[VerbDescriptor]
  /**
    * changes the state of the object to the requested one.
    * @param nNewState specifies the new state, can take values from the constant set {@link com.sun.star.embed.EmbedStates}
    * @throws com::sun::star::embed::UnreachableStateException the specified state can not be reached
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def changeState(nNewState: scala.Double): scala.Unit
  /**
    * lets object perform an action referenced by nVerbID.
    * @param nVerbID specifies an action to perform, can take values from {@link EmbedVerbs}
    * @throws com::sun::star::lang::IllegalArgumentException the verb is not supported
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state to call the function
    * @throws com::sun::star::embed::UnreachableStateException the state, required by the verb, can not be reached
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def doVerb(nVerbID: scala.Double): scala.Unit
  /**
    * provides access to the internal link to the container client.
    * @returns a reference to related container client if any is set
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def getClientSite(): XEmbeddedClient
  /**
    * returns the current state of the object.
    * @returns the current state of the object
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    */
  def getCurrentState(): scala.Double
  /**
    * returns supported states for the object.
    * @returns the sequence of states the object can be set to
    * @throws com::sun::star::embed::NeedsRunnignStateException means that the object is in loaded state now and can be switched to running state, other possib
    * @throws com::sun::star::embed::WrongStateException in case object is in invalid state
    */
  def getReachableStates(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * retrieves the status of the object.
    * @param nAspect the aspect specifying the form of object representation
    * @returns the value specifying the status of the object for specified aspect can take values from {@link EmbedMisc} constant set
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def getStatus(nAspect: scala.Double): scala.Double
  /**
    * returns supported verbs for the object.
    * @returns the sequence of verbs the object supports
    * @throws com::sun::star::embed::NeedsRunnignStateException means that the object is in loaded state now and can be switched to running state, acceptable v
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state to call the function
    */
  def getSupportedVerbs(): activexDashInteropLib.SafeArray[VerbDescriptor]
  /**
    * sets a connection to the container's client.
    * @param xClient provides a reference to a client implementation
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def setClientSite(xClient: XEmbeddedClient): scala.Unit
  /**
    * provides object with the name of container document.
    * @param sName name of the container document
    */
  def setContainerName(sName: java.lang.String): scala.Unit
  /**
    * specifies how often the object's representation should be updated.
    * @param nMode the new update mode, can take values from EmbeddedUpdateModes
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def setUpdateMode(nMode: scala.Double): scala.Unit
  /**
    * updates object's representations.
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state to call the function
    * @throws com::sun::star::uno::Exception in case problems detected
    */
  def update(): scala.Unit
}


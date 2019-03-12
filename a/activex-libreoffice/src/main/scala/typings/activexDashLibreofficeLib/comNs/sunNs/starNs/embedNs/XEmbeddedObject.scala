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
  val ReachableStates: stdLib.SafeArray[scala.Double]
  /**
    * returns supported verbs for the object.
    * @returns the sequence of verbs the object supports
    * @throws com::sun::star::embed::NeedsRunnignStateException means that the object is in loaded state now and can be switched to running state, acceptable v
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state to call the function
    */
  val SupportedVerbs: stdLib.SafeArray[VerbDescriptor]
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
  def getReachableStates(): stdLib.SafeArray[scala.Double]
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
  def getSupportedVerbs(): stdLib.SafeArray[VerbDescriptor]
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

object XEmbeddedObject {
  @scala.inline
  def apply(
    ClassID: stdLib.SafeArray[scala.Double],
    ClassName: java.lang.String,
    ClientSite: XEmbeddedClient,
    Component: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable,
    CurrentState: scala.Double,
    ReachableStates: stdLib.SafeArray[scala.Double],
    SupportedVerbs: stdLib.SafeArray[VerbDescriptor],
    acquire: () => scala.Unit,
    addCloseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventListener => scala.Unit,
    addStateChangeListener: XStateChangeListener => scala.Unit,
    changeState: scala.Double => scala.Unit,
    close: scala.Boolean => scala.Unit,
    doVerb: scala.Double => scala.Unit,
    getClassID: () => stdLib.SafeArray[scala.Double],
    getClassName: () => java.lang.String,
    getClientSite: () => XEmbeddedClient,
    getComponent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable,
    getCurrentState: () => scala.Double,
    getMapUnit: scala.Double => scala.Double,
    getPreferredVisualRepresentation: scala.Double => VisualRepresentation,
    getReachableStates: () => stdLib.SafeArray[scala.Double],
    getStatus: scala.Double => scala.Double,
    getSupportedVerbs: () => stdLib.SafeArray[VerbDescriptor],
    getVisualAreaSize: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeCloseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventListener => scala.Unit,
    removeStateChangeListener: XStateChangeListener => scala.Unit,
    setClassInfo: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], java.lang.String) => scala.Unit,
    setClientSite: XEmbeddedClient => scala.Unit,
    setContainerName: java.lang.String => scala.Unit,
    setUpdateMode: scala.Double => scala.Unit,
    setVisualAreaSize: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size) => scala.Unit,
    update: () => scala.Unit
  ): XEmbeddedObject = {
    val __obj = js.Dynamic.literal(ClassID = ClassID, ClassName = ClassName, ClientSite = ClientSite, Component = Component, CurrentState = CurrentState, ReachableStates = ReachableStates, SupportedVerbs = SupportedVerbs, acquire = js.Any.fromFunction0(acquire), addCloseListener = js.Any.fromFunction1(addCloseListener), addEventListener = js.Any.fromFunction1(addEventListener), addStateChangeListener = js.Any.fromFunction1(addStateChangeListener), changeState = js.Any.fromFunction1(changeState), close = js.Any.fromFunction1(close), doVerb = js.Any.fromFunction1(doVerb), getClassID = js.Any.fromFunction0(getClassID), getClassName = js.Any.fromFunction0(getClassName), getClientSite = js.Any.fromFunction0(getClientSite), getComponent = js.Any.fromFunction0(getComponent), getCurrentState = js.Any.fromFunction0(getCurrentState), getMapUnit = js.Any.fromFunction1(getMapUnit), getPreferredVisualRepresentation = js.Any.fromFunction1(getPreferredVisualRepresentation), getReachableStates = js.Any.fromFunction0(getReachableStates), getStatus = js.Any.fromFunction1(getStatus), getSupportedVerbs = js.Any.fromFunction0(getSupportedVerbs), getVisualAreaSize = js.Any.fromFunction1(getVisualAreaSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCloseListener = js.Any.fromFunction1(removeCloseListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeStateChangeListener = js.Any.fromFunction1(removeStateChangeListener), setClassInfo = js.Any.fromFunction2(setClassInfo), setClientSite = js.Any.fromFunction1(setClientSite), setContainerName = js.Any.fromFunction1(setContainerName), setUpdateMode = js.Any.fromFunction1(setUpdateMode), setVisualAreaSize = js.Any.fromFunction2(setVisualAreaSize), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[XEmbeddedObject]
  }
}


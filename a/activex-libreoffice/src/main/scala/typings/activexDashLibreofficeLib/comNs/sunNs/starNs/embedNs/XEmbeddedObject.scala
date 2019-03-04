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

object XEmbeddedObject {
  @scala.inline
  def apply(
    ClassID: activexDashInteropLib.SafeArray[scala.Double],
    ClassName: java.lang.String,
    ClientSite: XEmbeddedClient,
    Component: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable,
    CurrentState: scala.Double,
    ReachableStates: activexDashInteropLib.SafeArray[scala.Double],
    SupportedVerbs: activexDashInteropLib.SafeArray[VerbDescriptor],
    acquire: js.Function0[scala.Unit],
    addCloseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventListener, scala.Unit],
    addStateChangeListener: js.Function1[XStateChangeListener, scala.Unit],
    changeState: js.Function1[scala.Double, scala.Unit],
    close: js.Function1[scala.Boolean, scala.Unit],
    doVerb: js.Function1[scala.Double, scala.Unit],
    getClassID: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getClassName: js.Function0[java.lang.String],
    getClientSite: js.Function0[XEmbeddedClient],
    getComponent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable],
    getCurrentState: js.Function0[scala.Double],
    getMapUnit: js.Function1[scala.Double, scala.Double],
    getPreferredVisualRepresentation: js.Function1[scala.Double, VisualRepresentation],
    getReachableStates: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getStatus: js.Function1[scala.Double, scala.Double],
    getSupportedVerbs: js.Function0[activexDashInteropLib.SafeArray[VerbDescriptor]],
    getVisualAreaSize: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeCloseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseListener, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventListener, scala.Unit],
    removeStateChangeListener: js.Function1[XStateChangeListener, scala.Unit],
    setClassInfo: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      java.lang.String, 
      scala.Unit
    ],
    setClientSite: js.Function1[XEmbeddedClient, scala.Unit],
    setContainerName: js.Function1[java.lang.String, scala.Unit],
    setUpdateMode: js.Function1[scala.Double, scala.Unit],
    setVisualAreaSize: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit],
    update: js.Function0[scala.Unit]
  ): XEmbeddedObject = {
    val __obj = js.Dynamic.literal(ClassID = ClassID, ClassName = ClassName, ClientSite = ClientSite, Component = Component, CurrentState = CurrentState, ReachableStates = ReachableStates, SupportedVerbs = SupportedVerbs, acquire = acquire, addCloseListener = addCloseListener, addEventListener = addEventListener, addStateChangeListener = addStateChangeListener, changeState = changeState, close = close, doVerb = doVerb, getClassID = getClassID, getClassName = getClassName, getClientSite = getClientSite, getComponent = getComponent, getCurrentState = getCurrentState, getMapUnit = getMapUnit, getPreferredVisualRepresentation = getPreferredVisualRepresentation, getReachableStates = getReachableStates, getStatus = getStatus, getSupportedVerbs = getSupportedVerbs, getVisualAreaSize = getVisualAreaSize, queryInterface = queryInterface, release = release, removeCloseListener = removeCloseListener, removeEventListener = removeEventListener, removeStateChangeListener = removeStateChangeListener, setClassInfo = setClassInfo, setClientSite = setClientSite, setContainerName = setContainerName, setUpdateMode = setUpdateMode, setVisualAreaSize = setVisualAreaSize, update = update)
  
    __obj.asInstanceOf[XEmbeddedObject]
  }
}


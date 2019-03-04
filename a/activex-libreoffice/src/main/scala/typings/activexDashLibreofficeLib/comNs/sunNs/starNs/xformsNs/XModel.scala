package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represent an {@link XForms} model */
trait XModel extends js.Object {
  /** get a container containing all bindings; also supports XNameAccess */
  val Bindings: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet
  /** provides management access to the XSD data types associated with the model */
  val DataTypeRepository: XDataTypeRepository
  /** get the default instance for this model */
  val DefaultInstance: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XDocument
  /** get the {@link XForms} model ID */
  var ID: java.lang.String
  /**
    * gets container containing all instances;
    *
    * The elements of the set are arrays of {@link com.sun.star.beans.PropertyValues} , containing the ID, the URL, and the instance itself.
    */
  val Instances: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet
  /** get container containing all submissions; also supports XNameAccess */
  val Submissions: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet
  /**
    * clone an arbitrary binding element for this model; still needs
    *
    * The returned binding still needs to be inserted into the bindings container.
    * @see getBindings
    */
  def cloneBinding(binding: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * clone an arbitrary submission element for this model
    *
    * The returned submission element still needs to be inserted into the submission container.
    * @see getSubmissions
    */
  def cloneSubmission(submission: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet): XSubmission
  /**
    * create a binding element for this model
    *
    * The returned binding still needs to be inserted into the bindings container.
    * @see getBindings
    */
  def createBinding(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * create a submission element for this model
    *
    * The returned submission element still needs to be inserted into the submission container.
    * @see getSubmissions
    */
  def createSubmission(): XSubmission
  /**
    * get a binding with a certain ID
    *
    * This is a convenience method: the same result can also be obtained through {@link getBindings()}
    */
  def getBinding(id: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** get a container containing all bindings; also supports XNameAccess */
  def getBindings(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet
  /** provides management access to the XSD data types associated with the model */
  def getDataTypeRepository(): XDataTypeRepository
  /** get the default instance for this model */
  def getDefaultInstance(): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XDocument
  /** get the {@link XForms} model ID */
  def getID(): java.lang.String
  /** retrieves the instance with the given id */
  def getInstanceDocument(id: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XDocument
  /**
    * gets container containing all instances;
    *
    * The elements of the set are arrays of {@link com.sun.star.beans.PropertyValues} , containing the ID, the URL, and the instance itself.
    */
  def getInstances(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet
  /**
    * get a submission with a certain ID.
    *
    * This is a convenience method: the same result can also be obtained through {@link getSubmissions()} .
    */
  def getSubmission(id: java.lang.String): XSubmission
  /** get container containing all submissions; also supports XNameAccess */
  def getSubmissions(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet
  /** initialize the model */
  def initialize(): scala.Unit
  /** rebuild the model */
  def rebuild(): scala.Unit
  /** re-evaluate all calculate attributes */
  def recalculate(): scala.Unit
  /** refresh the model */
  def refresh(): scala.Unit
  /** re-evaluate all validity attributes */
  def revalidate(): scala.Unit
  /** set the {@link XForms} model ID */
  def setID(id: java.lang.String): scala.Unit
  /**
    * submit form through given submission id
    *
    * This is a convenience method. Calling it is equivalent to calling `getSubmission()( id ).submit()` .
    * @param id the ID of the submission to execute
    * @throws com::sun::star::util::VetoException when the current model state does not allow a submission. Usually, this indicates that consistency criteria f
    * @throws com::sun::star::lang::WrappedTargetException when another error occurred during the submission. The {@link com.sun.star.lang.WrappedTargetExcepti
    */
  def submit(id: java.lang.String): scala.Unit
  /**
    * submit form through given submission id
    *
    * This is a convenience method. Calling it is equivalent to calling `getSubmission()( id, handler ).submit()` .
    * @param id the ID of the submission to execute
    * @param aHandler This handler allows additional user interaction, which may be necessary before the submission can be performed.
    * @throws com::sun::star::util::VetoException when the current model state does not allow a submission. Usually, this indicates that consistency criteria f
    * @throws com::sun::star::lang::WrappedTargetException when another error occurred during the submission. The {@link com.sun.star.lang.WrappedTargetExcepti
    */
  def submitWithInteraction(
    id: java.lang.String,
    aHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler
  ): scala.Unit
}

object XModel {
  @scala.inline
  def apply(
    Bindings: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet,
    DataTypeRepository: XDataTypeRepository,
    DefaultInstance: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XDocument,
    ID: java.lang.String,
    Instances: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet,
    Submissions: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet,
    cloneBinding: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
    ],
    cloneSubmission: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, XSubmission],
    createBinding: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    createSubmission: js.Function0[XSubmission],
    getBinding: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
    ],
    getBindings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet],
    getDataTypeRepository: js.Function0[XDataTypeRepository],
    getDefaultInstance: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XDocument],
    getID: js.Function0[java.lang.String],
    getInstanceDocument: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XDocument
    ],
    getInstances: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet],
    getSubmission: js.Function1[java.lang.String, XSubmission],
    getSubmissions: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet],
    initialize: js.Function0[scala.Unit],
    rebuild: js.Function0[scala.Unit],
    recalculate: js.Function0[scala.Unit],
    refresh: js.Function0[scala.Unit],
    revalidate: js.Function0[scala.Unit],
    setID: js.Function1[java.lang.String, scala.Unit],
    submit: js.Function1[java.lang.String, scala.Unit],
    submitWithInteraction: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler, 
      scala.Unit
    ]
  ): XModel = {
    val __obj = js.Dynamic.literal(Bindings = Bindings, DataTypeRepository = DataTypeRepository, DefaultInstance = DefaultInstance, ID = ID, Instances = Instances, Submissions = Submissions, cloneBinding = cloneBinding, cloneSubmission = cloneSubmission, createBinding = createBinding, createSubmission = createSubmission, getBinding = getBinding, getBindings = getBindings, getDataTypeRepository = getDataTypeRepository, getDefaultInstance = getDefaultInstance, getID = getID, getInstanceDocument = getInstanceDocument, getInstances = getInstances, getSubmission = getSubmission, getSubmissions = getSubmissions, initialize = initialize, rebuild = rebuild, recalculate = recalculate, refresh = refresh, revalidate = revalidate, setID = setID, submit = submit, submitWithInteraction = submitWithInteraction)
  
    __obj.asInstanceOf[XModel]
  }
}


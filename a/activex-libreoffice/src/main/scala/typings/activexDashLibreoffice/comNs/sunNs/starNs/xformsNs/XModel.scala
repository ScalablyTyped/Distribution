package typings.activexDashLibreoffice.comNs.sunNs.starNs.xformsNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XInteractionHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.XDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represent an {@link XForms} model */
trait XModel extends js.Object {
  /** get a container containing all bindings; also supports XNameAccess */
  val Bindings: XSet
  /** provides management access to the XSD data types associated with the model */
  val DataTypeRepository: XDataTypeRepository
  /** get the default instance for this model */
  val DefaultInstance: XDocument
  /** get the {@link XForms} model ID */
  var ID: String
  /**
    * gets container containing all instances;
    *
    * The elements of the set are arrays of {@link com.sun.star.beans.PropertyValues} , containing the ID, the URL, and the instance itself.
    */
  val Instances: XSet
  /** get container containing all submissions; also supports XNameAccess */
  val Submissions: XSet
  /**
    * clone an arbitrary binding element for this model; still needs
    *
    * The returned binding still needs to be inserted into the bindings container.
    * @see getBindings
    */
  def cloneBinding(binding: XPropertySet): XPropertySet
  /**
    * clone an arbitrary submission element for this model
    *
    * The returned submission element still needs to be inserted into the submission container.
    * @see getSubmissions
    */
  def cloneSubmission(submission: XPropertySet): XSubmission
  /**
    * create a binding element for this model
    *
    * The returned binding still needs to be inserted into the bindings container.
    * @see getBindings
    */
  def createBinding(): XPropertySet
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
  def getBinding(id: String): XPropertySet
  /** get a container containing all bindings; also supports XNameAccess */
  def getBindings(): XSet
  /** provides management access to the XSD data types associated with the model */
  def getDataTypeRepository(): XDataTypeRepository
  /** get the default instance for this model */
  def getDefaultInstance(): XDocument
  /** get the {@link XForms} model ID */
  def getID(): String
  /** retrieves the instance with the given id */
  def getInstanceDocument(id: String): XDocument
  /**
    * gets container containing all instances;
    *
    * The elements of the set are arrays of {@link com.sun.star.beans.PropertyValues} , containing the ID, the URL, and the instance itself.
    */
  def getInstances(): XSet
  /**
    * get a submission with a certain ID.
    *
    * This is a convenience method: the same result can also be obtained through {@link getSubmissions()} .
    */
  def getSubmission(id: String): XSubmission
  /** get container containing all submissions; also supports XNameAccess */
  def getSubmissions(): XSet
  /** initialize the model */
  def initialize(): Unit
  /** rebuild the model */
  def rebuild(): Unit
  /** re-evaluate all calculate attributes */
  def recalculate(): Unit
  /** refresh the model */
  def refresh(): Unit
  /** re-evaluate all validity attributes */
  def revalidate(): Unit
  /** set the {@link XForms} model ID */
  def setID(id: String): Unit
  /**
    * submit form through given submission id
    *
    * This is a convenience method. Calling it is equivalent to calling `getSubmission()( id ).submit()` .
    * @param id the ID of the submission to execute
    * @throws com::sun::star::util::VetoException when the current model state does not allow a submission. Usually, this indicates that consistency criteria f
    * @throws com::sun::star::lang::WrappedTargetException when another error occurred during the submission. The {@link com.sun.star.lang.WrappedTargetExcepti
    */
  def submit(id: String): Unit
  /**
    * submit form through given submission id
    *
    * This is a convenience method. Calling it is equivalent to calling `getSubmission()( id, handler ).submit()` .
    * @param id the ID of the submission to execute
    * @param aHandler This handler allows additional user interaction, which may be necessary before the submission can be performed.
    * @throws com::sun::star::util::VetoException when the current model state does not allow a submission. Usually, this indicates that consistency criteria f
    * @throws com::sun::star::lang::WrappedTargetException when another error occurred during the submission. The {@link com.sun.star.lang.WrappedTargetExcepti
    */
  def submitWithInteraction(id: String, aHandler: XInteractionHandler): Unit
}

object XModel {
  @scala.inline
  def apply(
    Bindings: XSet,
    DataTypeRepository: XDataTypeRepository,
    DefaultInstance: XDocument,
    ID: String,
    Instances: XSet,
    Submissions: XSet,
    cloneBinding: XPropertySet => XPropertySet,
    cloneSubmission: XPropertySet => XSubmission,
    createBinding: () => XPropertySet,
    createSubmission: () => XSubmission,
    getBinding: String => XPropertySet,
    getBindings: () => XSet,
    getDataTypeRepository: () => XDataTypeRepository,
    getDefaultInstance: () => XDocument,
    getID: () => String,
    getInstanceDocument: String => XDocument,
    getInstances: () => XSet,
    getSubmission: String => XSubmission,
    getSubmissions: () => XSet,
    initialize: () => Unit,
    rebuild: () => Unit,
    recalculate: () => Unit,
    refresh: () => Unit,
    revalidate: () => Unit,
    setID: String => Unit,
    submit: String => Unit,
    submitWithInteraction: (String, XInteractionHandler) => Unit
  ): XModel = {
    val __obj = js.Dynamic.literal(Bindings = Bindings, DataTypeRepository = DataTypeRepository, DefaultInstance = DefaultInstance, ID = ID, Instances = Instances, Submissions = Submissions, cloneBinding = js.Any.fromFunction1(cloneBinding), cloneSubmission = js.Any.fromFunction1(cloneSubmission), createBinding = js.Any.fromFunction0(createBinding), createSubmission = js.Any.fromFunction0(createSubmission), getBinding = js.Any.fromFunction1(getBinding), getBindings = js.Any.fromFunction0(getBindings), getDataTypeRepository = js.Any.fromFunction0(getDataTypeRepository), getDefaultInstance = js.Any.fromFunction0(getDefaultInstance), getID = js.Any.fromFunction0(getID), getInstanceDocument = js.Any.fromFunction1(getInstanceDocument), getInstances = js.Any.fromFunction0(getInstances), getSubmission = js.Any.fromFunction1(getSubmission), getSubmissions = js.Any.fromFunction0(getSubmissions), initialize = js.Any.fromFunction0(initialize), rebuild = js.Any.fromFunction0(rebuild), recalculate = js.Any.fromFunction0(recalculate), refresh = js.Any.fromFunction0(refresh), revalidate = js.Any.fromFunction0(revalidate), setID = js.Any.fromFunction1(setID), submit = js.Any.fromFunction1(submit), submitWithInteraction = js.Any.fromFunction2(submitWithInteraction))
  
    __obj.asInstanceOf[XModel]
  }
}


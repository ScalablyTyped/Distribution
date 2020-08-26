package typings.activexLibreoffice.com_.sun.star.xforms

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.container.XSet
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.xml.dom.XDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represent an {@link XForms} model */
@js.native
trait XModel extends js.Object {
  /** get a container containing all bindings; also supports XNameAccess */
  val Bindings: XSet = js.native
  /** provides management access to the XSD data types associated with the model */
  val DataTypeRepository: XDataTypeRepository = js.native
  /** get the default instance for this model */
  val DefaultInstance: XDocument = js.native
  /** get the {@link XForms} model ID */
  var ID: String = js.native
  /**
    * gets container containing all instances;
    *
    * The elements of the set are arrays of {@link com.sun.star.beans.PropertyValues} , containing the ID, the URL, and the instance itself.
    */
  val Instances: XSet = js.native
  /** get container containing all submissions; also supports XNameAccess */
  val Submissions: XSet = js.native
  /**
    * clone an arbitrary binding element for this model; still needs
    *
    * The returned binding still needs to be inserted into the bindings container.
    * @see getBindings
    */
  def cloneBinding(binding: XPropertySet): XPropertySet = js.native
  /**
    * clone an arbitrary submission element for this model
    *
    * The returned submission element still needs to be inserted into the submission container.
    * @see getSubmissions
    */
  def cloneSubmission(submission: XPropertySet): XSubmission = js.native
  /**
    * create a binding element for this model
    *
    * The returned binding still needs to be inserted into the bindings container.
    * @see getBindings
    */
  def createBinding(): XPropertySet = js.native
  /**
    * create a submission element for this model
    *
    * The returned submission element still needs to be inserted into the submission container.
    * @see getSubmissions
    */
  def createSubmission(): XSubmission = js.native
  /**
    * get a binding with a certain ID
    *
    * This is a convenience method: the same result can also be obtained through {@link getBindings()}
    */
  def getBinding(id: String): XPropertySet = js.native
  /** get a container containing all bindings; also supports XNameAccess */
  def getBindings(): XSet = js.native
  /** provides management access to the XSD data types associated with the model */
  def getDataTypeRepository(): XDataTypeRepository = js.native
  /** get the default instance for this model */
  def getDefaultInstance(): XDocument = js.native
  /** get the {@link XForms} model ID */
  def getID(): String = js.native
  /** retrieves the instance with the given id */
  def getInstanceDocument(id: String): XDocument = js.native
  /**
    * gets container containing all instances;
    *
    * The elements of the set are arrays of {@link com.sun.star.beans.PropertyValues} , containing the ID, the URL, and the instance itself.
    */
  def getInstances(): XSet = js.native
  /**
    * get a submission with a certain ID.
    *
    * This is a convenience method: the same result can also be obtained through {@link getSubmissions()} .
    */
  def getSubmission(id: String): XSubmission = js.native
  /** get container containing all submissions; also supports XNameAccess */
  def getSubmissions(): XSet = js.native
  /** initialize the model */
  def initialize(): Unit = js.native
  /** rebuild the model */
  def rebuild(): Unit = js.native
  /** re-evaluate all calculate attributes */
  def recalculate(): Unit = js.native
  /** refresh the model */
  def refresh(): Unit = js.native
  /** re-evaluate all validity attributes */
  def revalidate(): Unit = js.native
  /** set the {@link XForms} model ID */
  def setID(id: String): Unit = js.native
  /**
    * submit form through given submission id
    *
    * This is a convenience method. Calling it is equivalent to calling `getSubmission()( id ).submit()` .
    * @param id the ID of the submission to execute
    * @throws com::sun::star::util::VetoException when the current model state does not allow a submission. Usually, this indicates that consistency criteria f
    * @throws com::sun::star::lang::WrappedTargetException when another error occurred during the submission. The {@link com.sun.star.lang.WrappedTargetExcepti
    */
  def submit(id: String): Unit = js.native
  /**
    * submit form through given submission id
    *
    * This is a convenience method. Calling it is equivalent to calling `getSubmission()( id, handler ).submit()` .
    * @param id the ID of the submission to execute
    * @param aHandler This handler allows additional user interaction, which may be necessary before the submission can be performed.
    * @throws com::sun::star::util::VetoException when the current model state does not allow a submission. Usually, this indicates that consistency criteria f
    * @throws com::sun::star::lang::WrappedTargetException when another error occurred during the submission. The {@link com.sun.star.lang.WrappedTargetExcepti
    */
  def submitWithInteraction(id: String, aHandler: XInteractionHandler): Unit = js.native
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
    val __obj = js.Dynamic.literal(Bindings = Bindings.asInstanceOf[js.Any], DataTypeRepository = DataTypeRepository.asInstanceOf[js.Any], DefaultInstance = DefaultInstance.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Instances = Instances.asInstanceOf[js.Any], Submissions = Submissions.asInstanceOf[js.Any], cloneBinding = js.Any.fromFunction1(cloneBinding), cloneSubmission = js.Any.fromFunction1(cloneSubmission), createBinding = js.Any.fromFunction0(createBinding), createSubmission = js.Any.fromFunction0(createSubmission), getBinding = js.Any.fromFunction1(getBinding), getBindings = js.Any.fromFunction0(getBindings), getDataTypeRepository = js.Any.fromFunction0(getDataTypeRepository), getDefaultInstance = js.Any.fromFunction0(getDefaultInstance), getID = js.Any.fromFunction0(getID), getInstanceDocument = js.Any.fromFunction1(getInstanceDocument), getInstances = js.Any.fromFunction0(getInstances), getSubmission = js.Any.fromFunction1(getSubmission), getSubmissions = js.Any.fromFunction0(getSubmissions), initialize = js.Any.fromFunction0(initialize), rebuild = js.Any.fromFunction0(rebuild), recalculate = js.Any.fromFunction0(recalculate), refresh = js.Any.fromFunction0(refresh), revalidate = js.Any.fromFunction0(revalidate), setID = js.Any.fromFunction1(setID), submit = js.Any.fromFunction1(submit), submitWithInteraction = js.Any.fromFunction2(submitWithInteraction))
    __obj.asInstanceOf[XModel]
  }
  @scala.inline
  implicit class XModelOps[Self <: XModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBindings(value: XSet): Self = this.set("Bindings", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataTypeRepository(value: XDataTypeRepository): Self = this.set("DataTypeRepository", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultInstance(value: XDocument): Self = this.set("DefaultInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstances(value: XSet): Self = this.set("Instances", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmissions(value: XSet): Self = this.set("Submissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloneBinding(value: XPropertySet => XPropertySet): Self = this.set("cloneBinding", js.Any.fromFunction1(value))
    @scala.inline
    def setCloneSubmission(value: XPropertySet => XSubmission): Self = this.set("cloneSubmission", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateBinding(value: () => XPropertySet): Self = this.set("createBinding", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateSubmission(value: () => XSubmission): Self = this.set("createSubmission", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBinding(value: String => XPropertySet): Self = this.set("getBinding", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBindings(value: () => XSet): Self = this.set("getBindings", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDataTypeRepository(value: () => XDataTypeRepository): Self = this.set("getDataTypeRepository", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDefaultInstance(value: () => XDocument): Self = this.set("getDefaultInstance", js.Any.fromFunction0(value))
    @scala.inline
    def setGetID(value: () => String): Self = this.set("getID", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInstanceDocument(value: String => XDocument): Self = this.set("getInstanceDocument", js.Any.fromFunction1(value))
    @scala.inline
    def setGetInstances(value: () => XSet): Self = this.set("getInstances", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSubmission(value: String => XSubmission): Self = this.set("getSubmission", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSubmissions(value: () => XSet): Self = this.set("getSubmissions", js.Any.fromFunction0(value))
    @scala.inline
    def setInitialize(value: () => Unit): Self = this.set("initialize", js.Any.fromFunction0(value))
    @scala.inline
    def setRebuild(value: () => Unit): Self = this.set("rebuild", js.Any.fromFunction0(value))
    @scala.inline
    def setRecalculate(value: () => Unit): Self = this.set("recalculate", js.Any.fromFunction0(value))
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
    @scala.inline
    def setRevalidate(value: () => Unit): Self = this.set("revalidate", js.Any.fromFunction0(value))
    @scala.inline
    def setSetID(value: String => Unit): Self = this.set("setID", js.Any.fromFunction1(value))
    @scala.inline
    def setSubmit(value: String => Unit): Self = this.set("submit", js.Any.fromFunction1(value))
    @scala.inline
    def setSubmitWithInteraction(value: (String, XInteractionHandler) => Unit): Self = this.set("submitWithInteraction", js.Any.fromFunction2(value))
  }
  
}


package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs.DataAccessDescriptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XConnection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XResultSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XJob
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCancellable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gives access to mail merge functionality.
  * @since OOo 1.1.2
  */
trait MailMerge
  extends XJob
     with XCancellable
     with XPropertySet
     with XMailMergeBroadcaster
     with DataAccessDescriptor {
  /**
    * contains the name of the data base column that contains the e-Mail address to the e-Mail to.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var AddressFromColumn: String
  /**
    * contains the name of the document filter to save the attached mail merge document. This property is only valid if "SendAsAttachment" is set to `TRUE`
    * .
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var AttachmentFilter: String
  /**
    * contains the name of the attachment. This property is only valid if "SendAsAttachment" is set to `TRUE` .
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var AttachmentName: String
  /**
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var BlindCopiesTo: SafeArray[String]
  /**
    * contains a list of e-Mail addresses to
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var CopiesTo: SafeArray[String]
  /**
    * contains the URL of a text document that is to be processed.
    *
    * If this property is not set an empty document is created.
    */
  var DocumentURL: String
  /**
    * determines whether file names of created files are generated using the content of a database column.
    *
    * This property is only evaluated for file output.
    */
  var FileNameFromColumn: Boolean
  /**
    * contains the name of the column to generate the output file names.
    *
    * If FileNameFromColumn is true the content of the related column is added to the OutputURL.
    *
    * If "OutputURL" or "FileNamePrefix" are empty the missing value is generated from the location or title of the source documents.
    *
    * This property is only evaluated for file output.
    */
  var FileNamePrefix: String
  /**
    * Contains the password of the incoming mail server. It is necessary to set this if the mail server configuration is set to "SMTP after POP"
    * authentication and the password is not already stored in the configuration for security reasons.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var InServerPassword: String
  /**
    * contains the text of the mail body. This property is only valid if the property "SendAsAttachment" is set to `TRUE`
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var MailBody: String
  /**
    * provides access to the model of the document to be processed.
    *
    * This property will automatically be set to the documents model if a document URL was set.
    */
  var Model: XModel
  /**
    * Contains the password of the outgoing mail server. It is necessary to set this if the password is not already stored in the configuration for security
    * reasons.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var OutServerPassword: String
  /**
    * determines the destination of the mail merge action.
    * @see com.sun.star.text.MailMergeType
    */
  var OutputType: Double
  /**
    * contains the path where generated files are created.
    *
    * If "OutputURL" or "FileNamePrefix" are empty the missing value is generated from the location or title of the source documents.
    *
    * This property is only evaluated for file output.
    */
  var OutputURL: String
  /**
    * contains the properties that are defined in < {@link com.sun.star.view.PrintOptions} >.
    *
    * This property is only evaluated for printer output.
    * @since OOo 2.0
    */
  var PrintOptions: SafeArray[PropertyValue]
  /**
    * determines that the output of the mail merge is save in one single file.
    *
    * This property is only evaluated for file output.
    * @since OOo 2.0
    */
  var SaveAsSingleFile: Boolean
  /**
    * contains the name of the document filter to save the output file(s).
    *
    * This property is only evaluated for file output.
    * @since OOo 2.0
    */
  var SaveFilter: String
  /**
    * determines that the created mail merge document is sent as attachment.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var SendAsAttachment: Boolean
  /**
    * determines that the created mail merge document is sent as body in HTML format. This property is only valid if the property "SendAsAttachment" is set
    * to `FALSE` .
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var SendAsHTML: Boolean
  /**
    * determines whether single print jobs will be generated per output document.
    *
    * This property is only evaluated for printer output.
    */
  var SinglePrintJobs: Boolean
  /**
    * contains the subject of the e-Mail message.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var Subject: String
}

object MailMerge {
  @scala.inline
  def apply(
    ActiveConnection: XConnection,
    AddressFromColumn: String,
    AttachmentFilter: String,
    AttachmentName: String,
    BlindCopiesTo: SafeArray[String],
    BookmarkSelection: Boolean,
    Column: XPropertySet,
    ColumnName: String,
    Command: String,
    CommandType: Double,
    ConnectionInfo: SafeArray[PropertyValue],
    ConnectionResource: String,
    CopiesTo: SafeArray[String],
    DataSourceName: String,
    DatabaseLocation: String,
    DocumentURL: String,
    EscapeProcessing: Boolean,
    FileNameFromColumn: Boolean,
    FileNamePrefix: String,
    Filter: String,
    GroupBy: String,
    HavingClause: String,
    InServerPassword: String,
    MailBody: String,
    Model: XModel,
    Order: String,
    OutServerPassword: String,
    OutputType: Double,
    OutputURL: String,
    PrintOptions: SafeArray[PropertyValue],
    PropertySetInfo: XPropertySetInfo,
    ResultSet: XResultSet,
    SaveAsSingleFile: Boolean,
    SaveFilter: String,
    Selection: SafeArray[_],
    SendAsAttachment: Boolean,
    SendAsHTML: Boolean,
    SinglePrintJobs: Boolean,
    Subject: String,
    acquire: () => Unit,
    addMailMergeEventListener: XMailMergeListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    cancel: () => Unit,
    execute: SeqEquiv[NamedValue] => js.Any,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeMailMergeEventListener: XMailMergeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): MailMerge = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, AddressFromColumn = AddressFromColumn, AttachmentFilter = AttachmentFilter, AttachmentName = AttachmentName, BlindCopiesTo = BlindCopiesTo, BookmarkSelection = BookmarkSelection, Column = Column, ColumnName = ColumnName, Command = Command, CommandType = CommandType, ConnectionInfo = ConnectionInfo, ConnectionResource = ConnectionResource, CopiesTo = CopiesTo, DataSourceName = DataSourceName, DatabaseLocation = DatabaseLocation, DocumentURL = DocumentURL, EscapeProcessing = EscapeProcessing, FileNameFromColumn = FileNameFromColumn, FileNamePrefix = FileNamePrefix, Filter = Filter, GroupBy = GroupBy, HavingClause = HavingClause, InServerPassword = InServerPassword, MailBody = MailBody, Model = Model, Order = Order, OutServerPassword = OutServerPassword, OutputType = OutputType, OutputURL = OutputURL, PrintOptions = PrintOptions, PropertySetInfo = PropertySetInfo, ResultSet = ResultSet, SaveAsSingleFile = SaveAsSingleFile, SaveFilter = SaveFilter, Selection = Selection, SendAsAttachment = SendAsAttachment, SendAsHTML = SendAsHTML, SinglePrintJobs = SinglePrintJobs, Subject = Subject, acquire = js.Any.fromFunction0(acquire), addMailMergeEventListener = js.Any.fromFunction1(addMailMergeEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), cancel = js.Any.fromFunction0(cancel), execute = js.Any.fromFunction1(execute), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeMailMergeEventListener = js.Any.fromFunction1(removeMailMergeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[MailMerge]
  }
}


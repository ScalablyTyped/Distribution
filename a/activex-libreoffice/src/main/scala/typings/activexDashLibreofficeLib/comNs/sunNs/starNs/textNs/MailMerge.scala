package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gives access to mail merge functionality.
  * @since OOo 1.1.2
  */
trait MailMerge
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XJob
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCancellable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XMailMergeBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.DataAccessDescriptor {
  /**
    * contains the name of the data base column that contains the e-Mail address to the e-Mail to.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var AddressFromColumn: java.lang.String
  /**
    * contains the name of the document filter to save the attached mail merge document. This property is only valid if "SendAsAttachment" is set to `TRUE`
    * .
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var AttachmentFilter: java.lang.String
  /**
    * contains the name of the attachment. This property is only valid if "SendAsAttachment" is set to `TRUE` .
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var AttachmentName: java.lang.String
  /**
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var BlindCopiesTo: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * contains a list of e-Mail addresses to
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var CopiesTo: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * contains the URL of a text document that is to be processed.
    *
    * If this property is not set an empty document is created.
    */
  var DocumentURL: java.lang.String
  /**
    * determines whether file names of created files are generated using the content of a database column.
    *
    * This property is only evaluated for file output.
    */
  var FileNameFromColumn: scala.Boolean
  /**
    * contains the name of the column to generate the output file names.
    *
    * If FileNameFromColumn is true the content of the related column is added to the OutputURL.
    *
    * If "OutputURL" or "FileNamePrefix" are empty the missing value is generated from the location or title of the source documents.
    *
    * This property is only evaluated for file output.
    */
  var FileNamePrefix: java.lang.String
  /**
    * Contains the password of the incoming mail server. It is necessary to set this if the mail server configuration is set to "SMTP after POP"
    * authentication and the password is not already stored in the configuration for security reasons.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var InServerPassword: java.lang.String
  /**
    * contains the text of the mail body. This property is only valid if the property "SendAsAttachment" is set to `TRUE`
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var MailBody: java.lang.String
  /**
    * provides access to the model of the document to be processed.
    *
    * This property will automatically be set to the documents model if a document URL was set.
    */
  var Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
  /**
    * Contains the password of the outgoing mail server. It is necessary to set this if the password is not already stored in the configuration for security
    * reasons.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var OutServerPassword: java.lang.String
  /**
    * determines the destination of the mail merge action.
    * @see com.sun.star.text.MailMergeType
    */
  var OutputType: scala.Double
  /**
    * contains the path where generated files are created.
    *
    * If "OutputURL" or "FileNamePrefix" are empty the missing value is generated from the location or title of the source documents.
    *
    * This property is only evaluated for file output.
    */
  var OutputURL: java.lang.String
  /**
    * contains the properties that are defined in < {@link com.sun.star.view.PrintOptions} >.
    *
    * This property is only evaluated for printer output.
    * @since OOo 2.0
    */
  var PrintOptions: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * determines that the output of the mail merge is save in one single file.
    *
    * This property is only evaluated for file output.
    * @since OOo 2.0
    */
  var SaveAsSingleFile: scala.Boolean
  /**
    * contains the name of the document filter to save the output file(s).
    *
    * This property is only evaluated for file output.
    * @since OOo 2.0
    */
  var SaveFilter: java.lang.String
  /**
    * determines that the created mail merge document is sent as attachment.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var SendAsAttachment: scala.Boolean
  /**
    * determines that the created mail merge document is sent as body in HTML format. This property is only valid if the property "SendAsAttachment" is set
    * to `FALSE` .
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var SendAsHTML: scala.Boolean
  /**
    * determines whether single print jobs will be generated per output document.
    *
    * This property is only evaluated for printer output.
    */
  var SinglePrintJobs: scala.Boolean
  /**
    * contains the subject of the e-Mail message.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var Subject: java.lang.String
}

object MailMerge {
  @scala.inline
  def apply(
    ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    AddressFromColumn: java.lang.String,
    AttachmentFilter: java.lang.String,
    AttachmentName: java.lang.String,
    BlindCopiesTo: activexDashInteropLib.SafeArray[java.lang.String],
    BookmarkSelection: scala.Boolean,
    Column: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ColumnName: java.lang.String,
    Command: java.lang.String,
    CommandType: scala.Double,
    ConnectionInfo: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    ConnectionResource: java.lang.String,
    CopiesTo: activexDashInteropLib.SafeArray[java.lang.String],
    DataSourceName: java.lang.String,
    DatabaseLocation: java.lang.String,
    DocumentURL: java.lang.String,
    EscapeProcessing: scala.Boolean,
    FileNameFromColumn: scala.Boolean,
    FileNamePrefix: java.lang.String,
    Filter: java.lang.String,
    GroupBy: java.lang.String,
    HavingClause: java.lang.String,
    InServerPassword: java.lang.String,
    MailBody: java.lang.String,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    Order: java.lang.String,
    OutServerPassword: java.lang.String,
    OutputType: scala.Double,
    OutputURL: java.lang.String,
    PrintOptions: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ResultSet: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet,
    SaveAsSingleFile: scala.Boolean,
    SaveFilter: java.lang.String,
    Selection: activexDashInteropLib.SafeArray[_],
    SendAsAttachment: scala.Boolean,
    SendAsHTML: scala.Boolean,
    SinglePrintJobs: scala.Boolean,
    Subject: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addMailMergeEventListener: js.Function1[XMailMergeListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    cancel: js.Function0[scala.Unit],
    execute: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      js.Any
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeMailMergeEventListener: js.Function1[XMailMergeListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): MailMerge = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, AddressFromColumn = AddressFromColumn, AttachmentFilter = AttachmentFilter, AttachmentName = AttachmentName, BlindCopiesTo = BlindCopiesTo, BookmarkSelection = BookmarkSelection, Column = Column, ColumnName = ColumnName, Command = Command, CommandType = CommandType, ConnectionInfo = ConnectionInfo, ConnectionResource = ConnectionResource, CopiesTo = CopiesTo, DataSourceName = DataSourceName, DatabaseLocation = DatabaseLocation, DocumentURL = DocumentURL, EscapeProcessing = EscapeProcessing, FileNameFromColumn = FileNameFromColumn, FileNamePrefix = FileNamePrefix, Filter = Filter, GroupBy = GroupBy, HavingClause = HavingClause, InServerPassword = InServerPassword, MailBody = MailBody, Model = Model, Order = Order, OutServerPassword = OutServerPassword, OutputType = OutputType, OutputURL = OutputURL, PrintOptions = PrintOptions, PropertySetInfo = PropertySetInfo, ResultSet = ResultSet, SaveAsSingleFile = SaveAsSingleFile, SaveFilter = SaveFilter, Selection = Selection, SendAsAttachment = SendAsAttachment, SendAsHTML = SendAsHTML, SinglePrintJobs = SinglePrintJobs, Subject = Subject, acquire = acquire, addMailMergeEventListener = addMailMergeEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, cancel = cancel, execute = execute, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removeMailMergeEventListener = removeMailMergeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[MailMerge]
  }
}


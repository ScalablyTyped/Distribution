package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.sdb.DataAccessDescriptor
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typings.activexLibreoffice.com_.sun.star.task.XJob
import typings.activexLibreoffice.com_.sun.star.util.XCancellable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gives access to mail merge functionality.
  * @since OOo 1.1.2
  */
@js.native
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
  var AddressFromColumn: String = js.native
  
  /**
    * contains the name of the document filter to save the attached mail merge document. This property is only valid if "SendAsAttachment" is set to `TRUE`
    * .
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var AttachmentFilter: String = js.native
  
  /**
    * contains the name of the attachment. This property is only valid if "SendAsAttachment" is set to `TRUE` .
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var AttachmentName: String = js.native
  
  /**
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var BlindCopiesTo: SafeArray[String] = js.native
  
  /**
    * contains a list of e-Mail addresses to
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var CopiesTo: SafeArray[String] = js.native
  
  /**
    * contains the URL of a text document that is to be processed.
    *
    * If this property is not set an empty document is created.
    */
  var DocumentURL: String = js.native
  
  /**
    * determines whether file names of created files are generated using the content of a database column.
    *
    * This property is only evaluated for file output.
    */
  var FileNameFromColumn: Boolean = js.native
  
  /**
    * contains the name of the column to generate the output file names.
    *
    * If FileNameFromColumn is true the content of the related column is added to the OutputURL.
    *
    * If "OutputURL" or "FileNamePrefix" are empty the missing value is generated from the location or title of the source documents.
    *
    * This property is only evaluated for file output.
    */
  var FileNamePrefix: String = js.native
  
  /**
    * Contains the password of the incoming mail server. It is necessary to set this if the mail server configuration is set to "SMTP after POP"
    * authentication and the password is not already stored in the configuration for security reasons.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var InServerPassword: String = js.native
  
  /**
    * contains the text of the mail body. This property is only valid if the property "SendAsAttachment" is set to `TRUE`
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var MailBody: String = js.native
  
  /**
    * provides access to the model of the document to be processed.
    *
    * This property will automatically be set to the documents model if a document URL was set.
    */
  var Model: XModel = js.native
  
  /**
    * Contains the password of the outgoing mail server. It is necessary to set this if the password is not already stored in the configuration for security
    * reasons.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var OutServerPassword: String = js.native
  
  /**
    * determines the destination of the mail merge action.
    * @see com.sun.star.text.MailMergeType
    */
  var OutputType: Double = js.native
  
  /**
    * contains the path where generated files are created.
    *
    * If "OutputURL" or "FileNamePrefix" are empty the missing value is generated from the location or title of the source documents.
    *
    * This property is only evaluated for file output.
    */
  var OutputURL: String = js.native
  
  /**
    * contains the properties that are defined in < {@link com.sun.star.view.PrintOptions} >.
    *
    * This property is only evaluated for printer output.
    * @since OOo 2.0
    */
  var PrintOptions: SafeArray[PropertyValue] = js.native
  
  /**
    * determines that the output of the mail merge is save in one single file.
    *
    * This property is only evaluated for file output.
    * @since OOo 2.0
    */
  var SaveAsSingleFile: Boolean = js.native
  
  /**
    * contains the name of the document filter to save the output file(s).
    *
    * This property is only evaluated for file output.
    * @since OOo 2.0
    */
  var SaveFilter: String = js.native
  
  /**
    * determines that the created mail merge document is sent as attachment.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var SendAsAttachment: Boolean = js.native
  
  /**
    * determines that the created mail merge document is sent as body in HTML format. This property is only valid if the property "SendAsAttachment" is set
    * to `FALSE` .
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var SendAsHTML: Boolean = js.native
  
  /**
    * determines whether single print jobs will be generated per output document.
    *
    * This property is only evaluated for printer output.
    */
  var SinglePrintJobs: Boolean = js.native
  
  /**
    * contains the subject of the e-Mail message.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var Subject: String = js.native
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
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], AddressFromColumn = AddressFromColumn.asInstanceOf[js.Any], AttachmentFilter = AttachmentFilter.asInstanceOf[js.Any], AttachmentName = AttachmentName.asInstanceOf[js.Any], BlindCopiesTo = BlindCopiesTo.asInstanceOf[js.Any], BookmarkSelection = BookmarkSelection.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any], ColumnName = ColumnName.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], CommandType = CommandType.asInstanceOf[js.Any], ConnectionInfo = ConnectionInfo.asInstanceOf[js.Any], ConnectionResource = ConnectionResource.asInstanceOf[js.Any], CopiesTo = CopiesTo.asInstanceOf[js.Any], DataSourceName = DataSourceName.asInstanceOf[js.Any], DatabaseLocation = DatabaseLocation.asInstanceOf[js.Any], DocumentURL = DocumentURL.asInstanceOf[js.Any], EscapeProcessing = EscapeProcessing.asInstanceOf[js.Any], FileNameFromColumn = FileNameFromColumn.asInstanceOf[js.Any], FileNamePrefix = FileNamePrefix.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], InServerPassword = InServerPassword.asInstanceOf[js.Any], MailBody = MailBody.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], OutServerPassword = OutServerPassword.asInstanceOf[js.Any], OutputType = OutputType.asInstanceOf[js.Any], OutputURL = OutputURL.asInstanceOf[js.Any], PrintOptions = PrintOptions.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ResultSet = ResultSet.asInstanceOf[js.Any], SaveAsSingleFile = SaveAsSingleFile.asInstanceOf[js.Any], SaveFilter = SaveFilter.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], SendAsAttachment = SendAsAttachment.asInstanceOf[js.Any], SendAsHTML = SendAsHTML.asInstanceOf[js.Any], SinglePrintJobs = SinglePrintJobs.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addMailMergeEventListener = js.Any.fromFunction1(addMailMergeEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), cancel = js.Any.fromFunction0(cancel), execute = js.Any.fromFunction1(execute), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeMailMergeEventListener = js.Any.fromFunction1(removeMailMergeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[MailMerge]
  }
  
  @scala.inline
  implicit class MailMergeOps[Self <: MailMerge] (val x: Self) extends AnyVal {
    
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
    def setAddressFromColumn(value: String): Self = this.set("AddressFromColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentFilter(value: String): Self = this.set("AttachmentFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentName(value: String): Self = this.set("AttachmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlindCopiesTo(value: SafeArray[String]): Self = this.set("BlindCopiesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopiesTo(value: SafeArray[String]): Self = this.set("CopiesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentURL(value: String): Self = this.set("DocumentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameFromColumn(value: Boolean): Self = this.set("FileNameFromColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNamePrefix(value: String): Self = this.set("FileNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInServerPassword(value: String): Self = this.set("InServerPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailBody(value: String): Self = this.set("MailBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: XModel): Self = this.set("Model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutServerPassword(value: String): Self = this.set("OutServerPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputType(value: Double): Self = this.set("OutputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputURL(value: String): Self = this.set("OutputURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintOptions(value: SafeArray[PropertyValue]): Self = this.set("PrintOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveAsSingleFile(value: Boolean): Self = this.set("SaveAsSingleFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveFilter(value: String): Self = this.set("SaveFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAsAttachment(value: Boolean): Self = this.set("SendAsAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAsHTML(value: Boolean): Self = this.set("SendAsHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinglePrintJobs(value: Boolean): Self = this.set("SinglePrintJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
  }
}

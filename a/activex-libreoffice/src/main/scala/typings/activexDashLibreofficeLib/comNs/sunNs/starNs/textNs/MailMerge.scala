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


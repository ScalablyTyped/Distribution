package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * identifies a {@link XReportComponent} as being a (sub-) report.
  *
  * This interface does not really provide an own functionality, it is only for easier runtime identification of report components.
  *
  * A report fulfills several tasks, like storing the structure of its report components and it provides the event environment for its contained elements.
  * @see XReportComponent
  */
trait XReportDefinition
  extends XReportComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XLoadable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XVisualObject
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XStorageBasedDocument
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XViewDataSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloseable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIConfigurationManagerSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XDocumentSubStorageSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyleFamiliesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifiable2
     with XFunctionsSupplier {
  /** specifies the active connection which is used to create the resulting report. */
  var ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
  /** returns a sequence of the currently supported output formats. */
  val AvailableMimeTypes: activexDashInteropLib.SafeArray[java.lang.String]
  /** Represents the title of the report in print preview. */
  var Caption: java.lang.String
  /**
    * is the command which should be executed, the type of command depends on the CommandType.
    *
    * In case of a {@link CommandType} of CommandType::COMMAND, means in case the {@link Command} specifies an SQL statement, the inherited {@link
    * com.sun.star.sdbc.RowSet.EscapeProcessing} becomes relevant: ;  It then can be to used to specify whether the SQL statement should be analyzed on the
    * client side before sending it to the database server. ;  The default value for {@link com.sun.star.sdbc.RowSet.EscapeProcessing} is `TRUE` . By
    * switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL, to your database.
    * @see com.sun.star.sdb.CommandType
    */
  var Command: java.lang.String
  /**
    * specifies the type of the command to be executed to retrieve a result set.
    *
    * {@link Command} needs to be interpreted depending on the value of this property.
    *
    * This property is only meaningful together with the {@link Command} property, thus either **both** or **none** of them are present.
    * @see com.sun.star.sdb.CommandType
    */
  var CommandType: scala.Double
  /** is the name of the datasource to use, this could be a named datasource or the URL of a data access component. */
  var DataSourceName: java.lang.String
  /**
    * returns the detail section.
    * @see XSection
    */
  var Detail: XSection
  /**
    * specifies if the {@link Command} should be analyzed on the client side before sending it to the database server.
    *
    * The default value of this property is `TRUE` . By switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL,
    * to your database.
    *
    * This property is usually present together with the {@link Command} and {@link CommandType} properties, and is evaluated if and only if {@link
    * CommandType} equals CommandType::COMMAND.
    */
  var EscapeProcessing: scala.Boolean
  /**
    * makes it possible to register listeners which are called whenever a document event occurs. This is a workaround due to the fact that this interface
    * can not be directly inherited from {@link com.sun.star.document.XEventBroadcaster} because the methods addEventListener and removeEventListener are
    * already defined in {@link com.sun.star.lang.XComponent} . A queryInterface call is still supported to the {@link
    * com.sun.star.document.XEventBroadcaster} interface.
    */
  val EventBroadcaster: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventBroadcaster
  /**
    * specifies an additional filter to optionally use.
    *
    * The Filter string has to form a SQL WHERE-clause, **without** the WHERE-string itself.
    *
    * If a {@link DataSourceName} , {@link Command} and {@link CommandType} are specified, a RowSet can be created with this information. If the results
    * provided by the row set are to be additionally filtered, the Filter property can be used.
    *
    * Note that the Filter property does not make sense if a ResultSet has been specified in the DataAccessDescriptor.
    * @see com.sun.star.sdb.RowSet
    * @see ResultSet
    */
  var Filter: java.lang.String
  /**
    * Specifies whether groups in a multi column report are kept together.
    * @see com.sun.star.report.GroupKeepTogether
    */
  var GroupKeepTogether: scala.Double
  /** Represents the groups of the report. */
  var Groups: XGroups
  /** Represents the output format (media (mime) type) of the resulting document when executing this report. */
  var MimeType: java.lang.String
  /**
    * returns the page footer if the {@link PageFooterOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the page footer disabled.
    */
  var PageFooter: XSection
  /** Defines that the page footer is on. Default is `TRUE` . */
  var PageFooterOn: scala.Boolean
  /**
    * Represents the location of the page footer.
    * @see ReportPrintOption
    */
  var PageFooterOption: scala.Double
  /**
    * returns the page header if the {@link PageHeaderOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the page header disabled.
    */
  var PageHeader: XSection
  /** Defines that the page header is on. Default is `TRUE` . */
  var PageHeaderOn: scala.Boolean
  /**
    * Represents the location of the page header.
    * @see ReportPrintOption
    */
  var PageHeaderOption: scala.Double
  /**
    * returns the report footer if the {@link ReportFooterOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NullPointerException If the report has the report footer disabled.
    */
  var ReportFooter: XSection
  /** Defines that the report footer is on. Default is `FALSE` . */
  var ReportFooterOn: scala.Boolean
  /**
    * returns the report header if the {@link ReportHeaderOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the report header disabled.
    */
  var ReportHeader: XSection
  /** Defines that the report header is on. Default is `FALSE` . */
  var ReportHeaderOn: scala.Boolean
  /** returns a sequence of the currently supported output formats. */
  def getAvailableMimeTypes(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * makes it possible to register listeners which are called whenever a document event occurs. This is a workaround due to the fact that this interface
    * can not be directly inherited from {@link com.sun.star.document.XEventBroadcaster} because the methods addEventListener and removeEventListener are
    * already defined in {@link com.sun.star.lang.XComponent} . A queryInterface call is still supported to the {@link
    * com.sun.star.document.XEventBroadcaster} interface.
    */
  def getEventBroadcaster(): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventBroadcaster
}


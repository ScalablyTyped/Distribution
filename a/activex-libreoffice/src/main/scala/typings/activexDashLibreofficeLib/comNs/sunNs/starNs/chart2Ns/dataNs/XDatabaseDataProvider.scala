package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * identifies a {@link XDataProvider} for result sets.
  * @see XDataProvider
  * @see DataProvider
  */
trait XDatabaseDataProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet
     with XDataProvider
     with XRangeXMLConversion
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XParameters {
  /** specifies the active connection which is used to create the resulting report. */
  var ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
  /** indicates whether the filter should be applied or not, default is `FALSE` . */
  var ApplyFilter: scala.Boolean
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
  /** is the name of the data source to use, this could be a named data source or the URL of a data access component. */
  var DataSourceName: java.lang.String
  /**
    * is used for subreports and contains the names of the columns of the subreport which are related to the master fields of the parent report.
    *
    * Entries in this sequence can either denote column names in the sub report, or parameter names. ;  For instance, you could base the report on the SQL
    * statement `SELECT * FROM invoices WHERE cust_ref = :cid` , and add `cid` to the DetailFields property. In this case, the parameter will be filled from
    * the corresponding master field. ;  Alternatively, you could simply base your report on the table `invoices` , and add the column name `cust_ref` to
    * the DetailFields. In this case, and implicit filter clause `WHERE cust_ref = :<new_param_name>` will be created, and the artificial parameter will be
    * filled from the corresponding master field. ;  If a string in this property denotes both a column name and a parameter name, it is undefined which way
    * it is interpreted, but implementations of the service are required to either decide for the parameter or the column, and proceed as usual.
    *
    * The columns specified herein typically represent a part of the primary key fields or their aliases of the detail report.
    *
    * If the report is no sub report (e.g. its parent is not a report itself), this property is not evaluated.
    */
  var DetailFields: activexDashInteropLib.SafeArray[java.lang.String]
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
    * specifies an additional filter to optionally use.
    *
    * The Filter string has to form a SQL WHERE-clause, **without** the WHERE-string itself.
    *
    * If a {@link DataSourceName} , {@link Command} and {@link CommandType} are specified, a RowSet can be created with this information. If the results
    * provided by the row set are to be additionally filtered, the Filter property can be used.
    *
    * Note that the Filter property does not make sense if a resultSet has been specified in the DataAccessDescriptor.
    * @see com.sun.star.sdb.RowSet
    * @see ResultSet
    */
  var Filter: java.lang.String
  /** additional group by for the row set */
  var GroupBy: java.lang.String
  /** additional having clause for the row set */
  var HavingClause: java.lang.String
  /**
    * is used for subreports and contains the names of columns of the parent report.
    *
    * These columns are typically the foreign key fields of the parent report. The values of theses columns are used to identify the data for the subreport.
    * Each time the parent report changes its current row, the subreport requeries it's data based on the values of the master fields.
    *
    * If the report is no sub report (e.g. its parent is not a report itself), this property is not evaluated.
    */
  var MasterFields: activexDashInteropLib.SafeArray[java.lang.String]
  /** is a additional sort order definition for a row set. */
  var Order: java.lang.String
  /**
    * specifies the maximal count of rows which should be fetched.
    *
    * A value of zero implies that no limit exists.
    */
  var RowLimit: scala.Double
}


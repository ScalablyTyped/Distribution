package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a service for analyzing a single select statement.
  *
  * It hides the complexity of parsing and evaluating a single select statement and provides sophisticated methods for accessing a statements filter,
  * group by, having and order criteria, as well as the corresponding select columns and tables. If supported, it even gives access to the parameters.
  * @see com.sun.star.sdb.SingleSelectQueryComposer
  */
trait SingleSelectQueryAnalyzer
  extends XSingleSelectQueryAnalyzer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XTablesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XColumnsSupplier
     with XParametersSupplier

object SingleSelectQueryAnalyzer {
  @scala.inline
  def apply(
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Filter: java.lang.String,
    Group: java.lang.String,
    GroupColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    HavingClause: java.lang.String,
    Order: java.lang.String,
    OrderColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Parameters: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Query: java.lang.String,
    QueryWithSubstitution: java.lang.String,
    StructuredFilter: activexDashInteropLib.SafeArray[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    StructuredHavingClause: activexDashInteropLib.SafeArray[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    Tables: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getFilter: js.Function0[java.lang.String],
    getGroup: js.Function0[java.lang.String],
    getGroupColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getHavingClause: js.Function0[java.lang.String],
    getOrder: js.Function0[java.lang.String],
    getOrderColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getParameters: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getQuery: js.Function0[java.lang.String],
    getQueryWithSubstitution: js.Function0[java.lang.String],
    getStructuredFilter: js.Function0[
      activexDashInteropLib.SafeArray[
        activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ]
    ],
    getStructuredHavingClause: js.Function0[
      activexDashInteropLib.SafeArray[
        activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ]
    ],
    getTables: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCommand: js.Function2[java.lang.String, scala.Double, scala.Unit],
    setQuery: js.Function1[java.lang.String, scala.Unit]
  ): SingleSelectQueryAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Columns")(Columns)
    __obj.updateDynamic("Filter")(Filter)
    __obj.updateDynamic("Group")(Group)
    __obj.updateDynamic("GroupColumns")(GroupColumns)
    __obj.updateDynamic("HavingClause")(HavingClause)
    __obj.updateDynamic("Order")(Order)
    __obj.updateDynamic("OrderColumns")(OrderColumns)
    __obj.updateDynamic("Parameters")(Parameters)
    __obj.updateDynamic("Query")(Query)
    __obj.updateDynamic("QueryWithSubstitution")(QueryWithSubstitution)
    __obj.updateDynamic("StructuredFilter")(StructuredFilter)
    __obj.updateDynamic("StructuredHavingClause")(StructuredHavingClause)
    __obj.updateDynamic("Tables")(Tables)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getColumns")(getColumns)
    __obj.updateDynamic("getFilter")(getFilter)
    __obj.updateDynamic("getGroup")(getGroup)
    __obj.updateDynamic("getGroupColumns")(getGroupColumns)
    __obj.updateDynamic("getHavingClause")(getHavingClause)
    __obj.updateDynamic("getOrder")(getOrder)
    __obj.updateDynamic("getOrderColumns")(getOrderColumns)
    __obj.updateDynamic("getParameters")(getParameters)
    __obj.updateDynamic("getQuery")(getQuery)
    __obj.updateDynamic("getQueryWithSubstitution")(getQueryWithSubstitution)
    __obj.updateDynamic("getStructuredFilter")(getStructuredFilter)
    __obj.updateDynamic("getStructuredHavingClause")(getStructuredHavingClause)
    __obj.updateDynamic("getTables")(getTables)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setCommand")(setCommand)
    __obj.updateDynamic("setQuery")(setQuery)
    __obj.asInstanceOf[SingleSelectQueryAnalyzer]
  }
}


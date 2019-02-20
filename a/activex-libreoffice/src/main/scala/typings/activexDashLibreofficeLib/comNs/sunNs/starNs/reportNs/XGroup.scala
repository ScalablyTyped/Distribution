package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * identifies a {@link XGroup} . A group is always a child of the groups collection in the report.
  * @see XReportDefinition
  * @see XGroups
  */
trait XGroup
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XFunctionsSupplier {
  /** Defines either a column name or an expression. */
  var Expression: java.lang.String
  /**
    * returns the group footer.
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the group has the footer disabled.
    */
  var Footer: XSection
  /** Defines if a group has a footer. */
  var FooterOn: scala.Boolean
  /** Defines an interval value that rows are grouped by. */
  var GroupInterval: scala.Double
  /**
    * Specifies how to group data.
    * @see GroupOn
    */
  var GroupOn: scala.Double
  /**
    * Specifies the parent of the group.
    * @see XChild
    */
  var Groups: XGroups
  /**
    * returns the group header.
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the group has the header disabled.
    */
  var Header: XSection
  /** Defines if a group has a header. */
  var HeaderOn: scala.Boolean
  /**
    * Specifies if a group header, detail, and footer section is printed on the same page.
    * @see KeepTogether
    */
  var KeepTogether: scala.Double
  /** Specifies that the group header should always be printed on a new page and the reset of the page number to zero. */
  var ResetPageNumber: scala.Boolean
  /** Defines if the group is sorted ascending or descending. The default is `TRUE` . */
  var SortAscending: scala.Boolean
  /** Specifies that the group header should always be printed on a new column. */
  var StartNewColumn: scala.Boolean
}


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

object XGroup {
  @scala.inline
  def apply(
    Expression: java.lang.String,
    Footer: XSection,
    FooterOn: scala.Boolean,
    Functions: XFunctions,
    GroupInterval: scala.Double,
    GroupOn: scala.Double,
    Groups: XGroups,
    Header: XSection,
    HeaderOn: scala.Boolean,
    KeepTogether: scala.Double,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ResetPageNumber: scala.Boolean,
    SortAscending: scala.Boolean,
    StartNewColumn: scala.Boolean,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    dispose: () => scala.Unit,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): XGroup = {
    val __obj = js.Dynamic.literal(Expression = Expression, Footer = Footer, FooterOn = FooterOn, Functions = Functions, GroupInterval = GroupInterval, GroupOn = GroupOn, Groups = Groups, Header = Header, HeaderOn = HeaderOn, KeepTogether = KeepTogether, Parent = Parent, PropertySetInfo = PropertySetInfo, ResetPageNumber = ResetPageNumber, SortAscending = SortAscending, StartNewColumn = StartNewColumn, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getParent = js.Any.fromFunction0(getParent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setParent = js.Any.fromFunction1(setParent), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[XGroup]
  }
}


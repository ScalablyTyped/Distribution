package typings.activexDashLibreoffice.comNs.sunNs.starNs.reportNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XChild
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * identifies a {@link XGroup} . A group is always a child of the groups collection in the report.
  * @see XReportDefinition
  * @see XGroups
  */
trait XGroup
  extends XChild
     with XPropertySet
     with XComponent
     with XFunctionsSupplier {
  /** Defines either a column name or an expression. */
  var Expression: String
  /**
    * returns the group footer.
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the group has the footer disabled.
    */
  var Footer: XSection
  /** Defines if a group has a footer. */
  var FooterOn: Boolean
  /** Defines an interval value that rows are grouped by. */
  var GroupInterval: Double
  /**
    * Specifies how to group data.
    * @see GroupOn
    */
  var GroupOn: Double
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
  var HeaderOn: Boolean
  /**
    * Specifies if a group header, detail, and footer section is printed on the same page.
    * @see KeepTogether
    */
  var KeepTogether: Double
  /** Specifies that the group header should always be printed on a new page and the reset of the page number to zero. */
  var ResetPageNumber: Boolean
  /** Defines if the group is sorted ascending or descending. The default is `TRUE` . */
  var SortAscending: Boolean
  /** Specifies that the group header should always be printed on a new column. */
  var StartNewColumn: Boolean
}

object XGroup {
  @scala.inline
  def apply(
    Expression: String,
    Footer: XSection,
    FooterOn: Boolean,
    Functions: XFunctions,
    GroupInterval: Double,
    GroupOn: Double,
    Groups: XGroups,
    Header: XSection,
    HeaderOn: Boolean,
    KeepTogether: Double,
    Parent: XInterface,
    PropertySetInfo: XPropertySetInfo,
    ResetPageNumber: Boolean,
    SortAscending: Boolean,
    StartNewColumn: Boolean,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    dispose: () => Unit,
    getParent: () => XInterface,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setParent: XInterface => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): XGroup = {
    val __obj = js.Dynamic.literal(Expression = Expression, Footer = Footer, FooterOn = FooterOn, Functions = Functions, GroupInterval = GroupInterval, GroupOn = GroupOn, Groups = Groups, Header = Header, HeaderOn = HeaderOn, KeepTogether = KeepTogether, Parent = Parent, PropertySetInfo = PropertySetInfo, ResetPageNumber = ResetPageNumber, SortAscending = SortAscending, StartNewColumn = StartNewColumn, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getParent = js.Any.fromFunction0(getParent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setParent = js.Any.fromFunction1(setParent), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[XGroup]
  }
}


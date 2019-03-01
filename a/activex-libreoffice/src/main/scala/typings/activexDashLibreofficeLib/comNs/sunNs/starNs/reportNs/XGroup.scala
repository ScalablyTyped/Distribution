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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
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
    dispose: js.Function0[scala.Unit],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
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
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Expression")(Expression)
    __obj.updateDynamic("Footer")(Footer)
    __obj.updateDynamic("FooterOn")(FooterOn)
    __obj.updateDynamic("Functions")(Functions)
    __obj.updateDynamic("GroupInterval")(GroupInterval)
    __obj.updateDynamic("GroupOn")(GroupOn)
    __obj.updateDynamic("Groups")(Groups)
    __obj.updateDynamic("Header")(Header)
    __obj.updateDynamic("HeaderOn")(HeaderOn)
    __obj.updateDynamic("KeepTogether")(KeepTogether)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("ResetPageNumber")(ResetPageNumber)
    __obj.updateDynamic("SortAscending")(SortAscending)
    __obj.updateDynamic("StartNewColumn")(StartNewColumn)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setParent")(setParent)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[XGroup]
  }
}


package typings.activexLibreoffice.com_.sun.star.report

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * identifies a {@link XGroup} . A group is always a child of the groups collection in the report.
  * @see XReportDefinition
  * @see XGroups
  */
@js.native
trait XGroup
  extends XChild
     with XPropertySet
     with XComponent
     with XFunctionsSupplier {
  
  /** Defines either a column name or an expression. */
  var Expression: String = js.native
  
  /**
    * returns the group footer.
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the group has the footer disabled.
    */
  var Footer: XSection = js.native
  
  /** Defines if a group has a footer. */
  var FooterOn: Boolean = js.native
  
  /** Defines an interval value that rows are grouped by. */
  var GroupInterval: Double = js.native
  
  /**
    * Specifies how to group data.
    * @see GroupOn
    */
  var GroupOn: Double = js.native
  
  /**
    * Specifies the parent of the group.
    * @see XChild
    */
  var Groups: XGroups = js.native
  
  /**
    * returns the group header.
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the group has the header disabled.
    */
  var Header: XSection = js.native
  
  /** Defines if a group has a header. */
  var HeaderOn: Boolean = js.native
  
  /**
    * Specifies if a group header, detail, and footer section is printed on the same page.
    * @see KeepTogether
    */
  var KeepTogether: Double = js.native
  
  /** Specifies that the group header should always be printed on a new page and the reset of the page number to zero. */
  var ResetPageNumber: Boolean = js.native
  
  /** Defines if the group is sorted ascending or descending. The default is `TRUE` . */
  var SortAscending: Boolean = js.native
  
  /** Specifies that the group header should always be printed on a new column. */
  var StartNewColumn: Boolean = js.native
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
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], FooterOn = FooterOn.asInstanceOf[js.Any], Functions = Functions.asInstanceOf[js.Any], GroupInterval = GroupInterval.asInstanceOf[js.Any], GroupOn = GroupOn.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], HeaderOn = HeaderOn.asInstanceOf[js.Any], KeepTogether = KeepTogether.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ResetPageNumber = ResetPageNumber.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any], StartNewColumn = StartNewColumn.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getParent = js.Any.fromFunction0(getParent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setParent = js.Any.fromFunction1(setParent), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[XGroup]
  }
  
  @scala.inline
  implicit class XGroupOps[Self <: XGroup] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: String): Self = this.set("Expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter(value: XSection): Self = this.set("Footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterOn(value: Boolean): Self = this.set("FooterOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupInterval(value: Double): Self = this.set("GroupInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupOn(value: Double): Self = this.set("GroupOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: XGroups): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: XSection): Self = this.set("Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderOn(value: Boolean): Self = this.set("HeaderOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepTogether(value: Double): Self = this.set("KeepTogether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetPageNumber(value: Boolean): Self = this.set("ResetPageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortAscending(value: Boolean): Self = this.set("SortAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartNewColumn(value: Boolean): Self = this.set("StartNewColumn", value.asInstanceOf[js.Any])
  }
}

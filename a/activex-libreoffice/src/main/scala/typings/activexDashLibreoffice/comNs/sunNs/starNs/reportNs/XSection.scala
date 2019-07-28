package typings.activexDashLibreoffice.comNs.sunNs.starNs.reportNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XChild
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XContainerListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShapes
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * identifies a {@link XSection} inside a report.
  *
  * A section acts like a container of report components. This generic construction allows the definition of hierarchies of reports and their dependent
  * subreports.
  * @see XReportDefinition
  * @see XGroup
  */
trait XSection
  extends XShapes
     with XChild
     with XContainer
     with XEnumerationAccess
     with XPropertySet
     with XComponent {
  /** Defines the back ground color of the section. */
  var BackColor: Color
  /** determines if the back ground color is set to transparent. */
  var BackTransparent: Boolean
  /**
    * Specifies that elements with dynamic state will be expanded vertically when then content of the element is larger than it's container. If this
    * property is disabled the content will be truncated when its size is larger than the container.
    */
  var CanGrow: Boolean
  /** Represents ... */
  var CanShrink: Boolean
  /**
    * Defines the expression which is executed before printing the section. If the return value of the expression is `TRUE` then the section will be
    * printed.
    */
  var ConditionalPrintExpression: String
  /**
    * Specifies whether the section is printed on a separate page.
    *
    * Not valid for page header or page footer.
    * @see ForceNewPage
    */
  var ForceNewPage: Double
  /** Specifies the parent of the section if it is a group header or group footer. */
  var Group: XGroup
  /** Defines the height of the section. */
  var Height: Double
  /**
    * Specifies that the section is printed on one page.
    *
    * Not valid for page header or page footer.
    */
  var KeepTogether: Boolean
  /** Defines the name of the section. */
  var Name: String
  /**
    * Specifies whether the section is printed in a new row or column within a multi column report.
    *
    * Not valid for page header or page footer.
    * @see ForceNewPage
    */
  var NewRowOrCol: Double
  /** Defines that the group header should be repeated on the next page when a group spans more than one page. It only applies to group headers. */
  var RepeatSection: Boolean
  /** Specifies the parent of the section if it is a page header or page footer. */
  var ReportDefinition: XReportDefinition
  /** Defines if the section should be visible in report. */
  var Visible: Boolean
}

object XSection {
  @scala.inline
  def apply(
    BackColor: Color,
    BackTransparent: Boolean,
    CanGrow: Boolean,
    CanShrink: Boolean,
    ConditionalPrintExpression: String,
    Count: Double,
    ElementType: `type`,
    ForceNewPage: Double,
    Group: XGroup,
    Height: Double,
    KeepTogether: Boolean,
    Name: String,
    NewRowOrCol: Double,
    Parent: XInterface,
    PropertySetInfo: XPropertySetInfo,
    RepeatSection: Boolean,
    ReportDefinition: XReportDefinition,
    Visible: Boolean,
    acquire: () => Unit,
    add: typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape => Unit,
    addContainerListener: XContainerListener => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createEnumeration: () => XEnumeration,
    dispose: () => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getParent: () => XInterface,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape => Unit,
    removeContainerListener: XContainerListener => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setParent: XInterface => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): XSection = {
    val __obj = js.Dynamic.literal(BackColor = BackColor, BackTransparent = BackTransparent, CanGrow = CanGrow, CanShrink = CanShrink, ConditionalPrintExpression = ConditionalPrintExpression, Count = Count, ElementType = ElementType, ForceNewPage = ForceNewPage, Group = Group, Height = Height, KeepTogether = KeepTogether, Name = Name, NewRowOrCol = NewRowOrCol, Parent = Parent, PropertySetInfo = PropertySetInfo, RepeatSection = RepeatSection, ReportDefinition = ReportDefinition, Visible = Visible, acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction1(add), addContainerListener = js.Any.fromFunction1(addContainerListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createEnumeration = js.Any.fromFunction0(createEnumeration), dispose = js.Any.fromFunction0(dispose), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getParent = js.Any.fromFunction0(getParent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setParent = js.Any.fromFunction1(setParent), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[XSection]
  }
}


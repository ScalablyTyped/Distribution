package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapes
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /** Defines the back ground color of the section. */
  var BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** determines if the back ground color is set to transparent. */
  var BackTransparent: scala.Boolean
  /**
    * Specifies that elements with dynamic state will be expanded vertically when then content of the element is larger than it's container. If this
    * property is disabled the content will be truncated when its size is larger than the container.
    */
  var CanGrow: scala.Boolean
  /** Represents ... */
  var CanShrink: scala.Boolean
  /**
    * Defines the expression which is executed before printing the section. If the return value of the expression is `TRUE` then the section will be
    * printed.
    */
  var ConditionalPrintExpression: java.lang.String
  /**
    * Specifies whether the section is printed on a separate page.
    *
    * Not valid for page header or page footer.
    * @see ForceNewPage
    */
  var ForceNewPage: scala.Double
  /** Specifies the parent of the section if it is a group header or group footer. */
  var Group: XGroup
  /** Defines the height of the section. */
  var Height: scala.Double
  /**
    * Specifies that the section is printed on one page.
    *
    * Not valid for page header or page footer.
    */
  var KeepTogether: scala.Boolean
  /** Defines the name of the section. */
  var Name: java.lang.String
  /**
    * Specifies whether the section is printed in a new row or column within a multi column report.
    *
    * Not valid for page header or page footer.
    * @see ForceNewPage
    */
  var NewRowOrCol: scala.Double
  /** Defines that the group header should be repeated on the next page when a group spans more than one page. It only applies to group headers. */
  var RepeatSection: scala.Boolean
  /** Specifies the parent of the section if it is a page header or page footer. */
  var ReportDefinition: XReportDefinition
  /** Defines if the section should be visible in report. */
  var Visible: scala.Boolean
}

object XSection {
  @scala.inline
  def apply(
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackTransparent: scala.Boolean,
    CanGrow: scala.Boolean,
    CanShrink: scala.Boolean,
    ConditionalPrintExpression: java.lang.String,
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    ForceNewPage: scala.Double,
    Group: XGroup,
    Height: scala.Double,
    KeepTogether: scala.Boolean,
    Name: java.lang.String,
    NewRowOrCol: scala.Double,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RepeatSection: scala.Boolean,
    ReportDefinition: XReportDefinition,
    Visible: scala.Boolean,
    acquire: js.Function0[scala.Unit],
    add: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
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
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    dispose: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
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
  ): XSection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BackColor")(BackColor)
    __obj.updateDynamic("BackTransparent")(BackTransparent)
    __obj.updateDynamic("CanGrow")(CanGrow)
    __obj.updateDynamic("CanShrink")(CanShrink)
    __obj.updateDynamic("ConditionalPrintExpression")(ConditionalPrintExpression)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("ForceNewPage")(ForceNewPage)
    __obj.updateDynamic("Group")(Group)
    __obj.updateDynamic("Height")(Height)
    __obj.updateDynamic("KeepTogether")(KeepTogether)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NewRowOrCol")(NewRowOrCol)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RepeatSection")(RepeatSection)
    __obj.updateDynamic("ReportDefinition")(ReportDefinition)
    __obj.updateDynamic("Visible")(Visible)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("addContainerListener")(addContainerListener)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("createEnumeration")(createEnumeration)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removeContainerListener")(removeContainerListener)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setParent")(setParent)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[XSection]
  }
}


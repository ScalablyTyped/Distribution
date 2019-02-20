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


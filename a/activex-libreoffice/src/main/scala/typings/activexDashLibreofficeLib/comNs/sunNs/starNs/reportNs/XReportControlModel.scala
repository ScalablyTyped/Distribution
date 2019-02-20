package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XReportControlModel
  extends XReportComponent
     with XReportControlFormat
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer {
  /**
    * Describes the print expression of the report control model. If the expression evaluates to true than the report control model will be printed
    * otherwise not.
    */
  var ConditionalPrintExpression: java.lang.String
  /**
    * Specifies which content should be shown.
    *
    * The value can be
    *
    * the name of a database column. The format to use is `field:[name]`the name of a function defined in the report or a group. The format to use is
    * `rpt:[functionName]`an expression like `rpt:24+24-47`
    * @see http://wiki.openoffice.org/wiki/SUN_Report_Builder
    * @see http://wiki.openoffice.org/wiki/SUN_Report_Builder#Syntax
    * @see http://wiki.openoffice.org/wiki/Base/Reports/Functions
    */
  var DataField: java.lang.String
  /** Specifies that the element gets printed when the group changes. The default value is `TRUE` . */
  var PrintWhenGroupChange: scala.Boolean
  /**
    * Creates a format condition.
    * @returns report component
    */
  def createFormatCondition(): XFormatCondition
}


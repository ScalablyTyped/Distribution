package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a scenario in a spreadsheet document. */
trait Scenario
  extends XScenario
     with XScenarioEnhanced
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  /** specifies the color of the border of the scenario. */
  var BorderColor: scala.Double
  /** specifies if the data should be copied back into the scenario. */
  var CopyBack: scala.Boolean
  /** specifies if the formulas are copied or only the results. */
  var CopyFormulas: scala.Boolean
  /** specifies if the styles are copied. */
  var CopyStyles: scala.Boolean
  /** specifies if the scenario is active. */
  var IsActive: scala.Boolean
  /** specifies if the scenario prints a border. */
  var PrintBorder: scala.Boolean
  /** specifies if the scenario is protected. */
  var Protected: scala.Boolean
  /** specifies if the scenario shows a border. */
  var ShowBorder: scala.Boolean
}


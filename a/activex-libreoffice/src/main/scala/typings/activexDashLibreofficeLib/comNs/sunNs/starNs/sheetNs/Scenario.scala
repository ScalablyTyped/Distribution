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

object Scenario {
  @scala.inline
  def apply(
    BorderColor: scala.Double,
    CopyBack: scala.Boolean,
    CopyFormulas: scala.Boolean,
    CopyStyles: scala.Boolean,
    IsActive: scala.Boolean,
    IsScenario: scala.Boolean,
    Name: java.lang.String,
    PrintBorder: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Protected: scala.Boolean,
    Ranges: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    ScenarioComment: java.lang.String,
    ShowBorder: scala.Boolean,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addRanges: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress] => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    apply: () => scala.Unit,
    getIsScenario: () => scala.Boolean,
    getName: () => java.lang.String,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getRanges: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    getScenarioComment: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setScenarioComment: java.lang.String => scala.Unit
  ): Scenario = {
    val __obj = js.Dynamic.literal(BorderColor = BorderColor, CopyBack = CopyBack, CopyFormulas = CopyFormulas, CopyStyles = CopyStyles, IsActive = IsActive, IsScenario = IsScenario, Name = Name, PrintBorder = PrintBorder, PropertySetInfo = PropertySetInfo, Protected = Protected, Ranges = Ranges, ScenarioComment = ScenarioComment, ShowBorder = ShowBorder, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRanges = js.Any.fromFunction1(addRanges), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), apply = js.Any.fromFunction0(apply), getIsScenario = js.Any.fromFunction0(getIsScenario), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRanges = js.Any.fromFunction0(getRanges), getScenarioComment = js.Any.fromFunction0(getScenarioComment), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setScenarioComment = js.Any.fromFunction1(setScenarioComment))
  
    __obj.asInstanceOf[Scenario]
  }
}


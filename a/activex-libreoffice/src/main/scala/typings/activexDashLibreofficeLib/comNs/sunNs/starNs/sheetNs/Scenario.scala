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
    Ranges: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    ScenarioComment: java.lang.String,
    ShowBorder: scala.Boolean,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addRanges: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress], 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    apply: js.Function0[scala.Unit],
    getIsScenario: js.Function0[scala.Boolean],
    getName: js.Function0[java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getRanges: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
    ],
    getScenarioComment: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
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
    setName: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setScenarioComment: js.Function1[java.lang.String, scala.Unit]
  ): Scenario = {
    val __obj = js.Dynamic.literal(BorderColor = BorderColor, CopyBack = CopyBack, CopyFormulas = CopyFormulas, CopyStyles = CopyStyles, IsActive = IsActive, IsScenario = IsScenario, Name = Name, PrintBorder = PrintBorder, PropertySetInfo = PropertySetInfo, Protected = Protected, Ranges = Ranges, ScenarioComment = ScenarioComment, ShowBorder = ShowBorder, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addRanges = addRanges, addVetoableChangeListener = addVetoableChangeListener, apply = apply, getIsScenario = getIsScenario, getName = getName, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getRanges = getRanges, getScenarioComment = getScenarioComment, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setName = setName, setPropertyValue = setPropertyValue, setScenarioComment = setScenarioComment)
  
    __obj.asInstanceOf[Scenario]
  }
}


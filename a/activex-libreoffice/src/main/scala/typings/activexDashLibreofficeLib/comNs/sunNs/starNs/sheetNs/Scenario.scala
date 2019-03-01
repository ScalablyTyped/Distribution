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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BorderColor")(BorderColor)
    __obj.updateDynamic("CopyBack")(CopyBack)
    __obj.updateDynamic("CopyFormulas")(CopyFormulas)
    __obj.updateDynamic("CopyStyles")(CopyStyles)
    __obj.updateDynamic("IsActive")(IsActive)
    __obj.updateDynamic("IsScenario")(IsScenario)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("PrintBorder")(PrintBorder)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Protected")(Protected)
    __obj.updateDynamic("Ranges")(Ranges)
    __obj.updateDynamic("ScenarioComment")(ScenarioComment)
    __obj.updateDynamic("ShowBorder")(ShowBorder)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addRanges")(addRanges)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("apply")(apply)
    __obj.updateDynamic("getIsScenario")(getIsScenario)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getRanges")(getRanges)
    __obj.updateDynamic("getScenarioComment")(getScenarioComment)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setScenarioComment")(setScenarioComment)
    __obj.asInstanceOf[Scenario]
  }
}


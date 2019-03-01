package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XLabeledDataSequence2
  extends XLabeledDataSequence
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable

object XLabeledDataSequence2 {
  @scala.inline
  def apply(
    Label: XDataSequence,
    Values: XDataSequence,
    acquire: js.Function0[scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    getLabel: js.Function0[XDataSequence],
    getValues: js.Function0[XDataSequence],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    setLabel: js.Function1[XDataSequence, scala.Unit],
    setValues: js.Function1[XDataSequence, scala.Unit]
  ): XLabeledDataSequence2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Label")(Label)
    __obj.updateDynamic("Values")(Values)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addModifyListener")(addModifyListener)
    __obj.updateDynamic("createClone")(createClone)
    __obj.updateDynamic("getLabel")(getLabel)
    __obj.updateDynamic("getValues")(getValues)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeModifyListener")(removeModifyListener)
    __obj.updateDynamic("setLabel")(setLabel)
    __obj.updateDynamic("setValues")(setValues)
    __obj.asInstanceOf[XLabeledDataSequence2]
  }
}


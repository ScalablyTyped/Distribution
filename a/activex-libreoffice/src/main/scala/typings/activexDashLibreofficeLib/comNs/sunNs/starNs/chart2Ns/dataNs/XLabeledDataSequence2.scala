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
    val __obj = js.Dynamic.literal(Label = Label, Values = Values, acquire = acquire, addModifyListener = addModifyListener, createClone = createClone, getLabel = getLabel, getValues = getValues, queryInterface = queryInterface, release = release, removeModifyListener = removeModifyListener, setLabel = setLabel, setValues = setValues)
  
    __obj.asInstanceOf[XLabeledDataSequence2]
  }
}


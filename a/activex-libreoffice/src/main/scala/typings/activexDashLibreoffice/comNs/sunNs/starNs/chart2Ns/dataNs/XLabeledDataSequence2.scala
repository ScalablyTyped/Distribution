package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloneable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifyBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifyListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XLabeledDataSequence2
  extends XLabeledDataSequence
     with XModifyBroadcaster
     with XCloneable

object XLabeledDataSequence2 {
  @scala.inline
  def apply(
    Label: XDataSequence,
    Values: XDataSequence,
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    createClone: () => XCloneable,
    getLabel: () => XDataSequence,
    getValues: () => XDataSequence,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeModifyListener: XModifyListener => Unit,
    setLabel: XDataSequence => Unit,
    setValues: XDataSequence => Unit
  ): XLabeledDataSequence2 = {
    val __obj = js.Dynamic.literal(Label = Label, Values = Values, acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), createClone = js.Any.fromFunction0(createClone), getLabel = js.Any.fromFunction0(getLabel), getValues = js.Any.fromFunction0(getValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModifyListener = js.Any.fromFunction1(removeModifyListener), setLabel = js.Any.fromFunction1(setLabel), setValues = js.Any.fromFunction1(setValues))
  
    __obj.asInstanceOf[XLabeledDataSequence2]
  }
}


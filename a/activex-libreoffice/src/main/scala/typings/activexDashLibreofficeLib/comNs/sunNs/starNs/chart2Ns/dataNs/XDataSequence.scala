package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows access to a one-dimensional sequence of data.
  *
  * The data that is stored in this container may contain different types.
  */
trait XDataSequence
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves the data stored in this component.
    * @returns a sequence containing the actual data. This sequence is a copy of the internal data. Therefore changing this object does not affect the content o
    */
  val Data: activexDashInteropLib.SafeArray[_]
  /** returns the (UI) range representation string used by this {@link XDataSequence} . */
  val SourceRangeRepresentation: java.lang.String
  /**
    * creates a label that describes the origin of this data sequence.
    *
    * This is useful, if a {@link XLabeledDataSequence} has no label sequence. In this case you can call this method at the value sequence to obtain a
    * fitting replacement label.
    *
    * The sequence returned here may be empty if no suitable label can be generated.
    *
    * The strings returned should be localized.
    * @param eLabelOrigin denotes what part of the range should be used for label generation. If you have, e.g., one cell only, the parameter COLUMN enables y
    * @returns Suitable labels for the given sequence depending on the range of the sequence and the parameter `eLabelOrigin` passed. In a spreadsheet this woul
    */
  def generateLabel(eLabelOrigin: LabelOrigin): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * retrieves the data stored in this component.
    * @returns a sequence containing the actual data. This sequence is a copy of the internal data. Therefore changing this object does not affect the content o
    */
  def getData(): activexDashInteropLib.SafeArray[_]
  /**
    * returns a number format key for the value at the given index in the data sequence. If nIndex is -1, a key for the entire sequence should be returned,
    * e.g. the most commonly used one.
    *
    * If number formats are not supported, or there is no heuristic to return a key for the entire series, return 0 here.
    *
    * The number format key must be valid for the {@link com.sun.star.util.XNumberFormatsSupplier} given by the {@link XDataProvider} , or 0 which is
    * assumed to be always valid.
    */
  def getNumberFormatKeyByIndex(nIndex: scala.Double): scala.Double
  /** returns the (UI) range representation string used by this {@link XDataSequence} . */
  def getSourceRangeRepresentation(): java.lang.String
}

object XDataSequence {
  @scala.inline
  def apply(
    Data: activexDashInteropLib.SafeArray[_],
    SourceRangeRepresentation: java.lang.String,
    acquire: js.Function0[scala.Unit],
    generateLabel: js.Function1[LabelOrigin, activexDashInteropLib.SafeArray[java.lang.String]],
    getData: js.Function0[activexDashInteropLib.SafeArray[_]],
    getNumberFormatKeyByIndex: js.Function1[scala.Double, scala.Double],
    getSourceRangeRepresentation: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDataSequence = {
    val __obj = js.Dynamic.literal(Data = Data, SourceRangeRepresentation = SourceRangeRepresentation, acquire = acquire, generateLabel = generateLabel, getData = getData, getNumberFormatKeyByIndex = getNumberFormatKeyByIndex, getSourceRangeRepresentation = getSourceRangeRepresentation, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDataSequence]
  }
}


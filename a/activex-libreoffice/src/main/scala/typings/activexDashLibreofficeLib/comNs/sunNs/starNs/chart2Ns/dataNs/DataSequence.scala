package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a container for a sequence of values.
  *
  * With the interface {@link XDataSequence} it is possible to transfer a complete sequence of values.
  *
  * With the optional {@link com.sun.star.container.XIndexReplace} it is possible to modify single elements, if the corresponding {@link DataProvider}
  * supports modification of its values.
  */
trait DataSequence
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace
     with XDataSequence
     with XNumericalDataSequence
     with XTextualDataSequence
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** a sequence of indexes that identify values that are hidden in the underlying data provider. */
  var HiddenValues: stdLib.SafeArray[scala.Double]
  /** If set to false `FALSE` , values from hidden cells are not returned. */
  var IncludeHiddenCells: scala.Boolean
  /**
    * The key (index) of the number format that this sequence should be formatted with.
    *
    * The key identifies a number format in an {@link com.sun.star.util.XNumberFormats} object. This object can be retrieved by the {@link
    * com.sun.star.util.XNumberFormatsSupplier} interface supported by {@link com.sun.star.chart.ChartDocument} .
    *
    * The role of the series inside a data series. This may be any string. However some strings are predefined and should always be used in the same way.
    * @see DataSequenceRole
    */
  var Role: DataSequenceRole
}

object DataSequence {
  @scala.inline
  def apply(
    Count: scala.Double,
    Data: stdLib.SafeArray[_],
    ElementType: activexDashLibreofficeLib.`type`,
    HiddenValues: stdLib.SafeArray[scala.Double],
    IncludeHiddenCells: scala.Boolean,
    NumericalData: stdLib.SafeArray[scala.Double],
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Role: DataSequenceRole,
    SourceRangeRepresentation: java.lang.String,
    TextualData: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    addModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    createClone: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable,
    generateLabel: LabelOrigin => stdLib.SafeArray[java.lang.String],
    getByIndex: scala.Double => js.Any,
    getCount: () => scala.Double,
    getData: () => stdLib.SafeArray[_],
    getElementType: () => activexDashLibreofficeLib.`type`,
    getNumberFormatKeyByIndex: scala.Double => scala.Double,
    getNumericalData: () => stdLib.SafeArray[scala.Double],
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getSourceRangeRepresentation: () => java.lang.String,
    getTextualData: () => stdLib.SafeArray[java.lang.String],
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    replaceByIndex: (scala.Double, js.Any) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): DataSequence = {
    val __obj = js.Dynamic.literal(Count = Count, Data = Data, ElementType = ElementType, HiddenValues = HiddenValues, IncludeHiddenCells = IncludeHiddenCells, NumericalData = NumericalData, PropertySetInfo = PropertySetInfo, Role = Role, SourceRangeRepresentation = SourceRangeRepresentation, TextualData = TextualData, acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), generateLabel = js.Any.fromFunction1(generateLabel), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getData = js.Any.fromFunction0(getData), getElementType = js.Any.fromFunction0(getElementType), getNumberFormatKeyByIndex = js.Any.fromFunction1(getNumberFormatKeyByIndex), getNumericalData = js.Any.fromFunction0(getNumericalData), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSourceRangeRepresentation = js.Any.fromFunction0(getSourceRangeRepresentation), getTextualData = js.Any.fromFunction0(getTextualData), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DataSequence]
  }
}


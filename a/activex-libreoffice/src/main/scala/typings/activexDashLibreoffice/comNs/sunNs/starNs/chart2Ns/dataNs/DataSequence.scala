package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexReplace
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloneable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifyBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifyListener
import typings.std.SafeArray
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
  extends XIndexReplace
     with XDataSequence
     with XNumericalDataSequence
     with XTextualDataSequence
     with XCloneable
     with XModifyBroadcaster
     with XPropertySet {
  /** a sequence of indexes that identify values that are hidden in the underlying data provider. */
  var HiddenValues: SafeArray[Double]
  /** If set to false `FALSE` , values from hidden cells are not returned. */
  var IncludeHiddenCells: Boolean
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
    Count: Double,
    Data: SafeArray[_],
    ElementType: `type`,
    HiddenValues: SafeArray[Double],
    IncludeHiddenCells: Boolean,
    NumericalData: SafeArray[Double],
    PropertySetInfo: XPropertySetInfo,
    Role: DataSequenceRole,
    SourceRangeRepresentation: String,
    TextualData: SafeArray[String],
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createClone: () => XCloneable,
    generateLabel: LabelOrigin => SafeArray[String],
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getData: () => SafeArray[_],
    getElementType: () => `type`,
    getNumberFormatKeyByIndex: Double => Double,
    getNumericalData: () => SafeArray[Double],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSourceRangeRepresentation: () => String,
    getTextualData: () => SafeArray[String],
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeModifyListener: XModifyListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    replaceByIndex: (Double, js.Any) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DataSequence = {
    val __obj = js.Dynamic.literal(Count = Count, Data = Data, ElementType = ElementType, HiddenValues = HiddenValues, IncludeHiddenCells = IncludeHiddenCells, NumericalData = NumericalData, PropertySetInfo = PropertySetInfo, Role = Role, SourceRangeRepresentation = SourceRangeRepresentation, TextualData = TextualData, acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), generateLabel = js.Any.fromFunction1(generateLabel), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getData = js.Any.fromFunction0(getData), getElementType = js.Any.fromFunction0(getElementType), getNumberFormatKeyByIndex = js.Any.fromFunction1(getNumberFormatKeyByIndex), getNumericalData = js.Any.fromFunction0(getNumericalData), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSourceRangeRepresentation = js.Any.fromFunction0(getSourceRangeRepresentation), getTextualData = js.Any.fromFunction0(getTextualData), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DataSequence]
  }
}


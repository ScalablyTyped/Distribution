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
  var HiddenValues: activexDashInteropLib.SafeArray[scala.Double]
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
    Data: activexDashInteropLib.SafeArray[_],
    ElementType: activexDashLibreofficeLib.`type`,
    HiddenValues: activexDashInteropLib.SafeArray[scala.Double],
    IncludeHiddenCells: scala.Boolean,
    NumericalData: activexDashInteropLib.SafeArray[scala.Double],
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Role: DataSequenceRole,
    SourceRangeRepresentation: java.lang.String,
    TextualData: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    generateLabel: js.Function1[LabelOrigin, activexDashInteropLib.SafeArray[java.lang.String]],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getData: js.Function0[activexDashInteropLib.SafeArray[_]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getNumberFormatKeyByIndex: js.Function1[scala.Double, scala.Double],
    getNumericalData: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSourceRangeRepresentation: js.Function0[java.lang.String],
    getTextualData: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
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
    replaceByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): DataSequence = {
    val __obj = js.Dynamic.literal(Count = Count, Data = Data, ElementType = ElementType, HiddenValues = HiddenValues, IncludeHiddenCells = IncludeHiddenCells, NumericalData = NumericalData, PropertySetInfo = PropertySetInfo, Role = Role, SourceRangeRepresentation = SourceRangeRepresentation, TextualData = TextualData, acquire = acquire, addModifyListener = addModifyListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createClone = createClone, generateLabel = generateLabel, getByIndex = getByIndex, getCount = getCount, getData = getData, getElementType = getElementType, getNumberFormatKeyByIndex = getNumberFormatKeyByIndex, getNumericalData = getNumericalData, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getSourceRangeRepresentation = getSourceRangeRepresentation, getTextualData = getTextualData, hasElements = hasElements, queryInterface = queryInterface, release = release, removeModifyListener = removeModifyListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, replaceByIndex = replaceByIndex, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[DataSequence]
  }
}


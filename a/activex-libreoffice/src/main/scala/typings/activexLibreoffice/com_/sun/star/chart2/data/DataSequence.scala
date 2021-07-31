package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a container for a sequence of values.
  *
  * With the interface {@link XDataSequence} it is possible to transfer a complete sequence of values.
  *
  * With the optional {@link com.sun.star.container.XIndexReplace} it is possible to modify single elements, if the corresponding {@link DataProvider}
  * supports modification of its values.
  */
trait DataSequence
  extends StObject
     with XDataSequence
     with XNumericalDataSequence
     with XTextualDataSequence
     with XIndexReplace
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
    Data: SafeArray[js.Any],
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
    getData: () => SafeArray[js.Any],
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
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], HiddenValues = HiddenValues.asInstanceOf[js.Any], IncludeHiddenCells = IncludeHiddenCells.asInstanceOf[js.Any], NumericalData = NumericalData.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], SourceRangeRepresentation = SourceRangeRepresentation.asInstanceOf[js.Any], TextualData = TextualData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), generateLabel = js.Any.fromFunction1(generateLabel), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getData = js.Any.fromFunction0(getData), getElementType = js.Any.fromFunction0(getElementType), getNumberFormatKeyByIndex = js.Any.fromFunction1(getNumberFormatKeyByIndex), getNumericalData = js.Any.fromFunction0(getNumericalData), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSourceRangeRepresentation = js.Any.fromFunction0(getSourceRangeRepresentation), getTextualData = js.Any.fromFunction0(getTextualData), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DataSequence]
  }
  
  @scala.inline
  implicit class DataSequenceMutableBuilder[Self <: DataSequence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHiddenValues(value: SafeArray[Double]): Self = StObject.set(x, "HiddenValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeHiddenCells(value: Boolean): Self = StObject.set(x, "IncludeHiddenCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: DataSequenceRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
  }
}

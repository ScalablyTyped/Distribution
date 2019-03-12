package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An application that provides data for a chart must implement this interface. */
trait XDataProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns a component that is able to change a given range representation to another one. This usually is a controller-component that uses the GUI to
    * allow a user to select a new range.
    *
    * This method may return nothing, if it does not support range selection or if there is no current controller available that offers the functionality.
    * @returns The component for selecting a new range. It must support XComponent, in order to inform the receiver about its lifetime.
    */
  val RangeSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XRangeSelection
  /**
    * creates a single data sequence for the given data range.
    * @param aRangeRepresentation is a string that can be interpreted by the component that implements this interface. The representation string is of a form
    * @see createDataSource
    * @throws com::sun::star::lang::IllegalArgumentException if the given range does not contain a valid range representation for a one-dimensional range of data.
    */
  def createDataSequenceByRangeRepresentation(aRangeRepresentation: java.lang.String): XDataSequence
  /**
    * If `TRUE` is returned, a call to createDataSequenceByRangeRepresentation with the same argument must return a valid {@link XDataSequence} object. If
    * `FALSE` is returned, createDataSequenceByRangeRepresentation throws an exception.
    */
  def createDataSequenceByRangeRepresentationPossible(aRangeRepresentation: java.lang.String): scala.Boolean
  def createDataSequenceByValueArray(aRole: java.lang.String, aValueArray: java.lang.String): XDataSequence
  /**
    * Creates a data source object that matches the given range representation string.
    *
    * This can be used for creating the necessary data for a new chart out of a previously selected range of cells in a spreadsheet.
    * @param aArguments Arguments that tell the data provider how to slice the given range. The properties should be defined in a separate service.  For sprea
    * @returns a data source containing DataSequences that span the entire region given in `aArguments` .
    * @throws com::sun::star::lang::IllegalArgumentException may be raised by the {@link XDataProvider} if it is unable to interpret the arguments passed in `a
    */
  def createDataSource(
    aArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): XDataSource
  /**
    * If `TRUE` is returned, a call to createDataSource with the same arguments must return a valid {@link XDataSequence} object. If `FALSE` is returned,
    * createDataSource throws an exception.
    */
  def createDataSourcePossible(
    aArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Boolean
  /**
    * Tries to find out with what parameters the passed {@link DataSource} most probably was created.
    *
    * if xDataSource is a data source that was created with {@link createDataSource()} , the arguments returned here should be the same than the ones passed
    * to the function. Of course, this cannot be guaranteed. However, if detection is ambiguous, the returned arguments should be empty.
    *
    * This method may merge representation strings together if adjacent ranges appear successively in the range identifiers. E.g., if the first range refers
    * to "$Sheet1.$A$1:$A$8" and the second range refers to "$Sheet1.$B$1:$B$8", those should be merged together to "$Sheet1.$A$1:$B$8".
    * @param xDataSource A data source containing all data used in a chart.
    * @returns Arguments that when being passed to {@link createDataSource()} should in an ideal case return the same data source as `xDataSource` .
    */
  def detectArguments(xDataSource: XDataSource): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * Returns a component that is able to change a given range representation to another one. This usually is a controller-component that uses the GUI to
    * allow a user to select a new range.
    *
    * This method may return nothing, if it does not support range selection or if there is no current controller available that offers the functionality.
    * @returns The component for selecting a new range. It must support XComponent, in order to inform the receiver about its lifetime.
    */
  def getRangeSelection(): activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XRangeSelection
}

object XDataProvider {
  @scala.inline
  def apply(
    RangeSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XRangeSelection,
    acquire: () => scala.Unit,
    createDataSequenceByRangeRepresentation: java.lang.String => XDataSequence,
    createDataSequenceByRangeRepresentationPossible: java.lang.String => scala.Boolean,
    createDataSequenceByValueArray: (java.lang.String, java.lang.String) => XDataSequence,
    createDataSource: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => XDataSource,
    createDataSourcePossible: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Boolean,
    detectArguments: XDataSource => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getRangeSelection: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XRangeSelection,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDataProvider = {
    val __obj = js.Dynamic.literal(RangeSelection = RangeSelection, acquire = js.Any.fromFunction0(acquire), createDataSequenceByRangeRepresentation = js.Any.fromFunction1(createDataSequenceByRangeRepresentation), createDataSequenceByRangeRepresentationPossible = js.Any.fromFunction1(createDataSequenceByRangeRepresentationPossible), createDataSequenceByValueArray = js.Any.fromFunction2(createDataSequenceByValueArray), createDataSource = js.Any.fromFunction1(createDataSource), createDataSourcePossible = js.Any.fromFunction1(createDataSourcePossible), detectArguments = js.Any.fromFunction1(detectArguments), getRangeSelection = js.Any.fromFunction0(getRangeSelection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDataProvider]
  }
}


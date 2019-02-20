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


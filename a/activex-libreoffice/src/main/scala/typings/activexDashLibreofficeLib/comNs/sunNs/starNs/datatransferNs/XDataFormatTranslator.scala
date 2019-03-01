package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to be implemented by objects used to translate a {@link DataFlavor} to a system dependent data transfer type and vice versa.
  *
  * Different platforms use different types to describe data formats available during data exchange operations like clipboard or drag&drop. Windows for
  * instance uses integer values to describe an available clipboard or drag&drop format, Unix X11 uses so called Atoms etc.
  */
trait XDataFormatTranslator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Converts a system dependent data type to a {@link DataFlavor} .
    * @param aSysDataType A system dependent data type. If aSysDataType is empty so is the returned {@link DataFlavor} .
    * @returns A {@link DataFlavor} for the given system dependent data transfer type. If there is no appropriate mapping for a system dependent data type, the
    */
  def getDataFlavorFromSystemDataType(aSysDataType: js.Any): DataFlavor
  /**
    * Converts a {@link DataFlavor} to system dependent data type.
    * @param aDataFlavor Describes the format for which a system dependent data types is requested.
    * @returns A system dependent data transfer type for the given {@link DataFlavor} if there is one available. If the is no system dependent data type for a g
    */
  def getSystemDataTypeFromDataFlavor(aDataFlavor: DataFlavor): js.Any
}

object XDataFormatTranslator {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getDataFlavorFromSystemDataType: js.Function1[js.Any, DataFlavor],
    getSystemDataTypeFromDataFlavor: js.Function1[DataFlavor, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDataFormatTranslator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDataFlavorFromSystemDataType")(getDataFlavorFromSystemDataType)
    __obj.updateDynamic("getSystemDataTypeFromDataFlavor")(getSystemDataTypeFromDataFlavor)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDataFormatTranslator]
  }
}


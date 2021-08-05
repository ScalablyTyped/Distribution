package typings.activexLibreoffice.com_.sun.star.datatransfer

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to be implemented by objects used to translate a {@link DataFlavor} to a system dependent data transfer type and vice versa.
  *
  * Different platforms use different types to describe data formats available during data exchange operations like clipboard or drag&drop. Windows for
  * instance uses integer values to describe an available clipboard or drag&drop format, Unix X11 uses so called Atoms etc.
  */
trait XDataFormatTranslator
  extends StObject
     with XInterface {
  
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
  
  inline def apply(
    acquire: () => Unit,
    getDataFlavorFromSystemDataType: js.Any => DataFlavor,
    getSystemDataTypeFromDataFlavor: DataFlavor => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataFormatTranslator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDataFlavorFromSystemDataType = js.Any.fromFunction1(getDataFlavorFromSystemDataType), getSystemDataTypeFromDataFlavor = js.Any.fromFunction1(getSystemDataTypeFromDataFlavor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataFormatTranslator]
  }
  
  extension [Self <: XDataFormatTranslator](x: Self) {
    
    inline def setGetDataFlavorFromSystemDataType(value: js.Any => DataFlavor): Self = StObject.set(x, "getDataFlavorFromSystemDataType", js.Any.fromFunction1(value))
    
    inline def setGetSystemDataTypeFromDataFlavor(value: DataFlavor => js.Any): Self = StObject.set(x, "getSystemDataTypeFromDataFlavor", js.Any.fromFunction1(value))
  }
}

package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a method to set an external name at the sheet.
  *
  * An external reference in a cell formula is implemented using a hidden sheet which is linked to the sheet in the external document. The name of the
  * hidden sheet is composed of the URL of the external document and the external sheet name.
  * @since OOo 3.0
  */
trait XExternalSheetName
  extends StObject
     with XInterface {
  
  /**
    * sets an external name at the sheet.
    *
    * This method allows to compose the sheet name from the URL of the external document and the name of the external sheet.
    * @param aUrl the URL of the external document.
    * @param aSheetName the name of the sheet in the external document.
    * @throws com::sun::star::container::ElementExistException a sheet with that external name already exists in this document
    */
  def setExternalName(aUrl: String, aSheetName: String): Unit
}
object XExternalSheetName {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    setExternalName: (String, String) => Unit
  ): XExternalSheetName = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setExternalName = js.Any.fromFunction2(setExternalName))
    __obj.asInstanceOf[XExternalSheetName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XExternalSheetName] (val x: Self) extends AnyVal {
    
    inline def setSetExternalName(value: (String, String) => Unit): Self = StObject.set(x, "setExternalName", js.Any.fromFunction2(value))
  }
}

package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables the object to handle text tables. */
trait XTextTablesSupplier
  extends StObject
     with XInterface {
  
  /**
    * @returns the collection of "TextTables" currently contained in the object.
    * @see com.sun.star.text.TextTables
    * @see com.sun.star.text.TextTable
    */
  val TextTables: XNameAccess
  
  /**
    * @returns the collection of "TextTables" currently contained in the object.
    * @see com.sun.star.text.TextTables
    * @see com.sun.star.text.TextTable
    */
  def getTextTables(): XNameAccess
}
object XTextTablesSupplier {
  
  inline def apply(
    TextTables: XNameAccess,
    acquire: () => Unit,
    getTextTables: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextTablesSupplier = {
    val __obj = js.Dynamic.literal(TextTables = TextTables.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTextTables = js.Any.fromFunction0(getTextTables), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextTablesSupplier]
  }
  
  extension [Self <: XTextTablesSupplier](x: Self) {
    
    inline def setGetTextTables(value: () => XNameAccess): Self = StObject.set(x, "getTextTables", js.Any.fromFunction0(value))
    
    inline def setTextTables(value: XNameAccess): Self = StObject.set(x, "TextTables", value.asInstanceOf[js.Any])
  }
}

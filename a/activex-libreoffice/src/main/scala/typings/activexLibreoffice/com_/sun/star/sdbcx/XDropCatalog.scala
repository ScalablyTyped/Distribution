package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * may be implemented to hide the complexity of dropping a database catalog. Could normally be used only in offline mode, no connection on the database.
  * This should be checked by the driver.
  */
@js.native
trait XDropCatalog extends XInterface {
  
  /**
    * drops a catalog identified by its name.
    * @param catalogName the catalog name
    * @param info driver specific information
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropCatalog(catalogName: String, info: SeqEquiv[PropertyValue]): Unit = js.native
}
object XDropCatalog {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    dropCatalog: (String, SeqEquiv[PropertyValue]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDropCatalog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dropCatalog = js.Any.fromFunction2(dropCatalog), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDropCatalog]
  }
  
  @scala.inline
  implicit class XDropCatalogMutableBuilder[Self <: XDropCatalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropCatalog(value: (String, SeqEquiv[PropertyValue]) => Unit): Self = StObject.set(x, "dropCatalog", js.Any.fromFunction2(value))
  }
}

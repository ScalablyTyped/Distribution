package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** may be implemented to hide the complexity of creating a database catalog. */
@js.native
trait XCreateCatalog extends XInterface {
  
  /**
    * creates the catalog by using a sequence of property values. The kind of properties depends on the provider.
    * @param info driver specific information
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def createCatalog(info: SeqEquiv[PropertyValue]): Unit = js.native
}
object XCreateCatalog {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createCatalog: SeqEquiv[PropertyValue] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCreateCatalog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createCatalog = js.Any.fromFunction1(createCatalog), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCreateCatalog]
  }
  
  @scala.inline
  implicit class XCreateCatalogMutableBuilder[Self <: XCreateCatalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateCatalog(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "createCatalog", js.Any.fromFunction1(value))
  }
}

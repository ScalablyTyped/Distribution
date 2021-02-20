package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for access to a container of indexes, typically used for a table definition object. */
@js.native
trait XIndexesSupplier extends XInterface {
  
  /**
    * returns the container of indexes.
    * @returns the indexes
    */
  val Indexes: XNameAccess = js.native
  
  /**
    * returns the container of indexes.
    * @returns the indexes
    */
  def getIndexes(): XNameAccess = js.native
}
object XIndexesSupplier {
  
  @scala.inline
  def apply(
    Indexes: XNameAccess,
    acquire: () => Unit,
    getIndexes: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIndexesSupplier = {
    val __obj = js.Dynamic.literal(Indexes = Indexes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIndexes = js.Any.fromFunction0(getIndexes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIndexesSupplier]
  }
  
  @scala.inline
  implicit class XIndexesSupplierMutableBuilder[Self <: XIndexesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetIndexes(value: () => XNameAccess): Self = StObject.set(x, "getIndexes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndexes(value: XNameAccess): Self = StObject.set(x, "Indexes", value.asInstanceOf[js.Any])
  }
}

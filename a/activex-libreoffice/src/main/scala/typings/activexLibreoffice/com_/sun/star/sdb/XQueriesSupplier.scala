package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the access to a container of database queries. */
trait XQueriesSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of queries.
    *
    * The single elements of the container support the {@link Query} service.
    * @returns the queries belonging to database connection at which the {@link XQueriesSupplier} interface is exposed.
    */
  val Queries: XNameAccess
  
  /**
    * returns the container of queries.
    *
    * The single elements of the container support the {@link Query} service.
    * @returns the queries belonging to database connection at which the {@link XQueriesSupplier} interface is exposed.
    */
  def getQueries(): XNameAccess
}
object XQueriesSupplier {
  
  @scala.inline
  def apply(
    Queries: XNameAccess,
    acquire: () => Unit,
    getQueries: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XQueriesSupplier = {
    val __obj = js.Dynamic.literal(Queries = Queries.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getQueries = js.Any.fromFunction0(getQueries), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XQueriesSupplier]
  }
  
  @scala.inline
  implicit class XQueriesSupplierMutableBuilder[Self <: XQueriesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetQueries(value: () => XNameAccess): Self = StObject.set(x, "getQueries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueries(value: XNameAccess): Self = StObject.set(x, "Queries", value.asInstanceOf[js.Any])
  }
}

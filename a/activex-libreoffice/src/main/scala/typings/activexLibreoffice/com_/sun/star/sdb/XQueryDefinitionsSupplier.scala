package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a container of database command definitions. */
trait XQueryDefinitionsSupplier extends XInterface {
  /**
    * returns the container of commands.
    * @returns the query definitions
    */
  val QueryDefinitions: XNameAccess
  /**
    * returns the container of commands.
    * @returns the query definitions
    */
  def getQueryDefinitions(): XNameAccess
}

object XQueryDefinitionsSupplier {
  @scala.inline
  def apply(
    QueryDefinitions: XNameAccess,
    acquire: () => Unit,
    getQueryDefinitions: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XQueryDefinitionsSupplier = {
    val __obj = js.Dynamic.literal(QueryDefinitions = QueryDefinitions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getQueryDefinitions = js.Any.fromFunction0(getQueryDefinitions), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XQueryDefinitionsSupplier]
  }
}


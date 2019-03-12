package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the result of a SPARQL "SELECT" query.
  *
  * The result consists of:  1. a list of query variable names (column labels) 2. an iterator of query results (rows), each being a list of bindings for
  * the above variables Note that each query result retrieved via {@link com.sun.star.container.XEnumeration.nextElement()} has the type {@link XNode} [],
  * the length of the sequence being the same as the number of query variables.
  * @see XRepository.querySelect
  * @see XNode
  * @since OOo 3.0
  */
trait XQuerySelectResult
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration {
  /** get the names of the query variables. */
  val BindingNames: stdLib.SafeArray[java.lang.String]
  /** get the names of the query variables. */
  def getBindingNames(): stdLib.SafeArray[java.lang.String]
}

object XQuerySelectResult {
  @scala.inline
  def apply(
    BindingNames: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    getBindingNames: () => stdLib.SafeArray[java.lang.String],
    hasMoreElements: () => scala.Boolean,
    nextElement: () => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XQuerySelectResult = {
    val __obj = js.Dynamic.literal(BindingNames = BindingNames, acquire = js.Any.fromFunction0(acquire), getBindingNames = js.Any.fromFunction0(getBindingNames), hasMoreElements = js.Any.fromFunction0(hasMoreElements), nextElement = js.Any.fromFunction0(nextElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XQuerySelectResult]
  }
}


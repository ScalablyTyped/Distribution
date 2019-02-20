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
  val BindingNames: activexDashInteropLib.SafeArray[java.lang.String]
  /** get the names of the query variables. */
  def getBindingNames(): activexDashInteropLib.SafeArray[java.lang.String]
}


package typings.activexLibreoffice.com_.sun.star.rdf

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with XEnumeration {
  
  /** get the names of the query variables. */
  val BindingNames: SafeArray[String]
  
  /** get the names of the query variables. */
  def getBindingNames(): SafeArray[String]
}
object XQuerySelectResult {
  
  inline def apply(
    BindingNames: SafeArray[String],
    acquire: () => Unit,
    getBindingNames: () => SafeArray[String],
    hasMoreElements: () => Boolean,
    nextElement: () => Any,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XQuerySelectResult = {
    val __obj = js.Dynamic.literal(BindingNames = BindingNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBindingNames = js.Any.fromFunction0(getBindingNames), hasMoreElements = js.Any.fromFunction0(hasMoreElements), nextElement = js.Any.fromFunction0(nextElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XQuerySelectResult]
  }
  
  extension [Self <: XQuerySelectResult](x: Self) {
    
    inline def setBindingNames(value: SafeArray[String]): Self = StObject.set(x, "BindingNames", value.asInstanceOf[js.Any])
    
    inline def setGetBindingNames(value: () => SafeArray[String]): Self = StObject.set(x, "getBindingNames", js.Any.fromFunction0(value))
  }
}

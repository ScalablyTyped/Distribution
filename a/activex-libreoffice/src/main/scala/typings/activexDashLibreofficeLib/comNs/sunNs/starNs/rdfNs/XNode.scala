package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a node that may occur in a RDF graph.
  *
  * In the RDF data model, there are three distinct types of nodes: {@link URIs} , blank nodes, and literals.
  *
  * `XNode; |; |---XLiteral; |; XResource; |; |---XBlankNode; |; XURI`
  * @see XRepository
  * @see Statement
  * @see XResource
  * @see XBlankNode
  * @see XURI
  * @see XLiteral
  * @since OOo 3.0
  */
trait XNode extends js.Object {
  var StringValue: java.lang.String
}

object XNode {
  @scala.inline
  def apply(StringValue: java.lang.String): XNode = {
    val __obj = js.Dynamic.literal(StringValue = StringValue)
  
    __obj.asInstanceOf[XNode]
  }
}


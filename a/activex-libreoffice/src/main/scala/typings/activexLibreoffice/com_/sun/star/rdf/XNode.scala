package typings.activexLibreoffice.com_.sun.star.rdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait XNode extends js.Object {
  
  var StringValue: String = js.native
}
object XNode {
  
  @scala.inline
  def apply(StringValue: String): XNode = {
    val __obj = js.Dynamic.literal(StringValue = StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[XNode]
  }
  
  @scala.inline
  implicit class XNodeOps[Self <: XNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("StringValue", value.asInstanceOf[js.Any])
  }
}

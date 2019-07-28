package typings.activexDashLibreoffice.comNs.sunNs.starNs.rdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a RDF statement, or triple.
  * @see XRepository
  * @since OOo 3.2
  */
trait Statement extends js.Object {
  var Graph: XURI
  var Object: XNode
  var Predicate: XURI
  var Subject: XResource
}

object Statement {
  @scala.inline
  def apply(Graph: XURI, Object: XNode, Predicate: XURI, Subject: XResource): Statement = {
    val __obj = js.Dynamic.literal(Graph = Graph, Object = Object, Predicate = Predicate, Subject = Subject)
  
    __obj.asInstanceOf[Statement]
  }
}


package typings.activexLibreoffice.com_.sun.star.rdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a RDF statement, or triple.
  * @see XRepository
  * @since OOo 3.2
  */
@js.native
trait Statement extends js.Object {
  var Graph: XURI = js.native
  var Object: XNode = js.native
  var Predicate: XURI = js.native
  var Subject: XResource = js.native
}

object Statement {
  @scala.inline
  def apply(Graph: XURI, Object: XNode, Predicate: XURI, Subject: XResource): Statement = {
    val __obj = js.Dynamic.literal(Graph = Graph.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], Predicate = Predicate.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  implicit class StatementOps[Self <: Statement] (val x: Self) extends AnyVal {
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
    def setGraph(value: XURI): Self = this.set("Graph", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: XNode): Self = this.set("Object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicate(value: XURI): Self = this.set("Predicate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: XResource): Self = this.set("Subject", value.asInstanceOf[js.Any])
  }
  
}


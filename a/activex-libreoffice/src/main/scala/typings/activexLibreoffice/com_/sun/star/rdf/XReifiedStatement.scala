package typings.activexLibreoffice.com_.sun.star.rdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a reified RDF statement.
  * @see XRepository
  * @since OOo 3.0
  */
@js.native
trait XReifiedStatement extends XNode {
  var Statement: typings.activexLibreoffice.com_.sun.star.rdf.Statement = js.native
}

object XReifiedStatement {
  @scala.inline
  def apply(Statement: Statement, StringValue: String): XReifiedStatement = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[XReifiedStatement]
  }
  @scala.inline
  implicit class XReifiedStatementOps[Self <: XReifiedStatement] (val x: Self) extends AnyVal {
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
    def setStatement(value: Statement): Self = this.set("Statement", value.asInstanceOf[js.Any])
  }
  
}


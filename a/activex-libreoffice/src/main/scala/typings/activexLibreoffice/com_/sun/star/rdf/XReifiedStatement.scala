package typings.activexLibreoffice.com_.sun.star.rdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a reified RDF statement.
  * @see XRepository
  * @since OOo 3.0
  */
trait XReifiedStatement extends XNode {
  var Statement: typings.activexLibreoffice.com_.sun.star.rdf.Statement
}

object XReifiedStatement {
  @scala.inline
  def apply(Statement: Statement, StringValue: String): XReifiedStatement = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[XReifiedStatement]
  }
}


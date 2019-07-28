package typings.activexDashLibreoffice.comNs.sunNs.starNs.rdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a reified RDF statement.
  * @see XRepository
  * @since OOo 3.0
  */
trait XReifiedStatement extends XNode {
  var Statement: typings.activexDashLibreoffice.comNs.sunNs.starNs.rdfNs.Statement
}

object XReifiedStatement {
  @scala.inline
  def apply(Statement: Statement, StringValue: String): XReifiedStatement = {
    val __obj = js.Dynamic.literal(Statement = Statement, StringValue = StringValue)
  
    __obj.asInstanceOf[XReifiedStatement]
  }
}


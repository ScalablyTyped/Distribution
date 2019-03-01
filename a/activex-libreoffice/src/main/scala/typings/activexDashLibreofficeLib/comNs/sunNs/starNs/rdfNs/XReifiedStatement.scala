package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a reified RDF statement.
  * @see XRepository
  * @since OOo 3.0
  */
trait XReifiedStatement extends XNode {
  var Statement: Statement
}

object XReifiedStatement {
  @scala.inline
  def apply(Statement: Statement, StringValue: java.lang.String): XReifiedStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Statement")(Statement)
    __obj.updateDynamic("StringValue")(StringValue)
    __obj.asInstanceOf[XReifiedStatement]
  }
}


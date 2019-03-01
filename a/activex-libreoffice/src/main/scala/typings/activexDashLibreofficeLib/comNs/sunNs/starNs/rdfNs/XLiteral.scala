package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a literal that may occur in a RDF graph.
  *
  * RDF literals may come in three varieties: just a string ValueValue and Languagetyped literal: Value and Datatype (represented by an {@link URI} ) Note
  * that there is no literal with both Language and Datatype.
  * @see XRepository
  * @since OOo 3.0
  */
trait XLiteral extends XNode {
  var Datatype: XURI
  var Language: java.lang.String
  var Value: java.lang.String
}

object XLiteral {
  @scala.inline
  def apply(Datatype: XURI, Language: java.lang.String, StringValue: java.lang.String, Value: java.lang.String): XLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Datatype")(Datatype)
    __obj.updateDynamic("Language")(Language)
    __obj.updateDynamic("StringValue")(StringValue)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[XLiteral]
  }
}


package typings.activexLibreoffice.com_.sun.star.rdf

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
  var Language: String
  var Value: String
}

object XLiteral {
  @scala.inline
  def apply(Datatype: XURI, Language: String, StringValue: String, Value: String): XLiteral = {
    val __obj = js.Dynamic.literal(Datatype = Datatype.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[XLiteral]
  }
}


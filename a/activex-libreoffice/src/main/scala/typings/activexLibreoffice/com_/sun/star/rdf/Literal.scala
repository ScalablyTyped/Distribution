package typings.activexLibreoffice.com_.sun.star.rdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a literal that may occur in a RDF graph.
  * @see XRepository
  * @since OOo 3.0
  */
trait Literal extends XLiteral {
  /**
    * creates a plain literal RDF node.
    * @param Value the string value of the literal
    */
  def create(Value: String): Unit
  /**
    * creates a literal RDF node with a language.
    * @param Value the string value of the literal
    * @param Language the language of the literal
    */
  def createWithLanguage(Value: String, Language: String): Unit
  /**
    * creates a typed literal RDF node.
    * @param Value the string value of the literal
    * @param Type the data type of the literal
    */
  def createWithType(Value: String, Type: XURI): Unit
}

object Literal {
  @scala.inline
  def apply(
    Datatype: XURI,
    Language: String,
    StringValue: String,
    Value: String,
    create: String => Unit,
    createWithLanguage: (String, String) => Unit,
    createWithType: (String, XURI) => Unit
  ): Literal = {
    val __obj = js.Dynamic.literal(Datatype = Datatype.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), createWithLanguage = js.Any.fromFunction2(createWithLanguage), createWithType = js.Any.fromFunction2(createWithType))
    __obj.asInstanceOf[Literal]
  }
}


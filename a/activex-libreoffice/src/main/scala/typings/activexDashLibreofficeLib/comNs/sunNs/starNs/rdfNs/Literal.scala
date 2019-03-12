package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.rdfNs

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
  def create(Value: java.lang.String): scala.Unit
  /**
    * creates a literal RDF node with a language.
    * @param Value the string value of the literal
    * @param Language the language of the literal
    */
  def createWithLanguage(Value: java.lang.String, Language: java.lang.String): scala.Unit
  /**
    * creates a typed literal RDF node.
    * @param Value the string value of the literal
    * @param Type the data type of the literal
    */
  def createWithType(Value: java.lang.String, Type: XURI): scala.Unit
}

object Literal {
  @scala.inline
  def apply(
    Datatype: XURI,
    Language: java.lang.String,
    StringValue: java.lang.String,
    Value: java.lang.String,
    create: java.lang.String => scala.Unit,
    createWithLanguage: (java.lang.String, java.lang.String) => scala.Unit,
    createWithType: (java.lang.String, XURI) => scala.Unit
  ): Literal = {
    val __obj = js.Dynamic.literal(Datatype = Datatype, Language = Language, StringValue = StringValue, Value = Value, create = js.Any.fromFunction1(create), createWithLanguage = js.Any.fromFunction2(createWithLanguage), createWithType = js.Any.fromFunction2(createWithType))
  
    __obj.asInstanceOf[Literal]
  }
}


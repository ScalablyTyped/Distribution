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


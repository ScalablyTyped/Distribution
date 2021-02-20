package typings.activexLibreoffice.com_.sun.star.rdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a literal that may occur in a RDF graph.
  * @see XRepository
  * @since OOo 3.0
  */
@js.native
trait Literal extends XLiteral {
  
  /**
    * creates a plain literal RDF node.
    * @param Value the string value of the literal
    */
  def create(Value: String): Unit = js.native
  
  /**
    * creates a literal RDF node with a language.
    * @param Value the string value of the literal
    * @param Language the language of the literal
    */
  def createWithLanguage(Value: String, Language: String): Unit = js.native
  
  /**
    * creates a typed literal RDF node.
    * @param Value the string value of the literal
    * @param Type the data type of the literal
    */
  def createWithType(Value: String, Type: XURI): Unit = js.native
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
  
  @scala.inline
  implicit class LiteralMutableBuilder[Self <: Literal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: String => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWithLanguage(value: (String, String) => Unit): Self = StObject.set(x, "createWithLanguage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateWithType(value: (String, XURI) => Unit): Self = StObject.set(x, "createWithType", js.Any.fromFunction2(value))
  }
}

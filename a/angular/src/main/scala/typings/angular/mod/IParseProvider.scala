package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IParseProvider extends StObject {
  
  /**
    * Configure $parse service to add literal values that will be present as literal at expressions.
    *
    * @param literalName Token for the literal value. The literal name value must be a valid literal name.
    * @param literalValue Value for this literal. All literal values must be primitives or `undefined`.
    **/
  def addLiteral(literalName: String, literalValue: js.Any): Unit = js.native
  
  def logPromiseWarnings(): Boolean = js.native
  def logPromiseWarnings(value: Boolean): IParseProvider = js.native
  
  /**
    * Allows defining the set of characters that are allowed in Angular expressions. The function identifierStart will get called to know if a given character is a valid character to be the first character for an identifier. The function identifierContinue will get called to know if a given character is a valid character to be a follow-up identifier character. The functions identifierStart and identifierContinue will receive as arguments the single character to be identifier and the character code point. These arguments will be string and numeric. Keep in mind that the string parameter can be two characters long depending on the character representation. It is expected for the function to return true or false, whether that character is allowed or not.
    * Since this function will be called extensivelly, keep the implementation of these functions fast, as the performance of these functions have a direct impact on the expressions parsing speed.
    *
    * @param identifierStart The function that will decide whether the given character is a valid identifier start character.
    * @param identifierContinue The function that will decide whether the given character is a valid identifier continue character.
    **/
  def setIdentifierFns(): Unit = js.native
  def setIdentifierFns(identifierStart: js.Function2[/* character */ String, /* codePoint */ Double, Boolean]): Unit = js.native
  def setIdentifierFns(
    identifierStart: js.Function2[/* character */ String, /* codePoint */ Double, Boolean],
    identifierContinue: js.Function2[/* character */ String, /* codePoint */ Double, Boolean]
  ): Unit = js.native
  def setIdentifierFns(
    identifierStart: Unit,
    identifierContinue: js.Function2[/* character */ String, /* codePoint */ Double, Boolean]
  ): Unit = js.native
  
  def unwrapPromises(): Boolean = js.native
  def unwrapPromises(value: Boolean): IParseProvider = js.native
}

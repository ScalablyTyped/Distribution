package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.Literal
  - typings.astTypes.namedTypesMod.namedTypes.JSXText
  - typings.astTypes.namedTypesMod.namedTypes.StringLiteral
  - typings.astTypes.namedTypesMod.namedTypes.NumericLiteral
  - typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral
  - typings.astTypes.namedTypesMod.namedTypes.NullLiteral
  - typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral
  - typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral
*/
trait LiteralKind extends StObject
object LiteralKind {
  
  inline def BigIntLiteral(value: String | Double): typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral]
  }
  
  inline def BooleanLiteral(value: Boolean): typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral]
  }
  
  inline def JSXText(value: String): typings.astTypes.namedTypesMod.namedTypes.JSXText = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXText]
  }
  
  inline def Literal(): typings.astTypes.namedTypesMod.namedTypes.Literal = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Literal]
  }
  
  inline def NullLiteral(): typings.astTypes.namedTypesMod.namedTypes.NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NullLiteral]
  }
  
  inline def NumericLiteral(value: Double): typings.astTypes.namedTypesMod.namedTypes.NumericLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NumericLiteral]
  }
  
  inline def RegExpLiteral(flags: String, pattern: String): typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral]
  }
  
  inline def StringLiteral(value: String): typings.astTypes.namedTypesMod.namedTypes.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.StringLiteral]
  }
}

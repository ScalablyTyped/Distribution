package typings.angularCompiler.mod

import typings.angularCompiler.anon.LiteralFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ConstantPool")
@js.native
open class ConstantPool () extends StObject {
  def this(isClosureCompilerEnabled: Boolean) = this()
  
  /* private */ var _getLiteralFactory: Any = js.native
  
  /* private */ var freshName: Any = js.native
  
  def getConstLiteral(literal: Expression): Expression = js.native
  def getConstLiteral(literal: Expression, forceShared: Boolean): Expression = js.native
  
  def getLiteralFactory(literal: LiteralArrayExpr): LiteralFactory = js.native
  def getLiteralFactory(literal: LiteralMapExpr): LiteralFactory = js.native
  
  /* private */ val isClosureCompilerEnabled: Any = js.native
  
  /* private */ var keyOf: Any = js.native
  
  /* private */ var literalFactories: Any = js.native
  
  /* private */ var literals: Any = js.native
  
  /* private */ var nextNameIndex: Any = js.native
  
  var statements: js.Array[Statement] = js.native
  
  /**
    * Produce a unique name.
    *
    * The name might be unique among different prefixes if any of the prefixes end in
    * a digit so the prefix should be a constant string (not based on user input) and
    * must not end in a digit.
    */
  def uniqueName(prefix: String): String = js.native
}

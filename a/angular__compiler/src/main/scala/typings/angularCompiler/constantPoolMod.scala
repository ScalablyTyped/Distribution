package typings.angularCompiler

import typings.angularCompiler.angularCompilerNumbers.`0`
import typings.angularCompiler.angularCompilerNumbers.`1`
import typings.angularCompiler.angularCompilerNumbers.`2`
import typings.angularCompiler.angularCompilerNumbers.`3`
import typings.angularCompiler.anon.LiteralFactory
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.LiteralArrayExpr
import typings.angularCompiler.outputAstMod.LiteralMapExpr
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.srcUtilMod.OutputContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantPoolMod {
  
  @JSImport("@angular/compiler/src/constant_pool", "ConstantPool")
  @js.native
  class ConstantPool () extends StObject {
    def this(isClosureCompilerEnabled: Boolean) = this()
    
    var _getLiteralFactory: js.Any = js.native
    
    var componentDefinitions: js.Any = js.native
    
    var definitionsOf: js.Any = js.native
    
    var directiveDefinitions: js.Any = js.native
    
    var freshName: js.Any = js.native
    
    def getConstLiteral(literal: Expression): Expression = js.native
    def getConstLiteral(literal: Expression, forceShared: Boolean): Expression = js.native
    
    def getDefinition(`type`: js.Any, kind: DefinitionKind, ctx: OutputContext): Expression = js.native
    def getDefinition(`type`: js.Any, kind: DefinitionKind, ctx: OutputContext, forceShared: Boolean): Expression = js.native
    
    def getLiteralFactory(literal: LiteralArrayExpr): LiteralFactory = js.native
    def getLiteralFactory(literal: LiteralMapExpr): LiteralFactory = js.native
    
    var injectorDefinitions: js.Any = js.native
    
    val isClosureCompilerEnabled: js.Any = js.native
    
    var keyOf: js.Any = js.native
    
    var literalFactories: js.Any = js.native
    
    var literals: js.Any = js.native
    
    var nextNameIndex: js.Any = js.native
    
    var pipeDefinitions: js.Any = js.native
    
    def propertyNameOf(kind: DefinitionKind): String = js.native
    
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompiler.angularCompilerNumbers.`0`
    - typings.angularCompiler.angularCompilerNumbers.`1`
    - typings.angularCompiler.angularCompilerNumbers.`2`
    - typings.angularCompiler.angularCompilerNumbers.`3`
  */
  trait DefinitionKind extends StObject
  object DefinitionKind {
    
    @scala.inline
    def Component: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def Directive: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def Injector: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def Pipe: `3` = 3.asInstanceOf[`3`]
  }
}

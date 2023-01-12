package typings.angularCompilerCli

import typings.angularCompiler.mod.ConstantPool
import typings.angularCompiler.mod.Expression
import typings.angularCompiler.mod.R3PartialDeclaration
import typings.angularCompiler.mod.Statement
import typings.angularCompilerCli.linkerSrcAstAstValueMod.AstObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerPartialLinkersPartialLinkerMod {
  
  trait LinkedDefinition extends StObject {
    
    var expression: Expression
    
    var statements: js.Array[Statement]
  }
  object LinkedDefinition {
    
    inline def apply(expression: Expression, statements: js.Array[Statement]): LinkedDefinition = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkedDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkedDefinition] (val x: Self) extends AnyVal {
      
      inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setStatements(value: js.Array[Statement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "statements", js.Array(value*))
    }
  }
  
  trait PartialLinker[TExpression] extends StObject {
    
    /**
      * Link the partial declaration `metaObj` information to generate a full definition expression.
      *
      * @param metaObj An object that fits one of the `R3DeclareDirectiveMetadata` or
      *     `R3DeclareComponentMetadata` interfaces.
      */
    def linkPartialDeclaration(constantPool: ConstantPool, metaObj: AstObject[R3PartialDeclaration, TExpression]): LinkedDefinition
  }
  object PartialLinker {
    
    inline def apply[TExpression](
      linkPartialDeclaration: (ConstantPool, AstObject[R3PartialDeclaration, TExpression]) => LinkedDefinition
    ): PartialLinker[TExpression] = {
      val __obj = js.Dynamic.literal(linkPartialDeclaration = js.Any.fromFunction2(linkPartialDeclaration))
      __obj.asInstanceOf[PartialLinker[TExpression]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLinker[?], TExpression] (val x: Self & PartialLinker[TExpression]) extends AnyVal {
      
      inline def setLinkPartialDeclaration(value: (ConstantPool, AstObject[R3PartialDeclaration, TExpression]) => LinkedDefinition): Self = StObject.set(x, "linkPartialDeclaration", js.Any.fromFunction2(value))
    }
  }
}

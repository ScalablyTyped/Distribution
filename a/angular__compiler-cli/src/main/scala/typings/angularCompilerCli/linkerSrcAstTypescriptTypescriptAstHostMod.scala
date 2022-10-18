package typings.angularCompilerCli

import typings.angularCompilerCli.linkerSrcAstAstHostMod.AstHost
import typings.angularCompilerCli.linkerSrcAstAstHostMod.Range
import typings.std.Map
import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcAstTypescriptTypescriptAstHostMod {
  
  @JSImport("@angular/compiler-cli/linker/src/ast/typescript/typescript_ast_host", "TypeScriptAstHost")
  @js.native
  open class TypeScriptAstHost ()
    extends StObject
       with AstHost[Expression] {
    
    /**
      * Compute the location range of the expression in the source file, to be used for source-mapping.
      */
    /* CompleteClass */
    override def getRange(node: Expression): Range = js.native
    
    /**
      * Get the name of the symbol represented by the given expression node, or `null` if it is not a
      * symbol.
      */
    /* CompleteClass */
    override def getSymbolName(node: Expression): String | Null = js.native
    
    /**
      * Return `true` if the given expression is an array literal, or false otherwise.
      */
    /* CompleteClass */
    override def isArrayLiteral(node: Expression): Boolean = js.native
    def isArrayLiteral(node: Node): /* is typescript.typescript.ArrayLiteralExpression */ Boolean = js.native
    @JSName("isArrayLiteral")
    var isArrayLiteral_Original: js.Function1[/* node */ Node, /* is typescript.typescript.ArrayLiteralExpression */ Boolean] = js.native
    
    /**
      * Return `true` if the given expression can be considered a boolean literal, or false otherwise.
      *
      * Note that this should also cover the special case of some minified code where `true` and
      * `false` are replaced by `!0` and `!1` respectively.
      */
    /* CompleteClass */
    override def isBooleanLiteral(node: Expression): Boolean = js.native
    
    /**
      * Return true if the given expression is a call expression, or false otherwise.
      */
    /* CompleteClass */
    override def isCallExpression(node: Expression): Boolean = js.native
    def isCallExpression(node: Node): /* is typescript.typescript.CallExpression */ Boolean = js.native
    @JSName("isCallExpression")
    var isCallExpression_Original: js.Function1[/* node */ Node, /* is typescript.typescript.CallExpression */ Boolean] = js.native
    
    /**
      * Return `true` if the given expression is a function, or false otherwise.
      */
    /* CompleteClass */
    override def isFunctionExpression(node: Expression): Boolean = js.native
    
    /**
      * Return `true` if the given expression is a numeric literal, or false otherwise.
      */
    /* CompleteClass */
    override def isNumericLiteral(node: Expression): Boolean = js.native
    def isNumericLiteral(node: Node): /* is typescript.typescript.NumericLiteral */ Boolean = js.native
    @JSName("isNumericLiteral")
    var isNumericLiteral_Original: js.Function1[/* node */ Node, /* is typescript.typescript.NumericLiteral */ Boolean] = js.native
    
    /**
      * Return `true` if the given expression is an object literal, or false otherwise.
      */
    /* CompleteClass */
    override def isObjectLiteral(node: Expression): Boolean = js.native
    def isObjectLiteral(node: Node): /* is typescript.typescript.ObjectLiteralExpression */ Boolean = js.native
    @JSName("isObjectLiteral")
    var isObjectLiteral_Original: js.Function1[/* node */ Node, /* is typescript.typescript.ObjectLiteralExpression */ Boolean] = js.native
    
    /**
      * Return `true` if the given expression is a string literal, or false otherwise.
      */
    /* CompleteClass */
    override def isStringLiteral(node: Expression): Boolean = js.native
    def isStringLiteral(node: Node): /* is typescript.typescript.StringLiteral */ Boolean = js.native
    @JSName("isStringLiteral")
    var isStringLiteral_Original: js.Function1[/* node */ Node, /* is typescript.typescript.StringLiteral */ Boolean] = js.native
    
    /**
      * Returns the argument expressions for the provided call expression, or throw if it is not
      * a call expression.
      */
    /* CompleteClass */
    override def parseArguments(call: Expression): js.Array[Expression] = js.native
    
    /**
      * Parse an array of expressions from the given expression, or throw if it is not an array
      * literal.
      */
    /* CompleteClass */
    override def parseArrayLiteral(array: Expression): js.Array[Expression] = js.native
    
    /**
      * Parse the boolean value from the given expression, or throw if it is not a boolean literal.
      *
      * Note that this should also cover the special case of some minified code where `true` and
      * `false` are replaced by `!0` and `!1` respectively.
      */
    /* CompleteClass */
    override def parseBooleanLiteral(bool: Expression): Boolean = js.native
    
    /**
      * Returns the expression that is called in the provided call expression, or throw if it is not
      * a call expression.
      */
    /* CompleteClass */
    override def parseCallee(call: Expression): Expression = js.native
    
    /**
      * Parse the numeric value from the given expression, or throw if it is not a numeric literal.
      */
    /* CompleteClass */
    override def parseNumericLiteral(num: Expression): Double = js.native
    
    /**
      * Parse the given expression into a map of object property names to property expressions, or
      * throw if it is not an object literal.
      */
    /* CompleteClass */
    override def parseObjectLiteral(obj: Expression): Map[String, Expression] = js.native
    
    /**
      * Compute the "value" of a function expression by parsing its body for a single `return`
      * statement, extracting the returned expression, or throw if it is not possible.
      */
    /* CompleteClass */
    override def parseReturnValue(fn: Expression): Expression = js.native
    
    /**
      * Parse the string value from the given expression, or throw if it is not a string literal.
      */
    /* CompleteClass */
    override def parseStringLiteral(str: Expression): String = js.native
  }
}

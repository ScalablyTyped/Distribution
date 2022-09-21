package typings.angularCompilerCli

import typings.angularCompilerCli.anon.Fn0
import typings.angularCompilerCli.anon.Fn1
import typings.angularCompilerCli.anon.Fn2
import typings.angularCompilerCli.anon.Fn3
import typings.angularCompilerCli.anon.FnCallNodeOpts
import typings.angularCompilerCli.astHostMod.AstHost
import typings.angularCompilerCli.astHostMod.Range
import typings.babelTypes.mod.Expression
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babelAstHostMod {
  
  @JSImport("@angular/compiler-cli/linker/babel/src/ast/babel_ast_host", "BabelAstHost")
  @js.native
  open class BabelAstHost ()
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
    
    def isArrayLiteral(): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = js.native
    def isArrayLiteral(node: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = js.native
    def isArrayLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = js.native
    def isArrayLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = js.native
    def isArrayLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = js.native
    /**
      * Return `true` if the given expression is an array literal, or false otherwise.
      */
    /* CompleteClass */
    override def isArrayLiteral(node: Expression): Boolean = js.native
    @JSName("isArrayLiteral")
    var isArrayLiteral_Original: Fn1 = js.native
    
    /**
      * Return `true` if the given expression can be considered a boolean literal, or false otherwise.
      *
      * Note that this should also cover the special case of some minified code where `true` and
      * `false` are replaced by `!0` and `!1` respectively.
      */
    /* CompleteClass */
    override def isBooleanLiteral(node: Expression): Boolean = js.native
    
    def isCallExpression(): /* is @babel/types.@babel/types.CallExpression */ Boolean = js.native
    def isCallExpression(node: js.Object): /* is @babel/types.@babel/types.CallExpression */ Boolean = js.native
    def isCallExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ Boolean = js.native
    def isCallExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ Boolean = js.native
    def isCallExpression(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ Boolean = js.native
    /**
      * Return true if the given expression is a call expression, or false otherwise.
      */
    /* CompleteClass */
    override def isCallExpression(node: Expression): Boolean = js.native
    @JSName("isCallExpression")
    var isCallExpression_Original: Fn3 = js.native
    
    /**
      * Return `true` if the given expression is a function, or false otherwise.
      */
    /* CompleteClass */
    override def isFunctionExpression(node: Expression): Boolean = js.native
    
    def isNumericLiteral(): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = js.native
    def isNumericLiteral(node: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = js.native
    def isNumericLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = js.native
    def isNumericLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = js.native
    def isNumericLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = js.native
    /**
      * Return `true` if the given expression is a numeric literal, or false otherwise.
      */
    /* CompleteClass */
    override def isNumericLiteral(node: Expression): Boolean = js.native
    @JSName("isNumericLiteral")
    var isNumericLiteral_Original: Fn0 = js.native
    
    def isObjectLiteral(): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = js.native
    def isObjectLiteral(node: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = js.native
    def isObjectLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = js.native
    def isObjectLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = js.native
    def isObjectLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = js.native
    /**
      * Return `true` if the given expression is an object literal, or false otherwise.
      */
    /* CompleteClass */
    override def isObjectLiteral(node: Expression): Boolean = js.native
    @JSName("isObjectLiteral")
    var isObjectLiteral_Original: Fn2 = js.native
    
    def isStringLiteral(): /* is @babel/types.@babel/types.StringLiteral */ Boolean = js.native
    def isStringLiteral(node: js.Object): /* is @babel/types.@babel/types.StringLiteral */ Boolean = js.native
    def isStringLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ Boolean = js.native
    def isStringLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ Boolean = js.native
    def isStringLiteral(node: Unit, opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ Boolean = js.native
    /**
      * Return `true` if the given expression is a string literal, or false otherwise.
      */
    /* CompleteClass */
    override def isStringLiteral(node: Expression): Boolean = js.native
    @JSName("isStringLiteral")
    var isStringLiteral_Original: FnCallNodeOpts = js.native
    
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

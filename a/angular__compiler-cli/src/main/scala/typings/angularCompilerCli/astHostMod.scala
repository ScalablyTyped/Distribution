package typings.angularCompilerCli

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astHostMod {
  
  trait AstHost[TExpression] extends StObject {
    
    /**
      * Compute the location range of the expression in the source file, to be used for source-mapping.
      */
    def getRange(node: TExpression): Range
    
    /**
      * Get the name of the symbol represented by the given expression node, or `null` if it is not a
      * symbol.
      */
    def getSymbolName(node: TExpression): String | Null
    
    /**
      * Return `true` if the given expression is an array literal, or false otherwise.
      */
    def isArrayLiteral(node: TExpression): Boolean
    
    /**
      * Return `true` if the given expression can be considered a boolean literal, or false otherwise.
      *
      * Note that this should also cover the special case of some minified code where `true` and
      * `false` are replaced by `!0` and `!1` respectively.
      */
    def isBooleanLiteral(node: TExpression): Boolean
    
    /**
      * Return true if the given expression is a call expression, or false otherwise.
      */
    def isCallExpression(node: TExpression): Boolean
    
    /**
      * Return `true` if the given expression is a function, or false otherwise.
      */
    def isFunctionExpression(node: TExpression): Boolean
    
    /**
      * Return `true` if the given expression is a numeric literal, or false otherwise.
      */
    def isNumericLiteral(node: TExpression): Boolean
    
    /**
      * Return `true` if the given expression is an object literal, or false otherwise.
      */
    def isObjectLiteral(node: TExpression): Boolean
    
    /**
      * Return `true` if the given expression is a string literal, or false otherwise.
      */
    def isStringLiteral(node: TExpression): Boolean
    
    /**
      * Returns the argument expressions for the provided call expression, or throw if it is not
      * a call expression.
      */
    def parseArguments(call: TExpression): js.Array[TExpression]
    
    /**
      * Parse an array of expressions from the given expression, or throw if it is not an array
      * literal.
      */
    def parseArrayLiteral(array: TExpression): js.Array[TExpression]
    
    /**
      * Parse the boolean value from the given expression, or throw if it is not a boolean literal.
      *
      * Note that this should also cover the special case of some minified code where `true` and
      * `false` are replaced by `!0` and `!1` respectively.
      */
    def parseBooleanLiteral(bool: TExpression): Boolean
    
    /**
      * Returns the expression that is called in the provided call expression, or throw if it is not
      * a call expression.
      */
    def parseCallee(call: TExpression): TExpression
    
    /**
      * Parse the numeric value from the given expression, or throw if it is not a numeric literal.
      */
    def parseNumericLiteral(num: TExpression): Double
    
    /**
      * Parse the given expression into a map of object property names to property expressions, or
      * throw if it is not an object literal.
      */
    def parseObjectLiteral(obj: TExpression): Map[String, TExpression]
    
    /**
      * Compute the "value" of a function expression by parsing its body for a single `return`
      * statement, extracting the returned expression, or throw if it is not possible.
      */
    def parseReturnValue(fn: TExpression): TExpression
    
    /**
      * Parse the string value from the given expression, or throw if it is not a string literal.
      */
    def parseStringLiteral(str: TExpression): String
  }
  object AstHost {
    
    inline def apply[TExpression](
      getRange: TExpression => Range,
      getSymbolName: TExpression => String | Null,
      isArrayLiteral: TExpression => Boolean,
      isBooleanLiteral: TExpression => Boolean,
      isCallExpression: TExpression => Boolean,
      isFunctionExpression: TExpression => Boolean,
      isNumericLiteral: TExpression => Boolean,
      isObjectLiteral: TExpression => Boolean,
      isStringLiteral: TExpression => Boolean,
      parseArguments: TExpression => js.Array[TExpression],
      parseArrayLiteral: TExpression => js.Array[TExpression],
      parseBooleanLiteral: TExpression => Boolean,
      parseCallee: TExpression => TExpression,
      parseNumericLiteral: TExpression => Double,
      parseObjectLiteral: TExpression => Map[String, TExpression],
      parseReturnValue: TExpression => TExpression,
      parseStringLiteral: TExpression => String
    ): AstHost[TExpression] = {
      val __obj = js.Dynamic.literal(getRange = js.Any.fromFunction1(getRange), getSymbolName = js.Any.fromFunction1(getSymbolName), isArrayLiteral = js.Any.fromFunction1(isArrayLiteral), isBooleanLiteral = js.Any.fromFunction1(isBooleanLiteral), isCallExpression = js.Any.fromFunction1(isCallExpression), isFunctionExpression = js.Any.fromFunction1(isFunctionExpression), isNumericLiteral = js.Any.fromFunction1(isNumericLiteral), isObjectLiteral = js.Any.fromFunction1(isObjectLiteral), isStringLiteral = js.Any.fromFunction1(isStringLiteral), parseArguments = js.Any.fromFunction1(parseArguments), parseArrayLiteral = js.Any.fromFunction1(parseArrayLiteral), parseBooleanLiteral = js.Any.fromFunction1(parseBooleanLiteral), parseCallee = js.Any.fromFunction1(parseCallee), parseNumericLiteral = js.Any.fromFunction1(parseNumericLiteral), parseObjectLiteral = js.Any.fromFunction1(parseObjectLiteral), parseReturnValue = js.Any.fromFunction1(parseReturnValue), parseStringLiteral = js.Any.fromFunction1(parseStringLiteral))
      __obj.asInstanceOf[AstHost[TExpression]]
    }
    
    extension [Self <: AstHost[?], TExpression](x: Self & AstHost[TExpression]) {
      
      inline def setGetRange(value: TExpression => Range): Self = StObject.set(x, "getRange", js.Any.fromFunction1(value))
      
      inline def setGetSymbolName(value: TExpression => String | Null): Self = StObject.set(x, "getSymbolName", js.Any.fromFunction1(value))
      
      inline def setIsArrayLiteral(value: TExpression => Boolean): Self = StObject.set(x, "isArrayLiteral", js.Any.fromFunction1(value))
      
      inline def setIsBooleanLiteral(value: TExpression => Boolean): Self = StObject.set(x, "isBooleanLiteral", js.Any.fromFunction1(value))
      
      inline def setIsCallExpression(value: TExpression => Boolean): Self = StObject.set(x, "isCallExpression", js.Any.fromFunction1(value))
      
      inline def setIsFunctionExpression(value: TExpression => Boolean): Self = StObject.set(x, "isFunctionExpression", js.Any.fromFunction1(value))
      
      inline def setIsNumericLiteral(value: TExpression => Boolean): Self = StObject.set(x, "isNumericLiteral", js.Any.fromFunction1(value))
      
      inline def setIsObjectLiteral(value: TExpression => Boolean): Self = StObject.set(x, "isObjectLiteral", js.Any.fromFunction1(value))
      
      inline def setIsStringLiteral(value: TExpression => Boolean): Self = StObject.set(x, "isStringLiteral", js.Any.fromFunction1(value))
      
      inline def setParseArguments(value: TExpression => js.Array[TExpression]): Self = StObject.set(x, "parseArguments", js.Any.fromFunction1(value))
      
      inline def setParseArrayLiteral(value: TExpression => js.Array[TExpression]): Self = StObject.set(x, "parseArrayLiteral", js.Any.fromFunction1(value))
      
      inline def setParseBooleanLiteral(value: TExpression => Boolean): Self = StObject.set(x, "parseBooleanLiteral", js.Any.fromFunction1(value))
      
      inline def setParseCallee(value: TExpression => TExpression): Self = StObject.set(x, "parseCallee", js.Any.fromFunction1(value))
      
      inline def setParseNumericLiteral(value: TExpression => Double): Self = StObject.set(x, "parseNumericLiteral", js.Any.fromFunction1(value))
      
      inline def setParseObjectLiteral(value: TExpression => Map[String, TExpression]): Self = StObject.set(x, "parseObjectLiteral", js.Any.fromFunction1(value))
      
      inline def setParseReturnValue(value: TExpression => TExpression): Self = StObject.set(x, "parseReturnValue", js.Any.fromFunction1(value))
      
      inline def setParseStringLiteral(value: TExpression => String): Self = StObject.set(x, "parseStringLiteral", js.Any.fromFunction1(value))
    }
  }
  
  trait Range extends StObject {
    
    /** 0-based character position of the range end in the source file text. */
    var endPos: Double
    
    /** 0-based column position of the range start in the source file text. */
    var startCol: Double
    
    /** 0-based line index of the range start in the source file text. */
    var startLine: Double
    
    /** 0-based character position of the range start in the source file text. */
    var startPos: Double
  }
  object Range {
    
    inline def apply(endPos: Double, startCol: Double, startLine: Double, startPos: Double): Range = {
      val __obj = js.Dynamic.literal(endPos = endPos.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setEndPos(value: Double): Self = StObject.set(x, "endPos", value.asInstanceOf[js.Any])
      
      inline def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
      
      inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
      
      inline def setStartPos(value: Double): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
    }
  }
}

package typings.angularCompilerCli

import typings.angularCompilerCli.angularCompilerCliStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astFactoryMod {
  
  @js.native
  trait AstFactory[TStatement, TExpression] extends StObject {
    
    /**
      * Attach the `leadingComments` to the given `statement` node.
      *
      * @param statement the statement where the comments are to be attached.
      * @param leadingComments the comments to attach.
      */
    def attachComments(statement: TStatement, leadingComments: js.Array[LeadingComment]): Unit = js.native
    
    /**
      * Create a literal array expression (e.g. `[expr1, expr2]`).
      *
      * @param elements a collection of the expressions to appear in each array slot.
      */
    def createArrayLiteral(elements: js.Array[TExpression]): TExpression = js.native
    
    /**
      * Create an assignment expression (e.g. `lhsExpr = rhsExpr`).
      *
      * @param target an expression that evaluates to the left side of the assignment.
      * @param value an expression that evaluates to the right side of the assignment.
      */
    def createAssignment(target: TExpression, value: TExpression): TExpression = js.native
    
    /**
      * Create a binary expression (e.g. `lhs && rhs`).
      *
      * @param leftOperand an expression that will appear on the left of the operator.
      * @param operator the binary operator that will be applied.
      * @param rightOperand an expression that will appear on the right of the operator.
      */
    def createBinaryExpression(leftOperand: TExpression, operator: BinaryOperator, rightOperand: TExpression): TExpression = js.native
    
    /**
      * Create a block of statements (e.g. `{ stmt1; stmt2; }`).
      *
      * @param body an array of statements to be wrapped in a block.
      */
    def createBlock(body: js.Array[TStatement]): TStatement = js.native
    
    /**
      * Create an expression that is calling the `callee` with the given `args`.
      *
      * @param callee an expression that evaluates to a function to be called.
      * @param args the arguments to be passed to the call.
      * @param pure whether to mark the call as pure (having no side-effects).
      */
    def createCallExpression(callee: TExpression, args: js.Array[TExpression], pure: Boolean): TExpression = js.native
    
    /**
      * Create a ternary expression (e.g. `testExpr ? trueExpr : falseExpr`).
      *
      * @param condition an expression that will be tested for truthiness.
      * @param thenExpression an expression that is executed if `condition` is truthy.
      * @param elseExpression an expression that is executed if `condition` is falsy.
      */
    def createConditional(condition: TExpression, thenExpression: TExpression, elseExpression: TExpression): TExpression = js.native
    
    /**
      * Create an element access (e.g. `obj[expr]`).
      *
      * @param expression an expression that evaluates to the object to be accessed.
      * @param element an expression that evaluates to the element on the object.
      */
    def createElementAccess(expression: TExpression, element: TExpression): TExpression = js.native
    
    /**
      * Create a statement that is simply executing the given `expression` (e.g. `x = 10;`).
      *
      * @param expression the expression to be converted to a statement.
      */
    def createExpressionStatement(expression: TExpression): TStatement = js.native
    
    /**
      * Create a statement that declares a function (e.g. `function foo(param1, param2) { stmt; }`).
      *
      * @param functionName the name of the function.
      * @param parameters the names of the function's parameters.
      * @param body a statement (or a block of statements) that are the body of the function.
      */
    def createFunctionDeclaration(functionName: String, parameters: js.Array[String], body: TStatement): TStatement = js.native
    
    /**
      * Create an expression that represents a function
      * (e.g. `function foo(param1, param2) { stmt; }`).
      *
      * @param functionName the name of the function.
      * @param parameters the names of the function's parameters.
      * @param body a statement (or a block of statements) that are the body of the function.
      */
    def createFunctionExpression(functionName: String, parameters: js.Array[String], body: TStatement): TExpression = js.native
    def createFunctionExpression(functionName: Null, parameters: js.Array[String], body: TStatement): TExpression = js.native
    
    /**
      * Create an identifier.
      *
      * @param name the name of the identifier.
      */
    def createIdentifier(name: String): TExpression = js.native
    
    /**
      * Create an if statement (e.g. `if (testExpr) { trueStmt; } else { falseStmt; }`).
      *
      * @param condition an expression that will be tested for truthiness.
      * @param thenStatement a statement (or block of statements) that is executed if `condition` is
      *     truthy.
      * @param elseStatement a statement (or block of statements) that is executed if `condition` is
      *     falsy.
      */
    def createIfStatement(condition: TExpression, thenStatement: TStatement): TStatement = js.native
    def createIfStatement(condition: TExpression, thenStatement: TStatement, elseStatement: TStatement): TStatement = js.native
    
    /**
      * Create a simple literal (e.g. `"string"`, `123`, `false`, etc).
      *
      * @param value the value of the literal.
      */
    def createLiteral(): TExpression = js.native
    def createLiteral(value: String): TExpression = js.native
    def createLiteral(value: Boolean): TExpression = js.native
    def createLiteral(value: Double): TExpression = js.native
    
    /**
      * Create an expression that is instantiating the `expression` as a class.
      *
      * @param expression an expression that evaluates to a constructor to be instantiated.
      * @param args the arguments to be passed to the constructor.
      */
    def createNewExpression(expression: TExpression, args: js.Array[TExpression]): TExpression = js.native
    
    /**
      * Create a literal object expression (e.g. `{ prop1: expr1, prop2: expr2 }`).
      *
      * @param properties the properties (key and value) to appear in the object.
      */
    def createObjectLiteral(properties: js.Array[ObjectLiteralProperty[TExpression]]): TExpression = js.native
    
    /**
      * Wrap an expression in parentheses.
      *
      * @param expression the expression to wrap in parentheses.
      */
    def createParenthesizedExpression(expression: TExpression): TExpression = js.native
    
    /**
      * Create a property access (e.g. `obj.prop`).
      *
      * @param expression an expression that evaluates to the object to be accessed.
      * @param propertyName the name of the property to access.
      */
    def createPropertyAccess(expression: TExpression, propertyName: String): TExpression = js.native
    
    /**
      * Create a return statement (e.g `return expr;`).
      *
      * @param expression the expression to be returned.
      */
    def createReturnStatement(): TStatement = js.native
    def createReturnStatement(expression: TExpression): TStatement = js.native
    
    /**
      * Create a tagged template literal string. E.g.
      *
      * ```
      * tag`str1${expr1}str2${expr2}str3`
      * ```
      *
      * @param tag an expression that is applied as a tag handler for this template string.
      * @param template the collection of strings and expressions that constitute an interpolated
      *     template literal.
      */
    def createTaggedTemplate(tag: TExpression, template: TemplateLiteral[TExpression]): TExpression = js.native
    
    /**
      * Create a throw statement (e.g. `throw expr;`).
      *
      * @param expression the expression to be thrown.
      */
    def createThrowStatement(expression: TExpression): TStatement = js.native
    
    /**
      * Create an expression that extracts the type of an expression (e.g. `typeof expr`).
      *
      * @param expression the expression whose type we want.
      */
    def createTypeOfExpression(expression: TExpression): TExpression = js.native
    
    /**
      * Prefix the `operand` with the given `operator` (e.g. `-expr`).
      *
      * @param operator the text of the operator to apply (e.g. `+`, `-` or `!`).
      * @param operand the expression that the operator applies to.
      */
    def createUnaryExpression(operator: UnaryOperator, operand: TExpression): TExpression = js.native
    
    /**
      * Create an expression that declares a new variable, possibly initialized to `initializer`.
      *
      * @param variableName the name of the variable.
      * @param initializer if not `null` then this expression is assigned to the declared variable.
      * @param type whether this variable should be declared as `var`, `let` or `const`.
      */
    def createVariableDeclaration(variableName: String, initializer: TExpression, `type`: VariableDeclarationType): TStatement = js.native
    def createVariableDeclaration(variableName: String, initializer: Null, `type`: VariableDeclarationType): TStatement = js.native
    
    /**
      * Attach a source map range to the given node.
      *
      * @param node the node to which the range should be attached.
      * @param sourceMapRange the range to attach to the node, or null if there is no range to attach.
      * @returns the `node` with the `sourceMapRange` attached.
      */
    def setSourceMapRange[T /* <: TStatement | TExpression */](node: T): T = js.native
    def setSourceMapRange[T /* <: TStatement | TExpression */](node: T, sourceMapRange: SourceMapRange): T = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.angularCompilerCliStrings.AmpersandAmpersand
    - typings.angularCompilerCli.angularCompilerCliStrings.Greaterthansign
    - typings.angularCompilerCli.angularCompilerCliStrings.GreaterthansignEqualssign
    - typings.angularCompilerCli.angularCompilerCliStrings.Ampersand
    - typings.angularCompilerCli.angularCompilerCliStrings.Slash
    - typings.angularCompilerCli.angularCompilerCliStrings.EqualssignEqualssign
    - typings.angularCompilerCli.angularCompilerCliStrings.EqualssignEqualssignEqualssign
    - typings.angularCompilerCli.angularCompilerCliStrings.Lessthansign
    - typings.angularCompilerCli.angularCompilerCliStrings.LessthansignEqualssign
    - typings.angularCompilerCli.angularCompilerCliStrings.`-_`
    - typings.angularCompilerCli.angularCompilerCliStrings.Percentsign
    - typings.angularCompilerCli.angularCompilerCliStrings.Asterisk
    - typings.angularCompilerCli.angularCompilerCliStrings.ExclamationmarkEqualssign
    - typings.angularCompilerCli.angularCompilerCliStrings.ExclamationmarkEqualssignEqualssign
    - typings.angularCompilerCli.angularCompilerCliStrings.VerticallineVerticalline
    - typings.angularCompilerCli.angularCompilerCliStrings.Plussign
    - typings.angularCompilerCli.angularCompilerCliStrings.QuestionmarkQuestionmark
  */
  trait BinaryOperator extends StObject
  object BinaryOperator {
    
    inline def Ampersand: typings.angularCompilerCli.angularCompilerCliStrings.Ampersand = "&".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.Ampersand]
    
    inline def AmpersandAmpersand: typings.angularCompilerCli.angularCompilerCliStrings.AmpersandAmpersand = "&&".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.AmpersandAmpersand]
    
    inline def Asterisk: typings.angularCompilerCli.angularCompilerCliStrings.Asterisk = "*".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.Asterisk]
    
    inline def EqualssignEqualssign: typings.angularCompilerCli.angularCompilerCliStrings.EqualssignEqualssign = "==".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.EqualssignEqualssign]
    
    inline def EqualssignEqualssignEqualssign: typings.angularCompilerCli.angularCompilerCliStrings.EqualssignEqualssignEqualssign = "===".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.EqualssignEqualssignEqualssign]
    
    inline def ExclamationmarkEqualssign: typings.angularCompilerCli.angularCompilerCliStrings.ExclamationmarkEqualssign = "!=".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.ExclamationmarkEqualssign]
    
    inline def ExclamationmarkEqualssignEqualssign: typings.angularCompilerCli.angularCompilerCliStrings.ExclamationmarkEqualssignEqualssign = "!==".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.ExclamationmarkEqualssignEqualssign]
    
    inline def Greaterthansign: typings.angularCompilerCli.angularCompilerCliStrings.Greaterthansign = ">".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typings.angularCompilerCli.angularCompilerCliStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typings.angularCompilerCli.angularCompilerCliStrings.Lessthansign = "<".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typings.angularCompilerCli.angularCompilerCliStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.LessthansignEqualssign]
    
    inline def Percentsign: typings.angularCompilerCli.angularCompilerCliStrings.Percentsign = "%".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.Percentsign]
    
    inline def Plussign: typings.angularCompilerCli.angularCompilerCliStrings.Plussign = "+".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.Plussign]
    
    inline def QuestionmarkQuestionmark: typings.angularCompilerCli.angularCompilerCliStrings.QuestionmarkQuestionmark = "??".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.QuestionmarkQuestionmark]
    
    inline def Slash: typings.angularCompilerCli.angularCompilerCliStrings.Slash = "/".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.Slash]
    
    inline def VerticallineVerticalline: typings.angularCompilerCli.angularCompilerCliStrings.VerticallineVerticalline = "||".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.VerticallineVerticalline]
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
  }
  
  trait LeadingComment extends StObject {
    
    var multiline: Boolean
    
    var trailingNewline: Boolean
  }
  object LeadingComment {
    
    inline def apply(multiline: Boolean, trailingNewline: Boolean): LeadingComment = {
      val __obj = js.Dynamic.literal(multiline = multiline.asInstanceOf[js.Any], trailingNewline = trailingNewline.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeadingComment]
    }
    
    extension [Self <: LeadingComment](x: Self) {
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setTrailingNewline(value: Boolean): Self = StObject.set(x, "trailingNewline", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjectLiteralProperty[TExpression] extends StObject {
    
    var propertyName: String
    
    /**
      * Whether the `propertyName` should be enclosed in quotes.
      */
    var quoted: Boolean
    
    var value: TExpression
  }
  object ObjectLiteralProperty {
    
    inline def apply[TExpression](propertyName: String, quoted: Boolean, value: TExpression): ObjectLiteralProperty[TExpression] = {
      val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectLiteralProperty[TExpression]]
    }
    
    extension [Self <: ObjectLiteralProperty[?], TExpression](x: Self & ObjectLiteralProperty[TExpression]) {
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TExpression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceMapLocation extends StObject {
    
    /** 0-based column position of the location in the original source file. */
    var column: Double
    
    /** 0-based line index of the location in the original source file. */
    var line: Double
    
    /** 0-based character position of the location in the original source file. */
    var offset: Double
  }
  object SourceMapLocation {
    
    inline def apply(column: Double, line: Double, offset: Double): SourceMapLocation = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapLocation]
    }
    
    extension [Self <: SourceMapLocation](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceMapRange extends StObject {
    
    var content: String
    
    var end: SourceMapLocation
    
    var start: SourceMapLocation
    
    var url: String
  }
  object SourceMapRange {
    
    inline def apply(content: String, end: SourceMapLocation, start: SourceMapLocation, url: String): SourceMapRange = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapRange]
    }
    
    extension [Self <: SourceMapRange](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: SourceMapLocation): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: SourceMapLocation): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateElement extends StObject {
    
    /** The parsed string, with escape codes etc processed. */
    var cooked: String
    
    /** The original location of this piece of the template literal string. */
    var range: SourceMapRange | Null
    
    /** The raw string as it was found in the original source code. */
    var raw: String
  }
  object TemplateElement {
    
    inline def apply(cooked: String, raw: String): TemplateElement = {
      val __obj = js.Dynamic.literal(cooked = cooked.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], range = null)
      __obj.asInstanceOf[TemplateElement]
    }
    
    extension [Self <: TemplateElement](x: Self) {
      
      inline def setCooked(value: String): Self = StObject.set(x, "cooked", value.asInstanceOf[js.Any])
      
      inline def setRange(value: SourceMapRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeNull: Self = StObject.set(x, "range", null)
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateLiteral[TExpression] extends StObject {
    
    /**
      * A collection of the static string pieces of the interpolated template literal string.
      */
    var elements: js.Array[TemplateElement]
    
    /**
      * A collection of the interpolated expressions that are interleaved between the elements.
      */
    var expressions: js.Array[TExpression]
  }
  object TemplateLiteral {
    
    inline def apply[TExpression](elements: js.Array[TemplateElement], expressions: js.Array[TExpression]): TemplateLiteral[TExpression] = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateLiteral[TExpression]]
    }
    
    extension [Self <: TemplateLiteral[?], TExpression](x: Self & TemplateLiteral[TExpression]) {
      
      inline def setElements(value: js.Array[TemplateElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: TemplateElement*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setExpressions(value: js.Array[TExpression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
      
      inline def setExpressionsVarargs(value: TExpression*): Self = StObject.set(x, "expressions", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.angularCompilerCliStrings.Plussign
    - typings.angularCompilerCli.angularCompilerCliStrings.`-_`
    - typings.angularCompilerCli.angularCompilerCliStrings.Exclamationmark
  */
  trait UnaryOperator extends StObject
  object UnaryOperator {
    
    inline def Exclamationmark: typings.angularCompilerCli.angularCompilerCliStrings.Exclamationmark = "!".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.Exclamationmark]
    
    inline def Plussign: typings.angularCompilerCli.angularCompilerCliStrings.Plussign = "+".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.Plussign]
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.angularCompilerCliStrings.const
    - typings.angularCompilerCli.angularCompilerCliStrings.let
    - typings.angularCompilerCli.angularCompilerCliStrings.`var`
  */
  trait VariableDeclarationType extends StObject
  object VariableDeclarationType {
    
    inline def const: typings.angularCompilerCli.angularCompilerCliStrings.const = "const".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.const]
    
    inline def let: typings.angularCompilerCli.angularCompilerCliStrings.let = "let".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.let]
    
    inline def `var`: typings.angularCompilerCli.angularCompilerCliStrings.`var` = "var".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.`var`]
  }
}

package typings.angularCompiler

import typings.angularCompiler.anon.Args
import typings.angularCompiler.anon.Quoted
import typings.angularCompiler.astMod.AST
import typings.angularCompiler.astMod.AbsoluteSourceSpan
import typings.angularCompiler.astMod.FunctionCall
import typings.angularCompiler.astMod.ParseSpan
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ReadVarExpr
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressionConverterMod {
  
  @js.native
  sealed trait BindingForm extends StObject
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "BindingForm")
  @js.native
  object BindingForm extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[BindingForm with Double] = js.native
    
    @js.native
    sealed trait Expression extends BindingForm
    /* 2 */ val Expression: typings.angularCompiler.expressionConverterMod.BindingForm.Expression with Double = js.native
    
    @js.native
    sealed trait General extends BindingForm
    /* 0 */ val General: typings.angularCompiler.expressionConverterMod.BindingForm.General with Double = js.native
    
    @js.native
    sealed trait TrySimple extends BindingForm
    /* 1 */ val TrySimple: typings.angularCompiler.expressionConverterMod.BindingForm.TrySimple with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "BuiltinFunctionCall")
  @js.native
  class BuiltinFunctionCall protected () extends FunctionCall {
    def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, args: js.Array[AST], converter: BuiltinConverter) = this()
    
    @JSName("args")
    var args_BuiltinFunctionCall: js.Array[AST] = js.native
    
    def converter(args: js.Array[Expression]): Expression = js.native
    @JSName("converter")
    var converter_Original: BuiltinConverter = js.native
  }
  
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "ConvertActionBindingResult")
  @js.native
  class ConvertActionBindingResult protected () extends StObject {
    def this(
      /**
      * Render2 compatible statements,
      */
    stmts: js.Array[Statement],
      /**
      * Variable name used with render2 compatible statements.
      */
    allowDefault: ReadVarExpr
    ) = this()
    
    /**
      * Variable name used with render2 compatible statements.
      */
    var allowDefault: ReadVarExpr = js.native
    
    /**
      * Store statements which are render3 compatible.
      */
    var render3Stmts: js.Array[Statement] = js.native
    
    /**
      * Render2 compatible statements,
      */
    var stmts: js.Array[Statement] = js.native
  }
  
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "ConvertPropertyBindingResult")
  @js.native
  class ConvertPropertyBindingResult protected () extends StObject {
    def this(stmts: js.Array[Statement], currValExpr: Expression) = this()
    
    var currValExpr: Expression = js.native
    
    var stmts: js.Array[Statement] = js.native
  }
  
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "EventHandlerVars")
  @js.native
  class EventHandlerVars () extends StObject
  /* static members */
  object EventHandlerVars {
    
    @JSImport("@angular/compiler/src/compiler_util/expression_converter", "EventHandlerVars")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/compiler/src/compiler_util/expression_converter", "EventHandlerVars.event")
    @js.native
    def event: ReadVarExpr = js.native
    @scala.inline
    def event_=(x: ReadVarExpr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("event")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(localResolver: Null, implicitReceiver: Expression, action: AST, bindingId: String): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: js.UndefOr[scala.Nothing],
    baseSourceSpan: js.UndefOr[scala.Nothing],
    implicitReceiverAccesses: js.UndefOr[scala.Nothing],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: js.UndefOr[scala.Nothing],
    baseSourceSpan: js.UndefOr[scala.Nothing],
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: js.UndefOr[scala.Nothing],
    baseSourceSpan: js.UndefOr[scala.Nothing],
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: js.UndefOr[scala.Nothing],
    baseSourceSpan: ParseSourceSpan
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: js.UndefOr[scala.Nothing],
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: js.UndefOr[scala.Nothing],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: js.UndefOr[scala.Nothing],
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: js.UndefOr[scala.Nothing],
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: js.UndefOr[scala.Nothing],
    implicitReceiverAccesses: js.UndefOr[scala.Nothing],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: js.UndefOr[scala.Nothing],
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: js.UndefOr[scala.Nothing],
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: js.UndefOr[scala.Nothing],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(localResolver: LocalResolver, implicitReceiver: Expression, action: AST, bindingId: String): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: js.UndefOr[scala.Nothing],
    baseSourceSpan: js.UndefOr[scala.Nothing],
    implicitReceiverAccesses: js.UndefOr[scala.Nothing],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: js.UndefOr[scala.Nothing],
    baseSourceSpan: js.UndefOr[scala.Nothing],
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: js.UndefOr[scala.Nothing],
    baseSourceSpan: js.UndefOr[scala.Nothing],
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: js.UndefOr[scala.Nothing],
    baseSourceSpan: ParseSourceSpan
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: js.UndefOr[scala.Nothing],
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: js.UndefOr[scala.Nothing],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: js.UndefOr[scala.Nothing],
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: js.UndefOr[scala.Nothing],
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: js.UndefOr[scala.Nothing],
    implicitReceiverAccesses: js.UndefOr[scala.Nothing],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: js.UndefOr[scala.Nothing],
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: js.UndefOr[scala.Nothing],
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: js.UndefOr[scala.Nothing],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertActionBinding")
  @js.native
  def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = js.native
  
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertPropertyBinding")
  @js.native
  def convertPropertyBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm
  ): ConvertPropertyBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertPropertyBinding")
  @js.native
  def convertPropertyBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm,
    interpolationFunction: InterpolationFunction
  ): ConvertPropertyBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertPropertyBinding")
  @js.native
  def convertPropertyBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm
  ): ConvertPropertyBindingResult = js.native
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertPropertyBinding")
  @js.native
  def convertPropertyBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm,
    interpolationFunction: InterpolationFunction
  ): ConvertPropertyBindingResult = js.native
  
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertPropertyBindingBuiltins")
  @js.native
  def convertPropertyBindingBuiltins(converterFactory: BuiltinConverterFactory, ast: AST): AST = js.native
  
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "convertUpdateArguments")
  @js.native
  def convertUpdateArguments(
    localResolver: LocalResolver,
    contextVariableExpression: Expression,
    expressionWithArgumentsToExtract: AST,
    bindingId: String
  ): Args = js.native
  
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "temporaryDeclaration")
  @js.native
  def temporaryDeclaration(bindingId: String, temporaryNumber: Double): Statement = js.native
  
  type BuiltinConverter = js.Function1[/* args */ js.Array[Expression], Expression]
  
  @js.native
  trait BuiltinConverterFactory extends StObject {
    
    def createLiteralArrayConverter(argCount: Double): BuiltinConverter = js.native
    
    def createLiteralMapConverter(keys: js.Array[Quoted]): BuiltinConverter = js.native
    
    def createPipeConverter(name: String, argCount: Double): BuiltinConverter = js.native
  }
  object BuiltinConverterFactory {
    
    @scala.inline
    def apply(
      createLiteralArrayConverter: Double => BuiltinConverter,
      createLiteralMapConverter: js.Array[Quoted] => BuiltinConverter,
      createPipeConverter: (String, Double) => BuiltinConverter
    ): BuiltinConverterFactory = {
      val __obj = js.Dynamic.literal(createLiteralArrayConverter = js.Any.fromFunction1(createLiteralArrayConverter), createLiteralMapConverter = js.Any.fromFunction1(createLiteralMapConverter), createPipeConverter = js.Any.fromFunction2(createPipeConverter))
      __obj.asInstanceOf[BuiltinConverterFactory]
    }
    
    @scala.inline
    implicit class BuiltinConverterFactoryMutableBuilder[Self <: BuiltinConverterFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateLiteralArrayConverter(value: Double => BuiltinConverter): Self = StObject.set(x, "createLiteralArrayConverter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateLiteralMapConverter(value: js.Array[Quoted] => BuiltinConverter): Self = StObject.set(x, "createLiteralMapConverter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreatePipeConverter(value: (String, Double) => BuiltinConverter): Self = StObject.set(x, "createPipeConverter", js.Any.fromFunction2(value))
    }
  }
  
  type InterpolationFunction = js.Function1[/* args */ js.Array[Expression], Expression]
  
  @js.native
  trait LocalResolver extends StObject {
    
    def getLocal(name: String): Expression | Null = js.native
    
    var globals: js.UndefOr[Set[String]] = js.native
    
    def notifyImplicitReceiverUse(): Unit = js.native
  }
  object LocalResolver {
    
    @scala.inline
    def apply(getLocal: String => Expression | Null, notifyImplicitReceiverUse: () => Unit): LocalResolver = {
      val __obj = js.Dynamic.literal(getLocal = js.Any.fromFunction1(getLocal), notifyImplicitReceiverUse = js.Any.fromFunction0(notifyImplicitReceiverUse))
      __obj.asInstanceOf[LocalResolver]
    }
    
    @scala.inline
    implicit class LocalResolverMutableBuilder[Self <: LocalResolver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLocal(value: String => Expression | Null): Self = StObject.set(x, "getLocal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGlobals(value: Set[String]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      @scala.inline
      def setNotifyImplicitReceiverUse(value: () => Unit): Self = StObject.set(x, "notifyImplicitReceiverUse", js.Any.fromFunction0(value))
    }
  }
}

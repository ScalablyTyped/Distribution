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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressionConverterMod {
  
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait BindingForm extends StObject
  @JSImport("@angular/compiler/src/compiler_util/expression_converter", "BindingForm")
  @js.native
  object BindingForm extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[BindingForm & Double] = js.native
    
    @js.native
    sealed trait Expression
      extends StObject
         with BindingForm
    /* 2 */ val Expression: typings.angularCompiler.expressionConverterMod.BindingForm.Expression & Double = js.native
    
    @js.native
    sealed trait General
      extends StObject
         with BindingForm
    /* 0 */ val General: typings.angularCompiler.expressionConverterMod.BindingForm.General & Double = js.native
    
    @js.native
    sealed trait TrySimple
      extends StObject
         with BindingForm
    /* 1 */ val TrySimple: typings.angularCompiler.expressionConverterMod.BindingForm.TrySimple & Double = js.native
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
    inline def event_=(x: ReadVarExpr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("event")(x.asInstanceOf[js.Any])
  }
  
  inline def convertActionBinding(localResolver: Null, implicitReceiver: Expression, action: AST, bindingId: String): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: Unit,
    baseSourceSpan: Unit,
    implicitReceiverAccesses: Unit,
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: Unit,
    baseSourceSpan: Unit,
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: Unit,
    baseSourceSpan: Unit,
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: Unit,
    baseSourceSpan: ParseSourceSpan
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: Unit,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Unit,
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: Unit,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: Unit,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: Unit,
    implicitReceiverAccesses: Unit,
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: Unit,
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: Unit,
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Unit,
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(localResolver: LocalResolver, implicitReceiver: Expression, action: AST, bindingId: String): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: Unit,
    baseSourceSpan: Unit,
    implicitReceiverAccesses: Unit,
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: Unit,
    baseSourceSpan: Unit,
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: Unit,
    baseSourceSpan: Unit,
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: Unit,
    baseSourceSpan: ParseSourceSpan
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: Unit,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Unit,
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: Unit,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: Unit,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: Unit,
    implicitReceiverAccesses: Unit,
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: Unit,
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: Unit,
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Unit,
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  inline def convertActionBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    action: AST,
    bindingId: String,
    interpolationFunction: InterpolationFunction,
    baseSourceSpan: ParseSourceSpan,
    implicitReceiverAccesses: Set[String],
    globals: Set[String]
  ): ConvertActionBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertActionBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], action.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any], baseSourceSpan.asInstanceOf[js.Any], implicitReceiverAccesses.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[ConvertActionBindingResult]
  
  inline def convertPropertyBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm
  ): ConvertPropertyBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPropertyBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], expressionWithoutBuiltins.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[ConvertPropertyBindingResult]
  inline def convertPropertyBinding(
    localResolver: Null,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm,
    interpolationFunction: InterpolationFunction
  ): ConvertPropertyBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPropertyBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], expressionWithoutBuiltins.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], form.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any])).asInstanceOf[ConvertPropertyBindingResult]
  inline def convertPropertyBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm
  ): ConvertPropertyBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPropertyBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], expressionWithoutBuiltins.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[ConvertPropertyBindingResult]
  inline def convertPropertyBinding(
    localResolver: LocalResolver,
    implicitReceiver: Expression,
    expressionWithoutBuiltins: AST,
    bindingId: String,
    form: BindingForm,
    interpolationFunction: InterpolationFunction
  ): ConvertPropertyBindingResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPropertyBinding")(localResolver.asInstanceOf[js.Any], implicitReceiver.asInstanceOf[js.Any], expressionWithoutBuiltins.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any], form.asInstanceOf[js.Any], interpolationFunction.asInstanceOf[js.Any])).asInstanceOf[ConvertPropertyBindingResult]
  
  inline def convertPropertyBindingBuiltins(converterFactory: BuiltinConverterFactory, ast: AST): AST = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPropertyBindingBuiltins")(converterFactory.asInstanceOf[js.Any], ast.asInstanceOf[js.Any])).asInstanceOf[AST]
  
  inline def convertUpdateArguments(
    localResolver: LocalResolver,
    contextVariableExpression: Expression,
    expressionWithArgumentsToExtract: AST,
    bindingId: String
  ): Args = (^.asInstanceOf[js.Dynamic].applyDynamic("convertUpdateArguments")(localResolver.asInstanceOf[js.Any], contextVariableExpression.asInstanceOf[js.Any], expressionWithArgumentsToExtract.asInstanceOf[js.Any], bindingId.asInstanceOf[js.Any])).asInstanceOf[Args]
  
  inline def temporaryDeclaration(bindingId: String, temporaryNumber: Double): Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryDeclaration")(bindingId.asInstanceOf[js.Any], temporaryNumber.asInstanceOf[js.Any])).asInstanceOf[Statement]
  
  type BuiltinConverter = js.Function1[/* args */ js.Array[Expression], Expression]
  
  trait BuiltinConverterFactory extends StObject {
    
    def createLiteralArrayConverter(argCount: Double): BuiltinConverter
    
    def createLiteralMapConverter(keys: js.Array[Quoted]): BuiltinConverter
    
    def createPipeConverter(name: String, argCount: Double): BuiltinConverter
  }
  object BuiltinConverterFactory {
    
    inline def apply(
      createLiteralArrayConverter: Double => BuiltinConverter,
      createLiteralMapConverter: js.Array[Quoted] => BuiltinConverter,
      createPipeConverter: (String, Double) => BuiltinConverter
    ): BuiltinConverterFactory = {
      val __obj = js.Dynamic.literal(createLiteralArrayConverter = js.Any.fromFunction1(createLiteralArrayConverter), createLiteralMapConverter = js.Any.fromFunction1(createLiteralMapConverter), createPipeConverter = js.Any.fromFunction2(createPipeConverter))
      __obj.asInstanceOf[BuiltinConverterFactory]
    }
    
    extension [Self <: BuiltinConverterFactory](x: Self) {
      
      inline def setCreateLiteralArrayConverter(value: Double => BuiltinConverter): Self = StObject.set(x, "createLiteralArrayConverter", js.Any.fromFunction1(value))
      
      inline def setCreateLiteralMapConverter(value: js.Array[Quoted] => BuiltinConverter): Self = StObject.set(x, "createLiteralMapConverter", js.Any.fromFunction1(value))
      
      inline def setCreatePipeConverter(value: (String, Double) => BuiltinConverter): Self = StObject.set(x, "createPipeConverter", js.Any.fromFunction2(value))
    }
  }
  
  type InterpolationFunction = js.Function1[/* args */ js.Array[Expression], Expression]
  
  trait LocalResolver extends StObject {
    
    def getLocal(name: String): Expression | Null
    
    var globals: js.UndefOr[Set[String]] = js.undefined
    
    def notifyImplicitReceiverUse(): Unit
  }
  object LocalResolver {
    
    inline def apply(getLocal: String => Expression | Null, notifyImplicitReceiverUse: () => Unit): LocalResolver = {
      val __obj = js.Dynamic.literal(getLocal = js.Any.fromFunction1(getLocal), notifyImplicitReceiverUse = js.Any.fromFunction0(notifyImplicitReceiverUse))
      __obj.asInstanceOf[LocalResolver]
    }
    
    extension [Self <: LocalResolver](x: Self) {
      
      inline def setGetLocal(value: String => Expression | Null): Self = StObject.set(x, "getLocal", js.Any.fromFunction1(value))
      
      inline def setGlobals(value: Set[String]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      inline def setNotifyImplicitReceiverUse(value: () => Unit): Self = StObject.set(x, "notifyImplicitReceiverUse", js.Any.fromFunction0(value))
    }
  }
}

package typings.angularCompiler

import typings.angularCompiler.anon.HasOverrideFlag
import typings.angularCompiler.astMod.AST
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExternalReference
import typings.angularCompiler.r3AstMod.BoundAttribute
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typings.angularCompiler.templateMod.ValueConverter
import typings.angularCompiler.viewUtilMod.DefinitionMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylingBuilderMod {
  
  @JSImport("@angular/compiler/src/render3/view/styling_builder", "MIN_STYLING_BINDING_SLOTS_REQUIRED")
  @js.native
  val MIN_STYLING_BINDING_SLOTS_REQUIRED: /* 2 */ Double = js.native
  
  @JSImport("@angular/compiler/src/render3/view/styling_builder", "StylingBuilder")
  @js.native
  class StylingBuilder () extends StObject {
    def this(_directiveExpr: Expression) = this()
    
    var _buildClassInputs: js.Any = js.native
    
    var _buildMapBasedInstruction: js.Any = js.native
    
    var _buildSingleInputs: js.Any = js.native
    
    var _buildStyleInputs: js.Any = js.native
    
    var _checkForPipes: js.Any = js.native
    
    /** the input for [class] (if it exists) */
    var _classMapInput: js.Any = js.native
    
    /**
      * Represents the location of each class binding in the template
      * (e.g. `<div [class.big]="b" [class.hidden]="h">` implies
      * that `big=0` and `hidden=1`)
      */
    var _classesIndex: js.Any = js.native
    
    var _directiveExpr: js.Any = js.native
    
    var _firstStylingInput: js.Any = js.native
    
    /** Whether or not there are any static styling values present */
    var _hasInitialValues: js.Any = js.native
    
    var _initialClassValues: js.Any = js.native
    
    var _initialStyleValues: js.Any = js.native
    
    var _lastStylingInput: js.Any = js.native
    
    /** an array of each [class.name] input */
    var _singleClassInputs: js.Any = js.native
    
    /** an array of each [style.prop] input */
    var _singleStyleInputs: js.Any = js.native
    
    /** the input for [style] (if it exists) */
    var _styleMapInput: js.Any = js.native
    
    /**
      * Represents the location of each style binding in the template
      * (e.g. `<div [style.width]="w" [style.height]="h">` implies
      * that `width=0` and `height=1`)
      */
    var _stylesIndex: js.Any = js.native
    
    /**
      * Builds an instruction with all the expressions and parameters for `elementHostAttrs`.
      *
      * The instruction generation code below is used for producing the AOT statement code which is
      * responsible for registering initial styles (within a directive hostBindings' creation block),
      * as well as any of the provided attribute values, to the directive host element.
      */
    def assignHostAttrs(attrs: js.Array[Expression], definitionMap: DefinitionMap): Unit = js.native
    
    /**
      * Builds an instruction with all the expressions and parameters for `classMap`.
      *
      * The instruction data will contain all expressions for `classMap` to function
      * which includes the `[class]` expression params.
      */
    def buildClassMapInstruction(valueConverter: ValueConverter): StylingInstruction | Null = js.native
    
    /**
      * Builds an instruction with all the expressions and parameters for `styleMap`.
      *
      * The instruction data will contain all expressions for `styleMap` to function
      * which includes the `[style]` expression params.
      */
    def buildStyleMapInstruction(valueConverter: ValueConverter): StylingInstruction | Null = js.native
    
    /**
      * Constructs all instructions which contain the expressions that will be placed
      * into the update block of a template function or a directive hostBindings function.
      */
    def buildUpdateLevelInstructions(valueConverter: ValueConverter): js.Array[StylingInstruction] = js.native
    
    /**
      *  Whether or not there are any styling bindings present
      *  (i.e. `[style]`, `[class]`, `[style.prop]` or `[class.name]`)
      */
    var hasBindings: Boolean = js.native
    
    var hasBindingsWithPipes: Boolean = js.native
    
    /**
      * Appends all styling-related expressions to the provided attrs array.
      *
      * @param attrs an existing array where each of the styling expressions
      * will be inserted into.
      */
    def populateInitialStylingAttrs(attrs: js.Array[Expression]): Unit = js.native
    
    /**
      * Registers a given input to the styling builder to be later used when producing AOT code.
      *
      * The code below will only accept the input if it is somehow tied to styling (whether it be
      * style/class bindings or static style/class attributes).
      */
    def registerBoundInput(input: BoundAttribute): Boolean = js.native
    
    /**
      * Registers the element's static class string value to the builder.
      *
      * @param value the className string (e.g. `disabled gold zoom`)
      */
    def registerClassAttr(value: String): Unit = js.native
    
    def registerClassInput(name: String, isMapBased: Boolean, value: AST, sourceSpan: ParseSourceSpan): BoundStylingEntry | Null = js.native
    
    def registerInputBasedOnName(name: String, expression: AST, sourceSpan: ParseSourceSpan): BoundStylingEntry | Null = js.native
    
    /**
      * Registers the element's static style string value to the builder.
      *
      * @param value the style string (e.g. `width:100px; height:200px;`)
      */
    def registerStyleAttr(value: String): Unit = js.native
    
    def registerStyleInput(name: String, isMapBased: Boolean, value: AST, sourceSpan: ParseSourceSpan): BoundStylingEntry | Null = js.native
    def registerStyleInput(name: String, isMapBased: Boolean, value: AST, sourceSpan: ParseSourceSpan, suffix: String): BoundStylingEntry | Null = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/view/styling_builder", "parseProperty")
  @js.native
  def parseProperty(name: String): HasOverrideFlag = js.native
  
  /**
    * An internal record of the input data for a styling binding
    */
  @js.native
  trait BoundStylingEntry extends StObject {
    
    var hasOverrideFlag: Boolean = js.native
    
    var name: String | Null = js.native
    
    var sourceSpan: ParseSourceSpan = js.native
    
    var suffix: String | Null = js.native
    
    var value: AST = js.native
  }
  object BoundStylingEntry {
    
    @scala.inline
    def apply(hasOverrideFlag: Boolean, sourceSpan: ParseSourceSpan, value: AST): BoundStylingEntry = {
      val __obj = js.Dynamic.literal(hasOverrideFlag = hasOverrideFlag.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundStylingEntry]
    }
    
    @scala.inline
    implicit class BoundStylingEntryMutableBuilder[Self <: BoundStylingEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasOverrideFlag(value: Boolean): Self = StObject.set(x, "hasOverrideFlag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "sourceSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      @scala.inline
      def setValue(value: AST): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StylingInstruction extends StObject {
    
    /** Calls to individual styling instructions. Used when chaining calls to the same instruction. */
    var calls: js.Array[StylingInstructionCall] = js.native
    
    var reference: ExternalReference = js.native
  }
  object StylingInstruction {
    
    @scala.inline
    def apply(calls: js.Array[StylingInstructionCall], reference: ExternalReference): StylingInstruction = {
      val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylingInstruction]
    }
    
    @scala.inline
    implicit class StylingInstructionMutableBuilder[Self <: StylingInstruction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalls(value: js.Array[StylingInstructionCall]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallsVarargs(value: StylingInstructionCall*): Self = StObject.set(x, "calls", js.Array(value :_*))
      
      @scala.inline
      def setReference(value: ExternalReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StylingInstructionCall extends StObject {
    
    var allocateBindingSlots: Double = js.native
    
    def params(convertFn: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]]): js.Array[Expression] = js.native
    
    var sourceSpan: ParseSourceSpan | Null = js.native
    
    var supportsInterpolation: Boolean = js.native
  }
  object StylingInstructionCall {
    
    @scala.inline
    def apply(
      allocateBindingSlots: Double,
      params: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]] => js.Array[Expression],
      supportsInterpolation: Boolean
    ): StylingInstructionCall = {
      val __obj = js.Dynamic.literal(allocateBindingSlots = allocateBindingSlots.asInstanceOf[js.Any], params = js.Any.fromFunction1(params), supportsInterpolation = supportsInterpolation.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylingInstructionCall]
    }
    
    @scala.inline
    implicit class StylingInstructionCallMutableBuilder[Self <: StylingInstructionCall] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocateBindingSlots(value: Double): Self = StObject.set(x, "allocateBindingSlots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]] => js.Array[Expression]): Self = StObject.set(x, "params", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "sourceSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceSpanNull: Self = StObject.set(x, "sourceSpan", null)
      
      @scala.inline
      def setSupportsInterpolation(value: Boolean): Self = StObject.set(x, "supportsInterpolation", value.asInstanceOf[js.Any])
    }
  }
}

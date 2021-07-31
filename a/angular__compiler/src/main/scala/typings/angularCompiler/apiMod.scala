package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.angularCompilerStrings.invalid
import typings.angularCompiler.anon.ClassAttr
import typings.angularCompiler.anon.ExpressionSelector
import typings.angularCompiler.anon.NgContentSelectors
import typings.angularCompiler.anon.UsesOnChanges
import typings.angularCompiler.coreMod.ChangeDetectionStrategy
import typings.angularCompiler.coreMod.ViewEncapsulation
import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Type
import typings.angularCompiler.r3FactoryMod.R3DependencyMetadata
import typings.angularCompiler.render3UtilMod.R3Reference
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  trait R3ComponentDef extends StObject {
    
    var expression: Expression
    
    var `type`: Type
  }
  object R3ComponentDef {
    
    @scala.inline
    def apply(expression: Expression, `type`: Type): R3ComponentDef = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3ComponentDef]
    }
    
    @scala.inline
    implicit class R3ComponentDefMutableBuilder[Self <: R3ComponentDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait R3ComponentMetadata
    extends StObject
       with R3DirectiveMetadata {
    
    /**
      * A collection of animation triggers that will be used in the component template.
      */
    var animations: Expression | Null
    
    /**
      * Strategy used for detecting changes in the component.
      */
    var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
    
    /**
      * A list of directive selectors and an expression referencing the directive type which are in the
      * scope of the compilation.
      */
    var directives: js.Array[ExpressionSelector]
    
    /**
      * An encapsulation policy for the template and CSS styles. One of:
      * - `ViewEncapsulation.Emulated`: Use shimmed CSS that emulates the native behavior.
      * - `ViewEncapsulation.None`: Use global CSS without any encapsulation.
      * - `ViewEncapsulation.ShadowDom`: Use the latest ShadowDOM API to natively encapsulate styles
      * into a shadow root.
      */
    var encapsulation: ViewEncapsulation
    
    /**
      * Whether translation variable name should contain external message id
      * (used by Closure Compiler's output of `goog.getMsg` for transition period).
      */
    var i18nUseExternalIds: Boolean
    
    /**
      * Overrides the default interpolation start and end delimiters ({{ and }}).
      */
    var interpolation: InterpolationConfig
    
    /**
      * A map of pipe names to an expression referencing the pipe type which are in the scope of the
      * compilation.
      */
    var pipes: Map[String, Expression]
    
    /**
      * Path to the .ts file in which this template's generated code will be included, relative to
      * the compilation root. This will be used to generate identifiers that need to be globally
      * unique in certain contexts (such as g3).
      */
    var relativeContextFilePath: String
    
    /**
      * A collection of styling data that will be applied and scoped to the component.
      */
    var styles: js.Array[String]
    
    /**
      * Information about the component's template.
      */
    var template: NgContentSelectors
    
    /**
      * The list of view providers defined in the component.
      */
    var viewProviders: Expression | Null
    
    /**
      * Whether to wrap the 'directives' and/or `pipes` array, if one is generated, in a closure.
      *
      * This is done when the directives or pipes contain forward references.
      */
    var wrapDirectivesAndPipesInClosure: Boolean
  }
  object R3ComponentMetadata {
    
    @scala.inline
    def apply(
      directives: js.Array[ExpressionSelector],
      encapsulation: ViewEncapsulation,
      fullInheritance: Boolean,
      host: R3HostMetadata,
      i18nUseExternalIds: Boolean,
      inputs: StringDictionary[String | (js.Tuple2[String, String])],
      internalType: Expression,
      interpolation: InterpolationConfig,
      lifecycle: UsesOnChanges,
      name: String,
      outputs: StringDictionary[String],
      pipes: Map[String, Expression],
      queries: js.Array[R3QueryMetadata],
      relativeContextFilePath: String,
      styles: js.Array[String],
      template: NgContentSelectors,
      `type`: R3Reference,
      typeArgumentCount: Double,
      typeSourceSpan: ParseSourceSpan,
      usesInheritance: Boolean,
      viewQueries: js.Array[R3QueryMetadata],
      wrapDirectivesAndPipesInClosure: Boolean
    ): R3ComponentMetadata = {
      val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], fullInheritance = fullInheritance.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], i18nUseExternalIds = i18nUseExternalIds.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], interpolation = interpolation.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], relativeContextFilePath = relativeContextFilePath.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any], wrapDirectivesAndPipesInClosure = wrapDirectivesAndPipesInClosure.asInstanceOf[js.Any], animations = null, deps = null, exportAs = null, providers = null, selector = null, viewProviders = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3ComponentMetadata]
    }
    
    @scala.inline
    implicit class R3ComponentMetadataMutableBuilder[Self <: R3ComponentMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimations(value: Expression): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationsNull: Self = StObject.set(x, "animations", null)
      
      @scala.inline
      def setChangeDetection(value: ChangeDetectionStrategy): Self = StObject.set(x, "changeDetection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeDetectionUndefined: Self = StObject.set(x, "changeDetection", js.undefined)
      
      @scala.inline
      def setDirectives(value: js.Array[ExpressionSelector]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectivesVarargs(value: ExpressionSelector*): Self = StObject.set(x, "directives", js.Array(value :_*))
      
      @scala.inline
      def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI18nUseExternalIds(value: Boolean): Self = StObject.set(x, "i18nUseExternalIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolation(value: InterpolationConfig): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipes(value: Map[String, Expression]): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeContextFilePath(value: String): Self = StObject.set(x, "relativeContextFilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def setTemplate(value: NgContentSelectors): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewProviders(value: Expression): Self = StObject.set(x, "viewProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewProvidersNull: Self = StObject.set(x, "viewProviders", null)
      
      @scala.inline
      def setWrapDirectivesAndPipesInClosure(value: Boolean): Self = StObject.set(x, "wrapDirectivesAndPipesInClosure", value.asInstanceOf[js.Any])
    }
  }
  
  trait R3DirectiveDef extends StObject {
    
    var expression: Expression
    
    var `type`: Type
  }
  object R3DirectiveDef {
    
    @scala.inline
    def apply(expression: Expression, `type`: Type): R3DirectiveDef = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3DirectiveDef]
    }
    
    @scala.inline
    implicit class R3DirectiveDefMutableBuilder[Self <: R3DirectiveDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait R3DirectiveMetadata extends StObject {
    
    /**
      * Dependencies of the directive's constructor.
      */
    var deps: js.Array[R3DependencyMetadata] | invalid | Null
    
    /**
      * Reference name under which to export the directive's type in a template,
      * if any.
      */
    var exportAs: js.Array[String] | Null
    
    /**
      * Whether or not the component or directive inherits its entire decorator from its base class.
      */
    var fullInheritance: Boolean
    
    /**
      * Mappings indicating how the directive interacts with its host element (host bindings,
      * listeners, etc).
      */
    var host: R3HostMetadata
    
    /**
      * A mapping of input field names to the property names.
      */
    var inputs: StringDictionary[String | (js.Tuple2[String, String])]
    
    /**
      * An expression representing a reference to the directive being compiled, intended for use within
      * a class definition itself.
      *
      * This can differ from the outer `type` if the class is being compiled by ngcc and is inside
      * an IIFE structure that uses a different name internally.
      */
    var internalType: Expression
    
    /**
      * Information about usage of specific lifecycle events which require special treatment in the
      * code generator.
      */
    var lifecycle: UsesOnChanges
    
    /**
      * Name of the directive type.
      */
    var name: String
    
    /**
      * A mapping of output field names to the property names.
      */
    var outputs: StringDictionary[String]
    
    /**
      * The list of providers defined in the directive.
      */
    var providers: Expression | Null
    
    /**
      * Information about the content queries made by the directive.
      */
    var queries: js.Array[R3QueryMetadata]
    
    /**
      * Unparsed selector of the directive, or `null` if there was no selector.
      */
    var selector: String | Null
    
    /**
      * An expression representing a reference to the directive itself.
      */
    var `type`: R3Reference
    
    /**
      * Number of generic type parameters of the type itself.
      */
    var typeArgumentCount: Double
    
    /**
      * A source span for the directive type.
      */
    var typeSourceSpan: ParseSourceSpan
    
    /**
      * Whether or not the component or directive inherits from another class
      */
    var usesInheritance: Boolean
    
    /**
      * Information about the view queries made by the directive.
      */
    var viewQueries: js.Array[R3QueryMetadata]
  }
  object R3DirectiveMetadata {
    
    @scala.inline
    def apply(
      fullInheritance: Boolean,
      host: R3HostMetadata,
      inputs: StringDictionary[String | (js.Tuple2[String, String])],
      internalType: Expression,
      lifecycle: UsesOnChanges,
      name: String,
      outputs: StringDictionary[String],
      queries: js.Array[R3QueryMetadata],
      `type`: R3Reference,
      typeArgumentCount: Double,
      typeSourceSpan: ParseSourceSpan,
      usesInheritance: Boolean,
      viewQueries: js.Array[R3QueryMetadata]
    ): R3DirectiveMetadata = {
      val __obj = js.Dynamic.literal(fullInheritance = fullInheritance.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any], deps = null, exportAs = null, providers = null, selector = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3DirectiveMetadata]
    }
    
    @scala.inline
    implicit class R3DirectiveMetadataMutableBuilder[Self <: R3DirectiveMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeps(value: js.Array[R3DependencyMetadata] | invalid): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepsNull: Self = StObject.set(x, "deps", null)
      
      @scala.inline
      def setDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value :_*))
      
      @scala.inline
      def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportAsNull: Self = StObject.set(x, "exportAs", null)
      
      @scala.inline
      def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value :_*))
      
      @scala.inline
      def setFullInheritance(value: Boolean): Self = StObject.set(x, "fullInheritance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: R3HostMetadata): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputs(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalType(value: Expression): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifecycle(value: UsesOnChanges): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputs(value: StringDictionary[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviders(value: Expression): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvidersNull: Self = StObject.set(x, "providers", null)
      
      @scala.inline
      def setQueries(value: js.Array[R3QueryMetadata]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueriesVarargs(value: R3QueryMetadata*): Self = StObject.set(x, "queries", js.Array(value :_*))
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorNull: Self = StObject.set(x, "selector", null)
      
      @scala.inline
      def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "typeSourceSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsesInheritance(value: Boolean): Self = StObject.set(x, "usesInheritance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewQueries(value: js.Array[R3QueryMetadata]): Self = StObject.set(x, "viewQueries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewQueriesVarargs(value: R3QueryMetadata*): Self = StObject.set(x, "viewQueries", js.Array(value :_*))
    }
  }
  
  trait R3HostMetadata extends StObject {
    
    /**
      * A mapping of attribute binding keys to `o.Expression`s.
      */
    var attributes: StringDictionary[Expression]
    
    /**
      * A mapping of event binding keys to unparsed expressions.
      */
    var listeners: StringDictionary[String]
    
    /**
      * A mapping of property binding keys to unparsed expressions.
      */
    var properties: StringDictionary[String]
    
    var specialAttributes: ClassAttr
  }
  object R3HostMetadata {
    
    @scala.inline
    def apply(
      attributes: StringDictionary[Expression],
      listeners: StringDictionary[String],
      properties: StringDictionary[String],
      specialAttributes: ClassAttr
    ): R3HostMetadata = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], specialAttributes = specialAttributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3HostMetadata]
    }
    
    @scala.inline
    implicit class R3HostMetadataMutableBuilder[Self <: R3HostMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[Expression]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListeners(value: StringDictionary[String]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecialAttributes(value: ClassAttr): Self = StObject.set(x, "specialAttributes", value.asInstanceOf[js.Any])
    }
  }
  
  trait R3QueryMetadata extends StObject {
    
    /**
      * Whether to include only direct children or all descendants.
      */
    var descendants: Boolean
    
    /**
      * Whether to read only the first matching result, or an array of results.
      */
    var first: Boolean
    
    /**
      * Either an expression representing a type or `InjectionToken` for the query
      * predicate, or a set of string selectors.
      */
    var predicate: Expression | js.Array[String]
    
    /**
      * Name of the property on the class to update with query results.
      */
    var propertyName: String
    
    /**
      * An expression representing a type to read from each matched node, or null if the default value
      * for a given node is to be returned.
      */
    var read: Expression | Null
    
    /**
      * Whether or not this query should collect only static results.
      *
      * If static is true, the query's results will be set on the component after nodes are created,
      * but before change detection runs. This means that any results that relied upon change detection
      * to run (e.g. results inside *ngIf or *ngFor views) will not be collected. Query results are
      * available in the ngOnInit hook.
      *
      * If static is false, the query's results will be set on the component after change detection
      * runs. This means that the query results can contain nodes inside *ngIf or *ngFor views, but
      * the results will not be available in the ngOnInit hook (only in the ngAfterContentInit for
      * content hooks and ngAfterViewInit for view hooks).
      */
    var static: Boolean
  }
  object R3QueryMetadata {
    
    @scala.inline
    def apply(
      descendants: Boolean,
      first: Boolean,
      predicate: Expression | js.Array[String],
      propertyName: String,
      static: Boolean
    ): R3QueryMetadata = {
      val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], read = null)
      __obj.asInstanceOf[R3QueryMetadata]
    }
    
    @scala.inline
    implicit class R3QueryMetadataMutableBuilder[Self <: R3QueryMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescendants(value: Boolean): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicate(value: Expression | js.Array[String]): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicateVarargs(value: String*): Self = StObject.set(x, "predicate", js.Array(value :_*))
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: Expression): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadNull: Self = StObject.set(x, "read", null)
      
      @scala.inline
      def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    }
  }
}

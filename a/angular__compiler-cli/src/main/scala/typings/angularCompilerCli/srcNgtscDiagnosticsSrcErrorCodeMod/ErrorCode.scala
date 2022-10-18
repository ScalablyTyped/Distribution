package typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends StObject
@JSImport("@angular/compiler-cli/src/ngtsc/diagnostics/src/error_code", "ErrorCode")
@js.native
object ErrorCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorCode & Double] = js.native
  
  /**
    * Raised when a type in the `imports` of a component is a directive or pipe, but is not
    * standalone.
    */
  @js.native
  sealed trait COMPONENT_IMPORT_NOT_STANDALONE
    extends StObject
       with ErrorCode
  /* 2011 */ val COMPONENT_IMPORT_NOT_STANDALONE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.COMPONENT_IMPORT_NOT_STANDALONE & Double = js.native
  
  /**
    * Raised when a component uses `ShadowDom` view encapsulation, but its selector
    * does not match the shadow DOM tag name requirements.
    */
  @js.native
  sealed trait COMPONENT_INVALID_SHADOW_DOM_SELECTOR
    extends StObject
       with ErrorCode
  /* 2009 */ val COMPONENT_INVALID_SHADOW_DOM_SELECTOR: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.COMPONENT_INVALID_SHADOW_DOM_SELECTOR & Double = js.native
  
  @js.native
  sealed trait COMPONENT_MISSING_TEMPLATE
    extends StObject
       with ErrorCode
  /* 2001 */ val COMPONENT_MISSING_TEMPLATE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.COMPONENT_MISSING_TEMPLATE & Double = js.native
  
  /**
    * Raised when a component has `imports` but is not marked as `standalone: true`.
    */
  @js.native
  sealed trait COMPONENT_NOT_STANDALONE
    extends StObject
       with ErrorCode
  /* 2010 */ val COMPONENT_NOT_STANDALONE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.COMPONENT_NOT_STANDALONE & Double = js.native
  
  /**
    * Raised when an component cannot resolve an external resource, such as a template or a style
    * sheet.
    */
  @js.native
  sealed trait COMPONENT_RESOURCE_NOT_FOUND
    extends StObject
       with ErrorCode
  /* 2008 */ val COMPONENT_RESOURCE_NOT_FOUND: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.COMPONENT_RESOURCE_NOT_FOUND & Double = js.native
  
  /**
    * Raised when a type in the `imports` of a component is not a directive, pipe, or NgModule.
    */
  @js.native
  sealed trait COMPONENT_UNKNOWN_IMPORT
    extends StObject
       with ErrorCode
  /* 2012 */ val COMPONENT_UNKNOWN_IMPORT: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.COMPONENT_UNKNOWN_IMPORT & Double = js.native
  
  @js.native
  sealed trait CONFIG_EXTENDED_DIAGNOSTICS_IMPLIES_STRICT_TEMPLATES
    extends StObject
       with ErrorCode
  /* 4003 */ val CONFIG_EXTENDED_DIAGNOSTICS_IMPLIES_STRICT_TEMPLATES: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.CONFIG_EXTENDED_DIAGNOSTICS_IMPLIES_STRICT_TEMPLATES & Double = js.native
  
  @js.native
  sealed trait CONFIG_EXTENDED_DIAGNOSTICS_UNKNOWN_CATEGORY_LABEL
    extends StObject
       with ErrorCode
  /* 4004 */ val CONFIG_EXTENDED_DIAGNOSTICS_UNKNOWN_CATEGORY_LABEL: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.CONFIG_EXTENDED_DIAGNOSTICS_UNKNOWN_CATEGORY_LABEL & Double = js.native
  
  @js.native
  sealed trait CONFIG_EXTENDED_DIAGNOSTICS_UNKNOWN_CHECK
    extends StObject
       with ErrorCode
  /* 4005 */ val CONFIG_EXTENDED_DIAGNOSTICS_UNKNOWN_CHECK: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.CONFIG_EXTENDED_DIAGNOSTICS_UNKNOWN_CHECK & Double = js.native
  
  @js.native
  sealed trait CONFIG_FLAT_MODULE_NO_INDEX
    extends StObject
       with ErrorCode
  /* 4001 */ val CONFIG_FLAT_MODULE_NO_INDEX: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.CONFIG_FLAT_MODULE_NO_INDEX & Double = js.native
  
  @js.native
  sealed trait CONFIG_STRICT_TEMPLATES_IMPLIES_FULL_TEMPLATE_TYPECHECK
    extends StObject
       with ErrorCode
  /* 4002 */ val CONFIG_STRICT_TEMPLATES_IMPLIES_FULL_TEMPLATE_TYPECHECK: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.CONFIG_STRICT_TEMPLATES_IMPLIES_FULL_TEMPLATE_TYPECHECK & Double = js.native
  
  @js.native
  sealed trait DECORATOR_ARG_NOT_LITERAL
    extends StObject
       with ErrorCode
  /* 1001 */ val DECORATOR_ARG_NOT_LITERAL: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DECORATOR_ARG_NOT_LITERAL & Double = js.native
  
  @js.native
  sealed trait DECORATOR_ARITY_WRONG
    extends StObject
       with ErrorCode
  /* 1002 */ val DECORATOR_ARITY_WRONG: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DECORATOR_ARITY_WRONG & Double = js.native
  
  /**
    * This error code indicates that there are incompatible decorators on a type or a class field.
    */
  @js.native
  sealed trait DECORATOR_COLLISION
    extends StObject
       with ErrorCode
  /* 1006 */ val DECORATOR_COLLISION: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DECORATOR_COLLISION & Double = js.native
  
  @js.native
  sealed trait DECORATOR_NOT_CALLED
    extends StObject
       with ErrorCode
  /* 1003 */ val DECORATOR_NOT_CALLED: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DECORATOR_NOT_CALLED & Double = js.native
  
  @js.native
  sealed trait DECORATOR_UNEXPECTED
    extends StObject
       with ErrorCode
  /* 1005 */ val DECORATOR_UNEXPECTED: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DECORATOR_UNEXPECTED & Double = js.native
  
  /**
    * Raised when a Directive inherits its constructor from a base class without an Angular
    * decorator.
    */
  @js.native
  sealed trait DIRECTIVE_INHERITS_UNDECORATED_CTOR
    extends StObject
       with ErrorCode
  /* 2006 */ val DIRECTIVE_INHERITS_UNDECORATED_CTOR: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DIRECTIVE_INHERITS_UNDECORATED_CTOR & Double = js.native
  
  @js.native
  sealed trait DIRECTIVE_MISSING_SELECTOR
    extends StObject
       with ErrorCode
  /* 2004 */ val DIRECTIVE_MISSING_SELECTOR: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DIRECTIVE_MISSING_SELECTOR & Double = js.native
  
  /**
    * A template variable was declared twice. For example:
    *
    * ```html
    * <div *ngFor="let i of items; let i = index">
    * </div>
    * ```
    */
  @js.native
  sealed trait DUPLICATE_VARIABLE_DECLARATION
    extends StObject
       with ErrorCode
  /* 8006 */ val DUPLICATE_VARIABLE_DECLARATION: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.DUPLICATE_VARIABLE_DECLARATION & Double = js.native
  
  /**
    * Raised when a host expression has a parse error, such as a host listener or host binding
    * expression containing a pipe.
    */
  @js.native
  sealed trait HOST_BINDING_PARSE_ERROR
    extends StObject
       with ErrorCode
  /* 5001 */ val HOST_BINDING_PARSE_ERROR: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.HOST_BINDING_PARSE_ERROR & Double = js.native
  
  /**
    * Raised when a relationship between directives and/or pipes would cause a cyclic import to be
    * created that cannot be handled, such as in partial compilation mode.
    */
  @js.native
  sealed trait IMPORT_CYCLE_DETECTED
    extends StObject
       with ErrorCode
  /* 3003 */ val IMPORT_CYCLE_DETECTED: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.IMPORT_CYCLE_DETECTED & Double = js.native
  
  /**
    * Raised when the compiler is unable to generate an import statement for a reference.
    */
  @js.native
  sealed trait IMPORT_GENERATION_FAILURE
    extends StObject
       with ErrorCode
  /* 3004 */ val IMPORT_GENERATION_FAILURE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.IMPORT_GENERATION_FAILURE & Double = js.native
  
  /**
    * An injectable already has a `ɵprov` property.
    */
  @js.native
  sealed trait INJECTABLE_DUPLICATE_PROV
    extends StObject
       with ErrorCode
  /* 9001 */ val INJECTABLE_DUPLICATE_PROV: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.INJECTABLE_DUPLICATE_PROV & Double = js.native
  
  /**
    * The template type-checking engine would need to generate an inline type check block for a
    * component, but the current type-checking environment doesn't support it.
    */
  @js.native
  sealed trait INLINE_TCB_REQUIRED
    extends StObject
       with ErrorCode
  /* 8900 */ val INLINE_TCB_REQUIRED: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.INLINE_TCB_REQUIRED & Double = js.native
  
  /**
    * The template type-checking engine would need to generate an inline type constructor for a
    * directive or component, but the current type-checking environment doesn't support it.
    */
  @js.native
  sealed trait INLINE_TYPE_CTOR_REQUIRED
    extends StObject
       with ErrorCode
  /* 8901 */ val INLINE_TYPE_CTOR_REQUIRED: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.INLINE_TYPE_CTOR_REQUIRED & Double = js.native
  
  /**
    * A two way binding in a template has an incorrect syntax,
    * parentheses outside brackets. For example:
    *
    * ```
    * <div ([foo])="bar" />
    * ```
    */
  @js.native
  sealed trait INVALID_BANANA_IN_BOX
    extends StObject
       with ErrorCode
  /* 8101 */ val INVALID_BANANA_IN_BOX: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.INVALID_BANANA_IN_BOX & Double = js.native
  
  /**
    * A known control flow directive (e.g. `*ngIf`) is used in a template,
    * but the `CommonModule` is not imported.
    */
  @js.native
  sealed trait MISSING_CONTROL_FLOW_DIRECTIVE
    extends StObject
       with ErrorCode
  /* 8103 */ val MISSING_CONTROL_FLOW_DIRECTIVE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.MISSING_CONTROL_FLOW_DIRECTIVE & Double = js.native
  
  /**
    * NgForOf is used in a template, but the user forgot to include let
    * in their statement.
    *
    * For example:
    * ```
    * <ul><li *ngFor="item of items">{{item["name"]}};</li></ul>
    * ```
    */
  @js.native
  sealed trait MISSING_NGFOROF_LET
    extends StObject
       with ErrorCode
  /* 8105 */ val MISSING_NGFOROF_LET: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.MISSING_NGFOROF_LET & Double = js.native
  
  /**
    * No matching pipe was found for a
    */
  @js.native
  sealed trait MISSING_PIPE
    extends StObject
       with ErrorCode
  /* 8004 */ val MISSING_PIPE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.MISSING_PIPE & Double = js.native
  
  /**
    * No matching directive was found for a `#ref="target"` expression.
    */
  @js.native
  sealed trait MISSING_REFERENCE_TARGET
    extends StObject
       with ErrorCode
  /* 8003 */ val MISSING_REFERENCE_TARGET: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.MISSING_REFERENCE_TARGET & Double = js.native
  
  /**
    * Raised when a standalone component is part of the bootstrap list of an NgModule.
    */
  @js.native
  sealed trait NGMODULE_BOOTSTRAP_IS_STANDALONE
    extends StObject
       with ErrorCode
  /* 6009 */ val NGMODULE_BOOTSTRAP_IS_STANDALONE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_BOOTSTRAP_IS_STANDALONE & Double = js.native
  
  /**
    * Raised when a standalone directive/pipe is part of the declarations of an NgModule.
    */
  @js.native
  sealed trait NGMODULE_DECLARATION_IS_STANDALONE
    extends StObject
       with ErrorCode
  /* 6008 */ val NGMODULE_DECLARATION_IS_STANDALONE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_DECLARATION_IS_STANDALONE & Double = js.native
  
  /**
    * Raised when a directive/pipe is part of the declarations of two or more NgModules.
    */
  @js.native
  sealed trait NGMODULE_DECLARATION_NOT_UNIQUE
    extends StObject
       with ErrorCode
  /* 6007 */ val NGMODULE_DECLARATION_NOT_UNIQUE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_DECLARATION_NOT_UNIQUE & Double = js.native
  
  /**
    * Raised when an NgModule contains an invalid reference in `declarations`.
    */
  @js.native
  sealed trait NGMODULE_INVALID_DECLARATION
    extends StObject
       with ErrorCode
  /* 6001 */ val NGMODULE_INVALID_DECLARATION: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_INVALID_DECLARATION & Double = js.native
  
  /**
    * Raised when an NgModule contains an invalid type in `exports`.
    */
  @js.native
  sealed trait NGMODULE_INVALID_EXPORT
    extends StObject
       with ErrorCode
  /* 6003 */ val NGMODULE_INVALID_EXPORT: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_INVALID_EXPORT & Double = js.native
  
  /**
    * Raised when an NgModule contains an invalid type in `imports`.
    */
  @js.native
  sealed trait NGMODULE_INVALID_IMPORT
    extends StObject
       with ErrorCode
  /* 6002 */ val NGMODULE_INVALID_IMPORT: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_INVALID_IMPORT & Double = js.native
  
  /**
    * Raised when an NgModule contains a type in `exports` which is neither in `declarations` nor
    * otherwise imported.
    */
  @js.native
  sealed trait NGMODULE_INVALID_REEXPORT
    extends StObject
       with ErrorCode
  /* 6004 */ val NGMODULE_INVALID_REEXPORT: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_INVALID_REEXPORT & Double = js.native
  
  /**
    * Raised when a `ModuleWithProviders` with a missing
    * generic type argument is passed into an `NgModule`.
    */
  @js.native
  sealed trait NGMODULE_MODULE_WITH_PROVIDERS_MISSING_GENERIC
    extends StObject
       with ErrorCode
  /* 6005 */ val NGMODULE_MODULE_WITH_PROVIDERS_MISSING_GENERIC: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_MODULE_WITH_PROVIDERS_MISSING_GENERIC & Double = js.native
  
  /**
    * Raised when an NgModule exports multiple directives/pipes of the same name and the compiler
    * attempts to generate private re-exports within the NgModule file.
    */
  @js.native
  sealed trait NGMODULE_REEXPORT_NAME_COLLISION
    extends StObject
       with ErrorCode
  /* 6006 */ val NGMODULE_REEXPORT_NAME_COLLISION: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_REEXPORT_NAME_COLLISION & Double = js.native
  
  /**
    * Not actually raised by the compiler, but reserved for documentation of a View Engine error when
    * a View Engine build depends on an Ivy-compiled NgModule.
    */
  @js.native
  sealed trait NGMODULE_VE_DEPENDENCY_ON_IVY_LIB
    extends StObject
       with ErrorCode
  /* 6999 */ val NGMODULE_VE_DEPENDENCY_ON_IVY_LIB: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NGMODULE_VE_DEPENDENCY_ON_IVY_LIB & Double = js.native
  
  /**
    * The left side of a nullish coalescing operation is not nullable.
    *
    * ```
    * {{ foo ?? bar }}
    * ```
    * When the type of foo doesn't include `null` or `undefined`.
    */
  @js.native
  sealed trait NULLISH_COALESCING_NOT_NULLABLE
    extends StObject
       with ErrorCode
  /* 8102 */ val NULLISH_COALESCING_NOT_NULLABLE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.NULLISH_COALESCING_NOT_NULLABLE & Double = js.native
  
  /**
    * The left side of an optional chain operation is not nullable.
    *
    * ```
    * {{ foo?.bar }}
    * {{ foo?.['bar'] }}
    * {{ foo?.() }}
    * ```
    * When the type of foo doesn't include `null` or `undefined`.
    */
  @js.native
  sealed trait OPTIONAL_CHAIN_NOT_NULLABLE
    extends StObject
       with ErrorCode
  /* 8107 */ val OPTIONAL_CHAIN_NOT_NULLABLE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.OPTIONAL_CHAIN_NOT_NULLABLE & Double = js.native
  
  @js.native
  sealed trait PARAM_MISSING_TOKEN
    extends StObject
       with ErrorCode
  /* 2003 */ val PARAM_MISSING_TOKEN: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.PARAM_MISSING_TOKEN & Double = js.native
  
  @js.native
  sealed trait PIPE_MISSING_NAME
    extends StObject
       with ErrorCode
  /* 2002 */ val PIPE_MISSING_NAME: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.PIPE_MISSING_NAME & Double = js.native
  
  /**
    * An element's attribute name failed validation against the DOM schema.
    */
  @js.native
  sealed trait SCHEMA_INVALID_ATTRIBUTE
    extends StObject
       with ErrorCode
  /* 8002 */ val SCHEMA_INVALID_ATTRIBUTE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.SCHEMA_INVALID_ATTRIBUTE & Double = js.native
  
  /**
    * An element name failed validation against the DOM schema.
    */
  @js.native
  sealed trait SCHEMA_INVALID_ELEMENT
    extends StObject
       with ErrorCode
  /* 8001 */ val SCHEMA_INVALID_ELEMENT: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.SCHEMA_INVALID_ELEMENT & Double = js.native
  
  /**
    * A template has a two way binding (two bindings created by a single syntactical element)
    * in which the input and output are going to different places.
    */
  @js.native
  sealed trait SPLIT_TWO_WAY_BINDING
    extends StObject
       with ErrorCode
  /* 8007 */ val SPLIT_TWO_WAY_BINDING: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.SPLIT_TWO_WAY_BINDING & Double = js.native
  
  /**
    * Indicates that the binding suffix is not supported
    *
    * Style bindings support suffixes like `style.width.px`, `.em`, and `.%`.
    * These suffixes are _not_ supported for attribute bindings.
    *
    * For example `[attr.width.px]="5"` becomes `width.px="5"` when bound.
    * This is almost certainly unintentional and this error is meant to
    * surface this mistake to the developer.
    */
  @js.native
  sealed trait SUFFIX_NOT_SUPPORTED
    extends StObject
       with ErrorCode
  /* 8106 */ val SUFFIX_NOT_SUPPORTED: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.SUFFIX_NOT_SUPPORTED & Double = js.native
  
  /**
    * Suggest users to enable `strictTemplates` to make use of full capabilities
    * provided by Angular language service.
    */
  @js.native
  sealed trait SUGGEST_STRICT_TEMPLATES
    extends StObject
       with ErrorCode
  /* 10001 */ val SUGGEST_STRICT_TEMPLATES: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.SUGGEST_STRICT_TEMPLATES & Double = js.native
  
  /**
    * Indicates that a particular structural directive provides advanced type narrowing
    * functionality, but the current template type-checking configuration does not allow its usage in
    * type inference.
    */
  @js.native
  sealed trait SUGGEST_SUBOPTIMAL_TYPE_INFERENCE
    extends StObject
       with ErrorCode
  /* 10002 */ val SUGGEST_SUBOPTIMAL_TYPE_INFERENCE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.SUGGEST_SUBOPTIMAL_TYPE_INFERENCE & Double = js.native
  
  @js.native
  sealed trait SYMBOL_NOT_EXPORTED
    extends StObject
       with ErrorCode
  /* 3001 */ val SYMBOL_NOT_EXPORTED: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.SYMBOL_NOT_EXPORTED & Double = js.native
  
  /**
    * Raised when the compiler cannot parse a component's template.
    */
  @js.native
  sealed trait TEMPLATE_PARSE_ERROR
    extends StObject
       with ErrorCode
  /* 5002 */ val TEMPLATE_PARSE_ERROR: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.TEMPLATE_PARSE_ERROR & Double = js.native
  
  /**
    * A text attribute is not interpreted as a binding but likely intended to be.
    *
    * For example:
    * ```
    * <div
    *   attr.x="value"
    *   class.blue="true"
    *   style.margin-right.px="5">
    * </div>
    * ```
    *
    * All of the above attributes will just be static text attributes and will not be interpreted as
    * bindings by the compiler.
    */
  @js.native
  sealed trait TEXT_ATTRIBUTE_NOT_BINDING
    extends StObject
       with ErrorCode
  /* 8104 */ val TEXT_ATTRIBUTE_NOT_BINDING: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.TEXT_ATTRIBUTE_NOT_BINDING & Double = js.native
  
  /**
    * Raised when an undecorated class that is using Angular features
    * has been discovered.
    */
  @js.native
  sealed trait UNDECORATED_CLASS_USING_ANGULAR_FEATURES
    extends StObject
       with ErrorCode
  /* 2007 */ val UNDECORATED_CLASS_USING_ANGULAR_FEATURES: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.UNDECORATED_CLASS_USING_ANGULAR_FEATURES & Double = js.native
  
  /** Raised when an undecorated class is passed in as a provider to a module or a directive. */
  @js.native
  sealed trait UNDECORATED_PROVIDER
    extends StObject
       with ErrorCode
  /* 2005 */ val UNDECORATED_PROVIDER: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.UNDECORATED_PROVIDER & Double = js.native
  
  @js.native
  sealed trait VALUE_HAS_WRONG_TYPE
    extends StObject
       with ErrorCode
  /* 1010 */ val VALUE_HAS_WRONG_TYPE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.VALUE_HAS_WRONG_TYPE & Double = js.native
  
  @js.native
  sealed trait VALUE_NOT_LITERAL
    extends StObject
       with ErrorCode
  /* 1011 */ val VALUE_NOT_LITERAL: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.VALUE_NOT_LITERAL & Double = js.native
  
  /**
    * Indicates that an NgModule is declared with `id: module.id`. This is an anti-pattern that is
    * disabled explicitly in the compiler, that was originally based on a misunderstanding of
    * `NgModule.id`.
    */
  @js.native
  sealed trait WARN_NGMODULE_ID_UNNECESSARY
    extends StObject
       with ErrorCode
  /* 6100 */ val WARN_NGMODULE_ID_UNNECESSARY: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.WARN_NGMODULE_ID_UNNECESSARY & Double = js.native
  
  /**
    * The left-hand side of an assignment expression was a template variable. Effectively, the
    * template looked like:
    *
    * ```
    * <ng-template let-something>
    *   <button (click)="something = ...">...</button>
    * </ng-template>
    * ```
    *
    * Template variables are read-only.
    */
  @js.native
  sealed trait WRITE_TO_READ_ONLY_VARIABLE
    extends StObject
       with ErrorCode
  /* 8005 */ val WRITE_TO_READ_ONLY_VARIABLE: typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode.WRITE_TO_READ_ONLY_VARIABLE & Double = js.native
}

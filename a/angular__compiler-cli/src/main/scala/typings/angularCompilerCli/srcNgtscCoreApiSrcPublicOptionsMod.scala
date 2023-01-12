package typings.angularCompilerCli

import typings.angularCompilerCli.angularCompilerCliStrings.full
import typings.angularCompilerCli.angularCompilerCliStrings.ngtsc
import typings.angularCompilerCli.angularCompilerCliStrings.partial
import typings.angularCompilerCli.anon.Checks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscCoreApiSrcPublicOptionsMod {
  
  @js.native
  sealed trait DiagnosticCategoryLabel extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/core/api/src/public_options", "DiagnosticCategoryLabel")
  @js.native
  object DiagnosticCategoryLabel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DiagnosticCategoryLabel & String] = js.native
    
    /** Treat the diagnostic as a hard error, fail the compilation. */
    @js.native
    sealed trait Error
      extends StObject
         with DiagnosticCategoryLabel
    /* "error" */ val Error: typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.DiagnosticCategoryLabel.Error & String = js.native
    
    /** Ignore the diagnostic altogether. */
    @js.native
    sealed trait Suppress
      extends StObject
         with DiagnosticCategoryLabel
    /* "suppress" */ val Suppress: typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.DiagnosticCategoryLabel.Suppress & String = js.native
    
    /** Treat the diagnostic as a warning, don't fail the compilation. */
    @js.native
    sealed trait Warning
      extends StObject
         with DiagnosticCategoryLabel
    /* "warning" */ val Warning: typings.angularCompilerCli.srcNgtscCoreApiSrcPublicOptionsMod.DiagnosticCategoryLabel.Warning & String = js.native
  }
  
  trait BazelAndG3Options extends StObject {
    
    /**
      * Insert JSDoc type annotations needed by Closure Compiler
      */
    var annotateForClosureCompiler: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables the generation of alias re-exports of directives/pipes that are visible from an
      * NgModule from that NgModule's file.
      *
      * This option should be disabled for application builds or for Angular Package Format libraries
      * (where NgModules along with their directives/pipes are exported via a single entrypoint).
      *
      * For other library compilations which are intended to be path-mapped into an application build
      * (or another library), enabling this option enables the resulting deep imports to work
      * correctly.
      *
      * A consumer of such a path-mapped library will write an import like:
      *
      * ```typescript
      * import {LibModule} from 'lib/deep/path/to/module';
      * ```
      *
      * The compiler will attempt to generate imports of directives/pipes from that same module
      * specifier (the compiler does not rewrite the user's given import path, unlike View Engine).
      *
      * ```typescript
      * import {LibDir, LibCmp, LibPipe} from 'lib/deep/path/to/module';
      * ```
      *
      * It would be burdensome for users to have to re-export all directives/pipes alongside each
      * NgModule to support this import model. Enabling this option tells the compiler to generate
      * private re-exports alongside the NgModule of all the directives/pipes it makes available, to
      * support these future imports.
      */
    var generateDeepReexports: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The `.d.ts` file for NgModules contain type pointers to their declarations, imports, and
      * exports. Without this flag, the generated type definition will include
      * components/directives/pipes/NgModules that are declared or imported locally in the NgModule and
      * not necessarily exported to consumers.
      *
      * With this flag set, the type definition generated in the `.d.ts` for an NgModule will be
      * filtered to only list those types which are publicly exported by the NgModule.
      */
    var onlyPublishPublicTypingsForNgModules: js.UndefOr[Boolean] = js.undefined
  }
  object BazelAndG3Options {
    
    inline def apply(): BazelAndG3Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BazelAndG3Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BazelAndG3Options] (val x: Self) extends AnyVal {
      
      inline def setAnnotateForClosureCompiler(value: Boolean): Self = StObject.set(x, "annotateForClosureCompiler", value.asInstanceOf[js.Any])
      
      inline def setAnnotateForClosureCompilerUndefined: Self = StObject.set(x, "annotateForClosureCompiler", js.undefined)
      
      inline def setGenerateDeepReexports(value: Boolean): Self = StObject.set(x, "generateDeepReexports", value.asInstanceOf[js.Any])
      
      inline def setGenerateDeepReexportsUndefined: Self = StObject.set(x, "generateDeepReexports", js.undefined)
      
      inline def setOnlyPublishPublicTypingsForNgModules(value: Boolean): Self = StObject.set(x, "onlyPublishPublicTypingsForNgModules", value.asInstanceOf[js.Any])
      
      inline def setOnlyPublishPublicTypingsForNgModulesUndefined: Self = StObject.set(x, "onlyPublishPublicTypingsForNgModules", js.undefined)
    }
  }
  
  trait DiagnosticOptions extends StObject {
    
    /** Options which control how diagnostics are emitted from the compiler. */
    var extendedDiagnostics: js.UndefOr[Checks] = js.undefined
  }
  object DiagnosticOptions {
    
    inline def apply(): DiagnosticOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiagnosticOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiagnosticOptions] (val x: Self) extends AnyVal {
      
      inline def setExtendedDiagnostics(value: Checks): Self = StObject.set(x, "extendedDiagnostics", value.asInstanceOf[js.Any])
      
      inline def setExtendedDiagnosticsUndefined: Self = StObject.set(x, "extendedDiagnostics", js.undefined)
    }
  }
  
  trait I18nOptions extends StObject {
    
    /**
      * Render `$localize` messages with legacy format ids.
      *
      * This is only active if we are building with `enableIvy: true`.
      * The default value for now is `true`.
      *
      * Use this option when use are using the `$localize` based localization messages but
      * have not migrated the translation files to use the new `$localize` message id format.
      */
    var enableI18nLegacyMessageIdFormat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Locale of the imported translations
      */
    var i18nInLocale: js.UndefOr[String] = js.undefined
    
    /**
      * If templates are stored in external files (e.g. via `templateUrl`) then we need to decide
      * whether or not to normalize the line-endings (from `\r\n` to `\n`) when processing ICU
      * expressions.
      *
      * Ideally we would always normalize, but for backward compatibility this flag allows the template
      * parser to avoid normalizing line endings in ICU expressions.
      *
      * If `true` then we will normalize ICU expression line endings.
      * The default is `false`, but this will be switched in a future major release.
      */
    var i18nNormalizeLineEndingsInICUs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Path to the extracted message file to emit when the xi18n operation is requested.
      */
    var i18nOutFile: js.UndefOr[String] = js.undefined
    
    /**
      * Export format (xlf, xlf2 or xmb) when the xi18n operation is requested.
      */
    var i18nOutFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Locale of the application (used when xi18n is requested).
      */
    var i18nOutLocale: js.UndefOr[String] = js.undefined
    
    /**
      * Whether translation variable name should contain external message id
      * (used by Closure Compiler's output of `goog.getMsg` for transition period)
      */
    var i18nUseExternalIds: js.UndefOr[Boolean] = js.undefined
  }
  object I18nOptions {
    
    inline def apply(): I18nOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[I18nOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: I18nOptions] (val x: Self) extends AnyVal {
      
      inline def setEnableI18nLegacyMessageIdFormat(value: Boolean): Self = StObject.set(x, "enableI18nLegacyMessageIdFormat", value.asInstanceOf[js.Any])
      
      inline def setEnableI18nLegacyMessageIdFormatUndefined: Self = StObject.set(x, "enableI18nLegacyMessageIdFormat", js.undefined)
      
      inline def setI18nInLocale(value: String): Self = StObject.set(x, "i18nInLocale", value.asInstanceOf[js.Any])
      
      inline def setI18nInLocaleUndefined: Self = StObject.set(x, "i18nInLocale", js.undefined)
      
      inline def setI18nNormalizeLineEndingsInICUs(value: Boolean): Self = StObject.set(x, "i18nNormalizeLineEndingsInICUs", value.asInstanceOf[js.Any])
      
      inline def setI18nNormalizeLineEndingsInICUsUndefined: Self = StObject.set(x, "i18nNormalizeLineEndingsInICUs", js.undefined)
      
      inline def setI18nOutFile(value: String): Self = StObject.set(x, "i18nOutFile", value.asInstanceOf[js.Any])
      
      inline def setI18nOutFileUndefined: Self = StObject.set(x, "i18nOutFile", js.undefined)
      
      inline def setI18nOutFormat(value: String): Self = StObject.set(x, "i18nOutFormat", value.asInstanceOf[js.Any])
      
      inline def setI18nOutFormatUndefined: Self = StObject.set(x, "i18nOutFormat", js.undefined)
      
      inline def setI18nOutLocale(value: String): Self = StObject.set(x, "i18nOutLocale", value.asInstanceOf[js.Any])
      
      inline def setI18nOutLocaleUndefined: Self = StObject.set(x, "i18nOutLocale", js.undefined)
      
      inline def setI18nUseExternalIds(value: Boolean): Self = StObject.set(x, "i18nUseExternalIds", value.asInstanceOf[js.Any])
      
      inline def setI18nUseExternalIdsUndefined: Self = StObject.set(x, "i18nUseExternalIds", js.undefined)
    }
  }
  
  trait LegacyNgcOptions extends StObject {
    
    /** generate all possible generated files  */
    var allowEmptyCodegenFiles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Preferred module id to use for importing flat module. References generated by `ngc`
      * will use this module name when importing symbols from the flat module. This is only
      * meaningful when `flatModuleOutFile` is also supplied. It is otherwise ignored.
      */
    var flatModuleId: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to generate a flat module index of the given name and the corresponding
      * flat module metadata. This option is intended to be used when creating flat
      * modules similar to how `@angular/core` and `@angular/common` are packaged.
      * When this option is used the `package.json` for the library should refer to the
      * generated flat module index instead of the library index file. When using this
      * option only one .metadata.json file is produced that contains all the metadata
      * necessary for symbols exported from the library index.
      * In the generated .ngfactory.ts files flat module index is used to import symbols
      * including both the public API from the library index as well as shrouded internal
      * symbols.
      * By default the .ts file supplied in the `files` field is assumed to be the
      * library index. If more than one is specified, uses `libraryIndex` to select the
      * file to use. If more than one .ts file is supplied and no `libraryIndex` is supplied
      * an error is produced.
      * A flat module index .d.ts and .js will be created with the given `flatModuleOutFile`
      * name in the same location as the library index .d.ts file is emitted.
      * For example, if a library uses `public_api.ts` file as the library index of the
      * module the `tsconfig.json` `files` field would be `["public_api.ts"]`. The
      * `flatModuleOutFile` options could then be set to, for example `"index.js"`, which
      * produces `index.d.ts` and  `index.metadata.json` files. The library's
      * `package.json`'s `module` field would be `"index.js"` and the `typings` field would
      * be `"index.d.ts"`.
      */
    var flatModuleOutFile: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to type check the entire template.
      *
      * This flag currently controls a couple aspects of template type-checking, including
      * whether embedded views are checked.
      *
      * For maximum type-checking, set this to `true`, and set `strictTemplates` to `true`.
      *
      * It is an error for this flag to be `false`, while `strictTemplates` is set to `true`.
      *
      * @deprecated The `fullTemplateTypeCheck` option has been superseded by the more granular
      * `strictTemplates` family of compiler options. Usage of `fullTemplateTypeCheck` is therefore
      * deprecated, `strictTemplates` and its related options should be used instead.
      */
    var fullTemplateTypeCheck: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to remove blank text nodes from compiled templates. It is `false` by default starting
      * from Angular 6.
      */
    var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Always report errors a parameter is supplied whose injection type cannot
      * be determined. When this value option is not provided or is `false`, constructor
      * parameters of classes marked with `@Injectable` whose type cannot be resolved will
      * produce a warning. With this option `true`, they produce an error. When this option is
      * not provided is treated as if it were `false`.
      */
    var strictInjectionParameters: js.UndefOr[Boolean] = js.undefined
  }
  object LegacyNgcOptions {
    
    inline def apply(): LegacyNgcOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegacyNgcOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegacyNgcOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowEmptyCodegenFiles(value: Boolean): Self = StObject.set(x, "allowEmptyCodegenFiles", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyCodegenFilesUndefined: Self = StObject.set(x, "allowEmptyCodegenFiles", js.undefined)
      
      inline def setFlatModuleId(value: String): Self = StObject.set(x, "flatModuleId", value.asInstanceOf[js.Any])
      
      inline def setFlatModuleIdUndefined: Self = StObject.set(x, "flatModuleId", js.undefined)
      
      inline def setFlatModuleOutFile(value: String): Self = StObject.set(x, "flatModuleOutFile", value.asInstanceOf[js.Any])
      
      inline def setFlatModuleOutFileUndefined: Self = StObject.set(x, "flatModuleOutFile", js.undefined)
      
      inline def setFullTemplateTypeCheck(value: Boolean): Self = StObject.set(x, "fullTemplateTypeCheck", value.asInstanceOf[js.Any])
      
      inline def setFullTemplateTypeCheckUndefined: Self = StObject.set(x, "fullTemplateTypeCheck", js.undefined)
      
      inline def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
      
      inline def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
      
      inline def setStrictInjectionParameters(value: Boolean): Self = StObject.set(x, "strictInjectionParameters", value.asInstanceOf[js.Any])
      
      inline def setStrictInjectionParametersUndefined: Self = StObject.set(x, "strictInjectionParameters", js.undefined)
    }
  }
  
  trait MiscOptions extends StObject {
    
    /**
      * Whether the compiler should avoid generating code for classes that haven't been exported.
      * This is only active when building with `enableIvy: true`. Defaults to `true`.
      */
    var compileNonExportedClasses: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable TypeScript Version Check.
      */
    var disableTypeScriptVersionCheck: js.UndefOr[Boolean] = js.undefined
  }
  object MiscOptions {
    
    inline def apply(): MiscOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiscOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MiscOptions] (val x: Self) extends AnyVal {
      
      inline def setCompileNonExportedClasses(value: Boolean): Self = StObject.set(x, "compileNonExportedClasses", value.asInstanceOf[js.Any])
      
      inline def setCompileNonExportedClassesUndefined: Self = StObject.set(x, "compileNonExportedClasses", js.undefined)
      
      inline def setDisableTypeScriptVersionCheck(value: Boolean): Self = StObject.set(x, "disableTypeScriptVersionCheck", value.asInstanceOf[js.Any])
      
      inline def setDisableTypeScriptVersionCheckUndefined: Self = StObject.set(x, "disableTypeScriptVersionCheck", js.undefined)
    }
  }
  
  trait NgcCompatibilityOptions extends StObject {
    
    /**
      * Tells the compiler to generate definitions using the Render3 style code generation.
      * This option defaults to `true`.
      *
      * Acceptable values are as follows:
      *
      * `false` - run ngc normally
      * `true` - run the ngtsc compiler instead of the normal ngc compiler
      * `ngtsc` - alias for `true`
      */
    var enableIvy: js.UndefOr[Boolean | ngtsc] = js.undefined
    
    /**
      * Controls whether ngtsc will emit `.ngfactory.js` shims for each compiled `.ts` file.
      *
      * These shims support legacy imports from `ngfactory` files, by exporting a factory shim
      * for each component or NgModule in the original `.ts` file.
      */
    var generateNgFactoryShims: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls whether ngtsc will emit `.ngsummary.js` shims for each compiled `.ts` file.
      *
      * These shims support legacy imports from `ngsummary` files, by exporting an empty object
      * for each NgModule in the original `.ts` file. The only purpose of summaries is to feed them to
      * `TestBed`, which is a no-op in Ivy.
      */
    var generateNgSummaryShims: js.UndefOr[Boolean] = js.undefined
  }
  object NgcCompatibilityOptions {
    
    inline def apply(): NgcCompatibilityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NgcCompatibilityOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NgcCompatibilityOptions] (val x: Self) extends AnyVal {
      
      inline def setEnableIvy(value: Boolean | ngtsc): Self = StObject.set(x, "enableIvy", value.asInstanceOf[js.Any])
      
      inline def setEnableIvyUndefined: Self = StObject.set(x, "enableIvy", js.undefined)
      
      inline def setGenerateNgFactoryShims(value: Boolean): Self = StObject.set(x, "generateNgFactoryShims", value.asInstanceOf[js.Any])
      
      inline def setGenerateNgFactoryShimsUndefined: Self = StObject.set(x, "generateNgFactoryShims", js.undefined)
      
      inline def setGenerateNgSummaryShims(value: Boolean): Self = StObject.set(x, "generateNgSummaryShims", value.asInstanceOf[js.Any])
      
      inline def setGenerateNgSummaryShimsUndefined: Self = StObject.set(x, "generateNgSummaryShims", js.undefined)
    }
  }
  
  trait StrictTemplateOptions extends StObject {
    
    /**
      * Whether to check text attributes that happen to be consumed by a directive or component.
      *
      * For example, in a template containing `<input matInput disabled>` the `disabled` attribute ends
      * up being consumed as an input with type `boolean` by the `matInput` directive. At runtime, the
      * input will be set to the attribute's string value, which is an empty string for attributes
      * without a value, so with this flag set to `true`, an error would be reported. If set to
      * `false`, text attributes will never report an error.
      *
      * Defaults to `false`, even if "fullTemplateTypeCheck" is set. Note that if `strictInputTypes` is
      * not set, or set to `false`, this flag has no effect.
      */
    var strictAttributeTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to include the generic type of components when type-checking the template.
      *
      * If no component has generic type parameters, this setting has no effect.
      *
      * If a component has generic type parameters and this setting is `true`, those generic parameters
      * will be included in the context type for the template. If `false`, any generic parameters will
      * be set to `any` in the template context type.
      *
      * Defaults to `false`, even if "fullTemplateTypeCheck" is set.
      */
    var strictContextGenerics: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to infer the type of the `$event` variable in event bindings to DOM events.
      *
      * If this is `true`, the type of `$event` will be inferred based on TypeScript's
      * `HTMLElementEventMap`, with a fallback to the native `Event` type. If set to `false`, the
      * `$event` variable will be of type `any`.
      *
      * Defaults to `false`, even if "fullTemplateTypeCheck" is set.
      */
    var strictDomEventTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to infer the type of local references.
      *
      * If this is `true`, the type of a `#ref` variable on a DOM node in the template will be
      * determined by the type of `document.createElement` for the given DOM node. If set to `false`,
      * the type of `ref` for DOM nodes will be `any`.
      *
      * Defaults to `false`, even if "fullTemplateTypeCheck" is set.
      */
    var strictDomLocalRefTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to check if the input binding attempts to assign to a restricted field (readonly,
      * private, or protected) on the directive/component.
      *
      * Defaults to `false`, even if "fullTemplateTypeCheck", "strictTemplates" and/or
      * "strictInputTypes" is set. Note that if `strictInputTypes` is not set, or set to `false`, this
      * flag has no effect.
      *
      * Tracking issue for enabling this by default: https://github.com/angular/angular/issues/38400
      */
    var strictInputAccessModifiers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to check the type of a binding to a directive/component input against the type of the
      * field on the directive/component.
      *
      * For example, if this is `false` then the expression `[input]="expr"` will have `expr` type-
      * checked, but not the assignment of the resulting type to the `input` property of whichever
      * directive or component is receiving the binding. If set to `true`, both sides of the assignment
      * are checked.
      *
      * Defaults to `false`, even if "fullTemplateTypeCheck" is set.
      */
    var strictInputTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether object or array literals defined in templates use their inferred type, or are
      * interpreted as `any`.
      *
      * Defaults to `false` unless `fullTemplateTypeCheck` or `strictTemplates` are set.
      */
    var strictLiteralTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use strict null types for input bindings for directives.
      *
      * If this is `true`, applications that are compiled with TypeScript's `strictNullChecks` enabled
      * will produce type errors for bindings which can evaluate to `undefined` or `null` where the
      * inputs's type does not include `undefined` or `null` in its type. If set to `false`, all
      * binding expressions are wrapped in a non-null assertion operator to effectively disable strict
      * null checks.
      *
      * Defaults to `false`, even if "fullTemplateTypeCheck" is set. Note that if `strictInputTypes` is
      * not set, or set to `false`, this flag has no effect.
      */
    var strictNullInputTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to infer the type of the `$event` variable in event bindings for directive outputs or
      * animation events.
      *
      * If this is `true`, the type of `$event` will be inferred based on the generic type of
      * `EventEmitter`/`Subject` of the output. If set to `false`, the `$event` variable will be of
      * type `any`.
      *
      * Defaults to `false`, even if "fullTemplateTypeCheck" is set.
      */
    var strictOutputEventTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use a strict type for null-safe navigation operations.
      *
      * If this is `false`, then the return type of `a?.b` or `a?()` will be `any`. If set to `true`,
      * then the return type of `a?.b` for example will be the same as the type of the ternary
      * expression `a != null ? a.b : a`.
      *
      * Defaults to `false`, even if "fullTemplateTypeCheck" is set.
      */
    var strictSafeNavigationTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, implies all template strictness flags below (unless individually disabled).
      *
      * This flag is a superset of the deprecated `fullTemplateTypeCheck` option.
      *
      * Defaults to `false`, even if "fullTemplateTypeCheck" is `true`.
      */
    var strictTemplates: js.UndefOr[Boolean] = js.undefined
  }
  object StrictTemplateOptions {
    
    inline def apply(): StrictTemplateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setStrictAttributeTypes(value: Boolean): Self = StObject.set(x, "strictAttributeTypes", value.asInstanceOf[js.Any])
      
      inline def setStrictAttributeTypesUndefined: Self = StObject.set(x, "strictAttributeTypes", js.undefined)
      
      inline def setStrictContextGenerics(value: Boolean): Self = StObject.set(x, "strictContextGenerics", value.asInstanceOf[js.Any])
      
      inline def setStrictContextGenericsUndefined: Self = StObject.set(x, "strictContextGenerics", js.undefined)
      
      inline def setStrictDomEventTypes(value: Boolean): Self = StObject.set(x, "strictDomEventTypes", value.asInstanceOf[js.Any])
      
      inline def setStrictDomEventTypesUndefined: Self = StObject.set(x, "strictDomEventTypes", js.undefined)
      
      inline def setStrictDomLocalRefTypes(value: Boolean): Self = StObject.set(x, "strictDomLocalRefTypes", value.asInstanceOf[js.Any])
      
      inline def setStrictDomLocalRefTypesUndefined: Self = StObject.set(x, "strictDomLocalRefTypes", js.undefined)
      
      inline def setStrictInputAccessModifiers(value: Boolean): Self = StObject.set(x, "strictInputAccessModifiers", value.asInstanceOf[js.Any])
      
      inline def setStrictInputAccessModifiersUndefined: Self = StObject.set(x, "strictInputAccessModifiers", js.undefined)
      
      inline def setStrictInputTypes(value: Boolean): Self = StObject.set(x, "strictInputTypes", value.asInstanceOf[js.Any])
      
      inline def setStrictInputTypesUndefined: Self = StObject.set(x, "strictInputTypes", js.undefined)
      
      inline def setStrictLiteralTypes(value: Boolean): Self = StObject.set(x, "strictLiteralTypes", value.asInstanceOf[js.Any])
      
      inline def setStrictLiteralTypesUndefined: Self = StObject.set(x, "strictLiteralTypes", js.undefined)
      
      inline def setStrictNullInputTypes(value: Boolean): Self = StObject.set(x, "strictNullInputTypes", value.asInstanceOf[js.Any])
      
      inline def setStrictNullInputTypesUndefined: Self = StObject.set(x, "strictNullInputTypes", js.undefined)
      
      inline def setStrictOutputEventTypes(value: Boolean): Self = StObject.set(x, "strictOutputEventTypes", value.asInstanceOf[js.Any])
      
      inline def setStrictOutputEventTypesUndefined: Self = StObject.set(x, "strictOutputEventTypes", js.undefined)
      
      inline def setStrictSafeNavigationTypes(value: Boolean): Self = StObject.set(x, "strictSafeNavigationTypes", value.asInstanceOf[js.Any])
      
      inline def setStrictSafeNavigationTypesUndefined: Self = StObject.set(x, "strictSafeNavigationTypes", js.undefined)
      
      inline def setStrictTemplates(value: Boolean): Self = StObject.set(x, "strictTemplates", value.asInstanceOf[js.Any])
      
      inline def setStrictTemplatesUndefined: Self = StObject.set(x, "strictTemplates", js.undefined)
    }
  }
  
  trait TargetOptions extends StObject {
    
    /**
      * Specifies the compilation mode to use. The following modes are available:
      * - 'full': generates fully AOT compiled code using Ivy instructions.
      * - 'partial': generates code in a stable, but intermediate form suitable for publication to NPM.
      *
      * The default value is 'full'.
      */
    var compilationMode: js.UndefOr[full | partial] = js.undefined
  }
  object TargetOptions {
    
    inline def apply(): TargetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TargetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TargetOptions] (val x: Self) extends AnyVal {
      
      inline def setCompilationMode(value: full | partial): Self = StObject.set(x, "compilationMode", value.asInstanceOf[js.Any])
      
      inline def setCompilationModeUndefined: Self = StObject.set(x, "compilationMode", js.undefined)
    }
  }
}

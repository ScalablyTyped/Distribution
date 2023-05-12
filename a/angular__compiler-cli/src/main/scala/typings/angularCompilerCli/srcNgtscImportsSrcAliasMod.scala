package typings.angularCompilerCli

import typings.angularCompiler.mod.Expression
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.UnifiedModulesHost
import typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ImportFlags
import typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ReferenceEmitResult
import typings.angularCompilerCli.srcNgtscImportsSrcEmitterMod.ReferenceEmitStrategy
import typings.angularCompilerCli.srcNgtscImportsSrcReferencesMod.Reference
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscImportsSrcAliasMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/alias", "AliasStrategy")
  @js.native
  open class AliasStrategy ()
    extends StObject
       with ReferenceEmitStrategy {
    
    /**
      * Emit an `Expression` which refers to the given `Reference` in the context of a particular
      * source file, if possible.
      *
      * @param ref the `Reference` for which to generate an expression
      * @param context the source file in which the `Expression` must be valid
      * @param importFlags a flag which controls whether imports should be generated or not
      * @returns an `EmittedReference` which refers to the `Reference`, or `null` if none can be
      *   generated
      */
    /* CompleteClass */
    override def emit(ref: Reference[Node], context: SourceFile, importFlags: ImportFlags): ReferenceEmitResult | Null = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/alias", "PrivateExportAliasingHost")
  @js.native
  open class PrivateExportAliasingHost protected ()
    extends StObject
       with AliasingHost {
    def this(host: ReflectionHost) = this()
    
    /**
      * Controls whether any alias re-exports are rendered into .d.ts files.
      *
      * This is not always necessary for aliasing to function correctly, so this flag allows an
      * `AliasingHost` to avoid cluttering the .d.ts files if exports are not strictly needed.
      */
    /* CompleteClass */
    override val aliasExportsInDts: Boolean = js.native
    
    /**
      * A `PrivateExportAliasingHost` only generates re-exports and does not direct the compiler to
      * directly consume the aliases it creates.
      *
      * Instead, they're consumed indirectly: `AbsoluteModuleStrategy` `ReferenceEmitterStrategy` will
      * select these alias exports automatically when looking for an export of the directive/pipe from
      * the same path as the NgModule was imported.
      *
      * Thus, `getAliasIn` always returns `null`.
      */
    def getAliasIn(): Null = js.native
    /**
      * Determine an `Expression` by which `decl` should be imported from `via` using an alias export
      * (which should have been previously created when compiling `via`).
      *
      * `getAliasIn` can return `null`, in which case no alias is needed to import `decl` from `via`
      * (and the normal import rules should be used).
      *
      * @param decl the declaration of the directive/pipe which is being imported, and which might be
      * aliased.
      * @param via the `ts.SourceFile` which might contain an alias to the
      */
    /* CompleteClass */
    override def getAliasIn(decl: ClassDeclarationDeclarati, via: SourceFile, isReExport: Boolean): Expression | Null = js.native
    
    /* private */ var host: Any = js.native
    
    def maybeAliasSymbolAs(ref: Reference[ClassDeclarationDeclarati], context: SourceFile, ngModuleName: String): String | Null = js.native
    /**
      * Determine a name by which `decl` should be re-exported from `context`, depending on the
      * particular set of aliasing rules in place.
      *
      * `maybeAliasSymbolAs` can return `null`, in which case no alias export should be generated.
      *
      * @param ref a `Reference` to the directive/pipe to consider for aliasing.
      * @param context the `ts.SourceFile` in which the alias re-export might need to be generated.
      * @param ngModuleName the declared name of the `NgModule` within `context` for which the alias
      * would be generated.
      * @param isReExport whether the directive/pipe under consideration is re-exported from another
      * NgModule (as opposed to being declared by it directly).
      */
    /* CompleteClass */
    override def maybeAliasSymbolAs(
      ref: Reference[ClassDeclarationDeclarati],
      context: SourceFile,
      ngModuleName: String,
      isReExport: Boolean
    ): String | Null = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/alias", "UnifiedModulesAliasingHost")
  @js.native
  open class UnifiedModulesAliasingHost protected ()
    extends StObject
       with AliasingHost {
    def this(unifiedModulesHost: UnifiedModulesHost) = this()
    
    /**
      * Controls whether any alias re-exports are rendered into .d.ts files.
      *
      * This is not always necessary for aliasing to function correctly, so this flag allows an
      * `AliasingHost` to avoid cluttering the .d.ts files if exports are not strictly needed.
      */
    /* CompleteClass */
    override val aliasExportsInDts: Boolean = js.native
    
    /**
      * Generates an alias name based on the full module name of the file which declares the aliased
      * directive/pipe.
      */
    /* private */ var aliasName: Any = js.native
    
    /**
      * Determine an `Expression` by which `decl` should be imported from `via` using an alias export
      * (which should have been previously created when compiling `via`).
      *
      * `getAliasIn` can return `null`, in which case no alias is needed to import `decl` from `via`
      * (and the normal import rules should be used).
      *
      * @param decl the declaration of the directive/pipe which is being imported, and which might be
      * aliased.
      * @param via the `ts.SourceFile` which might contain an alias to the
      */
    /* CompleteClass */
    override def getAliasIn(decl: ClassDeclarationDeclarati, via: SourceFile, isReExport: Boolean): Expression | Null = js.native
    
    /**
      * Determine a name by which `decl` should be re-exported from `context`, depending on the
      * particular set of aliasing rules in place.
      *
      * `maybeAliasSymbolAs` can return `null`, in which case no alias export should be generated.
      *
      * @param ref a `Reference` to the directive/pipe to consider for aliasing.
      * @param context the `ts.SourceFile` in which the alias re-export might need to be generated.
      * @param ngModuleName the declared name of the `NgModule` within `context` for which the alias
      * would be generated.
      * @param isReExport whether the directive/pipe under consideration is re-exported from another
      * NgModule (as opposed to being declared by it directly).
      */
    /* CompleteClass */
    override def maybeAliasSymbolAs(
      ref: Reference[ClassDeclarationDeclarati],
      context: SourceFile,
      ngModuleName: String,
      isReExport: Boolean
    ): String | Null = js.native
    
    /* private */ var unifiedModulesHost: Any = js.native
  }
  
  trait AliasingHost extends StObject {
    
    /**
      * Controls whether any alias re-exports are rendered into .d.ts files.
      *
      * This is not always necessary for aliasing to function correctly, so this flag allows an
      * `AliasingHost` to avoid cluttering the .d.ts files if exports are not strictly needed.
      */
    val aliasExportsInDts: Boolean
    
    /**
      * Determine an `Expression` by which `decl` should be imported from `via` using an alias export
      * (which should have been previously created when compiling `via`).
      *
      * `getAliasIn` can return `null`, in which case no alias is needed to import `decl` from `via`
      * (and the normal import rules should be used).
      *
      * @param decl the declaration of the directive/pipe which is being imported, and which might be
      * aliased.
      * @param via the `ts.SourceFile` which might contain an alias to the
      */
    def getAliasIn(decl: ClassDeclarationDeclarati, via: SourceFile, isReExport: Boolean): Expression | Null
    
    /**
      * Determine a name by which `decl` should be re-exported from `context`, depending on the
      * particular set of aliasing rules in place.
      *
      * `maybeAliasSymbolAs` can return `null`, in which case no alias export should be generated.
      *
      * @param ref a `Reference` to the directive/pipe to consider for aliasing.
      * @param context the `ts.SourceFile` in which the alias re-export might need to be generated.
      * @param ngModuleName the declared name of the `NgModule` within `context` for which the alias
      * would be generated.
      * @param isReExport whether the directive/pipe under consideration is re-exported from another
      * NgModule (as opposed to being declared by it directly).
      */
    def maybeAliasSymbolAs(
      ref: Reference[ClassDeclarationDeclarati],
      context: SourceFile,
      ngModuleName: String,
      isReExport: Boolean
    ): String | Null
  }
  object AliasingHost {
    
    inline def apply(
      aliasExportsInDts: Boolean,
      getAliasIn: (ClassDeclarationDeclarati, SourceFile, Boolean) => Expression | Null,
      maybeAliasSymbolAs: (Reference[ClassDeclarationDeclarati], SourceFile, String, Boolean) => String | Null
    ): AliasingHost = {
      val __obj = js.Dynamic.literal(aliasExportsInDts = aliasExportsInDts.asInstanceOf[js.Any], getAliasIn = js.Any.fromFunction3(getAliasIn), maybeAliasSymbolAs = js.Any.fromFunction4(maybeAliasSymbolAs))
      __obj.asInstanceOf[AliasingHost]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AliasingHost] (val x: Self) extends AnyVal {
      
      inline def setAliasExportsInDts(value: Boolean): Self = StObject.set(x, "aliasExportsInDts", value.asInstanceOf[js.Any])
      
      inline def setGetAliasIn(value: (ClassDeclarationDeclarati, SourceFile, Boolean) => Expression | Null): Self = StObject.set(x, "getAliasIn", js.Any.fromFunction3(value))
      
      inline def setMaybeAliasSymbolAs(value: (Reference[ClassDeclarationDeclarati], SourceFile, String, Boolean) => String | Null): Self = StObject.set(x, "maybeAliasSymbolAs", js.Any.fromFunction4(value))
    }
  }
}

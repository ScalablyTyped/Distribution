package typings.angularCore

import typings.angularCore.definitionCollectorMod.ResolvedDirective
import typings.angularCore.definitionCollectorMod.ResolvedNgModule
import typings.angularCore.missingInjectableUpdateRecorderMod.UpdateRecorder
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object missingInjectableTransformMod {
  
  @JSImport("@angular/core/schematics/migrations/missing-injectable/transform", "MissingInjectableTransform")
  @js.native
  class MissingInjectableTransform protected () extends StObject {
    def this(typeChecker: TypeChecker, getUpdateRecorder: js.Function1[/* sf */ SourceFile, UpdateRecorder]) = this()
    
    /**
      * Migrates object literal providers which do not use "useValue", "useClass",
      * "useExisting" or "useFactory". These providers behave differently in Ivy. e.g.
      *
      * ```ts
      *   {provide: X} -> {provide: X, useValue: undefined} // this is how it behaves in VE
      *   {provide: X} -> {provide: X, useClass: X} // this is how it behaves in Ivy
      * ```
      *
      * To ensure forward compatibility, we migrate these empty object literal providers
      * to explicitly use `useValue: undefined`.
      */
    /* private */ var _migrateLiteralProviders: js.Any = js.native
    
    /**
      * Visits the given resolved value of a provider. Providers can be nested in
      * arrays and we need to recursively walk through the providers to be able to
      * migrate all referenced provider classes. e.g. "providers: [[A, [B]]]".
      */
    /* private */ var _visitProviderResolvedValue: js.Any = js.native
    
    /* private */ var getUpdateRecorder: js.Any = js.native
    
    /* private */ var importManager: js.Any = js.native
    
    /**
      * Migrates a given directive by walking through defined providers. This method
      * also handles components with "viewProviders" defined.
      */
    def migrateDirective(directive: ResolvedDirective): js.Array[AnalysisFailure] = js.native
    
    /**
      * Migrates all specified directives by walking through referenced providers
      * and decorating them with "@Injectable" if needed.
      */
    def migrateDirectives(directives: js.Array[ResolvedDirective]): js.Array[AnalysisFailure] = js.native
    
    /** Migrates a given NgModule by walking through the referenced providers. */
    def migrateModule(module: ResolvedNgModule): js.Array[AnalysisFailure] = js.native
    
    /**
      * Migrates all specified NgModule's by walking through referenced providers
      * and decorating them with "@Injectable" if needed.
      */
    def migrateModules(modules: js.Array[ResolvedNgModule]): js.Array[AnalysisFailure] = js.native
    
    def migrateProviderClass(node: ClassDeclaration, context: ResolvedDirective): Unit = js.native
    /**
      * Migrates a given provider class if it is not decorated with
      * any Angular decorator.
      */
    def migrateProviderClass(node: ClassDeclaration, context: ResolvedNgModule): Unit = js.native
    
    /* private */ var printer: js.Any = js.native
    
    /* private */ var providersEvaluator: js.Any = js.native
    
    def recordChanges(): Unit = js.native
    
    /* private */ var typeChecker: js.Any = js.native
    
    /** Set of provider class declarations which were already checked or migrated. */
    /* private */ var visitedProviderClasses: js.Any = js.native
    
    /** Set of provider object literals which were already checked or migrated. */
    /* private */ var visitedProviderLiterals: js.Any = js.native
  }
  
  trait AnalysisFailure extends StObject {
    
    var message: String
    
    var node: Node
  }
  object AnalysisFailure {
    
    inline def apply(message: String, node: Node): AnalysisFailure = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalysisFailure]
    }
    
    extension [Self <: AnalysisFailure](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}

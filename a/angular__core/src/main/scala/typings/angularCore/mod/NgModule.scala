package typings.angularCore.mod

import typings.angularCore.angularCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgModule extends StObject {
  
  /**
    * The set of components that are bootstrapped when
    * this module is bootstrapped. The components listed here
    * are automatically added to `entryComponents`.
    */
  var bootstrap: js.UndefOr[js.Array[Type[Any] | js.Array[Any]]] = js.undefined
  
  /**
    * The set of components, directives, and pipes ([declarables](guide/glossary#declarable))
    * that belong to this module.
    *
    * @usageNotes
    *
    * The set of selectors that are available to a template include those declared here, and
    * those that are exported from imported NgModules.
    *
    * Declarables must belong to exactly one module.
    * The compiler emits an error if you try to declare the same class in more than one module.
    * Be careful not to declare a class that is imported from another module.
    *
    * ### Example
    *
    * The following example allows the CommonModule to use the `NgFor`
    * directive.
    *
    * ```javascript
    * @NgModule({
    *   declarations: [NgFor]
    * })
    * class CommonModule {
    * }
    * ```
    */
  var declarations: js.UndefOr[js.Array[Type[Any] | js.Array[Any]]] = js.undefined
  
  /**
    * The set of components to compile when this NgModule is defined,
    * so that they can be dynamically loaded into the view.
    *
    * For each component listed here, Angular creates a `ComponentFactory`
    * and stores it in the `ComponentFactoryResolver`.
    *
    * Angular automatically adds components in the module's bootstrap
    * and route definitions into the `entryComponents` list. Use this
    * option to add components that are bootstrapped
    * using one of the imperative techniques, such as `ViewContainerRef.createComponent()`.
    *
    * @see [Entry Components](guide/entry-components)
    * @deprecated
    * Since 9.0.0. With Ivy, this property is no longer necessary.
    * (You may need to keep these if building a library that will be consumed by a View Engine
    * application.)
    */
  var entryComponents: js.UndefOr[js.Array[Type[Any] | js.Array[Any]]] = js.undefined
  
  /**
    * The set of components, directives, and pipes declared in this
    * NgModule that can be used in the template of any component that is part of an
    * NgModule that imports this NgModule. Exported declarations are the module's public API.
    *
    * A declarable belongs to one and only one NgModule.
    * A module can list another module among its exports, in which case all of that module's
    * public declaration are exported.
    *
    * @usageNotes
    *
    * Declarations are private by default.
    * If this ModuleA does not export UserComponent, then only the components within this
    * ModuleA can use UserComponent.
    *
    * ModuleA can import ModuleB and also export it, making exports from ModuleB
    * available to an NgModule that imports ModuleA.
    *
    * ### Example
    *
    * The following example exports the `NgFor` directive from CommonModule.
    *
    * ```javascript
    * @NgModule({
    *   exports: [NgFor]
    * })
    * class CommonModule {
    * }
    * ```
    */
  var exports: js.UndefOr[js.Array[Type[Any] | js.Array[Any]]] = js.undefined
  
  /**
    * A name or path that uniquely identifies this NgModule in `getNgModuleById`.
    * If left `undefined`, the NgModule is not registered with `getNgModuleById`.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The set of NgModules whose exported [declarables](guide/glossary#declarable)
    * are available to templates in this module.
    *
    * @usageNotes
    *
    * A template can use exported declarables from any
    * imported module, including those from modules that are imported indirectly
    * and re-exported.
    * For example, `ModuleA` imports `ModuleB`, and also exports
    * it, which makes the declarables from `ModuleB` available
    * wherever `ModuleA` is imported.
    *
    * ### Example
    *
    * The following example allows MainModule to use anything exported by
    * `CommonModule`:
    *
    * ```javascript
    * @NgModule({
    *   imports: [CommonModule]
    * })
    * class MainModule {
    * }
    * ```
    *
    */
  var imports: js.UndefOr[js.Array[Type[Any] | ModuleWithProviders[js.Object] | js.Array[Any]]] = js.undefined
  
  /**
    * When present, this module is ignored by the AOT compiler.
    * It remains in distributed code, and the JIT compiler attempts to compile it
    * at run time, in the browser.
    * To ensure the correct behavior, the app must import `@angular/compiler`.
    */
  var jit: js.UndefOr[`true`] = js.undefined
  
  /**
    * The set of injectable objects that are available in the injector
    * of this module.
    *
    * @see [Dependency Injection guide](guide/dependency-injection)
    * @see [NgModule guide](guide/providers)
    *
    * @usageNotes
    *
    * Dependencies whose providers are listed here become available for injection
    * into any component, directive, pipe or service that is a child of this injector.
    * The NgModule used for bootstrapping uses the root injector, and can provide dependencies
    * to any part of the app.
    *
    * A lazy-loaded module has its own injector, typically a child of the app root injector.
    * Lazy-loaded services are scoped to the lazy-loaded module's injector.
    * If a lazy-loaded module also provides the `UserService`, any component created
    * within that module's context (such as by router navigation) gets the local instance
    * of the service, not the instance in the root injector.
    * Components in external modules continue to receive the instance provided by their injectors.
    *
    * ### Example
    *
    * The following example defines a class that is injected in
    * the HelloWorld NgModule:
    *
    * ```
    * class Greeter {
    *    greet(name:string) {
    *      return 'Hello ' + name + '!';
    *    }
    * }
    *
    * @NgModule({
    *   providers: [
    *     Greeter
    *   ]
    * })
    * class HelloWorld {
    *   greeter:Greeter;
    *
    *   constructor(greeter:Greeter) {
    *     this.greeter = greeter;
    *   }
    * }
    * ```
    */
  var providers: js.UndefOr[js.Array[Provider]] = js.undefined
  
  /**
    * The set of schemas that declare elements to be allowed in the NgModule.
    * Elements and properties that are neither Angular components nor directives
    * must be declared in a schema.
    *
    * Allowed value are `NO_ERRORS_SCHEMA` and `CUSTOM_ELEMENTS_SCHEMA`.
    *
    * @security When using one of `NO_ERRORS_SCHEMA` or `CUSTOM_ELEMENTS_SCHEMA`
    * you must ensure that allowed elements and properties securely escape inputs.
    */
  var schemas: js.UndefOr[js.Array[SchemaMetadata | js.Array[Any]]] = js.undefined
}
object NgModule {
  
  @JSImport("@angular/core", "NgModule")
  @js.native
  val ^ : NgModuleDecorator = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgModule] (val x: Self) extends AnyVal {
    
    inline def setBootstrap(value: js.Array[Type[Any] | js.Array[Any]]): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    inline def setBootstrapUndefined: Self = StObject.set(x, "bootstrap", js.undefined)
    
    inline def setBootstrapVarargs(value: (Type[Any] | js.Array[Any])*): Self = StObject.set(x, "bootstrap", js.Array(value*))
    
    inline def setDeclarations(value: js.Array[Type[Any] | js.Array[Any]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    inline def setDeclarationsVarargs(value: (Type[Any] | js.Array[Any])*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setEntryComponents(value: js.Array[Type[Any] | js.Array[Any]]): Self = StObject.set(x, "entryComponents", value.asInstanceOf[js.Any])
    
    inline def setEntryComponentsUndefined: Self = StObject.set(x, "entryComponents", js.undefined)
    
    inline def setEntryComponentsVarargs(value: (Type[Any] | js.Array[Any])*): Self = StObject.set(x, "entryComponents", js.Array(value*))
    
    inline def setExports(value: js.Array[Type[Any] | js.Array[Any]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setExportsVarargs(value: (Type[Any] | js.Array[Any])*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImports(value: js.Array[Type[Any] | ModuleWithProviders[js.Object] | js.Array[Any]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: (Type[Any] | ModuleWithProviders[js.Object] | js.Array[Any])*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setJit(value: `true`): Self = StObject.set(x, "jit", value.asInstanceOf[js.Any])
    
    inline def setJitUndefined: Self = StObject.set(x, "jit", js.undefined)
    
    inline def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setSchemas(value: js.Array[SchemaMetadata | js.Array[Any]]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: (SchemaMetadata | js.Array[Any])*): Self = StObject.set(x, "schemas", js.Array(value*))
  }
}

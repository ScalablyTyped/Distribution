package typings
package atAngularCoreLib.srcDiReflectiveUnderscoreInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/reflective_injector", "ReflectiveInjector")
@js.native
abstract class ReflectiveInjector ()
  extends atAngularCoreLib.srcDiInjectorMod.Injector {
  /**
    * Parent of this injector.
    *
    * <!-- TODO: Add a link to the section of the user guide talking about hierarchical injection.
    * -->
    */
  val parent: atAngularCoreLib.srcDiInjectorMod.Injector | scala.Null = js.native
  /**
    * Creates a child injector from previously resolved providers.
    *
    * <!-- TODO: Add a link to the section of the user guide talking about hierarchical injection.
    * -->
    *
    * This API is the recommended way to construct injectors in performance-sensitive parts.
    *
    * @usageNotes
    * ### Example
    *
    * ```typescript
    * class ParentProvider {}
    * class ChildProvider {}
    *
    * var parentProviders = ReflectiveInjector.resolve([ParentProvider]);
    * var childProviders = ReflectiveInjector.resolve([ChildProvider]);
    *
    * var parent = ReflectiveInjector.fromResolvedProviders(parentProviders);
    * var child = parent.createChildFromResolved(childProviders);
    *
    * expect(child.get(ParentProvider) instanceof ParentProvider).toBe(true);
    * expect(child.get(ChildProvider) instanceof ChildProvider).toBe(true);
    * expect(child.get(ParentProvider)).toBe(parent.get(ParentProvider));
    * ```
    */
  def createChildFromResolved(
    providers: js.Array[atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider]
  ): ReflectiveInjector = js.native
  /**
    * Instantiates an object using a resolved provider in the context of the injector.
    *
    * The created object does not get cached by the injector.
    *
    * @usageNotes
    * ### Example
    *
    * ```typescript
    * @Injectable()
    * class Engine {
    * }
    *
    * @Injectable()
    * class Car {
    *   constructor(public engine:Engine) {}
    * }
    *
    * var injector = ReflectiveInjector.resolveAndCreate([Engine]);
    * var carProvider = ReflectiveInjector.resolve([Car])[0];
    * var car = injector.instantiateResolved(carProvider);
    * expect(car.engine).toBe(injector.get(Engine));
    * expect(car).not.toBe(injector.instantiateResolved(carProvider));
    * ```
    */
  def instantiateResolved(provider: atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider): js.Any = js.native
  /**
    * Resolves an array of providers and creates a child injector from those providers.
    *
    * <!-- TODO: Add a link to the section of the user guide talking about hierarchical injection.
    * -->
    *
    * The passed-in providers can be an array of `Type`, `Provider`,
    * or a recursive array of more providers.
    *
    * @usageNotes
    * ### Example
    *
    * ```typescript
    * class ParentProvider {}
    * class ChildProvider {}
    *
    * var parent = ReflectiveInjector.resolveAndCreate([ParentProvider]);
    * var child = parent.resolveAndCreateChild([ChildProvider]);
    *
    * expect(child.get(ParentProvider) instanceof ParentProvider).toBe(true);
    * expect(child.get(ChildProvider) instanceof ChildProvider).toBe(true);
    * expect(child.get(ParentProvider)).toBe(parent.get(ParentProvider));
    * ```
    */
  def resolveAndCreateChild(providers: js.Array[atAngularCoreLib.srcDiProviderMod.Provider]): ReflectiveInjector = js.native
  /**
    * Resolves a provider and instantiates an object in the context of the injector.
    *
    * The created object does not get cached by the injector.
    *
    * @usageNotes
    * ### Example
    *
    * ```typescript
    * @Injectable()
    * class Engine {
    * }
    *
    * @Injectable()
    * class Car {
    *   constructor(public engine:Engine) {}
    * }
    *
    * var injector = ReflectiveInjector.resolveAndCreate([Engine]);
    *
    * var car = injector.resolveAndInstantiate(Car);
    * expect(car.engine).toBe(injector.get(Engine));
    * expect(car).not.toBe(injector.resolveAndInstantiate(Car));
    * ```
    */
  def resolveAndInstantiate(provider: atAngularCoreLib.srcDiProviderMod.Provider): js.Any = js.native
}

/* static members */
@JSImport("@angular/core/src/di/reflective_injector", "ReflectiveInjector")
@js.native
object ReflectiveInjector extends js.Object {
  /**
    * Creates an injector from previously resolved providers.
    *
    * This API is the recommended way to construct injectors in performance-sensitive parts.
    *
    * @usageNotes
    * ### Example
    *
    * ```typescript
    * @Injectable()
    * class Engine {
    * }
    *
    * @Injectable()
    * class Car {
    *   constructor(public engine:Engine) {}
    * }
    *
    * var providers = ReflectiveInjector.resolve([Car, Engine]);
    * var injector = ReflectiveInjector.fromResolvedProviders(providers);
    * expect(injector.get(Car) instanceof Car).toBe(true);
    * ```
    */
  def fromResolvedProviders(
    providers: js.Array[atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider]
  ): atAngularCoreLib.srcDiReflectiveUnderscoreInjectorMod.ReflectiveInjector = js.native
  def fromResolvedProviders(
    providers: js.Array[atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider],
    parent: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcDiReflectiveUnderscoreInjectorMod.ReflectiveInjector = js.native
  /**
    * Turns an array of provider definitions into an array of resolved providers.
    *
    * A resolution is a process of flattening multiple nested arrays and converting individual
    * providers into an array of `ResolvedReflectiveProvider`s.
    *
    * @usageNotes
    * ### Example
    *
    * ```typescript
    * @Injectable()
    * class Engine {
    * }
    *
    * @Injectable()
    * class Car {
    *   constructor(public engine:Engine) {}
    * }
    *
    * var providers = ReflectiveInjector.resolve([Car, [[Engine]]]);
    *
    * expect(providers.length).toEqual(2);
    *
    * expect(providers[0] instanceof ResolvedReflectiveProvider).toBe(true);
    * expect(providers[0].key.displayName).toBe("Car");
    * expect(providers[0].dependencies.length).toEqual(1);
    * expect(providers[0].factory).toBeDefined();
    *
    * expect(providers[1].key.displayName).toBe("Engine");
    * });
    * ```
    *
    */
  def resolve(providers: js.Array[atAngularCoreLib.srcDiProviderMod.Provider]): js.Array[atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider] = js.native
  /**
    * Resolves an array of providers and creates an injector from those providers.
    *
    * The passed-in providers can be an array of `Type`, `Provider`,
    * or a recursive array of more providers.
    *
    * @usageNotes
    * ### Example
    *
    * ```typescript
    * @Injectable()
    * class Engine {
    * }
    *
    * @Injectable()
    * class Car {
    *   constructor(public engine:Engine) {}
    * }
    *
    * var injector = ReflectiveInjector.resolveAndCreate([Car, Engine]);
    * expect(injector.get(Car) instanceof Car).toBe(true);
    * ```
    */
  def resolveAndCreate(providers: js.Array[atAngularCoreLib.srcDiProviderMod.Provider]): atAngularCoreLib.srcDiReflectiveUnderscoreInjectorMod.ReflectiveInjector = js.native
  def resolveAndCreate(
    providers: js.Array[atAngularCoreLib.srcDiProviderMod.Provider],
    parent: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcDiReflectiveUnderscoreInjectorMod.ReflectiveInjector = js.native
}


package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import typings.aureliaDashDependencyDashInjection.Anon_Inject
import typings.aureliaDashDependencyDashInjection.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "Container")
@js.native
/**
  * Creates an instance of Container.
  * @param configuration Provides some configuration for the new Container instance.
  */
class Container () extends js.Object {
  def this(configuration: ContainerConfiguration) = this()
  /**
    * The parent container in the DI hierarchy.
    */
  var parent: Container = js.native
  /**
    * The root container in the DI hierarchy.
    */
  var root: Container = js.native
  def _createInvocationHandler(fn: js.Function with Anon_Inject): InvocationHandler = js.native
  def _get(key: js.Any): js.Any = js.native
  /**
    * Registers a type (constructor function) by inspecting its registration annotations. If none are found, then the default singleton registration is used.
    * @param key The key that identifies the dependency at resolution time; usually a constructor function.
    * @param fn The constructor function to use when the dependency needs to be instantiated. This defaults to the key value when fn is not supplied.
    */
  def autoRegister(key: js.Any): Resolver = js.native
  def autoRegister(key: js.Any, fn: js.Function): Resolver = js.native
  /**
    * Registers an array of types (constructor functions) by inspecting their registration annotations. If none are found, then the default singleton registration is used.
    * @param fns The constructor function to use when the dependency needs to be instantiated.
    */
  def autoRegisterAll(fns: js.Array[_]): Unit = js.native
  /**
    * Creates a new dependency injection container whose parent is the current container.
    * @return Returns a new container instance parented to this.
    */
  def createChild(): Container = js.native
  /**
    * Resolves a single instance based on the provided key.
    * @param key The key that identifies the object to resolve.
    * @return Returns the resolved instance.
    */
  def get(key: js.Any): js.Any = js.native
  /**
    * Resolves all instance registered under the provided key.
    * @param key The key that identifies the objects to resolve.
    * @return Returns an array of the resolved instances.
    */
  def getAll(key: js.Any): js.Array[_] = js.native
  /**
    * Gets the resolver for the particular key, if it has been registered.
    * @param key The key that identifies the dependency at resolution time; usually a constructor function.
    * @return Returns the resolver, if registred, otherwise undefined.
    */
  def getResolver(key: js.Any): js.Any = js.native
  /**
    * Inspects the container to determine if a particular key has been registred.
    * @param key The key that identifies the dependency at resolution time; usually a constructor function.
    * @param checkParent Indicates whether or not to check the parent container hierarchy.
    * @return Returns true if the key has been registred; false otherwise.
    */
  def hasResolver(key: js.Any): Boolean = js.native
  def hasResolver(key: js.Any, checkParent: Boolean): Boolean = js.native
  /**
    * Invokes a function, recursively resolving its dependencies.
    * @param fn The function to invoke with the auto-resolved dependencies.
    * @param dynamicDependencies Additional function dependencies to use during invocation.
    * @return Returns the instance resulting from calling the function.
    */
  def invoke(fn: js.Function with Anon_Name): js.Any = js.native
  def invoke(fn: js.Function with Anon_Name, dynamicDependencies: js.Array[_]): js.Any = js.native
  /**
    * Makes this container instance globally reachable through Container.instance.
    */
  def makeGlobal(): Container = js.native
  /**
    * Registers an additional key that serves as an alias to the original DI key.
    * @param originalKey The key that originally identified the dependency; usually a constructor function.
    * @param aliasKey An alternate key which can also be used to resolve the same dependency  as the original.
    * @return The resolver that was registered.
    */
  def registerAlias(originalKey: js.Any, aliasKey: js.Any): Resolver = js.native
  /**
    * Registers a custom resolution function such that the container calls this function for each request to obtain the instance.
    * @param key The key that identifies the dependency at resolution time; usually a constructor function.
    * @param handler The resolution function to use when the dependency is needed.
    * @return The resolver that was registered.
    */
  def registerHandler(
    key: js.Any,
    handler: js.Function3[
      /* container */ js.UndefOr[this.type], 
      /* key */ js.UndefOr[js.Any], 
      /* resolver */ js.UndefOr[Resolver], 
      _
    ]
  ): Resolver = js.native
  /**
    * Registers an existing object instance with the container.
    * @param key The key that identifies the dependency at resolution time; usually a constructor function.
    * @param instance The instance that will be resolved when the key is matched. This defaults to the key value when instance is not supplied.
    * @return The resolver that was registered.
    */
  def registerInstance(key: js.Any): Resolver = js.native
  def registerInstance(key: js.Any, instance: js.Any): Resolver = js.native
  /**
    * Registers a custom resolution function such that the container calls this function for each request to obtain the instance.
    * @param key The key that identifies the dependency at resolution time; usually a constructor function.
    * @param resolver The resolver to use when the dependency is needed.
    * @return The resolver that was registered.
    */
  def registerResolver(key: js.Any, resolver: Resolver): Resolver = js.native
  /**
    * Registers a type (constructor function) such that the container always returns the same instance for each request.
    * @param key The key that identifies the dependency at resolution time; usually a constructor function.
    * @param fn The constructor function to use when the dependency needs to be instantiated. This defaults to the key value when fn is not supplied.
    * @return The resolver that was registered.
    */
  def registerSingleton(key: js.Any): Resolver = js.native
  def registerSingleton(key: js.Any, fn: js.Function): Resolver = js.native
  /**
    * Registers a type (constructor function) such that the container returns a new instance for each request.
    * @param key The key that identifies the dependency at resolution time; usually a constructor function.
    * @param fn The constructor function to use when the dependency needs to be instantiated. This defaults to the key value when fn is not supplied.
    * @return The resolver that was registered.
    */
  def registerTransient(key: js.Any): Resolver = js.native
  def registerTransient(key: js.Any, fn: js.Function): Resolver = js.native
  /**
    * Sets an invocation handler creation callback that will be called when new InvocationsHandlers are created (called once per Function).
    * @param onHandlerCreated The callback to be called when an InvocationsHandler is created.
    */
  def setHandlerCreatedCallback(onHandlerCreated: js.Function1[/* handler */ InvocationHandler, InvocationHandler]): Unit = js.native
  /**
    * Unregisters based on key.
    * @param key The key that identifies the dependency at resolution time; usually a constructor function.
    */
  def unregister(key: js.Any): Unit = js.native
}

/* static members */
@JSImport("aurelia-dependency-injection", "Container")
@js.native
object Container extends js.Object {
  /**
    * The global root Container instance. Available if makeGlobal() has been called. Aurelia Framework calls makeGlobal().
    */
  var instance: Container = js.native
}


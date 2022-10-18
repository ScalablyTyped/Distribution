package typings.aureliaDependencyInjection.mod

import typings.aureliaDependencyInjection.anon.Inject
import typings.aureliaDependencyInjection.anon.TypeofContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "Container")
@js.native
open class Container () extends StObject {
  def this(configuration: ContainerConfiguration) = this()
  
  def _createInvocationHandler[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](fn: (DependencyCtorOrFunctor[TBase, TImpl, TArgs]) & Inject): InvocationHandler[TBase, TImpl, TArgs] = js.native
  
  def _get(key: Any): Any = js.native
  
  def autoRegister[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs]): Resolver_ = js.native
  def autoRegister[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs], fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]): Resolver_ = js.native
  def autoRegister[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: Primitive, fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]): Resolver_ = js.native
  
  def autoRegisterAll(fns: js.Array[DependencyCtor[Any, Any, Any]]): Unit = js.native
  
  def createChild(): Container = js.native
  
  def get[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: TypeofContainer): Container = js.native
  def get[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): ImplOrAny[TImpl] = js.native
  
  def getAll[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): js.Array[ImplOrAny[TImpl]] = js.native
  
  def getResolver[TStrategyKey /* <: /* keyof aurelia-dependency-injection.aurelia-dependency-injection.StrategyState<TBase, TImpl, TArgs> */ String */, TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]): StrategyResolver[TBase, TImpl, TArgs, TStrategyKey] = js.native
  
  def hasResolver[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): Boolean = js.native
  def hasResolver[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], checkParent: Boolean): Boolean = js.native
  
  def invoke[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]): ImplOrAny[TImpl] = js.native
  def invoke[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs],
    dynamicDependencies: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]
  ): ImplOrAny[TImpl] = js.native
  
  def makeGlobal(): Container = js.native
  
  var parent: Container = js.native
  
  def registerAlias[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    originalKey: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs],
    aliasKey: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]
  ): Resolver_ = js.native
  
  def registerHandler[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs],
    handler: js.Function3[
      /* container */ js.UndefOr[this.type], 
      /* key */ js.UndefOr[PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]], 
      /* resolver */ js.UndefOr[Resolver_], 
      Any
    ]
  ): Resolver_ = js.native
  
  def registerInstance[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): Resolver_ = js.native
  def registerInstance[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], instance: TImpl): Resolver_ = js.native
  
  def registerResolver[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], resolver: Resolver_): Resolver_ = js.native
  
  def registerSingleton[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs]): Resolver_ = js.native
  def registerSingleton[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs], fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]): Resolver_ = js.native
  def registerSingleton[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: Primitive, fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]): Resolver_ = js.native
  
  def registerTransient[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs]): Resolver_ = js.native
  def registerTransient[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs], fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]): Resolver_ = js.native
  def registerTransient[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: Primitive, fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]): Resolver_ = js.native
  
  var root: Container = js.native
  
  def setHandlerCreatedCallback[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    onHandlerCreated: js.Function1[
      /* handler */ InvocationHandler[TBase, TImpl, TArgs], 
      InvocationHandler[TBase, TImpl, TArgs]
    ]
  ): Unit = js.native
  
  def unregister(key: Any): Unit = js.native
}
/* static members */
object Container {
  
  @JSImport("aurelia-dependency-injection", "Container")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aurelia-dependency-injection", "Container.instance")
  @js.native
  def instance: Container = js.native
  inline def instance_=(x: Container): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
}

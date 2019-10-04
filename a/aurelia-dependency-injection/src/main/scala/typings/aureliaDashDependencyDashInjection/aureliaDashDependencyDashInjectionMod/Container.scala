package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import typings.aureliaDashDependencyDashInjection.Anon_InjectAny
import typings.aureliaDashDependencyDashInjection.TypeofClassContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "Container")
@js.native
class Container () extends js.Object {
  def this(configuration: ContainerConfiguration) = this()
  var parent: Container = js.native
  var root: Container = js.native
  def _createInvocationHandler[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](fn: (DependencyCtorOrFunctor[TBase, TImpl, TArgs]) with Anon_InjectAny): InvocationHandler[TBase, TImpl, TArgs] = js.native
  def _get(key: js.Any): js.Any = js.native
  def autoRegister[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs]): Resolver = js.native
  def autoRegister[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs], fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]): Resolver = js.native
  def autoRegister[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: Primitive, fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]): Resolver = js.native
  def autoRegisterAll(fns: js.Array[DependencyCtor[_, _, _]]): Unit = js.native
  def createChild(): Container = js.native
  def get[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: TypeofClassContainer): Container = js.native
  def get[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): ImplOrAny[TImpl] = js.native
  def getAll[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): js.Array[ImplOrAny[TImpl]] = js.native
  def getResolver[TStrategyKey /* <: String */, TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]): StrategyResolver[TBase, TImpl, TArgs, TStrategyKey] = js.native
  def hasResolver[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): Boolean = js.native
  def hasResolver[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], checkParent: Boolean): Boolean = js.native
  def invoke[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]): ImplOrAny[TImpl] = js.native
  def invoke[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs],
    dynamicDependencies: js.Array[
      /* import warning: ImportType.apply Failed type conversion: TArgs[number] */ js.Any
    ]
  ): ImplOrAny[TImpl] = js.native
  def makeGlobal(): Container = js.native
  def registerAlias[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    originalKey: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs],
    aliasKey: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]
  ): Resolver = js.native
  def registerHandler[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs],
    handler: js.Function3[
      /* container */ js.UndefOr[this.type], 
      /* key */ js.UndefOr[PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]], 
      /* resolver */ js.UndefOr[Resolver], 
      _
    ]
  ): Resolver = js.native
  def registerInstance[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): Resolver = js.native
  def registerInstance[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], instance: TImpl): Resolver = js.native
  def registerResolver[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], resolver: Resolver): Resolver = js.native
  def registerSingleton[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs]): Resolver = js.native
  def registerSingleton[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs], fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]): Resolver = js.native
  def registerSingleton[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: Primitive, fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]): Resolver = js.native
  def registerTransient[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs]): Resolver = js.native
  def registerTransient[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: DependencyCtor[TBase, TImpl, TArgs], fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]): Resolver = js.native
  def registerTransient[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: Primitive, fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]): Resolver = js.native
  def setHandlerCreatedCallback[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    onHandlerCreated: js.Function1[
      /* handler */ InvocationHandler[TBase, TImpl, TArgs], 
      InvocationHandler[TBase, TImpl, TArgs]
    ]
  ): Unit = js.native
  def unregister(key: js.Any): Unit = js.native
}

/* static members */
@JSImport("aurelia-dependency-injection", "Container")
@js.native
object Container extends js.Object {
  var instance: Container = js.native
}


package typings.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invoker_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def invoke(container: Container, fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs], dependencies: TArgs): ImplOrAny[TImpl] = js.native
  def invokeWithDynamicDependencies(
    container: Container,
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs],
    staticDependencies: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ],
    dynamicDependencies: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]
  ): ImplOrAny[TImpl] = js.native
}

object Invoker_ {
  @scala.inline
  def apply[TBase, /* <: typings.aureliaDependencyInjection.mod.Impl[TBase] */ TImpl, /* <: typings.aureliaDependencyInjection.mod.Args[TBase] */ TArgs](
    invoke: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], TArgs) => ImplOrAny[TImpl],
    invokeWithDynamicDependencies: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ], js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]) => ImplOrAny[TImpl]
  ): Invoker_[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction3(invoke), invokeWithDynamicDependencies = js.Any.fromFunction4(invokeWithDynamicDependencies))
    __obj.asInstanceOf[Invoker_[TBase, TImpl, TArgs]]
  }
  @scala.inline
  implicit class Invoker_Ops[Self <: Invoker_[_, _, _], TBase, /* <: typings.aureliaDependencyInjection.mod.Impl[TBase] */ TImpl, /* <: typings.aureliaDependencyInjection.mod.Args[TBase] */ TArgs] (val x: Self with (Invoker_[TBase, TImpl, TArgs])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInvoke(value: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], TArgs) => ImplOrAny[TImpl]): Self = this.set("invoke", js.Any.fromFunction3(value))
    @scala.inline
    def setInvokeWithDynamicDependencies(
      value: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
        ], js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
        ]) => ImplOrAny[TImpl]
    ): Self = this.set("invokeWithDynamicDependencies", js.Any.fromFunction4(value))
  }
  
}


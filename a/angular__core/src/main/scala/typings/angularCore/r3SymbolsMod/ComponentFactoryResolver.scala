package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple registry that maps `Components` to generated `ComponentFactory` classes
  * that can be used to create instances of components.
  * Use to obtain the factory for a given component type,
  * then use the factory's `create()` method to create a component of that type.
  *
  * @see [Dynamic Components](guide/dynamic-component-loader)
  * @publicApi
  */
@js.native
trait ComponentFactoryResolver extends js.Object {
  /**
    * Retrieves the factory object that creates a component of the given type.
    * @param component The component type.
    */
  def resolveComponentFactory[T](component: Type[T]): ComponentFactory[T] = js.native
}

object ComponentFactoryResolver {
  @scala.inline
  def apply(resolveComponentFactory: Type[js.Any] => ComponentFactory[js.Any]): ComponentFactoryResolver = {
    val __obj = js.Dynamic.literal(resolveComponentFactory = js.Any.fromFunction1(resolveComponentFactory))
    __obj.asInstanceOf[ComponentFactoryResolver]
  }
  @scala.inline
  implicit class ComponentFactoryResolverOps[Self <: ComponentFactoryResolver] (val x: Self) extends AnyVal {
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
    def setResolveComponentFactory(value: Type[js.Any] => ComponentFactory[js.Any]): Self = this.set("resolveComponentFactory", js.Any.fromFunction1(value))
  }
  
}


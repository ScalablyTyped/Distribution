package typings.antDesignCreateReactContext.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[T] extends js.Object {
  var Consumer: ComponentClass[ConsumerProps[T], ComponentState]
  var Provider: ComponentClass[ProviderProps[T], ComponentState]
}

object Context {
  @scala.inline
  def apply[T](
    Consumer: ComponentClass[ConsumerProps[T], ComponentState],
    Provider: ComponentClass[ProviderProps[T], ComponentState]
  ): Context[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context[T]]
  }
}


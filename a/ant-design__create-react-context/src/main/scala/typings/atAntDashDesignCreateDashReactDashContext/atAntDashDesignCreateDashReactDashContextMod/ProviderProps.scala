package typings.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps[T] extends js.Object {
  var children: ReactNode
  var value: T
}

object ProviderProps {
  @scala.inline
  def apply[T](children: ReactNode, value: T): ProviderProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProviderProps[T]]
  }
}


package typings
package atAntDashDesignCreateDashReactDashContextLib.atAntDashDesignCreateDashReactDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerProps[T] extends js.Object {
  var children: atAntDashDesignCreateDashReactDashContextLib.RenderFn[T] | js.Array[atAntDashDesignCreateDashReactDashContextLib.RenderFn[T]]
  var observedBits: js.UndefOr[scala.Double] = js.undefined
}

object ConsumerProps {
  @scala.inline
  def apply[T](
    children: atAntDashDesignCreateDashReactDashContextLib.RenderFn[T] | js.Array[atAntDashDesignCreateDashReactDashContextLib.RenderFn[T]],
    observedBits: scala.Int | scala.Double = null
  ): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (observedBits != null) __obj.updateDynamic("observedBits")(observedBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerProps[T]]
  }
}


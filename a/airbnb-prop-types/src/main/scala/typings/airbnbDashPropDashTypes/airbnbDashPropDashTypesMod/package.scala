package typings.airbnbDashPropDashTypes

import typings.propDashTypes.propDashTypesMod.ReactNodeLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object airbnbDashPropDashTypesMod {
  type ReactFunctionComponentLike = js.Function1[/* repeated */ js.Any, ReactNodeLike]
  type ReactLegacyRefLike[T] = (js.Function1[/* instance */ T | Null, Unit]) | ReactRefLike[T]
  type ReactTypeLike = String | ReactClassComponentLike | ReactFunctionComponentLike
}

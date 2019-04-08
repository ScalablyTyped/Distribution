package typings
package airbnbDashPropDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object airbnbDashPropDashTypesMod {
  type ReactFunctionComponentLike = js.Function1[/* repeated */ js.Any, propDashTypesLib.propDashTypesMod.ReactNodeLike]
  type ReactLegacyRefLike[T] = (js.Function1[/* instance */ T | scala.Null, scala.Unit]) | ReactRefLike[T]
  type ReactTypeLike = java.lang.String | ReactClassComponentLike | ReactFunctionComponentLike
}

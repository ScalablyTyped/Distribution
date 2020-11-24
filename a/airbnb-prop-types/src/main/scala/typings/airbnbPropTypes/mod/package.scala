package typings.airbnbPropTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ReactFunctionComponentLike = js.Function1[/* repeated */ js.Any, typings.propTypes.mod.ReactNodeLike]
  
  type ReactLegacyRefLike[T] = (js.Function1[/* instance */ T | scala.Null, scala.Unit]) | typings.airbnbPropTypes.mod.ReactRefLike[T]
  
  type ReactTypeLike = java.lang.String | typings.airbnbPropTypes.mod.ReactClassComponentLike | typings.airbnbPropTypes.mod.ReactFunctionComponentLike
}

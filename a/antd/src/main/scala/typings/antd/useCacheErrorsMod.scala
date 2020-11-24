package typings.antd

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/form/hooks/useCacheErrors", JSImport.Namespace)
@js.native
object useCacheErrorsMod extends js.Object {
  
  def default(
    errors: js.Array[ReactNode],
    changeTrigger: js.Function1[/* visible */ Boolean, Unit],
    directly: Boolean
  ): js.Tuple2[Boolean, js.Array[ReactNode]] = js.native
}

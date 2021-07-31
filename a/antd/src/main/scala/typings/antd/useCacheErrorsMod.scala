package typings.antd

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCacheErrorsMod {
  
  @JSImport("antd/lib/form/hooks/useCacheErrors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    errors: js.Array[ReactNode],
    changeTrigger: js.Function1[/* visible */ Boolean, Unit],
    directly: Boolean
  ): js.Tuple2[Boolean, js.Array[ReactNode]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(errors.asInstanceOf[js.Any], changeTrigger.asInstanceOf[js.Any], directly.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, js.Array[ReactNode]]]
}

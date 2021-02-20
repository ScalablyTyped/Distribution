package typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFrameStateMod {
  
  @JSImport("antd/lib/form/hooks/useFrameState", JSImport.Default)
  @js.native
  def default[ValueType](defaultValue: ValueType): js.Tuple2[ValueType, js.Function1[/* updater */ Updater[ValueType], Unit]] = js.native
  
  type Updater[ValueType] = js.Function1[/* prev */ js.UndefOr[ValueType], ValueType]
}

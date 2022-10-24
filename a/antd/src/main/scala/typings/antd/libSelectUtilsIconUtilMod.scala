package typings.antd

import typings.antd.anon.ClearIcon
import typings.antd.anon.ItemIcon
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectUtilsIconUtilMod {
  
  @JSImport("antd/lib/select/utils/iconUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: ClearIcon): ItemIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[ItemIcon]
  
  type RenderNode = ReactNode | (js.Function1[/* props */ Any, ReactNode])
}

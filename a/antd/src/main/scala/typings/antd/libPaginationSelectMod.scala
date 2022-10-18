package typings.antd

import typings.antd.libSelectMod.SelectProps
import typings.rcSelect.libSelectMod.DefaultOptionType
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationSelectMod {
  
  @JSImport("antd/lib/pagination/Select", "MiddleSelect")
  @js.native
  val MiddleSelect: MiniOrMiddleSelectInterface = js.native
  
  @JSImport("antd/lib/pagination/Select", "MiniSelect")
  @js.native
  val MiniSelect: MiniOrMiddleSelectInterface = js.native
  
  @js.native
  trait MiniOrMiddleSelectInterface
    extends StObject
       with FunctionComponent[SelectProps[Any, DefaultOptionType]] {
    
    var Option: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Select.Option */ Any = js.native
  }
}

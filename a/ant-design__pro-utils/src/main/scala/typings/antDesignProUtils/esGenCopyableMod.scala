package typings.antDesignProUtils

import typings.react.mod.ReactFragment
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGenCopyableMod {
  
  @JSImport("@ant-design/pro-utils/es/genCopyable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def genCopyable(dom: ReactNode, item: Any, text: String): js.UndefOr[String | Double | Boolean | ReactFragment | Element | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("genCopyable")(dom.asInstanceOf[js.Any], item.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Double | Boolean | ReactFragment | Element | Null]]
}

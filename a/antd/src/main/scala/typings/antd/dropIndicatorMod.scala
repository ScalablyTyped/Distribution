package typings.antd

import typings.antd.anon.DropLevelOffset
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropIndicatorMod {
  
  @JSImport("antd/lib/tree/utils/dropIndicator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: DropLevelOffset): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("antd/lib/tree/utils/dropIndicator", "offset")
  @js.native
  val offset: /* 4 */ Double = js.native
}

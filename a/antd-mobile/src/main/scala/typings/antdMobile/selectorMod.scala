package typings.antdMobile

import typings.antdMobile.selectorSelectorMod.SelectorProps
import typings.antdMobile.selectorSelectorMod.SelectorValue
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorMod {
  
  @JSImport("antd-mobile/es/components/selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V /* <: SelectorValue */](p: SelectorProps[V]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
}

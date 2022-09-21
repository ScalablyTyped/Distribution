package typings.antd

import typings.antd.antdStrings.warn
import typings.antd.confirmMod.ModalStaticFunctions
import typings.react.mod.ReactElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useModalMod {
  
  @JSImport("antd/lib/modal/useModal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple2[Omit[ModalStaticFunctions, warn], ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[Omit[ModalStaticFunctions, warn], ReactElement]]
}

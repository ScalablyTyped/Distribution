package typings.antd

import typings.rcInput.esInterfaceMod.InputRef
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputHooksUseRemovePasswordTimeoutMod {
  
  @JSImport("antd/lib/input/hooks/useRemovePasswordTimeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(inputRef: RefObject[InputRef]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(inputRef.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def default(inputRef: RefObject[InputRef], triggerOnMount: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inputRef.asInstanceOf[js.Any], triggerOnMount.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}

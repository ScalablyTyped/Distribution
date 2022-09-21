package typings.antd

import typings.antd.clearableLabeledInputMod.ClearableInputProps
import typings.antd.inputInputMod.InputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputUtilsMod {
  
  @JSImport("antd/lib/input/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasPrefixSuffix(props: ClearableInputProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPrefixSuffix")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasPrefixSuffix(props: InputProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPrefixSuffix")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

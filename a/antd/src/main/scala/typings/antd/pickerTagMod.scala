package typings.antd

import typings.antd.tagMod.TagProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerTagMod {
  
  @JSImport("antd/lib/date-picker/PickerTag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TagProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}

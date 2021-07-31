package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.generatePickerMod.PickerLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeKoKRMod extends Shortcut {
  
  @JSImport("antd/lib/date-picker/locale/ko_KR", JSImport.Default)
  @js.native
  val default: PickerLocale = js.native
  
  type _To = PickerLocale
  
  /* This means you don't have to write `default`, but can instead just say `localeKoKRMod.foo` */
  override def _to: PickerLocale = default
}

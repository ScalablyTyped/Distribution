package typings.antdMobile.mod

import typings.antdMobile.anon.AutoHeight
import typings.antdMobile.textareaItemMod.TextareaItemProps
import typings.antdMobile.textareaItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "TextareaItem")
@js.native
class TextareaItem protected () extends default {
  def this(props: TextareaItemProps) = this()
}
/* static members */
object TextareaItem {
  
  @JSImport("antd-mobile", "TextareaItem")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile", "TextareaItem.defaultProps")
  @js.native
  def defaultProps: AutoHeight = js.native
  inline def defaultProps_=(x: AutoHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}

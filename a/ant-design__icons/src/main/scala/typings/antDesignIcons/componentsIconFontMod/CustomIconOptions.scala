package typings.antDesignIcons.componentsIconFontMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomIconOptions extends js.Object {
  
  var extraCommonProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var scriptUrl: js.UndefOr[String | js.Array[String]] = js.native
}
object CustomIconOptions {
  
  @scala.inline
  def apply(): CustomIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomIconOptions]
  }
  
  @scala.inline
  implicit class CustomIconOptionsOps[Self <: CustomIconOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtraCommonProps(value: StringDictionary[js.Any]): Self = this.set("extraCommonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraCommonProps: Self = this.set("extraCommonProps", js.undefined)
    
    @scala.inline
    def setScriptUrlVarargs(value: String*): Self = this.set("scriptUrl", js.Array(value :_*))
    
    @scala.inline
    def setScriptUrl(value: String | js.Array[String]): Self = this.set("scriptUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptUrl: Self = this.set("scriptUrl", js.undefined)
  }
}

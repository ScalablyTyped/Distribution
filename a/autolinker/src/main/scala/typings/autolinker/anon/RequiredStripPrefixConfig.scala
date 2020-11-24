package typings.autolinker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<autolinker.autolinker/dist/commonjs/autolinker.StripPrefixConfigObj> */
@js.native
trait RequiredStripPrefixConfig extends js.Object {
  
  var scheme: Boolean = js.native
  
  var www: Boolean = js.native
}
object RequiredStripPrefixConfig {
  
  @scala.inline
  def apply(scheme: Boolean, www: Boolean): RequiredStripPrefixConfig = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any], www = www.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredStripPrefixConfig]
  }
  
  @scala.inline
  implicit class RequiredStripPrefixConfigOps[Self <: RequiredStripPrefixConfig] (val x: Self) extends AnyVal {
    
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
    def setScheme(value: Boolean): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWww(value: Boolean): Self = this.set("www", value.asInstanceOf[js.Any])
  }
}

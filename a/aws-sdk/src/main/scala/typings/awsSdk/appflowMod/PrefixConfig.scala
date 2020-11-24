package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixConfig extends js.Object {
  
  /**
    *  Determines the format of the prefix, and whether it applies to the file name, file path, or both. 
    */
  var prefixFormat: js.UndefOr[PrefixFormat] = js.native
  
  /**
    *  Determines the level of granularity that's included in the prefix. 
    */
  var prefixType: js.UndefOr[PrefixType] = js.native
}
object PrefixConfig {
  
  @scala.inline
  def apply(): PrefixConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixConfig]
  }
  
  @scala.inline
  implicit class PrefixConfigOps[Self <: PrefixConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrefixFormat(value: PrefixFormat): Self = this.set("prefixFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixFormat: Self = this.set("prefixFormat", js.undefined)
    
    @scala.inline
    def setPrefixType(value: PrefixType): Self = this.set("prefixType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixType: Self = this.set("prefixType", js.undefined)
  }
}

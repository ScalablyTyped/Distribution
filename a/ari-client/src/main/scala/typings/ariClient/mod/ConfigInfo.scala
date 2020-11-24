package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigInfo extends js.Object {
  
  /**
    * Default language for media playback.
    */
  var default_language: String = js.native
  
  /**
    * Maximum number of simultaneous channels.
    */
  var max_channels: js.UndefOr[Double] = js.native
  
  /**
    * Maximum load avg on system.
    */
  var max_load: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of open file handles (files, sockets).
    */
  var max_open_files: js.UndefOr[Double] = js.native
  
  /**
    * Asterisk system name.
    */
  var name: String = js.native
  
  /**
    * Effective user/group id for running Asterisk.
    */
  var setid: SetId = js.native
}
object ConfigInfo {
  
  @scala.inline
  def apply(default_language: String, name: String, setid: SetId): ConfigInfo = {
    val __obj = js.Dynamic.literal(default_language = default_language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setid = setid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigInfo]
  }
  
  @scala.inline
  implicit class ConfigInfoOps[Self <: ConfigInfo] (val x: Self) extends AnyVal {
    
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
    def setDefault_language(value: String): Self = this.set("default_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetid(value: SetId): Self = this.set("setid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_channels(value: Double): Self = this.set("max_channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_channels: Self = this.set("max_channels", js.undefined)
    
    @scala.inline
    def setMax_load(value: Double): Self = this.set("max_load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_load: Self = this.set("max_load", js.undefined)
    
    @scala.inline
    def setMax_open_files(value: Double): Self = this.set("max_open_files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_open_files: Self = this.set("max_open_files", js.undefined)
  }
}

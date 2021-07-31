package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigInfo extends StObject {
  
  /**
    * Default language for media playback.
    */
  var default_language: String
  
  /**
    * Maximum number of simultaneous channels.
    */
  var max_channels: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum load avg on system.
    */
  var max_load: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum number of open file handles (files, sockets).
    */
  var max_open_files: js.UndefOr[Double] = js.undefined
  
  /**
    * Asterisk system name.
    */
  var name: String
  
  /**
    * Effective user/group id for running Asterisk.
    */
  var setid: SetId
}
object ConfigInfo {
  
  @scala.inline
  def apply(default_language: String, name: String, setid: SetId): ConfigInfo = {
    val __obj = js.Dynamic.literal(default_language = default_language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setid = setid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigInfo]
  }
  
  @scala.inline
  implicit class ConfigInfoMutableBuilder[Self <: ConfigInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault_language(value: String): Self = StObject.set(x, "default_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_channels(value: Double): Self = StObject.set(x, "max_channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_channelsUndefined: Self = StObject.set(x, "max_channels", js.undefined)
    
    @scala.inline
    def setMax_load(value: Double): Self = StObject.set(x, "max_load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_loadUndefined: Self = StObject.set(x, "max_load", js.undefined)
    
    @scala.inline
    def setMax_open_files(value: Double): Self = StObject.set(x, "max_open_files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_open_filesUndefined: Self = StObject.set(x, "max_open_files", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetid(value: SetId): Self = StObject.set(x, "setid", value.asInstanceOf[js.Any])
  }
}

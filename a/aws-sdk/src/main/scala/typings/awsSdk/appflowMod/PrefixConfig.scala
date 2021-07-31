package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixConfig extends StObject {
  
  /**
    *  Determines the format of the prefix, and whether it applies to the file name, file path, or both. 
    */
  var prefixFormat: js.UndefOr[PrefixFormat] = js.undefined
  
  /**
    *  Determines the level of granularity that's included in the prefix. 
    */
  var prefixType: js.UndefOr[PrefixType] = js.undefined
}
object PrefixConfig {
  
  @scala.inline
  def apply(): PrefixConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixConfig]
  }
  
  @scala.inline
  implicit class PrefixConfigMutableBuilder[Self <: PrefixConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefixFormat(value: PrefixFormat): Self = StObject.set(x, "prefixFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixFormatUndefined: Self = StObject.set(x, "prefixFormat", js.undefined)
    
    @scala.inline
    def setPrefixType(value: PrefixType): Self = StObject.set(x, "prefixType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixTypeUndefined: Self = StObject.set(x, "prefixType", js.undefined)
  }
}

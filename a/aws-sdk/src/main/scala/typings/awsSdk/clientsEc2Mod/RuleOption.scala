package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleOption extends StObject {
  
  /**
    * The Suricata keyword.
    */
  var Keyword: js.UndefOr[String] = js.undefined
  
  /**
    * The settings for the keyword.
    */
  var Settings: js.UndefOr[StringList] = js.undefined
}
object RuleOption {
  
  inline def apply(): RuleOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleOption] (val x: Self) extends AnyVal {
    
    inline def setKeyword(value: String): Self = StObject.set(x, "Keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "Keyword", js.undefined)
    
    inline def setSettings(value: StringList): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    inline def setSettingsVarargs(value: String*): Self = StObject.set(x, "Settings", js.Array(value*))
  }
}

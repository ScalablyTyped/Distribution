package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleOption extends StObject {
  
  /**
    * 
    */
  var Keyword: typings.awsSdk.clientsNetworkfirewallMod.Keyword
  
  /**
    * 
    */
  var Settings: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.Settings] = js.undefined
}
object RuleOption {
  
  inline def apply(Keyword: Keyword): RuleOption = {
    val __obj = js.Dynamic.literal(Keyword = Keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOption]
  }
  
  extension [Self <: RuleOption](x: Self) {
    
    inline def setKeyword(value: Keyword): Self = StObject.set(x, "Keyword", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    inline def setSettingsVarargs(value: Setting*): Self = StObject.set(x, "Settings", js.Array(value*))
  }
}

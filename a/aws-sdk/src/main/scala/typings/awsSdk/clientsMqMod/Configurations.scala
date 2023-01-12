package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configurations extends StObject {
  
  /**
    * The broker's current configuration.
    */
  var Current: js.UndefOr[ConfigurationId] = js.undefined
  
  /**
    * The history of configurations applied to the broker.
    */
  var History: js.UndefOr[listOfConfigurationId] = js.undefined
  
  /**
    * The broker's pending configuration.
    */
  var Pending: js.UndefOr[ConfigurationId] = js.undefined
}
object Configurations {
  
  inline def apply(): Configurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configurations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Configurations] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: ConfigurationId): Self = StObject.set(x, "Current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "Current", js.undefined)
    
    inline def setHistory(value: listOfConfigurationId): Self = StObject.set(x, "History", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "History", js.undefined)
    
    inline def setHistoryVarargs(value: ConfigurationId*): Self = StObject.set(x, "History", js.Array(value*))
    
    inline def setPending(value: ConfigurationId): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
    
    inline def setPendingUndefined: Self = StObject.set(x, "Pending", js.undefined)
  }
}

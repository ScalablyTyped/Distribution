package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CORSConfiguration extends StObject {
  
  /**
    * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the configuration.
    */
  var CORSRules: typings.awsSdk.clientsS3Mod.CORSRules
}
object CORSConfiguration {
  
  inline def apply(CORSRules: CORSRules): CORSConfiguration = {
    val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CORSConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCORSRules(value: CORSRules): Self = StObject.set(x, "CORSRules", value.asInstanceOf[js.Any])
    
    inline def setCORSRulesVarargs(value: CORSRule*): Self = StObject.set(x, "CORSRules", js.Array(value*))
  }
}

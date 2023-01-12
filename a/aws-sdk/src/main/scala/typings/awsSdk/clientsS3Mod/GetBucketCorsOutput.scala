package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketCorsOutput extends StObject {
  
  /**
    * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the configuration.
    */
  var CORSRules: js.UndefOr[typings.awsSdk.clientsS3Mod.CORSRules] = js.undefined
}
object GetBucketCorsOutput {
  
  inline def apply(): GetBucketCorsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketCorsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketCorsOutput] (val x: Self) extends AnyVal {
    
    inline def setCORSRules(value: CORSRules): Self = StObject.set(x, "CORSRules", value.asInstanceOf[js.Any])
    
    inline def setCORSRulesUndefined: Self = StObject.set(x, "CORSRules", js.undefined)
    
    inline def setCORSRulesVarargs(value: CORSRule*): Self = StObject.set(x, "CORSRules", js.Array(value*))
  }
}

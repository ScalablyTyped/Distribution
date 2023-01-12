package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketLifecycleConfigurationOutput extends StObject {
  
  /**
    * Container for a lifecycle rule.
    */
  var Rules: js.UndefOr[LifecycleRules] = js.undefined
}
object GetBucketLifecycleConfigurationOutput {
  
  inline def apply(): GetBucketLifecycleConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketLifecycleConfigurationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketLifecycleConfigurationOutput] (val x: Self) extends AnyVal {
    
    inline def setRules(value: LifecycleRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: LifecycleRule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}

package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDistributionConfigResult extends StObject {
  
  /**
    * The distribution's configuration information.
    */
  var DistributionConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.DistributionConfig] = js.undefined
  
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
}
object GetDistributionConfigResult {
  
  inline def apply(): GetDistributionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionConfigResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDistributionConfigResult] (val x: Self) extends AnyVal {
    
    inline def setDistributionConfig(value: DistributionConfig): Self = StObject.set(x, "DistributionConfig", value.asInstanceOf[js.Any])
    
    inline def setDistributionConfigUndefined: Self = StObject.set(x, "DistributionConfig", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}

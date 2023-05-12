package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyDistributionResult extends StObject {
  
  var Distribution: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.Distribution] = js.undefined
  
  /**
    * The version identifier for the current version of the staging distribution.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the staging distribution.
    */
  var Location: js.UndefOr[String] = js.undefined
}
object CopyDistributionResult {
  
  inline def apply(): CopyDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDistributionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyDistributionResult] (val x: Self) extends AnyVal {
    
    inline def setDistribution(value: Distribution): Self = StObject.set(x, "Distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "Distribution", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}

package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePlatformVersionResult extends StObject {
  
  /**
    * Detailed information about the version of the custom platform.
    */
  var PlatformSummary: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.PlatformSummary] = js.undefined
}
object DeletePlatformVersionResult {
  
  inline def apply(): DeletePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePlatformVersionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePlatformVersionResult] (val x: Self) extends AnyVal {
    
    inline def setPlatformSummary(value: PlatformSummary): Self = StObject.set(x, "PlatformSummary", value.asInstanceOf[js.Any])
    
    inline def setPlatformSummaryUndefined: Self = StObject.set(x, "PlatformSummary", js.undefined)
  }
}

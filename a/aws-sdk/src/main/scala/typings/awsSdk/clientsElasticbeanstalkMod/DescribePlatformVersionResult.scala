package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePlatformVersionResult extends StObject {
  
  /**
    * Detailed information about the platform version.
    */
  var PlatformDescription: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.PlatformDescription] = js.undefined
}
object DescribePlatformVersionResult {
  
  inline def apply(): DescribePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlatformVersionResult]
  }
  
  extension [Self <: DescribePlatformVersionResult](x: Self) {
    
    inline def setPlatformDescription(value: PlatformDescription): Self = StObject.set(x, "PlatformDescription", value.asInstanceOf[js.Any])
    
    inline def setPlatformDescriptionUndefined: Self = StObject.set(x, "PlatformDescription", js.undefined)
  }
}

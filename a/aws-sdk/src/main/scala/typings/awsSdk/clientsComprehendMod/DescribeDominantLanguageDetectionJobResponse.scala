package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDominantLanguageDetectionJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with a dominant language detection job.
    */
  var DominantLanguageDetectionJobProperties: js.UndefOr[typings.awsSdk.clientsComprehendMod.DominantLanguageDetectionJobProperties] = js.undefined
}
object DescribeDominantLanguageDetectionJobResponse {
  
  inline def apply(): DescribeDominantLanguageDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDominantLanguageDetectionJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDominantLanguageDetectionJobResponse] (val x: Self) extends AnyVal {
    
    inline def setDominantLanguageDetectionJobProperties(value: DominantLanguageDetectionJobProperties): Self = StObject.set(x, "DominantLanguageDetectionJobProperties", value.asInstanceOf[js.Any])
    
    inline def setDominantLanguageDetectionJobPropertiesUndefined: Self = StObject.set(x, "DominantLanguageDetectionJobProperties", js.undefined)
  }
}

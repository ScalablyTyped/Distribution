package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketIntelligentTieringConfigurationOutput extends StObject {
  
  /**
    * Container for S3 Intelligent-Tiering configuration.
    */
  var IntelligentTieringConfiguration: js.UndefOr[typings.awsSdk.clientsS3Mod.IntelligentTieringConfiguration] = js.undefined
}
object GetBucketIntelligentTieringConfigurationOutput {
  
  inline def apply(): GetBucketIntelligentTieringConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketIntelligentTieringConfigurationOutput]
  }
  
  extension [Self <: GetBucketIntelligentTieringConfigurationOutput](x: Self) {
    
    inline def setIntelligentTieringConfiguration(value: IntelligentTieringConfiguration): Self = StObject.set(x, "IntelligentTieringConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIntelligentTieringConfigurationUndefined: Self = StObject.set(x, "IntelligentTieringConfiguration", js.undefined)
  }
}

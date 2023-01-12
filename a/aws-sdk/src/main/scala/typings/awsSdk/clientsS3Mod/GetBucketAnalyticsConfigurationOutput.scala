package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketAnalyticsConfigurationOutput extends StObject {
  
  /**
    * The configuration and any analyses for the analytics filter.
    */
  var AnalyticsConfiguration: js.UndefOr[typings.awsSdk.clientsS3Mod.AnalyticsConfiguration] = js.undefined
}
object GetBucketAnalyticsConfigurationOutput {
  
  inline def apply(): GetBucketAnalyticsConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketAnalyticsConfigurationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketAnalyticsConfigurationOutput] (val x: Self) extends AnyVal {
    
    inline def setAnalyticsConfiguration(value: AnalyticsConfiguration): Self = StObject.set(x, "AnalyticsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsConfigurationUndefined: Self = StObject.set(x, "AnalyticsConfiguration", js.undefined)
  }
}

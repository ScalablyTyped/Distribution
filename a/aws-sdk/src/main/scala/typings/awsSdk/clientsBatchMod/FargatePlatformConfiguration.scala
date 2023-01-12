package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FargatePlatformConfiguration extends StObject {
  
  /**
    * The Fargate platform version where the jobs are running. A platform version is specified only for jobs that are running on Fargate resources. If one isn't specified, the LATEST platform version is used by default. This uses a recent, approved version of the Fargate platform for compute resources. For more information, see Fargate platform versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
}
object FargatePlatformConfiguration {
  
  inline def apply(): FargatePlatformConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FargatePlatformConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FargatePlatformConfiguration] (val x: Self) extends AnyVal {
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
  }
}

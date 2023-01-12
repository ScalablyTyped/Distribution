package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElasticBeanstalkEnvironmentTier extends StObject {
  
  /**
    * The name of the environment tier. Valid values are WebServer or Worker.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of environment tier. Valid values are Standard or SQS/HTTP.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The version of the environment tier.
    */
  var Version: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElasticBeanstalkEnvironmentTier {
  
  inline def apply(): AwsElasticBeanstalkEnvironmentTier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticBeanstalkEnvironmentTier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsElasticBeanstalkEnvironmentTier] (val x: Self) extends AnyVal {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVersion(value: NonEmptyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}

package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElasticBeanstalkEnvironmentEnvironmentLink extends StObject {
  
  /**
    * The name of the linked environment.
    */
  var EnvironmentName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the environment link.
    */
  var LinkName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElasticBeanstalkEnvironmentEnvironmentLink {
  
  inline def apply(): AwsElasticBeanstalkEnvironmentEnvironmentLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticBeanstalkEnvironmentEnvironmentLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsElasticBeanstalkEnvironmentEnvironmentLink] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentName(value: NonEmptyString): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    inline def setLinkName(value: NonEmptyString): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    inline def setLinkNameUndefined: Self = StObject.set(x, "LinkName", js.undefined)
  }
}

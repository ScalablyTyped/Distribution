package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceQuota extends StObject {
  
  /**
    * The maximum number of instances of this Elastic Beanstalk resource type that an AWS account can use.
    */
  var Maximum: js.UndefOr[BoxedInt] = js.undefined
}
object ResourceQuota {
  
  inline def apply(): ResourceQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuota]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceQuota] (val x: Self) extends AnyVal {
    
    inline def setMaximum(value: BoxedInt): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "Maximum", js.undefined)
  }
}

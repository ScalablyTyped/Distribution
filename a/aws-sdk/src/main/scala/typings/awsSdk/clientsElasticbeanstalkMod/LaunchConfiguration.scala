package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchConfiguration extends StObject {
  
  /**
    * The name of the launch configuration.
    */
  var Name: js.UndefOr[ResourceId] = js.undefined
}
object LaunchConfiguration {
  
  inline def apply(): LaunchConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchConfiguration] (val x: Self) extends AnyVal {
    
    inline def setName(value: ResourceId): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}

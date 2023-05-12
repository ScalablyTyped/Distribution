package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupConfigurationOutput extends StObject {
  
  /**
    * A structure that describes the service configuration attached with the specified group. For details about the service configuration syntax, see Service configurations for Resource Groups.
    */
  var GroupConfiguration: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.GroupConfiguration] = js.undefined
}
object GetGroupConfigurationOutput {
  
  inline def apply(): GetGroupConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupConfigurationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGroupConfigurationOutput] (val x: Self) extends AnyVal {
    
    inline def setGroupConfiguration(value: GroupConfiguration): Self = StObject.set(x, "GroupConfiguration", value.asInstanceOf[js.Any])
    
    inline def setGroupConfigurationUndefined: Self = StObject.set(x, "GroupConfiguration", js.undefined)
  }
}

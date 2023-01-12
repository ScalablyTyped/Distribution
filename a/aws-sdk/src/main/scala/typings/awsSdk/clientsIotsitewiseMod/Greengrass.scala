package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Greengrass extends StObject {
  
  /**
    * The ARN of the Greengrass group. For more information about how to find a group's ARN, see ListGroups and GetGroup in the IoT Greengrass API Reference.
    */
  var groupArn: ARN
}
object Greengrass {
  
  inline def apply(groupArn: ARN): Greengrass = {
    val __obj = js.Dynamic.literal(groupArn = groupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Greengrass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Greengrass] (val x: Self) extends AnyVal {
    
    inline def setGroupArn(value: ARN): Self = StObject.set(x, "groupArn", value.asInstanceOf[js.Any])
  }
}

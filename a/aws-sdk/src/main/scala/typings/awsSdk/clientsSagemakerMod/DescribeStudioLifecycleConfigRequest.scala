package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStudioLifecycleConfigRequest extends StObject {
  
  /**
    * The name of the Studio Lifecycle Configuration to describe.
    */
  var StudioLifecycleConfigName: typings.awsSdk.clientsSagemakerMod.StudioLifecycleConfigName
}
object DescribeStudioLifecycleConfigRequest {
  
  inline def apply(StudioLifecycleConfigName: StudioLifecycleConfigName): DescribeStudioLifecycleConfigRequest = {
    val __obj = js.Dynamic.literal(StudioLifecycleConfigName = StudioLifecycleConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStudioLifecycleConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStudioLifecycleConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setStudioLifecycleConfigName(value: StudioLifecycleConfigName): Self = StObject.set(x, "StudioLifecycleConfigName", value.asInstanceOf[js.Any])
  }
}

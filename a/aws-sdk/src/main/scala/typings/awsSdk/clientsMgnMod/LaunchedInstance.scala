package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchedInstance extends StObject {
  
  /**
    * Launched instance EC2 ID.
    */
  var ec2InstanceID: js.UndefOr[EC2InstanceID] = js.undefined
  
  /**
    * Launched instance first boot.
    */
  var firstBoot: js.UndefOr[FirstBoot] = js.undefined
  
  /**
    * Launched instance Job ID.
    */
  var jobID: js.UndefOr[JobID] = js.undefined
}
object LaunchedInstance {
  
  inline def apply(): LaunchedInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchedInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchedInstance] (val x: Self) extends AnyVal {
    
    inline def setEc2InstanceID(value: EC2InstanceID): Self = StObject.set(x, "ec2InstanceID", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceIDUndefined: Self = StObject.set(x, "ec2InstanceID", js.undefined)
    
    inline def setFirstBoot(value: FirstBoot): Self = StObject.set(x, "firstBoot", value.asInstanceOf[js.Any])
    
    inline def setFirstBootUndefined: Self = StObject.set(x, "firstBoot", js.undefined)
    
    inline def setJobID(value: JobID): Self = StObject.set(x, "jobID", value.asInstanceOf[js.Any])
    
    inline def setJobIDUndefined: Self = StObject.set(x, "jobID", js.undefined)
  }
}

package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceConfiguration extends StObject {
  
  /**
    * The number of CPU units reserved for each instance of your App Runner service. Default: 1 vCPU 
    */
  var Cpu: js.UndefOr[typings.awsSdk.clientsApprunnerMod.Cpu] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that provides permissions to your App Runner service. These are permissions that your code needs when it calls any Amazon Web Services APIs.
    */
  var InstanceRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The amount of memory, in MB or GB, reserved for each instance of your App Runner service. Default: 2 GB 
    */
  var Memory: js.UndefOr[typings.awsSdk.clientsApprunnerMod.Memory] = js.undefined
}
object InstanceConfiguration {
  
  inline def apply(): InstanceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCpu(value: Cpu): Self = StObject.set(x, "Cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "Cpu", js.undefined)
    
    inline def setInstanceRoleArn(value: RoleArn): Self = StObject.set(x, "InstanceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setInstanceRoleArnUndefined: Self = StObject.set(x, "InstanceRoleArn", js.undefined)
    
    inline def setMemory(value: Memory): Self = StObject.set(x, "Memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "Memory", js.undefined)
  }
}

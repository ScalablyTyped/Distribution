package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPUUtilization extends StObject {
  
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the I/O Wait state over the last 10 seconds.
    */
  var IOWait: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the IRQ state over the last 10 seconds.
    */
  var IRQ: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * Percentage of time that the CPU has spent in the Idle state over the last 10 seconds.
    */
  var Idle: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the Nice state over the last 10 seconds.
    */
  var Nice: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * Available on Windows environments only. Percentage of time that the CPU has spent in the Privileged state over the last 10 seconds.
    */
  var Privileged: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the SoftIRQ state over the last 10 seconds.
    */
  var SoftIRQ: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the System state over the last 10 seconds.
    */
  var System: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * Percentage of time that the CPU has spent in the User state over the last 10 seconds.
    */
  var User: js.UndefOr[NullableDouble] = js.undefined
}
object CPUUtilization {
  
  inline def apply(): CPUUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CPUUtilization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CPUUtilization] (val x: Self) extends AnyVal {
    
    inline def setIOWait(value: NullableDouble): Self = StObject.set(x, "IOWait", value.asInstanceOf[js.Any])
    
    inline def setIOWaitUndefined: Self = StObject.set(x, "IOWait", js.undefined)
    
    inline def setIRQ(value: NullableDouble): Self = StObject.set(x, "IRQ", value.asInstanceOf[js.Any])
    
    inline def setIRQUndefined: Self = StObject.set(x, "IRQ", js.undefined)
    
    inline def setIdle(value: NullableDouble): Self = StObject.set(x, "Idle", value.asInstanceOf[js.Any])
    
    inline def setIdleUndefined: Self = StObject.set(x, "Idle", js.undefined)
    
    inline def setNice(value: NullableDouble): Self = StObject.set(x, "Nice", value.asInstanceOf[js.Any])
    
    inline def setNiceUndefined: Self = StObject.set(x, "Nice", js.undefined)
    
    inline def setPrivileged(value: NullableDouble): Self = StObject.set(x, "Privileged", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedUndefined: Self = StObject.set(x, "Privileged", js.undefined)
    
    inline def setSoftIRQ(value: NullableDouble): Self = StObject.set(x, "SoftIRQ", value.asInstanceOf[js.Any])
    
    inline def setSoftIRQUndefined: Self = StObject.set(x, "SoftIRQ", js.undefined)
    
    inline def setSystem(value: NullableDouble): Self = StObject.set(x, "System", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "System", js.undefined)
    
    inline def setUser(value: NullableDouble): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}

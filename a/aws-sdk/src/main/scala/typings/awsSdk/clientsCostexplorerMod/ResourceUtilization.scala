package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceUtilization extends StObject {
  
  /**
    * The utilization of current Amazon EC2 instance. 
    */
  var EC2ResourceUtilization: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.EC2ResourceUtilization] = js.undefined
}
object ResourceUtilization {
  
  inline def apply(): ResourceUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUtilization]
  }
  
  extension [Self <: ResourceUtilization](x: Self) {
    
    inline def setEC2ResourceUtilization(value: EC2ResourceUtilization): Self = StObject.set(x, "EC2ResourceUtilization", value.asInstanceOf[js.Any])
    
    inline def setEC2ResourceUtilizationUndefined: Self = StObject.set(x, "EC2ResourceUtilization", js.undefined)
  }
}

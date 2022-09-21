package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfiguration extends StObject {
  
  /**
    *  If this field is specified, this access point will only allow connections from the specified VPC ID. 
    */
  var vpcId: VpcId
}
object VpcConfiguration {
  
  inline def apply(vpcId: VpcId): VpcConfiguration = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfiguration]
  }
  
  extension [Self <: VpcConfiguration](x: Self) {
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}

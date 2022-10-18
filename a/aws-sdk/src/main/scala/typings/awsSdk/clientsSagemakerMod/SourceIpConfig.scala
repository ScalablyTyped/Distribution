package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceIpConfig extends StObject {
  
  /**
    * A list of one to ten Classless Inter-Domain Routing (CIDR) values. Maximum: Ten CIDR values  The following Length Constraints apply to individual CIDR values in the CIDR value list. 
    */
  var Cidrs: typings.awsSdk.clientsSagemakerMod.Cidrs
}
object SourceIpConfig {
  
  inline def apply(Cidrs: Cidrs): SourceIpConfig = {
    val __obj = js.Dynamic.literal(Cidrs = Cidrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceIpConfig]
  }
  
  extension [Self <: SourceIpConfig](x: Self) {
    
    inline def setCidrs(value: Cidrs): Self = StObject.set(x, "Cidrs", value.asInstanceOf[js.Any])
    
    inline def setCidrsVarargs(value: Cidr*): Self = StObject.set(x, "Cidrs", js.Array(value*))
  }
}

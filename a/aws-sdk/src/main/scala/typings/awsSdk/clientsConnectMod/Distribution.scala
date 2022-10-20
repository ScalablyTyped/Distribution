package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distribution extends StObject {
  
  /**
    * The percentage of the traffic that is distributed, in increments of 10.
    */
  var Percentage: typings.awsSdk.clientsConnectMod.Percentage
  
  /**
    * The Amazon Web Services Region where the traffic is distributed.
    */
  var Region: AwsRegion
}
object Distribution {
  
  inline def apply(Percentage: Percentage, Region: AwsRegion): Distribution = {
    val __obj = js.Dynamic.literal(Percentage = Percentage.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  
  extension [Self <: Distribution](x: Self) {
    
    inline def setPercentage(value: Percentage): Self = StObject.set(x, "Percentage", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: AwsRegion): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
  }
}

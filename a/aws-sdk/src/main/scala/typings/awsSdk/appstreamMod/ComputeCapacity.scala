package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeCapacity extends StObject {
  
  /**
    * The desired number of streaming instances.
    */
  var DesiredInstances: Integer
}
object ComputeCapacity {
  
  inline def apply(DesiredInstances: Integer): ComputeCapacity = {
    val __obj = js.Dynamic.literal(DesiredInstances = DesiredInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeCapacity]
  }
  
  extension [Self <: ComputeCapacity](x: Self) {
    
    inline def setDesiredInstances(value: Integer): Self = StObject.set(x, "DesiredInstances", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeCapacity extends StObject {
  
  /**
    * The desired number of streaming instances.
    */
  var DesiredInstances: Integer = js.native
}
object ComputeCapacity {
  
  @scala.inline
  def apply(DesiredInstances: Integer): ComputeCapacity = {
    val __obj = js.Dynamic.literal(DesiredInstances = DesiredInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeCapacity]
  }
  
  @scala.inline
  implicit class ComputeCapacityMutableBuilder[Self <: ComputeCapacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredInstances(value: Integer): Self = StObject.set(x, "DesiredInstances", value.asInstanceOf[js.Any])
  }
}

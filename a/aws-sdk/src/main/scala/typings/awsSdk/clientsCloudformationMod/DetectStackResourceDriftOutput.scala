package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectStackResourceDriftOutput extends StObject {
  
  /**
    * Information about whether the resource's actual configuration has drifted from its expected template configuration, including actual and expected property values and any differences detected.
    */
  var StackResourceDrift: typings.awsSdk.clientsCloudformationMod.StackResourceDrift
}
object DetectStackResourceDriftOutput {
  
  inline def apply(StackResourceDrift: StackResourceDrift): DetectStackResourceDriftOutput = {
    val __obj = js.Dynamic.literal(StackResourceDrift = StackResourceDrift.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackResourceDriftOutput]
  }
  
  extension [Self <: DetectStackResourceDriftOutput](x: Self) {
    
    inline def setStackResourceDrift(value: StackResourceDrift): Self = StObject.set(x, "StackResourceDrift", value.asInstanceOf[js.Any])
  }
}

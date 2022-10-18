package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTargetGroupOutput extends StObject {
  
  /**
    * Information about the target group.
    */
  var TargetGroups: js.UndefOr[typings.awsSdk.clientsElbv2Mod.TargetGroups] = js.undefined
}
object CreateTargetGroupOutput {
  
  inline def apply(): CreateTargetGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTargetGroupOutput]
  }
  
  extension [Self <: CreateTargetGroupOutput](x: Self) {
    
    inline def setTargetGroups(value: TargetGroups): Self = StObject.set(x, "TargetGroups", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupsUndefined: Self = StObject.set(x, "TargetGroups", js.undefined)
    
    inline def setTargetGroupsVarargs(value: TargetGroup*): Self = StObject.set(x, "TargetGroups", js.Array(value*))
  }
}

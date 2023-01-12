package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunCommandParameters extends StObject {
  
  /**
    * Currently, we support including only one RunCommandTarget block, which specifies either an array of InstanceIds or a tag.
    */
  var RunCommandTargets: typings.awsSdk.clientsEventbridgeMod.RunCommandTargets
}
object RunCommandParameters {
  
  inline def apply(RunCommandTargets: RunCommandTargets): RunCommandParameters = {
    val __obj = js.Dynamic.literal(RunCommandTargets = RunCommandTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunCommandParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunCommandParameters] (val x: Self) extends AnyVal {
    
    inline def setRunCommandTargets(value: RunCommandTargets): Self = StObject.set(x, "RunCommandTargets", value.asInstanceOf[js.Any])
    
    inline def setRunCommandTargetsVarargs(value: RunCommandTarget*): Self = StObject.set(x, "RunCommandTargets", js.Array(value*))
  }
}

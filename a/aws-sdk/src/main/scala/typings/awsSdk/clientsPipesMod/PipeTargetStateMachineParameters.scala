package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeTargetStateMachineParameters extends StObject {
  
  /**
    * Specify whether to wait for the state machine to finish or not.
    */
  var InvocationType: js.UndefOr[PipeTargetInvocationType] = js.undefined
}
object PipeTargetStateMachineParameters {
  
  inline def apply(): PipeTargetStateMachineParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeTargetStateMachineParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeTargetStateMachineParameters] (val x: Self) extends AnyVal {
    
    inline def setInvocationType(value: PipeTargetInvocationType): Self = StObject.set(x, "InvocationType", value.asInstanceOf[js.Any])
    
    inline def setInvocationTypeUndefined: Self = StObject.set(x, "InvocationType", js.undefined)
  }
}

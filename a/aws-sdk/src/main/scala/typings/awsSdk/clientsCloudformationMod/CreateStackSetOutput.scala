package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStackSetOutput extends StObject {
  
  /**
    * The ID of the stack set that you're creating.
    */
  var StackSetId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackSetId] = js.undefined
}
object CreateStackSetOutput {
  
  inline def apply(): CreateStackSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStackSetOutput]
  }
  
  extension [Self <: CreateStackSetOutput](x: Self) {
    
    inline def setStackSetId(value: StackSetId): Self = StObject.set(x, "StackSetId", value.asInstanceOf[js.Any])
    
    inline def setStackSetIdUndefined: Self = StObject.set(x, "StackSetId", js.undefined)
  }
}

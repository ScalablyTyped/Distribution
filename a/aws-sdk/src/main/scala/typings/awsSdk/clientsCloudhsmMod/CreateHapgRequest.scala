package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHapgRequest extends StObject {
  
  /**
    * The label of the new high-availability partition group.
    */
  var Label: typings.awsSdk.clientsCloudhsmMod.Label
}
object CreateHapgRequest {
  
  inline def apply(Label: Label): CreateHapgRequest = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHapgRequest]
  }
  
  extension [Self <: CreateHapgRequest](x: Self) {
    
    inline def setLabel(value: Label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
  }
}

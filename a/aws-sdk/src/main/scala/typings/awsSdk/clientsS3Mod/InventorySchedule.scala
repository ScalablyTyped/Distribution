package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventorySchedule extends StObject {
  
  /**
    * Specifies how frequently inventory results are produced.
    */
  var Frequency: InventoryFrequency
}
object InventorySchedule {
  
  inline def apply(Frequency: InventoryFrequency): InventorySchedule = {
    val __obj = js.Dynamic.literal(Frequency = Frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventorySchedule]
  }
  
  extension [Self <: InventorySchedule](x: Self) {
    
    inline def setFrequency(value: InventoryFrequency): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
  }
}

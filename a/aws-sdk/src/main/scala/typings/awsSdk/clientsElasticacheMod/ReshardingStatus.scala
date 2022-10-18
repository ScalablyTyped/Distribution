package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReshardingStatus extends StObject {
  
  /**
    * Represents the progress of an online resharding operation.
    */
  var SlotMigration: js.UndefOr[typings.awsSdk.clientsElasticacheMod.SlotMigration] = js.undefined
}
object ReshardingStatus {
  
  inline def apply(): ReshardingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReshardingStatus]
  }
  
  extension [Self <: ReshardingStatus](x: Self) {
    
    inline def setSlotMigration(value: SlotMigration): Self = StObject.set(x, "SlotMigration", value.asInstanceOf[js.Any])
    
    inline def setSlotMigrationUndefined: Self = StObject.set(x, "SlotMigration", js.undefined)
  }
}

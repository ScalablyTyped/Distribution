package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReshardingStatus extends StObject {
  
  /**
    * The status of the online resharding slot migration
    */
  var SlotMigration: js.UndefOr[typings.awsSdk.clientsMemorydbMod.SlotMigration] = js.undefined
}
object ReshardingStatus {
  
  inline def apply(): ReshardingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReshardingStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReshardingStatus] (val x: Self) extends AnyVal {
    
    inline def setSlotMigration(value: SlotMigration): Self = StObject.set(x, "SlotMigration", value.asInstanceOf[js.Any])
    
    inline def setSlotMigrationUndefined: Self = StObject.set(x, "SlotMigration", js.undefined)
  }
}

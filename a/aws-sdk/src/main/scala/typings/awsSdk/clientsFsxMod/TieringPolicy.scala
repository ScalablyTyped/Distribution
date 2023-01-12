package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TieringPolicy extends StObject {
  
  /**
    * Specifies the number of days that user data in a volume must remain inactive before it is considered "cold" and moved to the capacity pool. Used with the AUTO and SNAPSHOT_ONLY tiering policies. Enter a whole number between 2 and 183. Default values are 31 days for AUTO and 2 days for SNAPSHOT_ONLY.
    */
  var CoolingPeriod: js.UndefOr[typings.awsSdk.clientsFsxMod.CoolingPeriod] = js.undefined
  
  /**
    * Specifies the tiering policy used to transition data. Default value is SNAPSHOT_ONLY.    SNAPSHOT_ONLY - moves cold snapshots to the capacity pool storage tier.    AUTO - moves cold user data and snapshots to the capacity pool storage tier based on your access patterns.    ALL - moves all user data blocks in both the active file system and Snapshot copies to the storage pool tier.    NONE - keeps a volume's data in the primary storage tier, preventing it from being moved to the capacity pool tier.  
    */
  var Name: js.UndefOr[TieringPolicyName] = js.undefined
}
object TieringPolicy {
  
  inline def apply(): TieringPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TieringPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TieringPolicy] (val x: Self) extends AnyVal {
    
    inline def setCoolingPeriod(value: CoolingPeriod): Self = StObject.set(x, "CoolingPeriod", value.asInstanceOf[js.Any])
    
    inline def setCoolingPeriodUndefined: Self = StObject.set(x, "CoolingPeriod", js.undefined)
    
    inline def setName(value: TieringPolicyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}

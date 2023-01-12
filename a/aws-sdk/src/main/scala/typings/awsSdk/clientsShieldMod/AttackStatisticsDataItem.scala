package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackStatisticsDataItem extends StObject {
  
  /**
    * The number of attacks detected during the time period. This is always present, but might be zero. 
    */
  var AttackCount: Long
  
  /**
    * Information about the volume of attacks during the time period. If the accompanying AttackCount is zero, this setting might be empty.
    */
  var AttackVolume: js.UndefOr[typings.awsSdk.clientsShieldMod.AttackVolume] = js.undefined
}
object AttackStatisticsDataItem {
  
  inline def apply(AttackCount: Long): AttackStatisticsDataItem = {
    val __obj = js.Dynamic.literal(AttackCount = AttackCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackStatisticsDataItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttackStatisticsDataItem] (val x: Self) extends AnyVal {
    
    inline def setAttackCount(value: Long): Self = StObject.set(x, "AttackCount", value.asInstanceOf[js.Any])
    
    inline def setAttackVolume(value: AttackVolume): Self = StObject.set(x, "AttackVolume", value.asInstanceOf[js.Any])
    
    inline def setAttackVolumeUndefined: Self = StObject.set(x, "AttackVolume", js.undefined)
  }
}

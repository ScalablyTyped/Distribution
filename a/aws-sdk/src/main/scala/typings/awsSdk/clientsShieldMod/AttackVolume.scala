package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackVolume extends StObject {
  
  /**
    * A statistics object that uses bits per second as the unit. This is included for network level attacks. 
    */
  var BitsPerSecond: js.UndefOr[AttackVolumeStatistics] = js.undefined
  
  /**
    * A statistics object that uses packets per second as the unit. This is included for network level attacks. 
    */
  var PacketsPerSecond: js.UndefOr[AttackVolumeStatistics] = js.undefined
  
  /**
    * A statistics object that uses requests per second as the unit. This is included for application level attacks, and is only available for accounts that are subscribed to Shield Advanced.
    */
  var RequestsPerSecond: js.UndefOr[AttackVolumeStatistics] = js.undefined
}
object AttackVolume {
  
  inline def apply(): AttackVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackVolume]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttackVolume] (val x: Self) extends AnyVal {
    
    inline def setBitsPerSecond(value: AttackVolumeStatistics): Self = StObject.set(x, "BitsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setBitsPerSecondUndefined: Self = StObject.set(x, "BitsPerSecond", js.undefined)
    
    inline def setPacketsPerSecond(value: AttackVolumeStatistics): Self = StObject.set(x, "PacketsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setPacketsPerSecondUndefined: Self = StObject.set(x, "PacketsPerSecond", js.undefined)
    
    inline def setRequestsPerSecond(value: AttackVolumeStatistics): Self = StObject.set(x, "RequestsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setRequestsPerSecondUndefined: Self = StObject.set(x, "RequestsPerSecond", js.undefined)
  }
}

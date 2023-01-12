package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigSnapshotDeliveryProperties extends StObject {
  
  /**
    * The frequency with which Config delivers configuration snapshots.
    */
  var deliveryFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined
}
object ConfigSnapshotDeliveryProperties {
  
  inline def apply(): ConfigSnapshotDeliveryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigSnapshotDeliveryProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigSnapshotDeliveryProperties] (val x: Self) extends AnyVal {
    
    inline def setDeliveryFrequency(value: MaximumExecutionFrequency): Self = StObject.set(x, "deliveryFrequency", value.asInstanceOf[js.Any])
    
    inline def setDeliveryFrequencyUndefined: Self = StObject.set(x, "deliveryFrequency", js.undefined)
  }
}

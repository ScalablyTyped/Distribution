package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleExpiration extends StObject {
  
  /**
    * Indicates at what date the object is to be moved or deleted. The date value must conform to the ISO 8601 format. The time is always midnight UTC.
    */
  var Date: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero positive integer.
    */
  var Days: js.UndefOr[typings.awsSdk.clientsS3Mod.Days] = js.undefined
  
  /**
    * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete marker will be expired; if set to false the policy takes no action. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
    */
  var ExpiredObjectDeleteMarker: js.UndefOr[typings.awsSdk.clientsS3Mod.ExpiredObjectDeleteMarker] = js.undefined
}
object LifecycleExpiration {
  
  inline def apply(): LifecycleExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleExpiration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifecycleExpiration] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
    
    inline def setDays(value: Days): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "Days", js.undefined)
    
    inline def setExpiredObjectDeleteMarker(value: ExpiredObjectDeleteMarker): Self = StObject.set(x, "ExpiredObjectDeleteMarker", value.asInstanceOf[js.Any])
    
    inline def setExpiredObjectDeleteMarkerUndefined: Self = StObject.set(x, "ExpiredObjectDeleteMarker", js.undefined)
  }
}

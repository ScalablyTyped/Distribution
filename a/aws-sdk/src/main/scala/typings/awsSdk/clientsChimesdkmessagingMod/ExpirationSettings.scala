package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpirationSettings extends StObject {
  
  /**
    * The conditions that must be met for a channel to expire.
    */
  var ExpirationCriterion: typings.awsSdk.clientsChimesdkmessagingMod.ExpirationCriterion
  
  /**
    * The period in days after which the system automatically deletes a channel.
    */
  var ExpirationDays: typings.awsSdk.clientsChimesdkmessagingMod.ExpirationDays
}
object ExpirationSettings {
  
  inline def apply(ExpirationCriterion: ExpirationCriterion, ExpirationDays: ExpirationDays): ExpirationSettings = {
    val __obj = js.Dynamic.literal(ExpirationCriterion = ExpirationCriterion.asInstanceOf[js.Any], ExpirationDays = ExpirationDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpirationSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpirationSettings] (val x: Self) extends AnyVal {
    
    inline def setExpirationCriterion(value: ExpirationCriterion): Self = StObject.set(x, "ExpirationCriterion", value.asInstanceOf[js.Any])
    
    inline def setExpirationDays(value: ExpirationDays): Self = StObject.set(x, "ExpirationDays", value.asInstanceOf[js.Any])
  }
}

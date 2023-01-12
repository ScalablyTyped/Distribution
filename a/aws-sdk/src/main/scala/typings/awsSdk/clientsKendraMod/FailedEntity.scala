package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedEntity extends StObject {
  
  /**
    * The identifier of the user or group in your IAM Identity Center identity source. For example, a user ID could be an email.
    */
  var EntityId: js.UndefOr[typings.awsSdk.clientsKendraMod.EntityId] = js.undefined
  
  /**
    * The reason the user or group in your IAM Identity Center identity source failed to properly configure with your Amazon Kendra experience.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.clientsKendraMod.ErrorMessage] = js.undefined
}
object FailedEntity {
  
  inline def apply(): FailedEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedEntity] (val x: Self) extends AnyVal {
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "EntityId", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}

package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContactRequest extends StObject {
  
  /**
    * The short name to quickly identify a contact or escalation plan. The contact alias must be unique and identifiable.
    */
  var Alias: ContactAlias
  
  /**
    * The full name of the contact or escalation plan.
    */
  var DisplayName: js.UndefOr[ContactName] = js.undefined
  
  /**
    * A token ensuring that the operation is called only once with the specified details.
    */
  var IdempotencyToken: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.IdempotencyToken] = js.undefined
  
  /**
    * A list of stages. A contact has an engagement plan with stages that contact specified contact channels. An escalation plan uses stages that contact specified contacts.
    */
  var Plan: typings.awsSdk.clientsSsmcontactsMod.Plan
  
  /**
    * Adds a tag to the target. You can only tag resources created in the first Region of your replication set.
    */
  var Tags: js.UndefOr[TagsList] = js.undefined
  
  /**
    * To create an escalation plan use ESCALATION. To create a contact use PERSONAL.
    */
  var Type: ContactType
}
object CreateContactRequest {
  
  inline def apply(Alias: ContactAlias, Plan: Plan, Type: ContactType): CreateContactRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], Plan = Plan.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateContactRequest] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: ContactAlias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: ContactName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    inline def setPlan(value: Plan): Self = StObject.set(x, "Plan", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: ContactType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}

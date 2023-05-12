package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfiguredTableAssociationInput extends StObject {
  
  /**
    * The unique identifier for the configured table association to update. Currently accepts the configured table association ID.
    */
  var configuredTableAssociationIdentifier: ConfiguredTableAssociationIdentifier
  
  /**
    * A new description for the configured table association.
    */
  var description: js.UndefOr[TableDescription] = js.undefined
  
  /**
    * The unique ID for the membership that the configured table association belongs to.
    */
  var membershipIdentifier: MembershipIdentifier
  
  /**
    * The service will assume this role to access catalog metadata and query the table.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object UpdateConfiguredTableAssociationInput {
  
  inline def apply(
    configuredTableAssociationIdentifier: ConfiguredTableAssociationIdentifier,
    membershipIdentifier: MembershipIdentifier
  ): UpdateConfiguredTableAssociationInput = {
    val __obj = js.Dynamic.literal(configuredTableAssociationIdentifier = configuredTableAssociationIdentifier.asInstanceOf[js.Any], membershipIdentifier = membershipIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfiguredTableAssociationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConfiguredTableAssociationInput] (val x: Self) extends AnyVal {
    
    inline def setConfiguredTableAssociationIdentifier(value: ConfiguredTableAssociationIdentifier): Self = StObject.set(x, "configuredTableAssociationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: TableDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMembershipIdentifier(value: MembershipIdentifier): Self = StObject.set(x, "membershipIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}

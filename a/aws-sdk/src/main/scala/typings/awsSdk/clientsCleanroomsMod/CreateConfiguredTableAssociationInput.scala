package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfiguredTableAssociationInput extends StObject {
  
  /**
    * A unique identifier for the configured table to be associated to. Currently accepts a configured table ID.
    */
  var configuredTableIdentifier: ConfiguredTableIdentifier
  
  /**
    * A description for the configured table association.
    */
  var description: js.UndefOr[TableDescription] = js.undefined
  
  /**
    * A unique identifier for one of your memberships for a collaboration. The configured table is associated to the collaboration that this membership belongs to. Currently accepts a membership ID.
    */
  var membershipIdentifier: MembershipIdentifier
  
  /**
    * The name of the configured table association. This name is used to query the underlying configured table.
    */
  var name: TableAlias
  
  /**
    * The service will assume this role to access catalog metadata and query the table.
    */
  var roleArn: RoleArn
  
  /**
    * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM policies to control access to this resource.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateConfiguredTableAssociationInput {
  
  inline def apply(
    configuredTableIdentifier: ConfiguredTableIdentifier,
    membershipIdentifier: MembershipIdentifier,
    name: TableAlias,
    roleArn: RoleArn
  ): CreateConfiguredTableAssociationInput = {
    val __obj = js.Dynamic.literal(configuredTableIdentifier = configuredTableIdentifier.asInstanceOf[js.Any], membershipIdentifier = membershipIdentifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfiguredTableAssociationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateConfiguredTableAssociationInput] (val x: Self) extends AnyVal {
    
    inline def setConfiguredTableIdentifier(value: ConfiguredTableIdentifier): Self = StObject.set(x, "configuredTableIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: TableDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMembershipIdentifier(value: MembershipIdentifier): Self = StObject.set(x, "membershipIdentifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: TableAlias): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}

package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfiguredTableAssociation extends StObject {
  
  /**
    * The unique ARN for the configured table association.
    */
  var arn: ConfiguredTableAssociationArn
  
  /**
    * The unique ARN for the configured table that the association refers to.
    */
  var configuredTableArn: ConfiguredTableArn
  
  /**
    * The unique ID for the configured table that the association refers to.
    */
  var configuredTableId: UUID
  
  /**
    * The time the configured table association was created.
    */
  var createTime: js.Date
  
  /**
    * A description of the configured table association.
    */
  var description: js.UndefOr[TableDescription] = js.undefined
  
  /**
    * The unique ID for the configured table association.
    */
  var id: UUID
  
  /**
    * The unique ARN for the membership this configured table association belongs to.
    */
  var membershipArn: MembershipArn
  
  /**
    * The unique ID for the membership this configured table association belongs to.
    */
  var membershipId: UUID
  
  /**
    * The name of the configured table association, in lowercase. The table is identified by this name when running protected queries against the underlying data.
    */
  var name: TableAlias
  
  /**
    * The service will assume this role to access catalog metadata and query the table.
    */
  var roleArn: RoleArn
  
  /**
    * The time the configured table association was last updated.
    */
  var updateTime: js.Date
}
object ConfiguredTableAssociation {
  
  inline def apply(
    arn: ConfiguredTableAssociationArn,
    configuredTableArn: ConfiguredTableArn,
    configuredTableId: UUID,
    createTime: js.Date,
    id: UUID,
    membershipArn: MembershipArn,
    membershipId: UUID,
    name: TableAlias,
    roleArn: RoleArn,
    updateTime: js.Date
  ): ConfiguredTableAssociation = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], configuredTableArn = configuredTableArn.asInstanceOf[js.Any], configuredTableId = configuredTableId.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], membershipArn = membershipArn.asInstanceOf[js.Any], membershipId = membershipId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfiguredTableAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfiguredTableAssociation] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ConfiguredTableAssociationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setConfiguredTableArn(value: ConfiguredTableArn): Self = StObject.set(x, "configuredTableArn", value.asInstanceOf[js.Any])
    
    inline def setConfiguredTableId(value: UUID): Self = StObject.set(x, "configuredTableId", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: TableDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMembershipArn(value: MembershipArn): Self = StObject.set(x, "membershipArn", value.asInstanceOf[js.Any])
    
    inline def setMembershipId(value: UUID): Self = StObject.set(x, "membershipId", value.asInstanceOf[js.Any])
    
    inline def setName(value: TableAlias): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}

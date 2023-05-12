package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfiguredTableAssociationSummary extends StObject {
  
  /**
    * The unique ARN for the configured table association.
    */
  var arn: ConfiguredTableAssociationArn
  
  /**
    * The unique configured table ID that this configured table association refers to.
    */
  var configuredTableId: UUID
  
  /**
    * The time the configured table association was created.
    */
  var createTime: js.Date
  
  /**
    * The unique ID for the configured table association.
    */
  var id: UUID
  
  /**
    * The unique ARN for the membership that the configured table association belongs to.
    */
  var membershipArn: MembershipArn
  
  /**
    * The unique ID for the membership that the configured table association belongs to.
    */
  var membershipId: MembershipIdentifier
  
  /**
    * The name of the configured table association. The table is identified by this name when running Protected Queries against the underlying data.
    */
  var name: TableAlias
  
  /**
    * The time the configured table association was last updated.
    */
  var updateTime: js.Date
}
object ConfiguredTableAssociationSummary {
  
  inline def apply(
    arn: ConfiguredTableAssociationArn,
    configuredTableId: UUID,
    createTime: js.Date,
    id: UUID,
    membershipArn: MembershipArn,
    membershipId: MembershipIdentifier,
    name: TableAlias,
    updateTime: js.Date
  ): ConfiguredTableAssociationSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], configuredTableId = configuredTableId.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], membershipArn = membershipArn.asInstanceOf[js.Any], membershipId = membershipId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfiguredTableAssociationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfiguredTableAssociationSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ConfiguredTableAssociationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setConfiguredTableId(value: UUID): Self = StObject.set(x, "configuredTableId", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMembershipArn(value: MembershipArn): Self = StObject.set(x, "membershipArn", value.asInstanceOf[js.Any])
    
    inline def setMembershipId(value: MembershipIdentifier): Self = StObject.set(x, "membershipId", value.asInstanceOf[js.Any])
    
    inline def setName(value: TableAlias): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}

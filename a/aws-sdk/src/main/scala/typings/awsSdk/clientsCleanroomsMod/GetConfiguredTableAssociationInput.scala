package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfiguredTableAssociationInput extends StObject {
  
  /**
    * The unique ID for the configured table association to retrieve. Currently accepts the configured table ID.
    */
  var configuredTableAssociationIdentifier: ConfiguredTableAssociationIdentifier
  
  /**
    * A unique identifier for the membership that the configured table association belongs to. Currently accepts the membership ID.
    */
  var membershipIdentifier: MembershipIdentifier
}
object GetConfiguredTableAssociationInput {
  
  inline def apply(
    configuredTableAssociationIdentifier: ConfiguredTableAssociationIdentifier,
    membershipIdentifier: MembershipIdentifier
  ): GetConfiguredTableAssociationInput = {
    val __obj = js.Dynamic.literal(configuredTableAssociationIdentifier = configuredTableAssociationIdentifier.asInstanceOf[js.Any], membershipIdentifier = membershipIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfiguredTableAssociationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConfiguredTableAssociationInput] (val x: Self) extends AnyVal {
    
    inline def setConfiguredTableAssociationIdentifier(value: ConfiguredTableAssociationIdentifier): Self = StObject.set(x, "configuredTableAssociationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMembershipIdentifier(value: MembershipIdentifier): Self = StObject.set(x, "membershipIdentifier", value.asInstanceOf[js.Any])
  }
}

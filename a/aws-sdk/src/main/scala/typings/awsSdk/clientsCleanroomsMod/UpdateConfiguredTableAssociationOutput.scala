package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfiguredTableAssociationOutput extends StObject {
  
  /**
    * The entire updated configured table association.
    */
  var configuredTableAssociation: ConfiguredTableAssociation
}
object UpdateConfiguredTableAssociationOutput {
  
  inline def apply(configuredTableAssociation: ConfiguredTableAssociation): UpdateConfiguredTableAssociationOutput = {
    val __obj = js.Dynamic.literal(configuredTableAssociation = configuredTableAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfiguredTableAssociationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConfiguredTableAssociationOutput] (val x: Self) extends AnyVal {
    
    inline def setConfiguredTableAssociation(value: ConfiguredTableAssociation): Self = StObject.set(x, "configuredTableAssociation", value.asInstanceOf[js.Any])
  }
}

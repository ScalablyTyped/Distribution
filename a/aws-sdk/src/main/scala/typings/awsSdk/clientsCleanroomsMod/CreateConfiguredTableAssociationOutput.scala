package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfiguredTableAssociationOutput extends StObject {
  
  /**
    * The entire configured table association object.
    */
  var configuredTableAssociation: ConfiguredTableAssociation
}
object CreateConfiguredTableAssociationOutput {
  
  inline def apply(configuredTableAssociation: ConfiguredTableAssociation): CreateConfiguredTableAssociationOutput = {
    val __obj = js.Dynamic.literal(configuredTableAssociation = configuredTableAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfiguredTableAssociationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateConfiguredTableAssociationOutput] (val x: Self) extends AnyVal {
    
    inline def setConfiguredTableAssociation(value: ConfiguredTableAssociation): Self = StObject.set(x, "configuredTableAssociation", value.asInstanceOf[js.Any])
  }
}

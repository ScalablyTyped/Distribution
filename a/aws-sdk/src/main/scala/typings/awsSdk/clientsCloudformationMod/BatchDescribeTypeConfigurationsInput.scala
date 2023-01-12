package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDescribeTypeConfigurationsInput extends StObject {
  
  /**
    * The list of identifiers for the desired extension configurations.
    */
  var TypeConfigurationIdentifiers: typings.awsSdk.clientsCloudformationMod.TypeConfigurationIdentifiers
}
object BatchDescribeTypeConfigurationsInput {
  
  inline def apply(TypeConfigurationIdentifiers: TypeConfigurationIdentifiers): BatchDescribeTypeConfigurationsInput = {
    val __obj = js.Dynamic.literal(TypeConfigurationIdentifiers = TypeConfigurationIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeTypeConfigurationsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDescribeTypeConfigurationsInput] (val x: Self) extends AnyVal {
    
    inline def setTypeConfigurationIdentifiers(value: TypeConfigurationIdentifiers): Self = StObject.set(x, "TypeConfigurationIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setTypeConfigurationIdentifiersVarargs(value: TypeConfigurationIdentifier*): Self = StObject.set(x, "TypeConfigurationIdentifiers", js.Array(value*))
  }
}

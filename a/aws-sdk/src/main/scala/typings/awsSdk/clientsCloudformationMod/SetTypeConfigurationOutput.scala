package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTypeConfigurationOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the configuration data, in this account and region. Conditional: You must specify ConfigurationArn, or Type and TypeName.
    */
  var ConfigurationArn: js.UndefOr[TypeConfigurationArn] = js.undefined
}
object SetTypeConfigurationOutput {
  
  inline def apply(): SetTypeConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetTypeConfigurationOutput]
  }
  
  extension [Self <: SetTypeConfigurationOutput](x: Self) {
    
    inline def setConfigurationArn(value: TypeConfigurationArn): Self = StObject.set(x, "ConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationArnUndefined: Self = StObject.set(x, "ConfigurationArn", js.undefined)
  }
}

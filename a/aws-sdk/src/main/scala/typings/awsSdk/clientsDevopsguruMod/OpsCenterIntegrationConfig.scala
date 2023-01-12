package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsCenterIntegrationConfig extends StObject {
  
  /**
    *  Specifies if DevOps Guru is enabled to create an Amazon Web Services Systems Manager OpsItem for each created insight. 
    */
  var OptInStatus: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.OptInStatus] = js.undefined
}
object OpsCenterIntegrationConfig {
  
  inline def apply(): OpsCenterIntegrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsCenterIntegrationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpsCenterIntegrationConfig] (val x: Self) extends AnyVal {
    
    inline def setOptInStatus(value: OptInStatus): Self = StObject.set(x, "OptInStatus", value.asInstanceOf[js.Any])
    
    inline def setOptInStatusUndefined: Self = StObject.set(x, "OptInStatus", js.undefined)
  }
}

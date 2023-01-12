package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of this connection.
    */
  var ConnectionArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
  
  /**
    * The customer-provided connection name.
    */
  var ConnectionName: js.UndefOr[typings.awsSdk.clientsApprunnerMod.ConnectionName] = js.undefined
  
  /**
    * The App Runner connection creation time, expressed as a Unix time stamp.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The source repository provider.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.clientsApprunnerMod.ProviderType] = js.undefined
  
  /**
    * The current state of the App Runner connection. When the state is AVAILABLE, you can use the connection to create an App Runner service.
    */
  var Status: js.UndefOr[ConnectionStatus] = js.undefined
}
object Connection {
  
  inline def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    inline def setConnectionArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setConnectionArnUndefined: Self = StObject.set(x, "ConnectionArn", js.undefined)
    
    inline def setConnectionName(value: ConnectionName): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
    
    inline def setStatus(value: ConnectionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}

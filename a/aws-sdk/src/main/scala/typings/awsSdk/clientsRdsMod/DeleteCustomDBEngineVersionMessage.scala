package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomDBEngineVersionMessage extends StObject {
  
  /**
    * The database engine. The only supported engine is custom-oracle-ee.
    */
  var Engine: CustomEngineName
  
  /**
    * The custom engine version (CEV) for your DB instance. This option is required for RDS Custom, but optional for Amazon RDS. The combination of Engine and EngineVersion is unique per customer per Amazon Web Services Region.
    */
  var EngineVersion: CustomEngineVersion
}
object DeleteCustomDBEngineVersionMessage {
  
  inline def apply(Engine: CustomEngineName, EngineVersion: CustomEngineVersion): DeleteCustomDBEngineVersionMessage = {
    val __obj = js.Dynamic.literal(Engine = Engine.asInstanceOf[js.Any], EngineVersion = EngineVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomDBEngineVersionMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCustomDBEngineVersionMessage] (val x: Self) extends AnyVal {
    
    inline def setEngine(value: CustomEngineName): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineVersion(value: CustomEngineVersion): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyCustomDBEngineVersionMessage extends StObject {
  
  /**
    * An optional description of your CEV.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsRdsMod.Description] = js.undefined
  
  /**
    * The DB engine. The only supported value is custom-oracle-ee.
    */
  var Engine: CustomEngineName
  
  /**
    * The custom engine version (CEV) that you want to modify. This option is required for RDS Custom for Oracle, but optional for Amazon RDS. The combination of Engine and EngineVersion is unique per customer per Amazon Web Services Region.
    */
  var EngineVersion: CustomEngineVersion
  
  /**
    * The availability status to be assigned to the CEV. Valid values are as follows:  available  You can use this CEV to create a new RDS Custom DB instance.  inactive  You can create a new RDS Custom instance by restoring a DB snapshot with this CEV. You can't patch or create new instances with this CEV.   You can change any status to any status. A typical reason to change status is to prevent the accidental use of a CEV, or to make a deprecated CEV eligible for use again. For example, you might change the status of your CEV from available to inactive, and from inactive back to available. To change the availability status of the CEV, it must not currently be in use by an RDS Custom instance, snapshot, or automated backup.
    */
  var Status: js.UndefOr[CustomEngineVersionStatus] = js.undefined
}
object ModifyCustomDBEngineVersionMessage {
  
  inline def apply(Engine: CustomEngineName, EngineVersion: CustomEngineVersion): ModifyCustomDBEngineVersionMessage = {
    val __obj = js.Dynamic.literal(Engine = Engine.asInstanceOf[js.Any], EngineVersion = EngineVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCustomDBEngineVersionMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyCustomDBEngineVersionMessage] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEngine(value: CustomEngineName): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineVersion(value: CustomEngineVersion): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CustomEngineVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}

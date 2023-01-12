package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGlobalTableSettingsOutput extends StObject {
  
  /**
    * The name of the global table.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.undefined
  
  /**
    * The Region-specific settings for the global table.
    */
  var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.undefined
}
object UpdateGlobalTableSettingsOutput {
  
  inline def apply(): UpdateGlobalTableSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalTableSettingsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGlobalTableSettingsOutput] (val x: Self) extends AnyVal {
    
    inline def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
    
    inline def setReplicaSettings(value: ReplicaSettingsDescriptionList): Self = StObject.set(x, "ReplicaSettings", value.asInstanceOf[js.Any])
    
    inline def setReplicaSettingsUndefined: Self = StObject.set(x, "ReplicaSettings", js.undefined)
    
    inline def setReplicaSettingsVarargs(value: ReplicaSettingsDescription*): Self = StObject.set(x, "ReplicaSettings", js.Array(value*))
  }
}

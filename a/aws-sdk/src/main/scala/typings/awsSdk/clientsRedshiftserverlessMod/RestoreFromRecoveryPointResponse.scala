package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreFromRecoveryPointResponse extends StObject {
  
  /**
    * The namespace that data was restored into.
    */
  var namespace: js.UndefOr[Namespace] = js.undefined
  
  /**
    * The unique identifier of the recovery point used for the restore.
    */
  var recoveryPointId: js.UndefOr[String] = js.undefined
}
object RestoreFromRecoveryPointResponse {
  
  inline def apply(): RestoreFromRecoveryPointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreFromRecoveryPointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreFromRecoveryPointResponse] (val x: Self) extends AnyVal {
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setRecoveryPointId(value: String): Self = StObject.set(x, "recoveryPointId", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointIdUndefined: Self = StObject.set(x, "recoveryPointId", js.undefined)
  }
}

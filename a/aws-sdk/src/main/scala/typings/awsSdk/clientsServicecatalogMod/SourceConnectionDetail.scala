package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceConnectionDetail extends StObject {
  
  /**
    * The connection details based on the connection Type.
    */
  var ConnectionParameters: js.UndefOr[SourceConnectionParameters] = js.undefined
  
  /**
    * Provides details about the product's connection sync and contains the following sub-fields.     LastSyncTime     LastSyncStatus     LastSyncStatusMessage     LastSuccessfulSyncTime     LastSuccessfulSyncProvisioningArtifactID   
    */
  var LastSync: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.LastSync] = js.undefined
  
  /**
    * The only supported SourceConnection type is Codestar.
    */
  var Type: js.UndefOr[SourceType] = js.undefined
}
object SourceConnectionDetail {
  
  inline def apply(): SourceConnectionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConnectionDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceConnectionDetail] (val x: Self) extends AnyVal {
    
    inline def setConnectionParameters(value: SourceConnectionParameters): Self = StObject.set(x, "ConnectionParameters", value.asInstanceOf[js.Any])
    
    inline def setConnectionParametersUndefined: Self = StObject.set(x, "ConnectionParameters", js.undefined)
    
    inline def setLastSync(value: LastSync): Self = StObject.set(x, "LastSync", value.asInstanceOf[js.Any])
    
    inline def setLastSyncUndefined: Self = StObject.set(x, "LastSync", js.undefined)
    
    inline def setType(value: SourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

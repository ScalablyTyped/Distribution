package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveLayerVersionPermissionRequest extends StObject {
  
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.clientsLambdaMod.LayerName
  
  /**
    * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier that was specified when the statement was added.
    */
  var StatementId: typings.awsSdk.clientsLambdaMod.StatementId
  
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber
}
object RemoveLayerVersionPermissionRequest {
  
  inline def apply(LayerName: LayerName, StatementId: StatementId, VersionNumber: LayerVersionNumber): RemoveLayerVersionPermissionRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveLayerVersionPermissionRequest]
  }
  
  extension [Self <: RemoveLayerVersionPermissionRequest](x: Self) {
    
    inline def setLayerName(value: LayerName): Self = StObject.set(x, "LayerName", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    inline def setStatementId(value: StatementId): Self = StObject.set(x, "StatementId", value.asInstanceOf[js.Any])
    
    inline def setVersionNumber(value: LayerVersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
  }
}

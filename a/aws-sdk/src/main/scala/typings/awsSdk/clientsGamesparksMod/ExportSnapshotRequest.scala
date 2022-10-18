package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSnapshotRequest extends StObject {
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.clientsGamesparksMod.GameName
  
  /**
    * The identifier of the snapshot to export.
    */
  var SnapshotId: typings.awsSdk.clientsGamesparksMod.SnapshotId
}
object ExportSnapshotRequest {
  
  inline def apply(GameName: GameName, SnapshotId: SnapshotId): ExportSnapshotRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSnapshotRequest]
  }
  
  extension [Self <: ExportSnapshotRequest](x: Self) {
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}

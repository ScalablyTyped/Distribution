package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeltaTarget extends StObject {
  
  /**
    * The name of the connection to use to connect to the Delta table target.
    */
  var ConnectionName: js.UndefOr[typings.awsSdk.clientsGlueMod.ConnectionName] = js.undefined
  
  /**
    * Specifies whether the crawler will create native tables, to allow integration with query engines that support querying of the Delta transaction log directly.
    */
  var CreateNativeDeltaTable: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * A list of the Amazon S3 paths to the Delta tables.
    */
  var DeltaTables: js.UndefOr[PathList] = js.undefined
  
  /**
    * Specifies whether to write the manifest files to the Delta table path.
    */
  var WriteManifest: js.UndefOr[NullableBoolean] = js.undefined
}
object DeltaTarget {
  
  inline def apply(): DeltaTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeltaTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeltaTarget] (val x: Self) extends AnyVal {
    
    inline def setConnectionName(value: ConnectionName): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    inline def setCreateNativeDeltaTable(value: NullableBoolean): Self = StObject.set(x, "CreateNativeDeltaTable", value.asInstanceOf[js.Any])
    
    inline def setCreateNativeDeltaTableUndefined: Self = StObject.set(x, "CreateNativeDeltaTable", js.undefined)
    
    inline def setDeltaTables(value: PathList): Self = StObject.set(x, "DeltaTables", value.asInstanceOf[js.Any])
    
    inline def setDeltaTablesUndefined: Self = StObject.set(x, "DeltaTables", js.undefined)
    
    inline def setDeltaTablesVarargs(value: Path*): Self = StObject.set(x, "DeltaTables", js.Array(value*))
    
    inline def setWriteManifest(value: NullableBoolean): Self = StObject.set(x, "WriteManifest", value.asInstanceOf[js.Any])
    
    inline def setWriteManifestUndefined: Self = StObject.set(x, "WriteManifest", js.undefined)
  }
}

package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUnfilteredPartitionMetadataResponse extends StObject {
  
  /**
    * A list of column names that the user has been granted access to.
    */
  var AuthorizedColumns: js.UndefOr[NameStringList] = js.undefined
  
  /**
    * A Boolean value that indicates whether the partition location is registered with Lake Formation.
    */
  var IsRegisteredWithLakeFormation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Partition object containing the partition metadata.
    */
  var Partition: js.UndefOr[typings.awsSdk.clientsGlueMod.Partition] = js.undefined
}
object GetUnfilteredPartitionMetadataResponse {
  
  inline def apply(): GetUnfilteredPartitionMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUnfilteredPartitionMetadataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUnfilteredPartitionMetadataResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthorizedColumns(value: NameStringList): Self = StObject.set(x, "AuthorizedColumns", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedColumnsUndefined: Self = StObject.set(x, "AuthorizedColumns", js.undefined)
    
    inline def setAuthorizedColumnsVarargs(value: NameString*): Self = StObject.set(x, "AuthorizedColumns", js.Array(value*))
    
    inline def setIsRegisteredWithLakeFormation(value: Boolean): Self = StObject.set(x, "IsRegisteredWithLakeFormation", value.asInstanceOf[js.Any])
    
    inline def setIsRegisteredWithLakeFormationUndefined: Self = StObject.set(x, "IsRegisteredWithLakeFormation", js.undefined)
    
    inline def setPartition(value: Partition): Self = StObject.set(x, "Partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "Partition", js.undefined)
  }
}

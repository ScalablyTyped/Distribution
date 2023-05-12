package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnfilteredPartition extends StObject {
  
  /**
    * The list of columns the user has permissions to access.
    */
  var AuthorizedColumns: js.UndefOr[NameStringList] = js.undefined
  
  /**
    * A Boolean value indicating that the partition location is registered with Lake Formation.
    */
  var IsRegisteredWithLakeFormation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The partition object.
    */
  var Partition: js.UndefOr[typings.awsSdk.clientsGlueMod.Partition] = js.undefined
}
object UnfilteredPartition {
  
  inline def apply(): UnfilteredPartition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnfilteredPartition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnfilteredPartition] (val x: Self) extends AnyVal {
    
    inline def setAuthorizedColumns(value: NameStringList): Self = StObject.set(x, "AuthorizedColumns", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedColumnsUndefined: Self = StObject.set(x, "AuthorizedColumns", js.undefined)
    
    inline def setAuthorizedColumnsVarargs(value: NameString*): Self = StObject.set(x, "AuthorizedColumns", js.Array(value*))
    
    inline def setIsRegisteredWithLakeFormation(value: Boolean): Self = StObject.set(x, "IsRegisteredWithLakeFormation", value.asInstanceOf[js.Any])
    
    inline def setIsRegisteredWithLakeFormationUndefined: Self = StObject.set(x, "IsRegisteredWithLakeFormation", js.undefined)
    
    inline def setPartition(value: Partition): Self = StObject.set(x, "Partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "Partition", js.undefined)
  }
}

package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotSortingEntity extends StObject {
  
  /**
    * The category for sorting the snapshots.
    */
  var Attribute: SnapshotAttributeToSortBy
  
  /**
    * The order for listing the attributes.
    */
  var SortOrder: js.UndefOr[SortByOrder] = js.undefined
}
object SnapshotSortingEntity {
  
  inline def apply(Attribute: SnapshotAttributeToSortBy): SnapshotSortingEntity = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSortingEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotSortingEntity] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: SnapshotAttributeToSortBy): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: SortByOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}

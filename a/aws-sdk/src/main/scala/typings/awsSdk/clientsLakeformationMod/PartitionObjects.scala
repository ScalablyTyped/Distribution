package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionObjects extends StObject {
  
  /**
    * A list of table objects
    */
  var Objects: js.UndefOr[TableObjectList] = js.undefined
  
  /**
    * A list of partition values.
    */
  var PartitionValues: js.UndefOr[PartitionValuesList] = js.undefined
}
object PartitionObjects {
  
  inline def apply(): PartitionObjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionObjects]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartitionObjects] (val x: Self) extends AnyVal {
    
    inline def setObjects(value: TableObjectList): Self = StObject.set(x, "Objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "Objects", js.undefined)
    
    inline def setObjectsVarargs(value: TableObject*): Self = StObject.set(x, "Objects", js.Array(value*))
    
    inline def setPartitionValues(value: PartitionValuesList): Self = StObject.set(x, "PartitionValues", value.asInstanceOf[js.Any])
    
    inline def setPartitionValuesUndefined: Self = StObject.set(x, "PartitionValues", js.undefined)
    
    inline def setPartitionValuesVarargs(value: PartitionValueString*): Self = StObject.set(x, "PartitionValues", js.Array(value*))
  }
}

package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputColumn extends StObject {
  
  /**
    * A description for a column.
    */
  var Description: js.UndefOr[ColumnDescriptiveText] = js.undefined
  
  /**
    * A display name for the dataset.
    */
  var Name: js.UndefOr[ColumnName] = js.undefined
  
  /**
    * Type.
    */
  var Type: js.UndefOr[ColumnDataType] = js.undefined
}
object OutputColumn {
  
  inline def apply(): OutputColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputColumn] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: ColumnDescriptiveText): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: ColumnName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: ColumnDataType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

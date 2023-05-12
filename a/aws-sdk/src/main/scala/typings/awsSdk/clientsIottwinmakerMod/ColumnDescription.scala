package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDescription extends StObject {
  
  /**
    * The name of the column description.
    */
  var name: js.UndefOr[ColumnName] = js.undefined
  
  /**
    * The type of the column description.
    */
  var `type`: js.UndefOr[ColumnType] = js.undefined
}
object ColumnDescription {
  
  inline def apply(): ColumnDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnDescription] (val x: Self) extends AnyVal {
    
    inline def setName(value: ColumnName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: ColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

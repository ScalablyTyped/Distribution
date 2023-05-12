package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /**
    * The name of the column.
    */
  var name: ColumnName
  
  /**
    * The type of the column.
    */
  var `type`: ColumnTypeString
}
object Column {
  
  inline def apply(name: ColumnName, `type`: ColumnTypeString): Column = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    inline def setName(value: ColumnName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ColumnTypeString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

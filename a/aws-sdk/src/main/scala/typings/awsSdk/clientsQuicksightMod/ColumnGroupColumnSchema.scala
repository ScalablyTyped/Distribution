package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnGroupColumnSchema extends StObject {
  
  /**
    * The name of the column group's column schema.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object ColumnGroupColumnSchema {
  
  inline def apply(): ColumnGroupColumnSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnGroupColumnSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnGroupColumnSchema] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}

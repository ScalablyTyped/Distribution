package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableVersion extends StObject {
  
  /**
    * The table in question.
    */
  var Table: js.UndefOr[typings.awsSdk.clientsGlueMod.Table] = js.undefined
  
  /**
    * The ID value that identifies this table version. A VersionId is a string representation of an integer. Each version is incremented by 1.
    */
  var VersionId: js.UndefOr[VersionString] = js.undefined
}
object TableVersion {
  
  inline def apply(): TableVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableVersion] (val x: Self) extends AnyVal {
    
    inline def setTable(value: Table): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    
    inline def setVersionId(value: VersionString): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}

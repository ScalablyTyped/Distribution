package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDefinition extends StObject {
  
  /**
    * Specifies one or more columns that store your data. Each schema can have up to 100 columns. Each column can have up to 100 nested types.
    */
  var columns: js.UndefOr[Columns] = js.undefined
}
object SchemaDefinition {
  
  inline def apply(): SchemaDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDefinition]
  }
  
  extension [Self <: SchemaDefinition](x: Self) {
    
    inline def setColumns(value: Columns): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value*))
  }
}

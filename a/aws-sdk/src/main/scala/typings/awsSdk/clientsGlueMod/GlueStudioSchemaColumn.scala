package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlueStudioSchemaColumn extends StObject {
  
  /**
    * The name of the column in the Glue Studio schema.
    */
  var Name: GlueStudioColumnNameString
  
  /**
    * The hive type for this column in the Glue Studio schema.
    */
  var Type: js.UndefOr[ColumnTypeString] = js.undefined
}
object GlueStudioSchemaColumn {
  
  inline def apply(Name: GlueStudioColumnNameString): GlueStudioSchemaColumn = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlueStudioSchemaColumn]
  }
  
  extension [Self <: GlueStudioSchemaColumn](x: Self) {
    
    inline def setName(value: GlueStudioColumnNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ColumnTypeString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

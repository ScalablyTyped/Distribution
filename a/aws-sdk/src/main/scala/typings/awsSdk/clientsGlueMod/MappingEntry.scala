package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingEntry extends StObject {
  
  /**
    * The source path.
    */
  var SourcePath: js.UndefOr[SchemaPathString] = js.undefined
  
  /**
    * The name of the source table.
    */
  var SourceTable: js.UndefOr[TableName] = js.undefined
  
  /**
    * The source type.
    */
  var SourceType: js.UndefOr[FieldType] = js.undefined
  
  /**
    * The target path.
    */
  var TargetPath: js.UndefOr[SchemaPathString] = js.undefined
  
  /**
    * The target table.
    */
  var TargetTable: js.UndefOr[TableName] = js.undefined
  
  /**
    * The target type.
    */
  var TargetType: js.UndefOr[FieldType] = js.undefined
}
object MappingEntry {
  
  inline def apply(): MappingEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingEntry] (val x: Self) extends AnyVal {
    
    inline def setSourcePath(value: SchemaPathString): Self = StObject.set(x, "SourcePath", value.asInstanceOf[js.Any])
    
    inline def setSourcePathUndefined: Self = StObject.set(x, "SourcePath", js.undefined)
    
    inline def setSourceTable(value: TableName): Self = StObject.set(x, "SourceTable", value.asInstanceOf[js.Any])
    
    inline def setSourceTableUndefined: Self = StObject.set(x, "SourceTable", js.undefined)
    
    inline def setSourceType(value: FieldType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    inline def setTargetPath(value: SchemaPathString): Self = StObject.set(x, "TargetPath", value.asInstanceOf[js.Any])
    
    inline def setTargetPathUndefined: Self = StObject.set(x, "TargetPath", js.undefined)
    
    inline def setTargetTable(value: TableName): Self = StObject.set(x, "TargetTable", value.asInstanceOf[js.Any])
    
    inline def setTargetTableUndefined: Self = StObject.set(x, "TargetTable", js.undefined)
    
    inline def setTargetType(value: FieldType): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "TargetType", js.undefined)
  }
}

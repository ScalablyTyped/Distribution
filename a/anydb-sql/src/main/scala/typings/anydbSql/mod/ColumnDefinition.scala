package typings.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDefinition extends StObject {
  
  var dataType: js.UndefOr[String] = js.undefined
  
  var notNull: js.UndefOr[Boolean] = js.undefined
  
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  
  var references: js.UndefOr[typings.anydbSql.anon.Column] = js.undefined
  
  var unique: js.UndefOr[Boolean] = js.undefined
}
object ColumnDefinition {
  
  inline def apply(): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnDefinition] (val x: Self) extends AnyVal {
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setNotNull(value: Boolean): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
    
    inline def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
    
    inline def setPrimaryKey(value: Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    inline def setReferences(value: typings.anydbSql.anon.Column): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}

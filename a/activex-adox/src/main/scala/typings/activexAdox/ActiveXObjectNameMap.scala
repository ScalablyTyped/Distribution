package typings.activexAdox

import typings.activexAdox.ADOX.Catalog
import typings.activexAdox.ADOX.Column
import typings.activexAdox.ADOX.Group
import typings.activexAdox.ADOX.Index
import typings.activexAdox.ADOX.Key
import typings.activexAdox.ADOX.Table
import typings.activexAdox.ADOX.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("ADOX.Catalog")
  var ADOXDotCatalog: Catalog
  
  @JSName("ADOX.Column")
  var ADOXDotColumn: Column
  
  @JSName("ADOX.Group")
  var ADOXDotGroup: Group
  
  @JSName("ADOX.Index")
  var ADOXDotIndex: Index
  
  @JSName("ADOX.Key")
  var ADOXDotKey: Key
  
  @JSName("ADOX.Table")
  var ADOXDotTable: Table
  
  @JSName("ADOX.User")
  var ADOXDotUser: User
}
object ActiveXObjectNameMap {
  
  inline def apply(
    ADOXDotCatalog: Catalog,
    ADOXDotColumn: Column,
    ADOXDotGroup: Group,
    ADOXDotIndex: Index,
    ADOXDotKey: Key,
    ADOXDotTable: Table,
    ADOXDotUser: User
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ADOX.Catalog")(ADOXDotCatalog.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Column")(ADOXDotColumn.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Group")(ADOXDotGroup.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Index")(ADOXDotIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Key")(ADOXDotKey.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Table")(ADOXDotTable.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.User")(ADOXDotUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  extension [Self <: ActiveXObjectNameMap](x: Self) {
    
    inline def setADOXDotCatalog(value: Catalog): Self = StObject.set(x, "ADOX.Catalog", value.asInstanceOf[js.Any])
    
    inline def setADOXDotColumn(value: Column): Self = StObject.set(x, "ADOX.Column", value.asInstanceOf[js.Any])
    
    inline def setADOXDotGroup(value: Group): Self = StObject.set(x, "ADOX.Group", value.asInstanceOf[js.Any])
    
    inline def setADOXDotIndex(value: Index): Self = StObject.set(x, "ADOX.Index", value.asInstanceOf[js.Any])
    
    inline def setADOXDotKey(value: Key): Self = StObject.set(x, "ADOX.Key", value.asInstanceOf[js.Any])
    
    inline def setADOXDotTable(value: Table): Self = StObject.set(x, "ADOX.Table", value.asInstanceOf[js.Any])
    
    inline def setADOXDotUser(value: User): Self = StObject.set(x, "ADOX.User", value.asInstanceOf[js.Any])
  }
}

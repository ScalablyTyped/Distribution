package typings.activexAdox

import typings.activexAdox.ADOX.Catalog
import typings.activexAdox.ADOX.Column
import typings.activexAdox.ADOX.Group
import typings.activexAdox.ADOX.Index
import typings.activexAdox.ADOX.Key
import typings.activexAdox.ADOX.Table
import typings.activexAdox.ADOX.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends js.Object {
  
  @JSName("ADOX.Catalog")
  var ADOXDotCatalog: Catalog = js.native
  
  @JSName("ADOX.Column")
  var ADOXDotColumn: Column = js.native
  
  @JSName("ADOX.Group")
  var ADOXDotGroup: Group = js.native
  
  @JSName("ADOX.Index")
  var ADOXDotIndex: Index = js.native
  
  @JSName("ADOX.Key")
  var ADOXDotKey: Key = js.native
  
  @JSName("ADOX.Table")
  var ADOXDotTable: Table = js.native
  
  @JSName("ADOX.User")
  var ADOXDotUser: User = js.native
}
object ActiveXObjectNameMap {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setADOXDotCatalog(value: Catalog): Self = this.set("ADOX.Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADOXDotColumn(value: Column): Self = this.set("ADOX.Column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADOXDotGroup(value: Group): Self = this.set("ADOX.Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADOXDotIndex(value: Index): Self = this.set("ADOX.Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADOXDotKey(value: Key): Self = this.set("ADOX.Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADOXDotTable(value: Table): Self = this.set("ADOX.Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setADOXDotUser(value: User): Self = this.set("ADOX.User", value.asInstanceOf[js.Any])
  }
}

package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TablesMixinProperties extends js.Object {
  
  /**
    * A collection of [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) instances that are tables saved in a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) and/or a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#tables)
    */
  var tables: js.UndefOr[CollectionProperties[LayerProperties] | js.Array[LayerProperties]] = js.native
}
object TablesMixinProperties {
  
  @scala.inline
  def apply(): TablesMixinProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TablesMixinProperties]
  }
  
  @scala.inline
  implicit class TablesMixinPropertiesOps[Self <: TablesMixinProperties] (val x: Self) extends AnyVal {
    
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
    def setTablesVarargs(value: LayerProperties*): Self = this.set("tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: CollectionProperties[LayerProperties] | js.Array[LayerProperties]): Self = this.set("tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
  }
}

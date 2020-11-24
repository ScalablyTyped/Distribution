package typings.antvDataSet.anon

import typings.antvDataSet.antvDataSetStrings.GeoJSON
import typings.antvDataSet.antvDataSetStrings.HexJSON
import typings.antvDataSet.antvDataSetStrings.TopoJSON
import typings.antvDataSet.antvDataSetStrings.`hex-json`
import typings.antvDataSet.antvDataSetStrings.csv
import typings.antvDataSet.antvDataSetStrings.diagram
import typings.antvDataSet.antvDataSetStrings.dsv
import typings.antvDataSet.antvDataSetStrings.geo
import typings.antvDataSet.antvDataSetStrings.geojson_
import typings.antvDataSet.antvDataSetStrings.graph
import typings.antvDataSet.antvDataSetStrings.hex
import typings.antvDataSet.antvDataSetStrings.hexjson_
import typings.antvDataSet.antvDataSetStrings.hierarchy
import typings.antvDataSet.antvDataSetStrings.topojson_
import typings.antvDataSet.antvDataSetStrings.tree
import typings.antvDataSet.antvDataSetStrings.tsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeT[T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */] extends js.Object {
  
  var `type`: T = js.native
}
object TypeT {
  
  @scala.inline
  def apply[T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */](`type`: T): TypeT[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeT[T]]
  }
  
  @scala.inline
  implicit class TypeTOps[Self <: TypeT[_], T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */] (val x: Self with TypeT[T]) extends AnyVal {
    
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
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

package typings.antvDataSet.connectorParamsMod

import typings.antvDataSet.hexjsonMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorParams extends js.Object {
  
  var GeoJSON: js.Tuple2[_, js.Object] = js.native
  
  var HexJSON: js.Tuple2[js.Array[_], Options] = js.native
  
  var TopoJSON: js.Tuple2[_, typings.antvDataSet.topojsonMod.Options] = js.native
  
  var csv: js.Tuple2[String, js.Object] = js.native
  
  var diagram: js.Tuple2[_, typings.antvDataSet.graphMod.Options] = js.native
  
  var dsv: js.Tuple2[String, typings.antvDataSet.dsvMod.Options] = js.native
  
  var geo: js.Tuple2[_, js.Object] = js.native
  
  var geojson: js.Tuple2[_, js.Object] = js.native
  
  var graph: js.Tuple2[_, typings.antvDataSet.graphMod.Options] = js.native
  
  var hex: js.Tuple2[js.Array[_], Options] = js.native
  
  var `hex-json`: js.Tuple2[js.Array[_], Options] = js.native
  
  var hexjson: js.Tuple2[js.Array[_], Options] = js.native
  
  var hierarchy: js.Tuple2[_, typings.antvDataSet.connectorHierarchyMod.Options] = js.native
  
  var topojson: js.Tuple2[_, typings.antvDataSet.topojsonMod.Options] = js.native
  
  var tree: js.Tuple2[_, typings.antvDataSet.connectorHierarchyMod.Options] = js.native
  
  var tsv: js.Tuple2[String, js.Object] = js.native
}
object ConnectorParams {
  
  @scala.inline
  def apply(
    GeoJSON: js.Tuple2[_, js.Object],
    HexJSON: js.Tuple2[js.Array[_], Options],
    TopoJSON: js.Tuple2[_, typings.antvDataSet.topojsonMod.Options],
    csv: js.Tuple2[String, js.Object],
    diagram: js.Tuple2[_, typings.antvDataSet.graphMod.Options],
    dsv: js.Tuple2[String, typings.antvDataSet.dsvMod.Options],
    geo: js.Tuple2[_, js.Object],
    geojson: js.Tuple2[_, js.Object],
    graph: js.Tuple2[_, typings.antvDataSet.graphMod.Options],
    hex: js.Tuple2[js.Array[_], Options],
    `hex-json`: js.Tuple2[js.Array[_], Options],
    hexjson: js.Tuple2[js.Array[_], Options],
    hierarchy: js.Tuple2[_, typings.antvDataSet.connectorHierarchyMod.Options],
    topojson: js.Tuple2[_, typings.antvDataSet.topojsonMod.Options],
    tree: js.Tuple2[_, typings.antvDataSet.connectorHierarchyMod.Options],
    tsv: js.Tuple2[String, js.Object]
  ): ConnectorParams = {
    val __obj = js.Dynamic.literal(GeoJSON = GeoJSON.asInstanceOf[js.Any], HexJSON = HexJSON.asInstanceOf[js.Any], TopoJSON = TopoJSON.asInstanceOf[js.Any], csv = csv.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], dsv = dsv.asInstanceOf[js.Any], geo = geo.asInstanceOf[js.Any], geojson = geojson.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], hexjson = hexjson.asInstanceOf[js.Any], hierarchy = hierarchy.asInstanceOf[js.Any], topojson = topojson.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], tsv = tsv.asInstanceOf[js.Any])
    __obj.updateDynamic("hex-json")(`hex-json`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorParams]
  }
  
  @scala.inline
  implicit class ConnectorParamsOps[Self <: ConnectorParams] (val x: Self) extends AnyVal {
    
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
    def setGeoJSON(value: js.Tuple2[_, js.Object]): Self = this.set("GeoJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHexJSON(value: js.Tuple2[js.Array[_], Options]): Self = this.set("HexJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopoJSON(value: js.Tuple2[_, typings.antvDataSet.topojsonMod.Options]): Self = this.set("TopoJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsv(value: js.Tuple2[String, js.Object]): Self = this.set("csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagram(value: js.Tuple2[_, typings.antvDataSet.graphMod.Options]): Self = this.set("diagram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDsv(value: js.Tuple2[String, typings.antvDataSet.dsvMod.Options]): Self = this.set("dsv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeo(value: js.Tuple2[_, js.Object]): Self = this.set("geo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraph(value: js.Tuple2[_, typings.antvDataSet.graphMod.Options]): Self = this.set("graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHex(value: js.Tuple2[js.Array[_], Options]): Self = this.set("hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHex-json`(value: js.Tuple2[js.Array[_], Options]): Self = this.set("hex-json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchy(value: js.Tuple2[_, typings.antvDataSet.connectorHierarchyMod.Options]): Self = this.set("hierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: js.Tuple2[_, typings.antvDataSet.connectorHierarchyMod.Options]): Self = this.set("tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsv(value: js.Tuple2[String, js.Object]): Self = this.set("tsv", value.asInstanceOf[js.Any])
  }
}

package typings.antvDataSet

import typings.antvDataSet.libConnectorHexjsonMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConnectorParamsMod {
  
  trait ConnectorParams extends StObject {
    
    var GeoJSON: js.Tuple2[Any, js.Object]
    
    var HexJSON: js.Tuple2[js.Array[Any], Options]
    
    var TopoJSON: js.Tuple2[Any, typings.antvDataSet.libConnectorTopojsonMod.Options]
    
    var csv: js.Tuple2[String, js.Object]
    
    var diagram: js.Tuple2[Any, typings.antvDataSet.libConnectorGraphMod.Options]
    
    var dsv: js.Tuple2[String, typings.antvDataSet.libConnectorDsvMod.Options]
    
    var geo: js.Tuple2[Any, js.Object]
    
    var geojson: js.Tuple2[Any, js.Object]
    
    var graph: js.Tuple2[Any, typings.antvDataSet.libConnectorGraphMod.Options]
    
    var hex: js.Tuple2[js.Array[Any], Options]
    
    var `hex-json`: js.Tuple2[js.Array[Any], Options]
    
    var hexjson: js.Tuple2[js.Array[Any], Options]
    
    var hierarchy: js.Tuple2[Any, typings.antvDataSet.libConnectorHierarchyMod.Options]
    
    var topojson: js.Tuple2[Any, typings.antvDataSet.libConnectorTopojsonMod.Options]
    
    var tree: js.Tuple2[Any, typings.antvDataSet.libConnectorHierarchyMod.Options]
    
    var tsv: js.Tuple2[String, js.Object]
  }
  object ConnectorParams {
    
    inline def apply(
      GeoJSON: js.Tuple2[Any, js.Object],
      HexJSON: js.Tuple2[js.Array[Any], Options],
      TopoJSON: js.Tuple2[Any, typings.antvDataSet.libConnectorTopojsonMod.Options],
      csv: js.Tuple2[String, js.Object],
      diagram: js.Tuple2[Any, typings.antvDataSet.libConnectorGraphMod.Options],
      dsv: js.Tuple2[String, typings.antvDataSet.libConnectorDsvMod.Options],
      geo: js.Tuple2[Any, js.Object],
      geojson: js.Tuple2[Any, js.Object],
      graph: js.Tuple2[Any, typings.antvDataSet.libConnectorGraphMod.Options],
      hex: js.Tuple2[js.Array[Any], Options],
      `hex-json`: js.Tuple2[js.Array[Any], Options],
      hexjson: js.Tuple2[js.Array[Any], Options],
      hierarchy: js.Tuple2[Any, typings.antvDataSet.libConnectorHierarchyMod.Options],
      topojson: js.Tuple2[Any, typings.antvDataSet.libConnectorTopojsonMod.Options],
      tree: js.Tuple2[Any, typings.antvDataSet.libConnectorHierarchyMod.Options],
      tsv: js.Tuple2[String, js.Object]
    ): ConnectorParams = {
      val __obj = js.Dynamic.literal(GeoJSON = GeoJSON.asInstanceOf[js.Any], HexJSON = HexJSON.asInstanceOf[js.Any], TopoJSON = TopoJSON.asInstanceOf[js.Any], csv = csv.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], dsv = dsv.asInstanceOf[js.Any], geo = geo.asInstanceOf[js.Any], geojson = geojson.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], hexjson = hexjson.asInstanceOf[js.Any], hierarchy = hierarchy.asInstanceOf[js.Any], topojson = topojson.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], tsv = tsv.asInstanceOf[js.Any])
      __obj.updateDynamic("hex-json")(`hex-json`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectorParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectorParams] (val x: Self) extends AnyVal {
      
      inline def setCsv(value: js.Tuple2[String, js.Object]): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      inline def setDiagram(value: js.Tuple2[Any, typings.antvDataSet.libConnectorGraphMod.Options]): Self = StObject.set(x, "diagram", value.asInstanceOf[js.Any])
      
      inline def setDsv(value: js.Tuple2[String, typings.antvDataSet.libConnectorDsvMod.Options]): Self = StObject.set(x, "dsv", value.asInstanceOf[js.Any])
      
      inline def setGeo(value: js.Tuple2[Any, js.Object]): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
      
      inline def setGeoJSON(value: js.Tuple2[Any, js.Object]): Self = StObject.set(x, "GeoJSON", value.asInstanceOf[js.Any])
      
      inline def setGraph(value: js.Tuple2[Any, typings.antvDataSet.libConnectorGraphMod.Options]): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setHex(value: js.Tuple2[js.Array[Any], Options]): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def `setHex-json`(value: js.Tuple2[js.Array[Any], Options]): Self = StObject.set(x, "hex-json", value.asInstanceOf[js.Any])
      
      inline def setHexJSON(value: js.Tuple2[js.Array[Any], Options]): Self = StObject.set(x, "HexJSON", value.asInstanceOf[js.Any])
      
      inline def setHierarchy(value: js.Tuple2[Any, typings.antvDataSet.libConnectorHierarchyMod.Options]): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
      
      inline def setTopoJSON(value: js.Tuple2[Any, typings.antvDataSet.libConnectorTopojsonMod.Options]): Self = StObject.set(x, "TopoJSON", value.asInstanceOf[js.Any])
      
      inline def setTree(value: js.Tuple2[Any, typings.antvDataSet.libConnectorHierarchyMod.Options]): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setTsv(value: js.Tuple2[String, js.Object]): Self = StObject.set(x, "tsv", value.asInstanceOf[js.Any])
    }
  }
}

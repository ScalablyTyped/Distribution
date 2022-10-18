package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrometheusInfo extends StObject {
  
  /**
    * 
    Indicates whether you want to turn on or turn off the JMX Exporter.
    
    */
  var JmxExporter: js.UndefOr[JmxExporterInfo] = js.undefined
  
  /**
    * 
    Indicates whether you want to turn on or turn off the Node Exporter.
    
    */
  var NodeExporter: js.UndefOr[NodeExporterInfo] = js.undefined
}
object PrometheusInfo {
  
  inline def apply(): PrometheusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrometheusInfo]
  }
  
  extension [Self <: PrometheusInfo](x: Self) {
    
    inline def setJmxExporter(value: JmxExporterInfo): Self = StObject.set(x, "JmxExporter", value.asInstanceOf[js.Any])
    
    inline def setJmxExporterUndefined: Self = StObject.set(x, "JmxExporter", js.undefined)
    
    inline def setNodeExporter(value: NodeExporterInfo): Self = StObject.set(x, "NodeExporter", value.asInstanceOf[js.Any])
    
    inline def setNodeExporterUndefined: Self = StObject.set(x, "NodeExporter", js.undefined)
  }
}

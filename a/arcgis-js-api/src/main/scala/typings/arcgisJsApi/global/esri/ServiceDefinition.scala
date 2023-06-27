package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ServiceDefinitionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ServiceDefinition")
@js.native
/**
		 * Outlines the service capabilities for a [knowledgeGraphService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html)
		 */
open class ServiceDefinition ()
  extends StObject
     with typings.arcgisJsApi.esri.ServiceDefinition {
  def this(properties: ServiceDefinitionProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ServiceDefinition {
  
  @JSGlobal("__esri.ServiceDefinition")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ServiceDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ServiceDefinition]
}

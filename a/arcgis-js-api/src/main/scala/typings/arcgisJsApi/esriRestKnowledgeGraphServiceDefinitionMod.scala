package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ServiceDefinition
import typings.arcgisJsApi.esri.ServiceDefinitionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestKnowledgeGraphServiceDefinitionMod {
  
  @JSImport("esri/rest/knowledgeGraph/ServiceDefinition", JSImport.Namespace)
  @js.native
  /**
  		 * Outlines the service capabilities for a [knowledgeGraphService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html)
  		 */
  open class ^ ()
    extends StObject
       with ServiceDefinition {
    def this(properties: ServiceDefinitionProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/knowledgeGraph/ServiceDefinition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ServiceDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ServiceDefinition]
}

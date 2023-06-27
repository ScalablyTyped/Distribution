package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Entity
import typings.arcgisJsApi.esri.EntityProperties
import typings.arcgisJsApi.esri.GraphNamedObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestKnowledgeGraphEntityMod {
  
  @JSImport("esri/rest/knowledgeGraph/Entity", JSImport.Namespace)
  @js.native
  /**
  		 * An entity is a specific instance of an [EntityType](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) that can exist in the [knowledge graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html)
  		 */
  open class ^ ()
    extends StObject
       with GraphNamedObject {
    def this(properties: EntityProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/knowledgeGraph/Entity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Entity]
}

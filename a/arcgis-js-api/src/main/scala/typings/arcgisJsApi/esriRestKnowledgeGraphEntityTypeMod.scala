package typings.arcgisJsApi

import typings.arcgisJsApi.esri.EntityType
import typings.arcgisJsApi.esri.EntityTypeProperties
import typings.arcgisJsApi.esri.GraphObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestKnowledgeGraphEntityTypeMod {
  
  @JSImport("esri/rest/knowledgeGraph/EntityType", JSImport.Namespace)
  @js.native
  /**
  		 * An entity type defines a homogeneous collection of [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) with a common set of properties and a spatial feature type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html)
  		 */
  open class ^ ()
    extends StObject
       with GraphObjectType {
    def this(properties: EntityTypeProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/knowledgeGraph/EntityType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): EntityType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[EntityType]
}

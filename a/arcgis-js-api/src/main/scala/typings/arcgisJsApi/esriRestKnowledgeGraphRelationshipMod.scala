package typings.arcgisJsApi

import typings.arcgisJsApi.esri.knowledgeGraphRelationship
import typings.arcgisJsApi.esri.knowledgeGraphRelationshipProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestKnowledgeGraphRelationshipMod {
  
  @JSImport("esri/rest/knowledgeGraph/Relationship", JSImport.Namespace)
  @js.native
  /**
  		 * A relationship is an instance of a [relationship type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html) that	defines an association between two [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html)
  		 */
  open class ^ ()
    extends StObject
       with knowledgeGraphRelationship {
    def this(properties: knowledgeGraphRelationshipProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/knowledgeGraph/Relationship", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): knowledgeGraphRelationship = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[knowledgeGraphRelationship]
}

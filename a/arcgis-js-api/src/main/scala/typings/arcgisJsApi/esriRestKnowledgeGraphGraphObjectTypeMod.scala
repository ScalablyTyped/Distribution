package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GraphObjectType
import typings.arcgisJsApi.esri.GraphObjectTypeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphGraphObjectTypeMod {
  
  @JSImport("esri/rest/knowledgeGraph/GraphObjectType", JSImport.Namespace)
  @js.native
  /**
    * Parent object for [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) and [relationship types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html) defined in the graph schema.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObjectType.html)
    */
  open class ^ ()
    extends StObject
       with GraphObjectType {
    def this(properties: GraphObjectTypeProperties) = this()
  }
}

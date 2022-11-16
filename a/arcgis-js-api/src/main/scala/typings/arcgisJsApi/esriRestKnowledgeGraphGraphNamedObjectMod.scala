package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GraphNamedObject
import typings.arcgisJsApi.esri.GraphNamedObjectProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphGraphNamedObjectMod {
  
  @JSImport("esri/rest/knowledgeGraph/GraphNamedObject", JSImport.Namespace)
  @js.native
  /**
    * The parent class for an [Entity](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) or [Relationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) that is defined in the graph schema.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphNamedObject.html)
    */
  open class ^ ()
    extends StObject
       with GraphNamedObject {
    def this(properties: GraphNamedObjectProperties) = this()
  }
}

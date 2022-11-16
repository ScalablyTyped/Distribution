package typings.arcgisJsApi

import typings.arcgisJsApi.esri.knowledgeGraphRelationship
import typings.arcgisJsApi.esri.knowledgeGraphRelationshipProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphRelationshipMod {
  
  @JSImport("esri/rest/knowledgeGraph/Relationship", JSImport.Namespace)
  @js.native
  /**
    * A relationship is an instance of a [relationship type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html) that  defines an association between two [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html)
    */
  open class ^ ()
    extends StObject
       with knowledgeGraphRelationship {
    def this(properties: knowledgeGraphRelationshipProperties) = this()
  }
}

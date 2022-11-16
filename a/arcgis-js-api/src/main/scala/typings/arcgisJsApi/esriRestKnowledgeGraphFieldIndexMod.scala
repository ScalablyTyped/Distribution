package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FieldIndex
import typings.arcgisJsApi.esri.FieldIndexProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphFieldIndexMod {
  
  @JSImport("esri/rest/knowledgeGraph/FieldIndex", JSImport.Namespace)
  @js.native
  /**
    * Defines an index on fields associated with an [entity type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) or [relationship type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-FieldIndex.html)
    */
  open class ^ ()
    extends StObject
       with FieldIndex {
    def this(properties: FieldIndexProperties) = this()
  }
}

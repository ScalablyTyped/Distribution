package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DataModel
import typings.arcgisJsApi.esri.DataModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestKnowledgeGraphDataModelMod {
  
  @JSImport("esri/rest/knowledgeGraph/DataModel", JSImport.Namespace)
  @js.native
  /**
    * The data model defines the [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) and [relationship types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html) in a knowledge graph service  as well as some additional settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html)
    */
  open class ^ ()
    extends StObject
       with DataModel {
    def this(properties: DataModelProperties) = this()
  }
}

package typings.arcgisJsApi

import typings.arcgisJsApi.esri.EntityTypeProperties
import typings.arcgisJsApi.esri.GraphObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  }
}

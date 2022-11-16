package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.EntityProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Entity")
@js.native
/**
  * An entity is a specific instance of an [EntityType](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) that can exist in the [knowledge graph](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html)
  */
open class Entity ()
  extends StObject
     with typings.arcgisJsApi.esri.GraphNamedObject {
  def this(properties: EntityProperties) = this()
}

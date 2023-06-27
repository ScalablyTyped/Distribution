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
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Entity {
  
  @JSGlobal("__esri.Entity")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Entity]
}

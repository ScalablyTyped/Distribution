package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.DataModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.DataModel")
@js.native
/**
		 * The data model defines the [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) and [relationship types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html) in a knowledge graph service	as well as some additional settings.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html)
		 */
open class DataModel ()
  extends StObject
     with typings.arcgisJsApi.esri.DataModel {
  def this(properties: DataModelProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object DataModel {
  
  @JSGlobal("__esri.DataModel")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.DataModel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.DataModel]
}

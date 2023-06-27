package typings.arcgisJsApi

import typings.arcgisJsApi.esri.RelationshipElement
import typings.arcgisJsApi.esri.RelationshipElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriFormElementsRelationshipElementMod {
  
  @JSImport("esri/form/elements/RelationshipElement", JSImport.Namespace)
  @js.native
  /**
  		 * A `RelationshipElement` form element defines how a relationship between [feature layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) and [tables](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#tables) participates in the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-RelationshipElement.html)
  		 */
  open class ^ ()
    extends StObject
       with RelationshipElement {
    def this(properties: RelationshipElementProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/form/elements/RelationshipElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): RelationshipElement = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[RelationshipElement]
}

package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ColumnTemplate
import typings.arcgisJsApi.esri.ColumnTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsFeatureTableSupportColumnTemplateMod {
  
  @JSImport("esri/widgets/FeatureTable/support/ColumnTemplate", JSImport.Namespace)
  @js.native
  /**
  		 * A ColumnTemplate formats and defines the structure of a [Column](module-esri-widgets-FeatureTable-Grid-Column.html) within a [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplate.html)
  		 */
  open class ^ ()
    extends StObject
       with ColumnTemplate {
    def this(properties: ColumnTemplateProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/widgets/FeatureTable/support/ColumnTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ColumnTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ColumnTemplate]
}

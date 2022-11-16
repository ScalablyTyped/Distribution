package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FieldColumnTemplate
import typings.arcgisJsApi.esri.FieldColumnTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsFeatureTableSupportFieldColumnTemplateMod {
  
  @JSImport("esri/widgets/FeatureTable/support/FieldColumnTemplate", JSImport.Namespace)
  @js.native
  /**
    * A FieldColumnTemplate formats and defines the structure of a [FieldColumn](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html) within a [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-FieldColumnTemplate.html)
    */
  open class ^ ()
    extends StObject
       with FieldColumnTemplate {
    def this(properties: FieldColumnTemplateProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/widgets/FeatureTable/support/FieldColumnTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FieldColumnTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FieldColumnTemplate]
}

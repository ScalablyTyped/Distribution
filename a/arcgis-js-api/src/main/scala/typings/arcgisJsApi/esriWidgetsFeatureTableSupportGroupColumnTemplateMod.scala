package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GroupColumnTemplate
import typings.arcgisJsApi.esri.GroupColumnTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsFeatureTableSupportGroupColumnTemplateMod {
  
  @JSImport("esri/widgets/FeatureTable/support/GroupColumnTemplate", JSImport.Namespace)
  @js.native
  /**
    * A GroupColumnTemplate formats and defines the structure of a [GroupColumn](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-GroupColumn.html) within a [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-GroupColumnTemplate.html)
    */
  open class ^ ()
    extends StObject
       with GroupColumnTemplate {
    def this(properties: GroupColumnTemplateProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/widgets/FeatureTable/support/GroupColumnTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): GroupColumnTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[GroupColumnTemplate]
}

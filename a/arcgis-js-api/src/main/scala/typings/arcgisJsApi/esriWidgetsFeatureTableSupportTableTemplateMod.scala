package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TableTemplate
import typings.arcgisJsApi.esri.TableTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsFeatureTableSupportTableTemplateMod {
  
  @JSImport("esri/widgets/FeatureTable/support/TableTemplate", JSImport.Namespace)
  @js.native
  /**
  		 * A TableTemplate formats and defines the content of a [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-TableTemplate.html)
  		 */
  open class ^ ()
    extends StObject
       with TableTemplate {
    def this(properties: TableTemplateProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/widgets/FeatureTable/support/TableTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TableTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TableTemplate]
}

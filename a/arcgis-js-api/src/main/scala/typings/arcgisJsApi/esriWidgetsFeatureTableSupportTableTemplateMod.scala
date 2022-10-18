package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TableTemplate
import typings.arcgisJsApi.esri.TableTemplateConstructor
import typings.arcgisJsApi.esri.TableTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureTableSupportTableTemplateMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/support/TableTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TableTemplateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/support/TableTemplate", JSImport.Namespace)
  @js.native
  /**
    * A TableTemplate formats and defines the content of a [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-TableTemplate.html)
    */
  open class Class ()
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
  
  type _To = js.Object & TableTemplateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFeatureTableSupportTableTemplateMod.foo` */
  override def _to: js.Object & TableTemplateConstructor = ^
}

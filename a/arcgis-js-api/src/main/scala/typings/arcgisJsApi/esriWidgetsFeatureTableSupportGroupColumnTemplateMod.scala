package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GroupColumnTemplate
import typings.arcgisJsApi.esri.GroupColumnTemplateConstructor
import typings.arcgisJsApi.esri.GroupColumnTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureTableSupportGroupColumnTemplateMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/support/GroupColumnTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GroupColumnTemplateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/support/GroupColumnTemplate", JSImport.Namespace)
  @js.native
  /**
    * A GroupColumnTemplate formats and defines the structure of a [GroupColumn](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-GroupColumn.html) within a [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-GroupColumnTemplate.html)
    */
  open class Class ()
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
  
  type _To = js.Object & GroupColumnTemplateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFeatureTableSupportGroupColumnTemplateMod.foo` */
  override def _to: js.Object & GroupColumnTemplateConstructor = ^
}

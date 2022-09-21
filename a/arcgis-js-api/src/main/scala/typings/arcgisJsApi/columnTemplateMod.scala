package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ColumnTemplate
import typings.arcgisJsApi.esri.ColumnTemplateConstructor
import typings.arcgisJsApi.esri.ColumnTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnTemplateMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/support/ColumnTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ColumnTemplateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/support/ColumnTemplate", JSImport.Namespace)
  @js.native
  /**
    * A ColumnTemplate formats and defines the structure of a [Column](module-esri-widgets-FeatureTable-Grid-Column.html) within a [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplate.html)
    */
  open class Class ()
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
  
  type _To = js.Object & ColumnTemplateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `columnTemplateMod.foo` */
  override def _to: js.Object & ColumnTemplateConstructor = ^
}

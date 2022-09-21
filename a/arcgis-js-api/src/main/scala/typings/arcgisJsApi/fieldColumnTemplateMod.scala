package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FieldColumnTemplate
import typings.arcgisJsApi.esri.FieldColumnTemplateConstructor
import typings.arcgisJsApi.esri.FieldColumnTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldColumnTemplateMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/support/FieldColumnTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FieldColumnTemplateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/support/FieldColumnTemplate", JSImport.Namespace)
  @js.native
  /**
    * A FieldColumnTemplate formats and defines the structure of a [FieldColumn](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html) within a [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-FieldColumnTemplate.html)
    */
  open class Class ()
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
  
  type _To = js.Object & FieldColumnTemplateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fieldColumnTemplateMod.foo` */
  override def _to: js.Object & FieldColumnTemplateConstructor = ^
}

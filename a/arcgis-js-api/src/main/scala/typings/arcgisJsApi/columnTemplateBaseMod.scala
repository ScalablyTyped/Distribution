package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ColumnTemplateBase
import typings.arcgisJsApi.esri.ColumnTemplateBaseConstructor
import typings.arcgisJsApi.esri.ColumnTemplateBaseProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnTemplateBaseMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/support/ColumnTemplateBase", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ColumnTemplateBaseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/support/ColumnTemplateBase", JSImport.Namespace)
  @js.native
  /**
    * The base class for all column templates used by the [tableTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-TableTemplate.html) within the [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplateBase.html)
    */
  open class Class ()
    extends StObject
       with ColumnTemplateBase {
    def this(properties: ColumnTemplateBaseProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ColumnTemplateBaseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `columnTemplateBaseMod.foo` */
  override def _to: js.Object & ColumnTemplateBaseConstructor = ^
}

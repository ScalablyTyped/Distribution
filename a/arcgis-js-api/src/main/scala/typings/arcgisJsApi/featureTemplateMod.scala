package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureTemplate
import typings.arcgisJsApi.esri.FeatureTemplateConstructor
import typings.arcgisJsApi.esri.FeatureTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureTemplateMod extends Shortcut {
  
  @JSImport("esri/layers/support/FeatureTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureTemplateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/FeatureTemplate", JSImport.Namespace)
  @js.native
  /**
    * Feature templates define all the information required to create a new feature in a [feature layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html)
    */
  open class Class ()
    extends StObject
       with FeatureTemplate {
    def this(properties: FeatureTemplateProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FeatureTemplateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureTemplateMod.foo` */
  override def _to: js.Object & FeatureTemplateConstructor = ^
}

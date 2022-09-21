package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.AttributeColorInfo
import typings.arcgisJsApi.esri.AttributeColorInfoConstructor
import typings.arcgisJsApi.esri.AttributeColorInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributeColorInfoMod extends Shortcut {
  
  @JSImport("esri/renderers/support/AttributeColorInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AttributeColorInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/support/AttributeColorInfo", JSImport.Namespace)
  @js.native
  /**
    * Defines colors for dots in a [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes), or colors for pie chart slices in a [PieChartRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#attributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html)
    */
  open class Class ()
    extends StObject
       with AttributeColorInfo {
    def this(properties: AttributeColorInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & AttributeColorInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `attributeColorInfoMod.foo` */
  override def _to: js.Object & AttributeColorInfoConstructor = ^
}

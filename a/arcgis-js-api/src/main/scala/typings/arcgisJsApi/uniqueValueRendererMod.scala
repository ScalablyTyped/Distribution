package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.UniqueValueRenderer
import typings.arcgisJsApi.esri.UniqueValueRendererConstructor
import typings.arcgisJsApi.esri.UniqueValueRendererProperties
import typings.arcgisJsApi.esri.VisualVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniqueValueRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/UniqueValueRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & UniqueValueRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/UniqueValueRenderer", JSImport.Namespace)
  @js.native
  /**
    * UniqueValueRenderer allows you to symbolize features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on one or more matching string attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html)
    */
  class Class ()
    extends StObject
       with UniqueValueRenderer {
    def this(properties: UniqueValueRendererProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /**
      * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
      */
    /* CompleteClass */
    var visualVariables: js.Array[VisualVariable] = js.native
  }
  
  type _To = js.Object & UniqueValueRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `uniqueValueRendererMod.foo` */
  override def _to: js.Object & UniqueValueRendererConstructor = ^
}

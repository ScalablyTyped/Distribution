package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LabelClass
import typings.arcgisJsApi.esri.LabelClassConstructor
import typings.arcgisJsApi.esri.LabelClassProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportLabelClassMod extends Shortcut {
  
  @JSImport("esri/layers/support/LabelClass", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LabelClassConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/LabelClass", JSImport.Namespace)
  @js.native
  /**
    * Defines label expressions, symbols, scale ranges, label priorities, and label placement options for labels on a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html)
    */
  open class Class ()
    extends StObject
       with LabelClass {
    def this(properties: LabelClassProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & LabelClassConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportLabelClassMod.foo` */
  override def _to: js.Object & LabelClassConstructor = ^
}

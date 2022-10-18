package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Field
import typings.arcgisJsApi.esri.FieldConstructor
import typings.arcgisJsApi.esri.FieldProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportFieldMod extends Shortcut {
  
  @JSImport("esri/layers/support/Field", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FieldConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/Field", JSImport.Namespace)
  @js.native
  /**
    * Information about each field in a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html)
    */
  open class Class ()
    extends StObject
       with Field {
    def this(properties: FieldProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FieldConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportFieldMod.foo` */
  override def _to: js.Object & FieldConstructor = ^
}

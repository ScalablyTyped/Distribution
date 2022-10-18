package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FieldInfo
import typings.arcgisJsApi.esri.FieldInfoConstructor
import typings.arcgisJsApi.esri.FieldInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupFieldInfoMod extends Shortcut {
  
  @JSImport("esri/popup/FieldInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FieldInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/FieldInfo", JSImport.Namespace)
  @js.native
  /**
    * The `FieldInfo` class defines how a [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) participates, or in some cases, does not participate, in a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html)
    */
  open class Class ()
    extends StObject
       with FieldInfo {
    def this(properties: FieldInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FieldInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupFieldInfoMod.foo` */
  override def _to: js.Object & FieldInfoConstructor = ^
}

package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FieldInfoFormat
import typings.arcgisJsApi.esri.FieldInfoFormatConstructor
import typings.arcgisJsApi.esri.FieldInfoFormatProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupSupportFieldInfoFormatMod extends Shortcut {
  
  @JSImport("esri/popup/support/FieldInfoFormat", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FieldInfoFormatConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/support/FieldInfoFormat", JSImport.Namespace)
  @js.native
  /**
    * The `FieldInfoFormat` class is used with numerical or date fields to provide more detail about how the value should be displayed in a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html)
    */
  open class Class ()
    extends StObject
       with FieldInfoFormat {
    def this(properties: FieldInfoFormatProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FieldInfoFormatConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupSupportFieldInfoFormatMod.foo` */
  override def _to: js.Object & FieldInfoFormatConstructor = ^
}

package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FieldsContent
import typings.arcgisJsApi.esri.FieldsContentConstructor
import typings.arcgisJsApi.esri.FieldsContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldsContentMod extends Shortcut {
  
  @JSImport("esri/popup/content/FieldsContent", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FieldsContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/FieldsContent", JSImport.Namespace)
  @js.native
  /**
    * A `FieldsContent` popup element represents the [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) associated with a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html)
    */
  class Class ()
    extends StObject
       with FieldsContent {
    def this(properties: FieldsContentProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & FieldsContentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fieldsContentMod.foo` */
  override def _to: js.Object & FieldsContentConstructor = ^
}

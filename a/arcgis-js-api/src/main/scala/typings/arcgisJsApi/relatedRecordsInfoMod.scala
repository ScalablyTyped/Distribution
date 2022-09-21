package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RelatedRecordsInfo
import typings.arcgisJsApi.esri.RelatedRecordsInfoConstructor
import typings.arcgisJsApi.esri.RelatedRecordsInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relatedRecordsInfoMod extends Shortcut {
  
  @JSImport("esri/popup/RelatedRecordsInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RelatedRecordsInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/RelatedRecordsInfo", JSImport.Namespace)
  @js.native
  /**
    * The `RelatedRecordsInfo` class provides additional sorting options when working with related records in a layer's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-RelatedRecordsInfo.html)
    */
  open class Class ()
    extends StObject
       with RelatedRecordsInfo {
    def this(properties: RelatedRecordsInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & RelatedRecordsInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `relatedRecordsInfoMod.foo` */
  override def _to: js.Object & RelatedRecordsInfoConstructor = ^
}

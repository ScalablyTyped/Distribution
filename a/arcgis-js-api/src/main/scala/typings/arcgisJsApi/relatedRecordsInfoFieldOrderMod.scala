package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RelatedRecordsInfoFieldOrder
import typings.arcgisJsApi.esri.RelatedRecordsInfoFieldOrderConstructor
import typings.arcgisJsApi.esri.RelatedRecordsInfoFieldOrderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relatedRecordsInfoFieldOrderMod extends Shortcut {
  
  @JSImport("esri/popup/support/RelatedRecordsInfoFieldOrder", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RelatedRecordsInfoFieldOrderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/support/RelatedRecordsInfoFieldOrder", JSImport.Namespace)
  @js.native
  /**
    * The `RelatedRecordsInfoFieldOrder` class indicates the field display order for the related records in a layer's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html)
    */
  open class Class ()
    extends StObject
       with RelatedRecordsInfoFieldOrder {
    def this(properties: RelatedRecordsInfoFieldOrderProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & RelatedRecordsInfoFieldOrderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `relatedRecordsInfoFieldOrderMod.foo` */
  override def _to: js.Object & RelatedRecordsInfoFieldOrderConstructor = ^
}

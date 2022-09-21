package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.AttachmentsContent
import typings.arcgisJsApi.esri.AttachmentsContentConstructor
import typings.arcgisJsApi.esri.AttachmentsContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachmentsContentMod extends Shortcut {
  
  @JSImport("esri/popup/content/AttachmentsContent", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AttachmentsContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/AttachmentsContent", JSImport.Namespace)
  @js.native
  /**
    * An `AttachmentsContent` popup element represents an attachment element associated with a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html)
    */
  open class Class ()
    extends StObject
       with AttachmentsContent {
    def this(properties: AttachmentsContentProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & AttachmentsContentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `attachmentsContentMod.foo` */
  override def _to: js.Object & AttachmentsContentConstructor = ^
}

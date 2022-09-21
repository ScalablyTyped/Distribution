package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.AttachmentInfo
import typings.arcgisJsApi.esri.AttachmentInfoConstructor
import typings.arcgisJsApi.esri.AttachmentInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachmentInfoMod extends Shortcut {
  
  @JSImport("esri/rest/query/support/AttachmentInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AttachmentInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/query/support/AttachmentInfo", JSImport.Namespace)
  @js.native
  /**
    * The `AttachmentInfo` class returns information about attachments associated with a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query-support-AttachmentInfo.html)
    */
  open class Class ()
    extends StObject
       with AttachmentInfo {
    def this(properties: AttachmentInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & AttachmentInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `attachmentInfoMod.foo` */
  override def _to: js.Object & AttachmentInfoConstructor = ^
}

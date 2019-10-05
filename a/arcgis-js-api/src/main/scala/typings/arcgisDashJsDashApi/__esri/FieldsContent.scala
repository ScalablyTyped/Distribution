package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldsContent
  extends Content
     with typings.arcgisDashJsDashApi.__esri.content.Content
     with contentContent {
  /**
    * Array of [fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html). If the `fieldInfos` property is not provided directly within the content, the popup will display whatever is set in the [PopupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html#fieldInfos)
    */
  var fieldInfos: js.Array[FieldInfo] = js.native
}

@JSGlobal("__esri.FieldsContent")
@js.native
object FieldsContent extends TopLevel[FieldsContentConstructor]


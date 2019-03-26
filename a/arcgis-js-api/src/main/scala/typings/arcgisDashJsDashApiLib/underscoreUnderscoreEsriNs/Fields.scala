package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields
  extends ContentElementContentElement
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.ContentElementNs.ContentElement
     with supportContentElementContentElement {
  /**
    * Object array of [fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html). If the `fieldInfos` property is not provided directly within the content, the popup will display whatever is set in the [PopupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Fields.html#fieldInfos)
    */
  var fieldInfos: js.Array[FieldInfo] = js.native
}

@JSGlobal("__esri.Fields")
@js.native
/**
  * A FieldsContentElement represents [fieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html) associated with a feature. If this is not set within the content, it will revert to whatever may be set within the [PopupTemplate.Fieldinfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html) property.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Fields.html)
  */
class FieldsCls () extends Fields {
  def this(properties: FieldsProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}


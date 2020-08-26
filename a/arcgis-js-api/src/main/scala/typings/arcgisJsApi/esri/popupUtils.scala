package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait popupUtils extends js.Object {
  /**
    * Creates an array of [fieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) used for populating [FieldsContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#createFieldInfos)
    *
    * @param config A configuration object containing properties for creating [fieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html).
    * @param options Options for creating the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    */
  def createFieldInfos(config: FieldInfosConfig): js.Array[FieldInfo] = js.native
  def createFieldInfos(config: FieldInfosConfig, options: CreatePopupTemplateOptions): js.Array[FieldInfo] = js.native
  /**
    * Creates [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html) content used for populating a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#createFieldsContent)
    *
    * @param config A configuration object containing properties for creating [FieldsContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html).
    * @param options Options for creating the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    */
  def createFieldsContent(config: FieldInfosConfig): FieldsContent = js.native
  def createFieldsContent(config: FieldInfosConfig, options: CreatePopupTemplateOptions): FieldsContent = js.native
  /**
    * Creates a popup template given the specified [config](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#Config) information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#createPopupTemplate)
    *
    * @param config A configuration object containing properties for creating a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    * @param options Options for creating the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    */
  def createPopupTemplate(config: Config_): PopupTemplate = js.native
  def createPopupTemplate(config: Config_, options: CreatePopupTemplateOptions): PopupTemplate = js.native
}


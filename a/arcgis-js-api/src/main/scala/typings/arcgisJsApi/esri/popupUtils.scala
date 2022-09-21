package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Various utils for working with [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) widget functionality.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html)
  */
@js.native
trait popupUtils extends StObject {
  
  /**
    * Creates an array of [fieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) used for populating [FieldsContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#createFieldInfos)
    */
  def createFieldInfos(config: FieldInfosConfig): js.Array[FieldInfo] = js.native
  def createFieldInfos(config: FieldInfosConfig, options: CreatePopupTemplateOptions): js.Array[FieldInfo] = js.native
  
  /**
    * Creates [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html) content used for populating a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#createFieldsContent)
    */
  def createFieldsContent(config: FieldInfosConfig): FieldsContent = js.native
  def createFieldsContent(config: FieldInfosConfig, options: CreatePopupTemplateOptions): FieldsContent = js.native
  
  /**
    * Creates a popup template given the specified [config](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#Config) information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#createPopupTemplate)
    */
  def createPopupTemplate(config: Config_): PopupTemplate = js.native
  def createPopupTemplate(config: Config_, options: CreatePopupTemplateOptions): PopupTemplate = js.native
}

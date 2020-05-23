package typings.antDesignReactNative.cameraRollPickerMod

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.CameraRollAssetType
import typings.reactNative.mod.CameraRollGroupType
import typings.reactNative.mod.GetPhotosParamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraRollPickerProps extends GetPhotosParamType {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var containerWidth: js.UndefOr[Double] = js.undefined
  var imageMargin: Double
  var imagesPerRow: Double
  var maximum: Double
  var selectSingleItem: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[js.Array[_]] = js.undefined
  var selectedMarker: js.UndefOr[Element] = js.undefined
}

object CameraRollPickerProps {
  @scala.inline
  def apply(
    first: Double,
    imageMargin: Double,
    imagesPerRow: Double,
    maximum: Double,
    after: String = null,
    assetType: CameraRollAssetType = null,
    backgroundColor: String = null,
    callback: /* repeated */ js.Any => _ = null,
    containerWidth: js.UndefOr[Double] = js.undefined,
    groupName: String = null,
    groupTypes: CameraRollGroupType = null,
    mimeTypes: js.Array[String] = null,
    selectSingleItem: js.UndefOr[Boolean] = js.undefined,
    selected: js.Array[_] = null,
    selectedMarker: Element = null
  ): CameraRollPickerProps = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (assetType != null) __obj.updateDynamic("assetType")(assetType.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(containerWidth)) __obj.updateDynamic("containerWidth")(containerWidth.get.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (groupTypes != null) __obj.updateDynamic("groupTypes")(groupTypes.asInstanceOf[js.Any])
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(selectSingleItem)) __obj.updateDynamic("selectSingleItem")(selectSingleItem.get.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedMarker != null) __obj.updateDynamic("selectedMarker")(selectedMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollPickerProps]
  }
}


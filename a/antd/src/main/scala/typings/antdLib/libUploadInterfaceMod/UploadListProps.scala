package typings
package antdLib.libUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UploadListProps extends js.Object {
  var items: js.UndefOr[js.Array[UploadFile]] = js.undefined
  var listType: js.UndefOr[UploadListType] = js.undefined
  var locale: UploadLocale
  var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile, scala.Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* file */ UploadFile, scala.Unit | scala.Boolean]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var progressAttr: js.UndefOr[js.Object] = js.undefined
  var showPreviewIcon: js.UndefOr[scala.Boolean] = js.undefined
  var showRemoveIcon: js.UndefOr[scala.Boolean] = js.undefined
}


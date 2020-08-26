package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`backward-diagonal`
import typings.arcgisJsApi.arcgisJsApiStrings.`diagonal-cross`
import typings.arcgisJsApi.arcgisJsApiStrings.`forward-diagonal`
import typings.arcgisJsApi.arcgisJsApiStrings.cross
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.solid
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleFillSymbolProperties extends FillSymbolProperties {
  /**
    * The fill style. Possible values are listed in the table below:
    *
    * Value | Description
    * ------|-------------
    * backward-diagonal | ![sfs-backward-diagonal](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-backward-diagonal.png)
    * cross | ![sfs-cross](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-cross.png)
    * diagonal-cross | ![sfs-diagonal-cross](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-diagonal-cross.png)
    * forward-diagonal | ![sfs-forward-diagonal](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-forward-diagonal.png)
    * horizontal | ![sfs-horizontal](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-horizontal.png)
    * none | The polygon has no fill.
    * solid | ![sfs-solid](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-solid.png)
    * vertical | ![sfs-vertical](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sfs-vertical.png)
    *
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#style)
    *
    * @default solid
    */
  var style: js.UndefOr[
    `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none | solid | vertical
  ] = js.native
}

object SimpleFillSymbolProperties {
  @scala.inline
  def apply(): SimpleFillSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleFillSymbolProperties]
  }
  @scala.inline
  implicit class SimpleFillSymbolPropertiesOps[Self <: SimpleFillSymbolProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStyle(
      value: `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none | solid | vertical
    ): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}


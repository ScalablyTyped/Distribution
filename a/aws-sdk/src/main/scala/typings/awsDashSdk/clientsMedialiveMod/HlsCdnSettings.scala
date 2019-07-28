package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsCdnSettings extends js.Object {
  var HlsAkamaiSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.HlsAkamaiSettings] = js.undefined
  var HlsBasicPutSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.HlsBasicPutSettings] = js.undefined
  var HlsMediaStoreSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.HlsMediaStoreSettings] = js.undefined
  var HlsWebdavSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.HlsWebdavSettings] = js.undefined
}

object HlsCdnSettings {
  @scala.inline
  def apply(
    HlsAkamaiSettings: HlsAkamaiSettings = null,
    HlsBasicPutSettings: HlsBasicPutSettings = null,
    HlsMediaStoreSettings: HlsMediaStoreSettings = null,
    HlsWebdavSettings: HlsWebdavSettings = null
  ): HlsCdnSettings = {
    val __obj = js.Dynamic.literal()
    if (HlsAkamaiSettings != null) __obj.updateDynamic("HlsAkamaiSettings")(HlsAkamaiSettings)
    if (HlsBasicPutSettings != null) __obj.updateDynamic("HlsBasicPutSettings")(HlsBasicPutSettings)
    if (HlsMediaStoreSettings != null) __obj.updateDynamic("HlsMediaStoreSettings")(HlsMediaStoreSettings)
    if (HlsWebdavSettings != null) __obj.updateDynamic("HlsWebdavSettings")(HlsWebdavSettings)
    __obj.asInstanceOf[HlsCdnSettings]
  }
}


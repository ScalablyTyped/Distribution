package typings
package appDashBuilderDashLibLib.outTargetsNsisNsisOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NsisWebOptions extends NsisOptions {
  /**
       * The application package download URL. Optional — by default computed using publish configuration.
       *
       * URL like `https://example.com/download/latest` allows web installer to be version independent (installer will download latest application package).
       * Please note — it is [full URL](https://github.com/electron-userland/electron-builder/issues/1810#issuecomment-317650878).
       *
       * Custom `X-Arch` http header is set to `32` or `64`.
       */
  val appPackageUrl: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}


package typings
package awsDashSdkLib.libCredentialsSharedUnderscoreIniUnderscoreFileUnderscoreCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedIniFileCredentialsOptions extends js.Object {
  var disableAssumeRole: js.UndefOr[scala.Boolean] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var httpOptions: js.UndefOr[awsDashSdkLib.libConfigMod.HTTPOptions] = js.undefined
  var profile: js.UndefOr[java.lang.String] = js.undefined
  var tokenCodeFn: js.UndefOr[
    js.Function2[
      /* mfaSerial */ java.lang.String, 
      /* callback */ js.Function2[
        /* err */ js.UndefOr[nodeLib.Error], 
        /* token */ js.UndefOr[java.lang.String], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
}


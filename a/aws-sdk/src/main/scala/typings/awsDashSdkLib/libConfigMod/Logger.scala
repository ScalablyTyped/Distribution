package typings
package awsDashSdkLib.libConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Logger extends js.Object {
  var log: js.UndefOr[js.Function1[/* repeated */js.Any, scala.Unit]] = js.undefined
  var write: js.UndefOr[
    js.Function3[
      /* chunk */ js.Any, 
      /* encoding */ js.UndefOr[java.lang.String], 
      /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
      scala.Unit
    ]
  ] = js.undefined
}


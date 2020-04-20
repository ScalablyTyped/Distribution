package typings.appBuilderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windowsCodeSignMod {
  type CustomWindowsSign = js.Function2[
    /* configuration */ typings.appBuilderLib.windowsCodeSignMod.CustomWindowsSignTaskConfiguration, 
    /* packager */ js.UndefOr[typings.appBuilderLib.winPackagerMod.WinPackager], 
    js.Promise[js.Any]
  ]
}

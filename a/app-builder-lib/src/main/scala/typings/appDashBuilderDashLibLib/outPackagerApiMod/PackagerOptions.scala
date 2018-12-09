package typings
package appDashBuilderDashLibLib.outPackagerApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PackagerOptions extends js.Object {
  val config: js.UndefOr[
    appDashBuilderDashLibLib.outConfigurationMod.Configuration | java.lang.String | scala.Null
  ] = js.undefined
  val effectiveOptionComputed: js.UndefOr[js.Function1[/* options */ js.Any, js.Promise[scala.Boolean]]] = js.undefined
  var linux: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var mac: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var platformPackagerFactory: js.UndefOr[
    (js.Function2[
      /* info */ appDashBuilderDashLibLib.outPackagerMod.Packager, 
      /* platform */ appDashBuilderDashLibLib.outCoreMod.Platform, 
      appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_]
    ]) | scala.Null
  ] = js.undefined
  val prepackaged: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var projectDir: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var targets: js.UndefOr[
    stdLib.Map[
      appDashBuilderDashLibLib.outCoreMod.Platform, 
      stdLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
    ]
  ] = js.undefined
  var win: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}


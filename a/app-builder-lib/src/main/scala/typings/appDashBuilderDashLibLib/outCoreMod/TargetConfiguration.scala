package typings
package appDashBuilderDashLibLib.outCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TargetConfiguration extends js.Object {
  /**
       * The arch or list of archs.
       */
  val arch: js.UndefOr[
    js.Array[builderDashUtilLib.outArchMod.ArchType] | builderDashUtilLib.outArchMod.ArchType
  ] = js.undefined
  /**
       * The target name. e.g. `snap`.
       */
  val target: java.lang.String
}


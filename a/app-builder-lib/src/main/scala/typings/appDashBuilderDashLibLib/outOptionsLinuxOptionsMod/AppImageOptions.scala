package typings
package appDashBuilderDashLibLib.outOptionsLinuxOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped any */ 
trait AppImageOptions extends CommonLinuxOptions {
  /**
       * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). Only plain text is supported.
       */
  val license: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The system integration installation.
       * @default ask
       */
  val systemIntegration: js.UndefOr[
    appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.ask | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.doNotAsk
  ] = js.undefined
}


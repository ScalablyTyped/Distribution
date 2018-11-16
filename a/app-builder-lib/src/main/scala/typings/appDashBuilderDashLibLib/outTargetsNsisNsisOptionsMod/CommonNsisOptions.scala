package typings
package appDashBuilderDashLibLib.outTargetsNsisNsisOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommonNsisOptions extends js.Object {
  /**
       * See [GUID vs Application Name](../configuration/nsis#guid-vs-application-name).
       */
  val guid: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * Whether to create [Unicode installer](http://nsis.sourceforge.net/Docs/Chapter1.html#intro-unicode).
       * @default true
       */
  val unicode: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * @private
       * @default false
       */
  val useZip: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If `warningsAsErrors` is `true` (default): NSIS will treat warnings as errors. If `warningsAsErrors` is `false`: NSIS will allow warnings.
       * @default true
       */
  val warningsAsErrors: js.UndefOr[scala.Boolean] = js.undefined
}


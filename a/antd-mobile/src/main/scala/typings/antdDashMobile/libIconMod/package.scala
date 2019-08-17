package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIconMod {
  import typings.antdDashMobile.antdDashMobileStrings.`type`
  import typings.antdDashMobile.antdDashMobileStrings.size
  import typings.antdDashMobile.libUnderscoreUtilTypesMod.Omit
  import typings.react.reactMod.HTMLProps
  import typings.std.SVGSVGElement

  type SvgProps = Omit[HTMLProps[SVGSVGElement], size | `type`]
}

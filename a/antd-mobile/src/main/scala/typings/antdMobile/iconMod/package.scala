package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iconMod {
  type SvgProps = typings.antdMobile.typesMod.Omit[
    typings.react.mod.HTMLProps[typings.std.SVGSVGElement], 
    typings.antdMobile.antdMobileStrings.size | typings.antdMobile.antdMobileStrings.`type`
  ]
}

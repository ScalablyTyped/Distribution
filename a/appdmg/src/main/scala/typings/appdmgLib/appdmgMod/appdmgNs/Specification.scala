package typings
package appdmgLib.appdmgMod.appdmgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Specification extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var `background-color`: js.UndefOr[java.lang.String] = js.undefined
  var `code-sign`: js.UndefOr[SpecificationCodeSign] = js.undefined
  var contents: js.Array[SpecificationContents]
  var format: appdmgLib.appdmgLibStrings.UDRW | appdmgLib.appdmgLibStrings.UDRO | appdmgLib.appdmgLibStrings.UDCO | appdmgLib.appdmgLibStrings.UDZO | appdmgLib.appdmgLibStrings.UDBZ | appdmgLib.appdmgLibStrings.ULFO
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var `icon-size`: js.UndefOr[scala.Double] = js.undefined
  var title: java.lang.String
  var window: js.UndefOr[SpecificationWindow] = js.undefined
}


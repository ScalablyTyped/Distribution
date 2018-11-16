package typings
package atAtlaskitButtonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buttonMod {
  type Button = reactLib.reactMod.Component[ButtonProps, ButtonState, js.Any]
  type ButtonAppearances = atAtlaskitButtonLib.atAtlaskitButtonLibStrings.default | atAtlaskitButtonLib.atAtlaskitButtonLibStrings.danger | atAtlaskitButtonLib.atAtlaskitButtonLibStrings.link | atAtlaskitButtonLib.atAtlaskitButtonLibStrings.primary | atAtlaskitButtonLib.atAtlaskitButtonLibStrings.subtle | atAtlaskitButtonLib.atAtlaskitButtonLibStrings.`subtle-link` | atAtlaskitButtonLib.atAtlaskitButtonLibStrings.warning | atAtlaskitButtonLib.atAtlaskitButtonLibStrings.help
  type ButtonSpacing = atAtlaskitButtonLib.atAtlaskitButtonLibStrings.compact | atAtlaskitButtonLib.atAtlaskitButtonLibStrings.default | atAtlaskitButtonLib.atAtlaskitButtonLibStrings.none
  type ButtonType = atAtlaskitButtonLib.atAtlaskitButtonLibStrings.button | atAtlaskitButtonLib.atAtlaskitButtonLibStrings.submit
}

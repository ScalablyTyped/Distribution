package typings
package antdLib.libFormInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MEMO_STATICS extends js.Object {
  @JSName("$$typeof")
  var $$typeof: antdLib.antdLibNumbers.`true`
  var compare: antdLib.antdLibNumbers.`true`
  var defaultProps: antdLib.antdLibNumbers.`true`
  var displayName: antdLib.antdLibNumbers.`true`
  var propTypes: antdLib.antdLibNumbers.`true`
  var `type`: antdLib.antdLibNumbers.`true`
}

object MEMO_STATICS {
  @scala.inline
  def apply(
    $$typeof: antdLib.antdLibNumbers.`true`,
    compare: antdLib.antdLibNumbers.`true`,
    defaultProps: antdLib.antdLibNumbers.`true`,
    displayName: antdLib.antdLibNumbers.`true`,
    propTypes: antdLib.antdLibNumbers.`true`,
    `type`: antdLib.antdLibNumbers.`true`
  ): MEMO_STATICS = {
    val __obj = js.Dynamic.literal($$typeof = $$typeof, compare = compare, defaultProps = defaultProps, displayName = displayName, propTypes = propTypes)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MEMO_STATICS]
  }
}


package typings
package atAngularCoreLib.srcRender3InterfacesI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TI18n extends js.Object {
  /**
    * A set of OpCodes which will create the Text Nodes and ICU anchors for the translation blocks.
    *
    * NOTE: The ICU anchors are filled in with ICU Update OpCode.
    */
  var create: I18nMutateOpCodes
  /**
    * Index in EXPANDO where the i18n stores its DOM nodes.
    *
    * When the bindings are processed by the `i18nEnd` instruction it is necessary to know where the
    * newly created DOM nodes will be inserted.
    */
  var expandoStartIndex: scala.Double
  /**
    * A list of ICUs in a translation block (or `null` if block has no ICUs).
    *
    * Example:
    * Given: `<div i18n>You have {count, plural, ...} and {state, switch, ...}</div>`
    * There would be 2 ICUs in this array.
    *   1. `{count, plural, ...}`
    *   2. `{state, switch, ...}`
    */
  var icus: js.Array[TIcu] | scala.Null
  /**
    * A set of OpCodes which will be executed on each change detection to determine if any changes to
    * DOM are required.
    */
  var update: I18nUpdateOpCodes
  /**
    * Number of slots to allocate in expando.
    *
    * This is the max number of DOM elements which will be created by this i18n + ICU blocks. When
    * the DOM elements are being created they are stored in the EXPANDO, so that update OpCodes can
    * write into them.
    */
  var vars: scala.Double
}

object TI18n {
  @scala.inline
  def apply(
    create: I18nMutateOpCodes,
    expandoStartIndex: scala.Double,
    update: I18nUpdateOpCodes,
    vars: scala.Double,
    icus: js.Array[TIcu] = null
  ): TI18n = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("expandoStartIndex")(expandoStartIndex)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("vars")(vars)
    if (icus != null) __obj.updateDynamic("icus")(icus)
    __obj.asInstanceOf[TI18n]
  }
}


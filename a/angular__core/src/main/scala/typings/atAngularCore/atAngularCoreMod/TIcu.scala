package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TIcu extends js.Object {
  /**
    * A list of case values which the current ICU will try to match.
    *
    * The last value is `other`
    */
  var cases: js.Array[_]
  /**
    * An optional array of child/sub ICUs.
    *
    * In case of nested ICUs such as:
    * ```
    * {�0�, plural,
    *   =0 {zero}
    *   other {�0� {�1�, select,
    *                     cat {cats}
    *                     dog {dogs}
    *                     other {animals}
    *                   }!
    *   }
    * }
    * ```
    * When the parent ICU is changing it must clean up child ICUs as well. For this reason it needs
    * to know which child ICUs to run clean up for as well.
    *
    * In the above example this would be:
    * ```ts
    * [
    *   [],   // `=0` has no sub ICUs
    *   [1],  // `other` has one subICU at `1`st index.
    * ]
    * ```
    *
    * The reason why it is Array of Arrays is because first array represents the case, and second
    * represents the child ICUs to clean up. There may be more than one child ICUs per case.
    */
  var childIcus: js.Array[js.Array[Double]]
  /**
    * A set of OpCodes to apply in order to build up the DOM render tree for the ICU
    */
  var create: js.Array[I18nMutateOpCodes]
  /**
    * A set of OpCodes to apply in order to destroy the DOM render tree for the ICU.
    */
  var remove: js.Array[I18nMutateOpCodes]
  /**
    * Defines the ICU type of `select` or `plural`
    */
  var `type`: IcuType
  /**
    * A set of OpCodes to apply in order to update the DOM render tree for the ICU bindings.
    */
  var update: js.Array[I18nUpdateOpCodes]
  /**
    * Number of slots to allocate in expando for each case.
    *
    * This is the max number of DOM elements which will be created by this i18n + ICU blocks. When
    * the DOM elements are being created they are stored in the EXPANDO, so that update OpCodes can
    * write into them.
    */
  var vars: js.Array[Double]
}

object TIcu {
  @scala.inline
  def apply(
    cases: js.Array[_],
    childIcus: js.Array[js.Array[Double]],
    create: js.Array[I18nMutateOpCodes],
    remove: js.Array[I18nMutateOpCodes],
    `type`: IcuType,
    update: js.Array[I18nUpdateOpCodes],
    vars: js.Array[Double]
  ): TIcu = {
    val __obj = js.Dynamic.literal(cases = cases, childIcus = childIcus, create = create, remove = remove, update = update, vars = vars)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TIcu]
  }
}


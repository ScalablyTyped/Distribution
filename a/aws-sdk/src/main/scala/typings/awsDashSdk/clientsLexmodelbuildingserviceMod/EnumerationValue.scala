package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumerationValue extends js.Object {
  /**
    * Additional values related to the slot type value.
    */
  var synonyms: js.UndefOr[SynonymList] = js.undefined
  /**
    * The value of the slot type.
    */
  var value: Value
}

object EnumerationValue {
  @scala.inline
  def apply(value: Value, synonyms: SynonymList = null): EnumerationValue = {
    val __obj = js.Dynamic.literal(value = value)
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms)
    __obj.asInstanceOf[EnumerationValue]
  }
}


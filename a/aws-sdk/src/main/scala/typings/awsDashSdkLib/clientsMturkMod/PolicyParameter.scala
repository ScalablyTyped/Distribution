package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyParameter extends js.Object {
  /**
    *  Name of the parameter from the list of Review Polices. 
    */
  var Key: js.UndefOr[String] = js.undefined
  /**
    *  List of ParameterMapEntry objects. 
    */
  var MapEntries: js.UndefOr[ParameterMapEntryList] = js.undefined
  /**
    *  The list of values of the Parameter
    */
  var Values: js.UndefOr[StringList] = js.undefined
}

object PolicyParameter {
  @scala.inline
  def apply(Key: String = null, MapEntries: ParameterMapEntryList = null, Values: StringList = null): PolicyParameter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (MapEntries != null) __obj.updateDynamic("MapEntries")(MapEntries)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[PolicyParameter]
  }
}


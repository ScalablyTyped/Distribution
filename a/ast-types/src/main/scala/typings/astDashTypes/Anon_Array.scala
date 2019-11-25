package typings.astDashTypes

import org.scalablytyped.runtime.StringDictionary
import typings.astDashTypes.libTypesMod.Type
import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var Date: Type[typings.std.Date]
  var RegExp: Type[typings.std.RegExp]
  var array: Type[js.Array[_]]
  var boolean: Type[Boolean]
  var function: Type[js.Function]
  var `null`: Type[Null]
  var number: Type[Double]
  var `object`: Type[StringDictionary[_]]
  var string: Type[String]
  var undefined: Type[js.UndefOr[scala.Nothing]]
}

object Anon_Array {
  @scala.inline
  def apply(
    Date: Type[Date],
    RegExp: Type[RegExp],
    array: Type[js.Array[_]],
    boolean: Type[Boolean],
    function: Type[js.Function],
    `null`: Type[Null],
    number: Type[Double],
    `object`: Type[StringDictionary[_]],
    string: Type[String],
    undefined: Type[js.UndefOr[scala.Nothing]]
  ): Anon_Array = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], RegExp = RegExp.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Array]
  }
}


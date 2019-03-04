package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayBoolean extends js.Object {
  var Date: astDashTypesLib.libTypesMod.Type[stdLib.Date]
  var RegExp: astDashTypesLib.libTypesMod.Type[stdLib.RegExp]
  var array: astDashTypesLib.libTypesMod.Type[js.Array[_]]
  var boolean: astDashTypesLib.libTypesMod.Type[scala.Boolean]
  var function: astDashTypesLib.libTypesMod.Type[js.Function]
  var `null`: astDashTypesLib.libTypesMod.Type[scala.Null]
  var number: astDashTypesLib.libTypesMod.Type[scala.Double]
  var `object`: astDashTypesLib.libTypesMod.Type[org.scalablytyped.runtime.StringDictionary[_]]
  var string: astDashTypesLib.libTypesMod.Type[java.lang.String]
  var undefined: astDashTypesLib.libTypesMod.Type[js.UndefOr[scala.Nothing]]
}

object Anon_ArrayBoolean {
  @scala.inline
  def apply(
    Date: astDashTypesLib.libTypesMod.Type[stdLib.Date],
    RegExp: astDashTypesLib.libTypesMod.Type[stdLib.RegExp],
    array: astDashTypesLib.libTypesMod.Type[js.Array[_]],
    boolean: astDashTypesLib.libTypesMod.Type[scala.Boolean],
    function: astDashTypesLib.libTypesMod.Type[js.Function],
    `null`: astDashTypesLib.libTypesMod.Type[scala.Null],
    number: astDashTypesLib.libTypesMod.Type[scala.Double],
    `object`: astDashTypesLib.libTypesMod.Type[org.scalablytyped.runtime.StringDictionary[_]],
    string: astDashTypesLib.libTypesMod.Type[java.lang.String],
    undefined: astDashTypesLib.libTypesMod.Type[js.UndefOr[scala.Nothing]]
  ): Anon_ArrayBoolean = {
    val __obj = js.Dynamic.literal(Date = Date, RegExp = RegExp, array = array, boolean = boolean, function = function, number = number, string = string, undefined = undefined)
    __obj.updateDynamic("null")(`null`)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[Anon_ArrayBoolean]
  }
}


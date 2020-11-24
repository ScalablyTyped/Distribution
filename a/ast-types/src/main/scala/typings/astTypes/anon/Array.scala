package typings.astTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.astTypes.typesMod.Type
import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array extends js.Object {
  
  var Date: Type[typings.std.Date] = js.native
  
  var RegExp: Type[typings.std.RegExp] = js.native
  
  var array: Type[js.Array[_]] = js.native
  
  var boolean: Type[Boolean] = js.native
  
  var function: Type[js.Function] = js.native
  
  var `null`: Type[Null] = js.native
  
  var number: Type[Double] = js.native
  
  var `object`: Type[StringDictionary[_]] = js.native
  
  var string: Type[String] = js.native
  
  var undefined: Type[js.UndefOr[scala.Nothing]] = js.native
}
object Array {
  
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
  ): Array = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], RegExp = RegExp.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  
  @scala.inline
  implicit class ArrayOps[Self <: Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: Type[Date]): Self = this.set("Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExp(value: Type[RegExp]): Self = this.set("RegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArray(value: Type[js.Array[_]]): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolean(value: Type[Boolean]): Self = this.set("boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(value: Type[js.Function]): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNull(value: Type[Null]): Self = this.set("null", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Type[Double]): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Type[StringDictionary[_]]): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: Type[String]): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefined(value: Type[js.UndefOr[scala.Nothing]]): Self = this.set("undefined", value.asInstanceOf[js.Any])
  }
}

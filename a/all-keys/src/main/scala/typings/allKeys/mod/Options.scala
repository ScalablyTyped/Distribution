package typings.allKeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Include `Object.prototype` properties like `isPrototypeOf`.
  		@default true
  		*/
  val includeObjectPrototype: js.UndefOr[Boolean] = js.native
  /**
  		Include [`Symbol`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Symbol) keys.
  		@default true
  		*/
  val includeSymbols: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setIncludeObjectPrototype(value: Boolean): Self = this.set("includeObjectPrototype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeObjectPrototype: Self = this.set("includeObjectPrototype", js.undefined)
    @scala.inline
    def setIncludeSymbols(value: Boolean): Self = this.set("includeSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSymbols: Self = this.set("includeSymbols", js.undefined)
  }
  
}


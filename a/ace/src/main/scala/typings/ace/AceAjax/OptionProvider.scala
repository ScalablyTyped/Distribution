package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionProvider extends js.Object {
  
  /**
    * Get a Configuration Option
    **/
  def getOption(name: String): js.Any = js.native
  
  /**
    * Get Configuration Options
    **/
  def getOptions(): js.Any = js.native
  
  /**
    * Sets a Configuration Option
    **/
  def setOption(optionName: String, optionValue: js.Any): Unit = js.native
  
  /**
    * Sets Configuration Options
    **/
  def setOptions(keyValueTuples: js.Any): Unit = js.native
}
object OptionProvider {
  
  @scala.inline
  def apply(
    getOption: String => js.Any,
    getOptions: () => js.Any,
    setOption: (String, js.Any) => Unit,
    setOptions: js.Any => Unit
  ): OptionProvider = {
    val __obj = js.Dynamic.literal(getOption = js.Any.fromFunction1(getOption), getOptions = js.Any.fromFunction0(getOptions), setOption = js.Any.fromFunction2(setOption), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[OptionProvider]
  }
  
  @scala.inline
  implicit class OptionProviderOps[Self <: OptionProvider] (val x: Self) extends AnyVal {
    
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
    def setGetOption(value: String => js.Any): Self = this.set("getOption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOptions(value: () => js.Any): Self = this.set("getOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetOption(value: (String, js.Any) => Unit): Self = this.set("setOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetOptions(value: js.Any => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
  }
}

package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionProvider extends js.Object {
  /**
    * Get a Configuration Option
    **/
  def getOption(name: String): js.Any
  /**
    * Get Configuration Options
    **/
  def getOptions(): js.Any
  /**
    * Sets a Configuration Option
    **/
  def setOption(optionName: String, optionValue: js.Any): Unit
  /**
    * Sets Configuration Options
    **/
  def setOptions(keyValueTuples: js.Any): Unit
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
}


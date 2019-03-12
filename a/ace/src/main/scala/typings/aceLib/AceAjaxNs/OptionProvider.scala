package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionProvider extends js.Object {
  /**
    * Get a Configuration Option
    **/
  def getOption(name: java.lang.String): js.Any
  /**
    * Get Configuration Options
    **/
  def getOptions(): js.Any
  /**
    * Sets a Configuration Option
    **/
  def setOption(optionName: java.lang.String, optionValue: js.Any): scala.Unit
  /**
    * Sets Configuration Options
    **/
  def setOptions(keyValueTuples: js.Any): scala.Unit
}

object OptionProvider {
  @scala.inline
  def apply(
    getOption: java.lang.String => js.Any,
    getOptions: () => js.Any,
    setOption: (java.lang.String, js.Any) => scala.Unit,
    setOptions: js.Any => scala.Unit
  ): OptionProvider = {
    val __obj = js.Dynamic.literal(getOption = js.Any.fromFunction1(getOption), getOptions = js.Any.fromFunction0(getOptions), setOption = js.Any.fromFunction2(setOption), setOptions = js.Any.fromFunction1(setOptions))
  
    __obj.asInstanceOf[OptionProvider]
  }
}


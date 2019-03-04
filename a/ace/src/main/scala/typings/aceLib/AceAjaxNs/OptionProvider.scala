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
    getOption: js.Function1[java.lang.String, js.Any],
    getOptions: js.Function0[js.Any],
    setOption: js.Function2[java.lang.String, js.Any, scala.Unit],
    setOptions: js.Function1[js.Any, scala.Unit]
  ): OptionProvider = {
    val __obj = js.Dynamic.literal(getOption = getOption, getOptions = getOptions, setOption = setOption, setOptions = setOptions)
  
    __obj.asInstanceOf[OptionProvider]
  }
}


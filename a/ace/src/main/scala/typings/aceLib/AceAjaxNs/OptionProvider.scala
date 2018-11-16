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


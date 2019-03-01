package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenIterator extends js.Object {
  /**
    * Returns the current tokenized string.
    **/
  def getCurrentToken(): TokenInfo
  /**
    * Returns the current column.
    **/
  def getCurrentTokenColumn(): scala.Double
  /**
    * Returns the current row.
    **/
  def getCurrentTokenRow(): scala.Double
  /**
    * Tokenizes all the items from the current point to the row prior in the document.
    **/
  def stepBackward(): js.Array[java.lang.String]
  /**
    * Tokenizes all the items from the current point until the next row in the document. If the current point is at the end of the file, this function returns `null`. Otherwise, it returns the tokenized string.
    **/
  def stepForward(): java.lang.String
}

object TokenIterator {
  @scala.inline
  def apply(
    getCurrentToken: js.Function0[TokenInfo],
    getCurrentTokenColumn: js.Function0[scala.Double],
    getCurrentTokenRow: js.Function0[scala.Double],
    stepBackward: js.Function0[js.Array[java.lang.String]],
    stepForward: js.Function0[java.lang.String]
  ): TokenIterator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrentToken")(getCurrentToken)
    __obj.updateDynamic("getCurrentTokenColumn")(getCurrentTokenColumn)
    __obj.updateDynamic("getCurrentTokenRow")(getCurrentTokenRow)
    __obj.updateDynamic("stepBackward")(stepBackward)
    __obj.updateDynamic("stepForward")(stepForward)
    __obj.asInstanceOf[TokenIterator]
  }
}


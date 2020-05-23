package typings.algoliaClientSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  /**
    * The length.
    */
  var length: Double
  /**
    * The offset.
    */
  var offset: Double
  /**
    * The alternative type.
    */
  var types: js.Array[String]
  /**
    * The number of typos.
    */
  var typos: Double
  /**
    * The list of alternative words.
    */
  var words: js.Array[String]
}

object Length {
  @scala.inline
  def apply(length: Double, offset: Double, types: js.Array[String], typos: Double, words: js.Array[String]): Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], typos = typos.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}


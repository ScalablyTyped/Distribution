package typings.algoliaClientSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  /**
    * The length.
    */
  val length: Double
  /**
    * The offset.
    */
  val offset: Double
  /**
    * The alternative type.
    */
  val types: js.Array[String]
  /**
    * The number of typos.
    */
  val typos: Double
  /**
    * The list of alternative words.
    */
  val words: js.Array[String]
}

object AnonLength {
  @scala.inline
  def apply(length: Double, offset: Double, types: js.Array[String], typos: Double, words: js.Array[String]): AnonLength = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], typos = typos.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLength]
  }
}


package typings
package adoneLib.adoneNs.fakeNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Post extends js.Object {
  var paragraph: java.lang.String
  var sentence: java.lang.String
  var sentences: java.lang.String
  var words: java.lang.String
}

object Post {
  @scala.inline
  def apply(
    paragraph: java.lang.String,
    sentence: java.lang.String,
    sentences: java.lang.String,
    words: java.lang.String
  ): Post = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("paragraph")(paragraph)
    __obj.updateDynamic("sentence")(sentence)
    __obj.updateDynamic("sentences")(sentences)
    __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[Post]
  }
}


package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhacker extends js.Object {
  def abbreviation(): String
  def adjective(): String
  def ingverb(): String
  def noun(): String
  def phrase(): String
  def verb(): String
}

object Typeofhacker {
  @scala.inline
  def apply(
    abbreviation: () => String,
    adjective: () => String,
    ingverb: () => String,
    noun: () => String,
    phrase: () => String,
    verb: () => String
  ): Typeofhacker = {
    val __obj = js.Dynamic.literal(abbreviation = js.Any.fromFunction0(abbreviation), adjective = js.Any.fromFunction0(adjective), ingverb = js.Any.fromFunction0(ingverb), noun = js.Any.fromFunction0(noun), phrase = js.Any.fromFunction0(phrase), verb = js.Any.fromFunction0(verb))
  
    __obj.asInstanceOf[Typeofhacker]
  }
}


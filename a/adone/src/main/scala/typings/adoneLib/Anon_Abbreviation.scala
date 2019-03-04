package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abbreviation extends js.Object {
  def abbreviation(): java.lang.String
  def adjective(): java.lang.String
  def ingverb(): java.lang.String
  def noun(): java.lang.String
  def phrase(): java.lang.String
  def verb(): java.lang.String
}

object Anon_Abbreviation {
  @scala.inline
  def apply(
    abbreviation: js.Function0[java.lang.String],
    adjective: js.Function0[java.lang.String],
    ingverb: js.Function0[java.lang.String],
    noun: js.Function0[java.lang.String],
    phrase: js.Function0[java.lang.String],
    verb: js.Function0[java.lang.String]
  ): Anon_Abbreviation = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation, adjective = adjective, ingverb = ingverb, noun = noun, phrase = phrase, verb = verb)
  
    __obj.asInstanceOf[Anon_Abbreviation]
  }
}


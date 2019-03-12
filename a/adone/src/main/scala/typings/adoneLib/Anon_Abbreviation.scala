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
    abbreviation: () => java.lang.String,
    adjective: () => java.lang.String,
    ingverb: () => java.lang.String,
    noun: () => java.lang.String,
    phrase: () => java.lang.String,
    verb: () => java.lang.String
  ): Anon_Abbreviation = {
    val __obj = js.Dynamic.literal(abbreviation = js.Any.fromFunction0(abbreviation), adjective = js.Any.fromFunction0(adjective), ingverb = js.Any.fromFunction0(ingverb), noun = js.Any.fromFunction0(noun), phrase = js.Any.fromFunction0(phrase), verb = js.Any.fromFunction0(verb))
  
    __obj.asInstanceOf[Anon_Abbreviation]
  }
}


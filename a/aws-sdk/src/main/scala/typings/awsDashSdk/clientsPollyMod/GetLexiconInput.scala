package typings.awsDashSdk.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLexiconInput extends js.Object {
  /**
    * Name of the lexicon.
    */
  var Name: LexiconName
}

object GetLexiconInput {
  @scala.inline
  def apply(Name: LexiconName): GetLexiconInput = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[GetLexiconInput]
  }
}


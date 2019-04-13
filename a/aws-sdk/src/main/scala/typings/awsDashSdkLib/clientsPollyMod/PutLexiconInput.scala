package typings
package awsDashSdkLib.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutLexiconInput extends js.Object {
  /**
    * Content of the PLS lexicon as string data.
    */
  var Content: LexiconContent
  /**
    * Name of the lexicon. The name must follow the regular express format [0-9A-Za-z]{1,20}. That is, the name is a case-sensitive alphanumeric string up to 20 characters long. 
    */
  var Name: LexiconName
}

object PutLexiconInput {
  @scala.inline
  def apply(Content: LexiconContent, Name: LexiconName): PutLexiconInput = {
    val __obj = js.Dynamic.literal(Content = Content, Name = Name)
  
    __obj.asInstanceOf[PutLexiconInput]
  }
}


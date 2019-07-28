package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionDocument extends js.Object {
  /**
    * The language used to define the entity. GRAPHQL is the only valid value.
    */
  var language: DefinitionLanguage
  /**
    * The GraphQL text that defines the entity.
    */
  var text: DefinitionText
}

object DefinitionDocument {
  @scala.inline
  def apply(language: DefinitionLanguage, text: DefinitionText): DefinitionDocument = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], text = text)
  
    __obj.asInstanceOf[DefinitionDocument]
  }
}


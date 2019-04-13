package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggester extends js.Object {
  var DocumentSuggesterOptions: awsDashSdkLib.clientsCloudsearchMod.DocumentSuggesterOptions
  var SuggesterName: StandardName
}

object Suggester {
  @scala.inline
  def apply(DocumentSuggesterOptions: DocumentSuggesterOptions, SuggesterName: StandardName): Suggester = {
    val __obj = js.Dynamic.literal(DocumentSuggesterOptions = DocumentSuggesterOptions, SuggesterName = SuggesterName)
  
    __obj.asInstanceOf[Suggester]
  }
}


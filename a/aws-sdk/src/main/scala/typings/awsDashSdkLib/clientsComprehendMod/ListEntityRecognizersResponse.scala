package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEntityRecognizersResponse extends js.Object {
  /**
    * The list of properties of an entity recognizer.
    */
  var EntityRecognizerPropertiesList: js.UndefOr[EntityRecognizerPropertiesList] = js.undefined
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListEntityRecognizersResponse {
  @scala.inline
  def apply(EntityRecognizerPropertiesList: EntityRecognizerPropertiesList = null, NextToken: String = null): ListEntityRecognizersResponse = {
    val __obj = js.Dynamic.literal()
    if (EntityRecognizerPropertiesList != null) __obj.updateDynamic("EntityRecognizerPropertiesList")(EntityRecognizerPropertiesList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListEntityRecognizersResponse]
  }
}


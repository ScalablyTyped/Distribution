package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClassifiersResponse extends js.Object {
  /**
    * The requested list of classifier objects.
    */
  var Classifiers: js.UndefOr[ClassifierList] = js.undefined
  /**
    * A continuation token.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object GetClassifiersResponse {
  @scala.inline
  def apply(Classifiers: ClassifierList = null, NextToken: Token = null): GetClassifiersResponse = {
    val __obj = js.Dynamic.literal()
    if (Classifiers != null) __obj.updateDynamic("Classifiers")(Classifiers)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetClassifiersResponse]
  }
}


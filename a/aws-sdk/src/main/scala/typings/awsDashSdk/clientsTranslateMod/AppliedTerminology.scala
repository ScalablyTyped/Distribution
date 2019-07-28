package typings.awsDashSdk.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppliedTerminology extends js.Object {
  /**
    * The name of the custom terminology applied to the input text by Amazon Translate for the translated text response.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The specific terms of the custom terminology applied to the input text by Amazon Translate for the translated text response. A maximum of 250 terms will be returned, and the specific terms applied will be the first 250 terms in the source text. 
    */
  var Terms: js.UndefOr[TermList] = js.undefined
}

object AppliedTerminology {
  @scala.inline
  def apply(Name: ResourceName = null, Terms: TermList = null): AppliedTerminology = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Terms != null) __obj.updateDynamic("Terms")(Terms)
    __obj.asInstanceOf[AppliedTerminology]
  }
}


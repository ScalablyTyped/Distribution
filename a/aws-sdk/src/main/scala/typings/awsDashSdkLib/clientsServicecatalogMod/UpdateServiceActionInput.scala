package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServiceActionInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * A map that defines the self-service action.
    */
  var Definition: js.UndefOr[ServiceActionDefinitionMap] = js.undefined
  /**
    * The self-service action description.
    */
  var Description: js.UndefOr[ServiceActionDescription] = js.undefined
  /**
    * The self-service action identifier.
    */
  var Id: awsDashSdkLib.clientsServicecatalogMod.Id
  /**
    * The self-service action name.
    */
  var Name: js.UndefOr[ServiceActionName] = js.undefined
}

object UpdateServiceActionInput {
  @scala.inline
  def apply(
    Id: Id,
    AcceptLanguage: AcceptLanguage = null,
    Definition: ServiceActionDefinitionMap = null,
    Description: ServiceActionDescription = null,
    Name: ServiceActionName = null
  ): UpdateServiceActionInput = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (Definition != null) __obj.updateDynamic("Definition")(Definition)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateServiceActionInput]
  }
}


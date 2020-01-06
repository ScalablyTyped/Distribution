package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexPatternSet extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: js.UndefOr[ResourceArn] = js.native
  /**
    * A friendly description of the set. You cannot change the description of a set after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: js.UndefOr[EntityId] = js.native
  /**
    * A friendly name of the set. You cannot change the name after you create the set.
    */
  var Name: js.UndefOr[EntityName] = js.native
  /**
    * The regular expression patterns in the set.
    */
  var RegularExpressionList: js.UndefOr[typings.awsDashSdk.clientsWafv2Mod.RegularExpressionList] = js.native
}

object RegexPatternSet {
  @scala.inline
  def apply(
    ARN: ResourceArn = null,
    Description: EntityDescription = null,
    Id: EntityId = null,
    Name: EntityName = null,
    RegularExpressionList: RegularExpressionList = null
  ): RegexPatternSet = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RegularExpressionList != null) __obj.updateDynamic("RegularExpressionList")(RegularExpressionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexPatternSet]
  }
}


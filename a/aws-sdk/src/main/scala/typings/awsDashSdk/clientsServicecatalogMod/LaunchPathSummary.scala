package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchPathSummary extends js.Object {
  /**
    * The constraints on the portfolio-product relationship.
    */
  var ConstraintSummaries: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ConstraintSummaries] = js.undefined
  /**
    * The identifier of the product path.
    */
  var Id: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Id] = js.undefined
  /**
    * The name of the portfolio to which the user was assigned.
    */
  var Name: js.UndefOr[PortfolioName] = js.undefined
  /**
    * The tags associated with this product path.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Tags] = js.undefined
}

object LaunchPathSummary {
  @scala.inline
  def apply(
    ConstraintSummaries: ConstraintSummaries = null,
    Id: Id = null,
    Name: PortfolioName = null,
    Tags: Tags = null
  ): LaunchPathSummary = {
    val __obj = js.Dynamic.literal()
    if (ConstraintSummaries != null) __obj.updateDynamic("ConstraintSummaries")(ConstraintSummaries)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[LaunchPathSummary]
  }
}


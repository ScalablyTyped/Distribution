package typings.awsSdk.anon

import typings.awsSdk.appstreamMod.String
import typings.awsSdk.appstreamMod.StringList
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/appstream.DescribeFleetsRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeFleetsRequestwait extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The names of the fleets to describe.
    */
  var Names: js.UndefOr[StringList] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeFleetsRequestwait {
  @scala.inline
  def apply($waiter: WaiterConfiguration = null, Names: StringList = null, NextToken: String = null): DescribeFleetsRequestwait = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetsRequestwait]
  }
}


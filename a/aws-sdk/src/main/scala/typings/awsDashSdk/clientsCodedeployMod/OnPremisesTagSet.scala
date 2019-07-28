package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPremisesTagSet extends js.Object {
  /**
    * A list that contains other lists of on-premises instance tag groups. For an instance to be included in the deployment group, it must be identified by all of the tag groups in the list.
    */
  var onPremisesTagSetList: js.UndefOr[OnPremisesTagSetList] = js.undefined
}

object OnPremisesTagSet {
  @scala.inline
  def apply(onPremisesTagSetList: OnPremisesTagSetList = null): OnPremisesTagSet = {
    val __obj = js.Dynamic.literal()
    if (onPremisesTagSetList != null) __obj.updateDynamic("onPremisesTagSetList")(onPremisesTagSetList)
    __obj.asInstanceOf[OnPremisesTagSet]
  }
}


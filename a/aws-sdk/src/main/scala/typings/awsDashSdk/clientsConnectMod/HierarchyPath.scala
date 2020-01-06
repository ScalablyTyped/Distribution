package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchyPath extends js.Object {
  /**
    * Information about level five.
    */
  var LevelFive: js.UndefOr[HierarchyGroupSummary] = js.native
  /**
    * Information about level four.
    */
  var LevelFour: js.UndefOr[HierarchyGroupSummary] = js.native
  /**
    * Information about level one.
    */
  var LevelOne: js.UndefOr[HierarchyGroupSummary] = js.native
  /**
    * Information about level three.
    */
  var LevelThree: js.UndefOr[HierarchyGroupSummary] = js.native
  /**
    * Information about level two.
    */
  var LevelTwo: js.UndefOr[HierarchyGroupSummary] = js.native
}

object HierarchyPath {
  @scala.inline
  def apply(
    LevelFive: HierarchyGroupSummary = null,
    LevelFour: HierarchyGroupSummary = null,
    LevelOne: HierarchyGroupSummary = null,
    LevelThree: HierarchyGroupSummary = null,
    LevelTwo: HierarchyGroupSummary = null
  ): HierarchyPath = {
    val __obj = js.Dynamic.literal()
    if (LevelFive != null) __obj.updateDynamic("LevelFive")(LevelFive.asInstanceOf[js.Any])
    if (LevelFour != null) __obj.updateDynamic("LevelFour")(LevelFour.asInstanceOf[js.Any])
    if (LevelOne != null) __obj.updateDynamic("LevelOne")(LevelOne.asInstanceOf[js.Any])
    if (LevelThree != null) __obj.updateDynamic("LevelThree")(LevelThree.asInstanceOf[js.Any])
    if (LevelTwo != null) __obj.updateDynamic("LevelTwo")(LevelTwo.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyPath]
  }
}


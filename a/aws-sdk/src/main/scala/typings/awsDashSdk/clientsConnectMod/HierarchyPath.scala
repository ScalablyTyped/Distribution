package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyPath extends js.Object {
  /**
    * A HierarchyGroupSummary object that contains information about the level of the hierarchy group, including ARN, Id, and Name.
    */
  var LevelFive: js.UndefOr[HierarchyGroupSummary] = js.undefined
  /**
    * A HierarchyGroupSummary object that contains information about the level of the hierarchy group, including ARN, Id, and Name.
    */
  var LevelFour: js.UndefOr[HierarchyGroupSummary] = js.undefined
  /**
    * A HierarchyGroupSummary object that contains information about the level of the hierarchy group, including ARN, Id, and Name.
    */
  var LevelOne: js.UndefOr[HierarchyGroupSummary] = js.undefined
  /**
    * A HierarchyGroupSummary object that contains information about the level of the hierarchy group, including ARN, Id, and Name.
    */
  var LevelThree: js.UndefOr[HierarchyGroupSummary] = js.undefined
  /**
    * A HierarchyGroupSummary object that contains information about the level of the hierarchy group, including ARN, Id, and Name.
    */
  var LevelTwo: js.UndefOr[HierarchyGroupSummary] = js.undefined
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
    if (LevelFive != null) __obj.updateDynamic("LevelFive")(LevelFive)
    if (LevelFour != null) __obj.updateDynamic("LevelFour")(LevelFour)
    if (LevelOne != null) __obj.updateDynamic("LevelOne")(LevelOne)
    if (LevelThree != null) __obj.updateDynamic("LevelThree")(LevelThree)
    if (LevelTwo != null) __obj.updateDynamic("LevelTwo")(LevelTwo)
    __obj.asInstanceOf[HierarchyPath]
  }
}


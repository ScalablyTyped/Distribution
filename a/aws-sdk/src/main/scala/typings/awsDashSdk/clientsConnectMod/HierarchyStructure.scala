package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchyStructure extends js.Object {
  /**
    * Information about level five.
    */
  var LevelFive: js.UndefOr[HierarchyLevel] = js.native
  /**
    * Information about level four.
    */
  var LevelFour: js.UndefOr[HierarchyLevel] = js.native
  /**
    * Information about level one.
    */
  var LevelOne: js.UndefOr[HierarchyLevel] = js.native
  /**
    * Information about level three.
    */
  var LevelThree: js.UndefOr[HierarchyLevel] = js.native
  /**
    * Information about level two.
    */
  var LevelTwo: js.UndefOr[HierarchyLevel] = js.native
}

object HierarchyStructure {
  @scala.inline
  def apply(
    LevelFive: HierarchyLevel = null,
    LevelFour: HierarchyLevel = null,
    LevelOne: HierarchyLevel = null,
    LevelThree: HierarchyLevel = null,
    LevelTwo: HierarchyLevel = null
  ): HierarchyStructure = {
    val __obj = js.Dynamic.literal()
    if (LevelFive != null) __obj.updateDynamic("LevelFive")(LevelFive.asInstanceOf[js.Any])
    if (LevelFour != null) __obj.updateDynamic("LevelFour")(LevelFour.asInstanceOf[js.Any])
    if (LevelOne != null) __obj.updateDynamic("LevelOne")(LevelOne.asInstanceOf[js.Any])
    if (LevelThree != null) __obj.updateDynamic("LevelThree")(LevelThree.asInstanceOf[js.Any])
    if (LevelTwo != null) __obj.updateDynamic("LevelTwo")(LevelTwo.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyStructure]
  }
}


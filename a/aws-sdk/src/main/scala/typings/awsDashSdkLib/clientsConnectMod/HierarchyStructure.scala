package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyStructure extends js.Object {
  /**
    * A HierarchyLevel object that contains information about the hierarchy group level.
    */
  var LevelFive: js.UndefOr[HierarchyLevel] = js.undefined
  /**
    * A HierarchyLevel object that contains information about the hierarchy group level.
    */
  var LevelFour: js.UndefOr[HierarchyLevel] = js.undefined
  /**
    * A HierarchyLevel object that contains information about the hierarchy group level.
    */
  var LevelOne: js.UndefOr[HierarchyLevel] = js.undefined
  /**
    * A HierarchyLevel object that contains information about the hierarchy group level.
    */
  var LevelThree: js.UndefOr[HierarchyLevel] = js.undefined
  /**
    * A HierarchyLevel object that contains information about the hierarchy group level.
    */
  var LevelTwo: js.UndefOr[HierarchyLevel] = js.undefined
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
    if (LevelFive != null) __obj.updateDynamic("LevelFive")(LevelFive)
    if (LevelFour != null) __obj.updateDynamic("LevelFour")(LevelFour)
    if (LevelOne != null) __obj.updateDynamic("LevelOne")(LevelOne)
    if (LevelThree != null) __obj.updateDynamic("LevelThree")(LevelThree)
    if (LevelTwo != null) __obj.updateDynamic("LevelTwo")(LevelTwo)
    __obj.asInstanceOf[HierarchyStructure]
  }
}


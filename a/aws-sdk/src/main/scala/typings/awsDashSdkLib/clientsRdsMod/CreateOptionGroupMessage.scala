package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptionGroupMessage extends js.Object {
  /**
    * Specifies the name of the engine that this option group should be associated with.
    */
  var EngineName: String
  /**
    * Specifies the major version of the engine that this option group should be associated with.
    */
  var MajorEngineVersion: String
  /**
    * The description of the option group.
    */
  var OptionGroupDescription: String
  /**
    * Specifies the name of the option group to be created. Constraints:   Must be 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: myoptiongroup 
    */
  var OptionGroupName: String
  /**
    * Tags to assign to the option group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateOptionGroupMessage {
  @scala.inline
  def apply(
    EngineName: String,
    MajorEngineVersion: String,
    OptionGroupDescription: String,
    OptionGroupName: String,
    Tags: TagList = null
  ): CreateOptionGroupMessage = {
    val __obj = js.Dynamic.literal(EngineName = EngineName, MajorEngineVersion = MajorEngineVersion, OptionGroupDescription = OptionGroupDescription, OptionGroupName = OptionGroupName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateOptionGroupMessage]
  }
}


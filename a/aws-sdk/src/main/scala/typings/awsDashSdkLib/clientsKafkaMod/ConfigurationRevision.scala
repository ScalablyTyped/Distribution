package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationRevision extends js.Object {
  /**
    * The time when the configuration revision was created.
    */
  var CreationTime: __timestampIso8601
  /**
    * The description of the configuration revision.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The revision number.
    */
  var Revision: __long
}

object ConfigurationRevision {
  @scala.inline
  def apply(CreationTime: __timestampIso8601, Revision: __long, Description: __string = null): ConfigurationRevision = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, Revision = Revision)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[ConfigurationRevision]
  }
}


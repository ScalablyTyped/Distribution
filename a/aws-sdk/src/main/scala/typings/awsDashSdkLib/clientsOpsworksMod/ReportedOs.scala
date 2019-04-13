package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportedOs extends js.Object {
  /**
    * The operating system family.
    */
  var Family: js.UndefOr[String] = js.undefined
  /**
    * The operating system name.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The operating system version.
    */
  var Version: js.UndefOr[String] = js.undefined
}

object ReportedOs {
  @scala.inline
  def apply(Family: String = null, Name: String = null, Version: String = null): ReportedOs = {
    val __obj = js.Dynamic.literal()
    if (Family != null) __obj.updateDynamic("Family")(Family)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[ReportedOs]
  }
}


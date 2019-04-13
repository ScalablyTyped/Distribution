package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupPlanTemplatesListMember extends js.Object {
  /**
    * Uniquely identifies a stored backup plan template.
    */
  var BackupPlanTemplateId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The optional display name of a backup plan template.
    */
  var BackupPlanTemplateName: js.UndefOr[java.lang.String] = js.undefined
}

object BackupPlanTemplatesListMember {
  @scala.inline
  def apply(BackupPlanTemplateId: java.lang.String = null, BackupPlanTemplateName: java.lang.String = null): BackupPlanTemplatesListMember = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanTemplateId != null) __obj.updateDynamic("BackupPlanTemplateId")(BackupPlanTemplateId)
    if (BackupPlanTemplateName != null) __obj.updateDynamic("BackupPlanTemplateName")(BackupPlanTemplateName)
    __obj.asInstanceOf[BackupPlanTemplatesListMember]
  }
}


package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupPlanTemplatesListMember extends js.Object {
  /**
    * Uniquely identifies a stored backup plan template.
    */
  var BackupPlanTemplateId: js.UndefOr[String] = js.undefined
  /**
    * The optional display name of a backup plan template.
    */
  var BackupPlanTemplateName: js.UndefOr[String] = js.undefined
}

object BackupPlanTemplatesListMember {
  @scala.inline
  def apply(BackupPlanTemplateId: String = null, BackupPlanTemplateName: String = null): BackupPlanTemplatesListMember = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanTemplateId != null) __obj.updateDynamic("BackupPlanTemplateId")(BackupPlanTemplateId)
    if (BackupPlanTemplateName != null) __obj.updateDynamic("BackupPlanTemplateName")(BackupPlanTemplateName)
    __obj.asInstanceOf[BackupPlanTemplatesListMember]
  }
}


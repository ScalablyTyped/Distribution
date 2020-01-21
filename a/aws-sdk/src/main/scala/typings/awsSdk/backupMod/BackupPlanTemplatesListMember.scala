package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupPlanTemplatesListMember extends js.Object {
  /**
    * Uniquely identifies a stored backup plan template.
    */
  var BackupPlanTemplateId: js.UndefOr[String] = js.native
  /**
    * The optional display name of a backup plan template.
    */
  var BackupPlanTemplateName: js.UndefOr[String] = js.native
}

object BackupPlanTemplatesListMember {
  @scala.inline
  def apply(BackupPlanTemplateId: String = null, BackupPlanTemplateName: String = null): BackupPlanTemplatesListMember = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanTemplateId != null) __obj.updateDynamic("BackupPlanTemplateId")(BackupPlanTemplateId.asInstanceOf[js.Any])
    if (BackupPlanTemplateName != null) __obj.updateDynamic("BackupPlanTemplateName")(BackupPlanTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupPlanTemplatesListMember]
  }
}


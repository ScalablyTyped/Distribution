package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/backup", "Backup")
@js.native
object BackupNs extends js.Object {
  trait BackupJob extends js.Object {
    /**
      * Uniquely identifies a request to AWS Backup to back up a resource.
      */
    var BackupJobId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The size, in bytes, of a backup.
      */
    var BackupSizeInBytes: js.UndefOr[Long] = js.undefined
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
      */
    var BackupVaultArn: js.UndefOr[ARN] = js.undefined
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined
    /**
      * The size in bytes transferred to a backup vault at the time that the job status was queried.
      */
    var BytesTransferred: js.UndefOr[Long] = js.undefined
    /**
      * The date and time a job to create a backup job is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CompletionDate: js.UndefOr[timestamp] = js.undefined
    /**
      * Contains identifying information about the creation of a backup job, including the BackupPlanArn, BackupPlanId, BackupPlanVersion, and BackupRuleId of the backup plan used to create it.
      */
    var CreatedBy: js.UndefOr[RecoveryPointCreator] = js.undefined
    /**
      * The date and time a backup job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * The date and time a job to back up resources is expected to be completed, in Unix format and Coordinated Universal Time (UTC). The value of ExpectedCompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var ExpectedCompletionDate: js.UndefOr[timestamp] = js.undefined
    /**
      * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
      */
    var IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
    /**
      * Contains an estimated percentage complete of a job at the time the job status was queried.
      */
    var PercentDone: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
    /**
      * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
      */
    var ResourceArn: js.UndefOr[ARN] = js.undefined
    /**
      * The type of AWS resource to be backed-up; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
      */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * Specifies the time in Unix format and Coordinated Universal Time (UTC) when a backup job must be started before it is canceled. The value is calculated by adding the start window to the scheduled time. So if the scheduled time were 6:00 PM and the start window is 2 hours, the StartBy time would be 8:00 PM on the date specified. The value of StartBy is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var StartBy: js.UndefOr[timestamp] = js.undefined
    /**
      * The current state of a resource recovery point.
      */
    var State: js.UndefOr[BackupJobState] = js.undefined
    /**
      * A detailed message explaining the status of the job to back up a resource.
      */
    var StatusMessage: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait BackupPlan extends js.Object {
    /**
      * The display name of a backup plan.
      */
    var BackupPlanName: BackupPlanName
    /**
      * An array of BackupRule objects, each of which specifies a scheduled task that is used to back up a selection of resources.
      */
    var Rules: BackupRules
  }
  
  trait BackupPlanInput extends js.Object {
    /**
      * The display name of a backup plan.
      */
    var BackupPlanName: BackupPlanName
    /**
      * An array of BackupRule objects, each of which specifies a scheduled task that is used to back up a selection of resources.
      */
    var Rules: BackupRulesInput
  }
  
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
  
  trait BackupPlansListMember extends js.Object {
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
      */
    var BackupPlanArn: js.UndefOr[ARN] = js.undefined
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The display name of a saved backup plan.
      */
    var BackupPlanName: js.UndefOr[BackupPlanName] = js.undefined
    /**
      * The date and time a resource backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
      */
    var CreatorRequestId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The date and time a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The value of DeletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var DeletionDate: js.UndefOr[timestamp] = js.undefined
    /**
      * The last time a job to back up resources was executed with this rule. A date and time, in Unix format and Coordinated Universal Time (UTC). The value of LastExecutionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var LastExecutionDate: js.UndefOr[timestamp] = js.undefined
    /**
      * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs cannot be edited.
      */
    var VersionId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait BackupRule extends js.Object {
    /**
      * A value in minutes after a backup job is successfully started before it must be completed or it is canceled by AWS Backup. This value is optional.
      */
    var CompletionWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
    /**
      * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
      */
    var Lifecycle: js.UndefOr[Lifecycle] = js.undefined
    /**
      * An array of key-value pair strings that are assigned to resources that are associated with this rule when restored from backup.
      */
    var RecoveryPointTags: js.UndefOr[Tags] = js.undefined
    /**
      * Uniquely identifies a rule that is used to schedule the backup of a selection of resources.
      */
    var RuleId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An optional display name for a backup rule.
      */
    var RuleName: BackupRuleName
    /**
      * A CRON expression specifying when AWS Backup initiates a backup job.
      */
    var ScheduleExpression: js.UndefOr[CronExpression] = js.undefined
    /**
      * An optional value that specifies a period of time in minutes after a backup is scheduled before a job is canceled if it doesn't start successfully.
      */
    var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var TargetBackupVaultName: BackupVaultName
  }
  
  trait BackupRuleInput extends js.Object {
    /**
      * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
      */
    var CompletionWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
    /**
      * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup will transition and expire backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days”. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
      */
    var Lifecycle: js.UndefOr[Lifecycle] = js.undefined
    /**
      * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair.
      */
    var RecoveryPointTags: js.UndefOr[Tags] = js.undefined
    /**
      * &gt;An optional display name for a backup rule.
      */
    var RuleName: BackupRuleName
    /**
      * A CRON expression specifying when AWS Backup initiates a backup job.
      */
    var ScheduleExpression: js.UndefOr[CronExpression] = js.undefined
    /**
      * The amount of time in minutes before beginning a backup.
      */
    var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var TargetBackupVaultName: BackupVaultName
  }
  
  trait BackupSelection extends js.Object {
    /**
      * The ARN of the IAM role that AWS Backup uses to authenticate when restoring the target resource; for example, arn:aws:iam::123456789012:role/S3Access.
      */
    var IamRoleArn: IAMRoleArn
    /**
      * An array of conditions used to specify a set of resources to assign to a backup plan; for example, "StringEquals": {"ec2:ResourceTag/Department": "accounting".
      */
    var ListOfTags: js.UndefOr[ListOfTags] = js.undefined
    /**
      * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns such as "arn:aws:ec2:us-east-1:123456789012:volume/ *" of resources to assign to a backup plan.
      */
    var Resources: js.UndefOr[ResourceArns] = js.undefined
    /**
      * The display name of a resource selection document.
      */
    var SelectionName: BackupSelectionName
  }
  
  trait BackupSelectionsListMember extends js.Object {
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The date and time a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
      */
    var CreatorRequestId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Specifies the IAM role Amazon Resource Name (ARN) to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
      */
    var IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
    /**
      * Uniquely identifies a request to assign a set of resources to a backup plan.
      */
    var SelectionId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The display name of a resource selection document.
      */
    var SelectionName: js.UndefOr[BackupSelectionName] = js.undefined
  }
  
  trait BackupVaultListMember extends js.Object {
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
      */
    var BackupVaultArn: js.UndefOr[ARN] = js.undefined
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined
    /**
      * The date and time a resource backup is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
      */
    var CreatorRequestId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The server-side encryption key that is used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
      */
    var EncryptionKeyArn: js.UndefOr[ARN] = js.undefined
    /**
      * The number of recovery points that are stored in a backup vault.
      */
    var NumberOfRecoveryPoints: js.UndefOr[long] = js.undefined
  }
  
  trait CalculatedLifecycle extends js.Object {
    /**
      * A timestamp that specifies when to delete a recovery point.
      */
    var DeleteAt: js.UndefOr[timestamp] = js.undefined
    /**
      * A timestamp that specifies when to transition a recovery point to cold storage.
      */
    var MoveToColdStorageAt: js.UndefOr[timestamp] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Condition extends js.Object {
    /**
      * The key in a key-value pair. For example, in "ec2:ResourceTag/Department": "accounting", "ec2:ResourceTag/Department" is the key.
      */
    var ConditionKey: ConditionKey
    /**
      * An operation, such as StringEquals, that is applied to a key-value pair used to filter resources in a selection.
      */
    var ConditionType: ConditionType
    /**
      * The value in a key-value pair. For example, in "ec2:ResourceTag/Department": "accounting", "accounting" is the value.
      */
    var ConditionValue: ConditionValue
  }
  
  trait CreateBackupPlanInput extends js.Object {
    /**
      * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
      */
    var BackupPlan: BackupPlanInput
    /**
      * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair. The specified tags are assigned to all backups created with this plan.
      */
    var BackupPlanTags: js.UndefOr[Tags] = js.undefined
    /**
      * Identifies the request and allows failed requests to be retried without the risk of executing the operation twice. If the request includes a CreatorRequestId that matches an existing backup plan, that plan is returned. This parameter is optional.
      */
    var CreatorRequestId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CreateBackupPlanOutput extends js.Object {
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
      */
    var BackupPlanArn: js.UndefOr[ARN] = js.undefined
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1024 bytes long. They cannot be edited.
      */
    var VersionId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CreateBackupSelectionInput extends js.Object {
    /**
      * Uniquely identifies the backup plan to be associated with the selection of resources.
      */
    var BackupPlanId: java.lang.String
    /**
      * Specifies the body of a request to assign a set of resources to a backup plan. It includes an array of resources, an optional array of patterns to exclude resources, an optional role to provide access to the AWS service the resource belongs to, and an optional array of tags used to identify a set of resources.
      */
    var BackupSelection: BackupSelection
    /**
      * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
      */
    var CreatorRequestId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CreateBackupSelectionOutput extends js.Object {
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The date and time a backup selection is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
      */
    var SelectionId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CreateBackupVaultInput extends js.Object {
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: BackupVaultName
    /**
      * Metadata that you can assign to help organize the resources that you create. Each tag is a key-value pair.
      */
    var BackupVaultTags: js.UndefOr[Tags] = js.undefined
    /**
      * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
      */
    var CreatorRequestId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The server-side encryption key that is used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
      */
    var EncryptionKeyArn: js.UndefOr[ARN] = js.undefined
  }
  
  trait CreateBackupVaultOutput extends js.Object {
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
      */
    var BackupVaultArn: js.UndefOr[ARN] = js.undefined
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined
    /**
      * The date and time a backup vault is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
  }
  
  trait DeleteBackupPlanInput extends js.Object {
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: java.lang.String
  }
  
  trait DeleteBackupPlanOutput extends js.Object {
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
      */
    var BackupPlanArn: js.UndefOr[ARN] = js.undefined
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The date and time a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var DeletionDate: js.UndefOr[timestamp] = js.undefined
    /**
      * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version Ids cannot be edited.
      */
    var VersionId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait DeleteBackupSelectionInput extends js.Object {
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: java.lang.String
    /**
      * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
      */
    var SelectionId: java.lang.String
  }
  
  trait DeleteBackupVaultAccessPolicyInput extends js.Object {
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: BackupVaultName
  }
  
  trait DeleteBackupVaultInput extends js.Object {
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and theAWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: java.lang.String
  }
  
  trait DeleteBackupVaultNotificationsInput extends js.Object {
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: BackupVaultName
  }
  
  trait DeleteRecoveryPointInput extends js.Object {
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: BackupVaultName
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: ARN
  }
  
  trait DescribeBackupJobInput extends js.Object {
    /**
      * Uniquely identifies a request to AWS Backup to back up a resource.
      */
    var BackupJobId: java.lang.String
  }
  
  trait DescribeBackupJobOutput extends js.Object {
    /**
      * Uniquely identifies a request to AWS Backup to back up a resource.
      */
    var BackupJobId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The size, in bytes, of a backup.
      */
    var BackupSizeInBytes: js.UndefOr[Long] = js.undefined
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
      */
    var BackupVaultArn: js.UndefOr[ARN] = js.undefined
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined
    /**
      * The size in bytes transferred to a backup vault at the time that the job status was queried.
      */
    var BytesTransferred: js.UndefOr[Long] = js.undefined
    /**
      * The date and time that a job to create a backup job is completed, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CompletionDate: js.UndefOr[timestamp] = js.undefined
    /**
      * Contains identifying information about the creation of a backup job, including the BackupPlanArn, BackupPlanId, BackupPlanVersion, and BackupRuleId of the backup plan that is used to create it.
      */
    var CreatedBy: js.UndefOr[RecoveryPointCreator] = js.undefined
    /**
      * The date and time that a backup job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * The date and time that a job to back up resources is expected to be completed, in Unix format and Coordinated Universal Time (UTC). The value of ExpectedCompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var ExpectedCompletionDate: js.UndefOr[timestamp] = js.undefined
    /**
      * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
      */
    var IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
    /**
      * Contains an estimated percentage that is complete of a job at the time the job status was queried.
      */
    var PercentDone: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
    /**
      * An ARN that uniquely identifies a saved resource. The format of the ARN depends on the resource type.
      */
    var ResourceArn: js.UndefOr[ARN] = js.undefined
    /**
      * The type of AWS resource to be backed-up; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
      */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * Specifies the time in Unix format and Coordinated Universal Time (UTC) when a backup job must be started before it is canceled. The value is calculated by adding the start window to the scheduled time. So if the scheduled time were 6:00 PM and the start window is 2 hours, the StartBy time would be 8:00 PM on the date specified. The value of StartBy is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var StartBy: js.UndefOr[timestamp] = js.undefined
    /**
      * The current state of a resource recovery point.
      */
    var State: js.UndefOr[BackupJobState] = js.undefined
    /**
      * A detailed message explaining the status of the job to back up a resource.
      */
    var StatusMessage: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait DescribeBackupVaultInput extends js.Object {
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: java.lang.String
  }
  
  trait DescribeBackupVaultOutput extends js.Object {
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
      */
    var BackupVaultArn: js.UndefOr[ARN] = js.undefined
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The date and time that a backup vault is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
      */
    var CreatorRequestId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The server-side encryption key that is used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
      */
    var EncryptionKeyArn: js.UndefOr[ARN] = js.undefined
    /**
      * The number of recovery points that are stored in a backup vault.
      */
    var NumberOfRecoveryPoints: js.UndefOr[long] = js.undefined
  }
  
  trait DescribeProtectedResourceInput extends js.Object {
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
      */
    var ResourceArn: ARN
  }
  
  trait DescribeProtectedResourceOutput extends js.Object {
    /**
      * The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The value of LastBackupTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var LastBackupTime: js.UndefOr[timestamp] = js.undefined
    /**
      * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
      */
    var ResourceArn: js.UndefOr[ARN] = js.undefined
    /**
      * The type of AWS resource saved as a recovery point; for example, an EBS volume or an Amazon RDS database.
      */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  trait DescribeRecoveryPointInput extends js.Object {
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: BackupVaultName
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: ARN
  }
  
  trait DescribeRecoveryPointOutput extends js.Object {
    /**
      * The size, in bytes, of a backup.
      */
    var BackupSizeInBytes: js.UndefOr[Long] = js.undefined
    /**
      * An ARN that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
      */
    var BackupVaultArn: js.UndefOr[ARN] = js.undefined
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined
    /**
      * A CalculatedLifecycle object containing DeleteAt and MoveToColdStorageAt timestamps.
      */
    var CalculatedLifecycle: js.UndefOr[CalculatedLifecycle] = js.undefined
    /**
      * The date and time that a job to create a recovery point is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CompletionDate: js.UndefOr[timestamp] = js.undefined
    /**
      * Contains identifying information about the creation of a recovery point, including the BackupPlanArn, BackupPlanId, BackupPlanVersion, and BackupRuleId of the backup plan used to create it.
      */
    var CreatedBy: js.UndefOr[RecoveryPointCreator] = js.undefined
    /**
      * The date and time that a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * The server-side encryption key used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
      */
    var EncryptionKeyArn: js.UndefOr[ARN] = js.undefined
    /**
      * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
      */
    var IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
    /**
      * A Boolean value that is returned as TRUE if the specified recovery point is encrypted, or FALSE if the recovery point is not encrypted.
      */
    var IsEncrypted: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The date and time that a recovery point was last restored, in Unix format and Coordinated Universal Time (UTC). The value of LastRestoreTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var LastRestoreTime: js.UndefOr[timestamp] = js.undefined
    /**
      * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups that are transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
      */
    var Lifecycle: js.UndefOr[Lifecycle] = js.undefined
    /**
      * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
    /**
      * An ARN that uniquely identifies a saved resource. The format of the ARN depends on the resource type.
      */
    var ResourceArn: js.UndefOr[ARN] = js.undefined
    /**
      * The type of AWS resource to save as a recovery point; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
      */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * A status code specifying the state of the recovery point.  A partial status indicates that the recovery point was not successfully re-created and must be retried. 
      */
    var Status: js.UndefOr[RecoveryPointStatus] = js.undefined
    /**
      * Specifies the storage class of the recovery point. Valid values are WARM or COLD.
      */
    var StorageClass: js.UndefOr[StorageClass] = js.undefined
  }
  
  trait DescribeRestoreJobInput extends js.Object {
    /**
      * Uniquely identifies the job that restores a recovery point.
      */
    var RestoreJobId: RestoreJobId
  }
  
  trait DescribeRestoreJobOutput extends js.Object {
    /**
      * The size, in bytes, of the restored resource.
      */
    var BackupSizeInBytes: js.UndefOr[Long] = js.undefined
    /**
      * The date and time that a job to restore a recovery point is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CompletionDate: js.UndefOr[timestamp] = js.undefined
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a resource whose recovery point is being restored. The format of the ARN depends on the resource type of the backed-up resource.
      */
    var CreatedResourceArn: js.UndefOr[ARN] = js.undefined
    /**
      * The date and time that a restore job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * The amount of time in minutes that a job restoring a recovery point is expected to take.
      */
    var ExpectedCompletionTimeMinutes: js.UndefOr[Long] = js.undefined
    /**
      * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
      */
    var IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
    /**
      * Contains an estimated percentage that is complete of a job at the time the job status was queried.
      */
    var PercentDone: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
    /**
      * Uniquely identifies the job that restores a recovery point.
      */
    var RestoreJobId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Status code specifying the state of the job that is initiated by AWS Backup to restore a recovery point.
      */
    var Status: js.UndefOr[RestoreJobStatus] = js.undefined
    /**
      * A detailed message explaining the status of a job to restore a recovery point.
      */
    var StatusMessage: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ExportBackupPlanTemplateInput extends js.Object {
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: java.lang.String
  }
  
  trait ExportBackupPlanTemplateOutput extends js.Object {
    /**
      * The body of a backup plan template in JSON format.  This is a signed JSON document that cannot be modified before being passed to GetBackupPlanFromJSON.  
      */
    var BackupPlanTemplateJson: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetBackupPlanFromJSONInput extends js.Object {
    /**
      * A customer-supplied backup plan document in JSON format.
      */
    var BackupPlanTemplateJson: java.lang.String
  }
  
  trait GetBackupPlanFromJSONOutput extends js.Object {
    /**
      * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
      */
    var BackupPlan: js.UndefOr[BackupPlan] = js.undefined
  }
  
  trait GetBackupPlanFromTemplateInput extends js.Object {
    /**
      * Uniquely identifies a stored backup plan template.
      */
    var BackupPlanTemplateId: java.lang.String
  }
  
  trait GetBackupPlanFromTemplateOutput extends js.Object {
    /**
      * Returns the body of a backup plan based on the target template, including the name, rules, and backup vault of the plan.
      */
    var BackupPlanDocument: js.UndefOr[BackupPlan] = js.undefined
  }
  
  trait GetBackupPlanInput extends js.Object {
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: java.lang.String
    /**
      * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs cannot be edited.
      */
    var VersionId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetBackupPlanOutput extends js.Object {
    /**
      * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
      */
    var BackupPlan: js.UndefOr[BackupPlan] = js.undefined
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
      */
    var BackupPlanArn: js.UndefOr[ARN] = js.undefined
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
      */
    var CreatorRequestId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The date and time that a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var DeletionDate: js.UndefOr[timestamp] = js.undefined
    /**
      * The last time a job to back up resources was executed with this backup plan. A date and time, in Unix format and Coordinated Universal Time (UTC). The value of LastExecutionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var LastExecutionDate: js.UndefOr[timestamp] = js.undefined
    /**
      * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs cannot be edited.
      */
    var VersionId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetBackupSelectionInput extends js.Object {
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: java.lang.String
    /**
      * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
      */
    var SelectionId: java.lang.String
  }
  
  trait GetBackupSelectionOutput extends js.Object {
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Specifies the body of a request to assign a set of resources to a backup plan. It includes an array of resources, an optional array of patterns to exclude resources, an optional role to provide access to the AWS service that the resource belongs to, and an optional array of tags used to identify a set of resources.
      */
    var BackupSelection: js.UndefOr[BackupSelection] = js.undefined
    /**
      * The date and time a backup selection is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
      */
    var CreatorRequestId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
      */
    var SelectionId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetBackupVaultAccessPolicyInput extends js.Object {
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: BackupVaultName
  }
  
  trait GetBackupVaultAccessPolicyOutput extends js.Object {
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
      */
    var BackupVaultArn: js.UndefOr[ARN] = js.undefined
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined
    /**
      * The backup vault access policy document in JSON format.
      */
    var Policy: js.UndefOr[IAMPolicy] = js.undefined
  }
  
  trait GetBackupVaultNotificationsInput extends js.Object {
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: BackupVaultName
  }
  
  trait GetBackupVaultNotificationsOutput extends js.Object {
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
      */
    var BackupVaultArn: js.UndefOr[ARN] = js.undefined
    /**
      * An array of events that indicate the status of jobs to back up resources to the backup vault.
      */
    var BackupVaultEvents: js.UndefOr[BackupVaultEvents] = js.undefined
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined
    /**
      * An ARN that uniquely identifies an Amazon Simple Notification Service (Amazon SNS) topic; for example, arn:aws:sns:us-west-2:111122223333:MyTopic.
      */
    var SNSTopicArn: js.UndefOr[ARN] = js.undefined
  }
  
  trait GetRecoveryPointRestoreMetadataInput extends js.Object {
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: BackupVaultName
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: ARN
  }
  
  trait GetRecoveryPointRestoreMetadataOutput extends js.Object {
    /**
      * An ARN that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
      */
    var BackupVaultArn: js.UndefOr[ARN] = js.undefined
    /**
      * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
    /**
      * A set of metadata key-value pairs that lists the metadata key-value pairs that are required to restore the recovery point.
      */
    var RestoreMetadata: js.UndefOr[Metadata] = js.undefined
  }
  
  trait GetSupportedResourceTypesOutput extends js.Object {
    /**
      * Contains a string with the supported AWS resource types:    EBS for Amazon Elastic Block Store    SGW for AWS Storage Gateway    RDS for Amazon Relational Database Service    DDB for Amazon DynamoDB    EFS for Amazon Elastic File System  
      */
    var ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined
  }
  
  trait Lifecycle extends js.Object {
    /**
      * Specifies the number of days after creation that a recovery point is deleted. Must be greater than MoveToColdStorageAfterDays.
      */
    var DeleteAfterDays: js.UndefOr[Long] = js.undefined
    /**
      * Specifies the number of days after creation that a recovery point is moved to cold storage.
      */
    var MoveToColdStorageAfterDays: js.UndefOr[Long] = js.undefined
  }
  
  trait ListBackupJobsInput extends js.Object {
    /**
      * Returns only backup jobs that will be stored in the specified backup vault. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var ByBackupVaultName: js.UndefOr[BackupVaultName] = js.undefined
    /**
      * Returns only backup jobs that were created after the specified date.
      */
    var ByCreatedAfter: js.UndefOr[timestamp] = js.undefined
    /**
      * Returns only backup jobs that were created before the specified date.
      */
    var ByCreatedBefore: js.UndefOr[timestamp] = js.undefined
    /**
      * Returns only backup jobs that match the specified resource Amazon Resource Name (ARN).
      */
    var ByResourceArn: js.UndefOr[ARN] = js.undefined
    /**
      * Returns only backup jobs for the specified resources:    EBS for Amazon Elastic Block Store    SGW for AWS Storage Gateway    RDS for Amazon Relational Database Service    DDB for Amazon DynamoDB    EFS for Amazon Elastic File System  
      */
    var ByResourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * Returns only backup jobs that are in the specified state.
      */
    var ByState: js.UndefOr[BackupJobState] = js.undefined
    /**
      * The maximum number of items to be returned.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListBackupJobsOutput extends js.Object {
    /**
      * An array of structures containing metadata about your backup jobs returned in JSON format.
      */
    var BackupJobs: js.UndefOr[BackupJobsList] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListBackupPlanTemplatesInput extends js.Object {
    /**
      * The maximum number of items to be returned.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListBackupPlanTemplatesOutput extends js.Object {
    /**
      * An array of template list items containing metadata about your saved templates.
      */
    var BackupPlanTemplatesList: js.UndefOr[BackupPlanTemplatesList] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListBackupPlanVersionsInput extends js.Object {
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: java.lang.String
    /**
      * The maximum number of items to be returned.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListBackupPlanVersionsOutput extends js.Object {
    /**
      * An array of version list items containing metadata about your backup plans.
      */
    var BackupPlanVersionsList: js.UndefOr[BackupPlanVersionsList] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListBackupPlansInput extends js.Object {
    /**
      * A Boolean value with a default value of FALSE that returns deleted backup plans when set to TRUE.
      */
    var IncludeDeleted: js.UndefOr[Boolean] = js.undefined
    /**
      * The maximum number of items to be returned.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListBackupPlansOutput extends js.Object {
    /**
      * An array of backup plan list items containing metadata about your saved backup plans.
      */
    var BackupPlansList: js.UndefOr[BackupPlansList] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListBackupSelectionsInput extends js.Object {
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: java.lang.String
    /**
      * The maximum number of items to be returned.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListBackupSelectionsOutput extends js.Object {
    /**
      * An array of backup selection list items containing metadata about each resource in the list.
      */
    var BackupSelectionsList: js.UndefOr[BackupSelectionsList] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListBackupVaultsInput extends js.Object {
    /**
      * The maximum number of items to be returned.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListBackupVaultsOutput extends js.Object {
    /**
      * An array of backup vault list members containing vault metadata, including Amazon Resource Name (ARN), display name, creation date, number of saved recovery points, and encryption information if the resources saved in the backup vault are encrypted.
      */
    var BackupVaultList: js.UndefOr[BackupVaultList] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListProtectedResourcesInput extends js.Object {
    /**
      * The maximum number of items to be returned.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListProtectedResourcesOutput extends js.Object {
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An array of resources successfully backed up by AWS Backup including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
      */
    var Results: js.UndefOr[ProtectedResourcesList] = js.undefined
  }
  
  trait ListRecoveryPointsByBackupVaultInput extends js.Object {
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: BackupVaultName
    /**
      * Returns only recovery points that match the specified backup plan ID.
      */
    var ByBackupPlanId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Returns only recovery points that were created after the specified timestamp.
      */
    var ByCreatedAfter: js.UndefOr[timestamp] = js.undefined
    /**
      * Returns only recovery points that were created before the specified timestamp.
      */
    var ByCreatedBefore: js.UndefOr[timestamp] = js.undefined
    /**
      * Returns only recovery points that match the specified resource Amazon Resource Name (ARN).
      */
    var ByResourceArn: js.UndefOr[ARN] = js.undefined
    /**
      * Returns only recovery points that match the specified resource type.
      */
    var ByResourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The maximum number of items to be returned.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListRecoveryPointsByBackupVaultOutput extends js.Object {
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An array of objects that contain detailed information about recovery points saved in a backup vault.
      */
    var RecoveryPoints: js.UndefOr[RecoveryPointByBackupVaultList] = js.undefined
  }
  
  trait ListRecoveryPointsByResourceInput extends js.Object {
    /**
      * The maximum number of items to be returned.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
      */
    var ResourceArn: ARN
  }
  
  trait ListRecoveryPointsByResourceOutput extends js.Object {
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An array of objects that contain detailed information about recovery points of the specified resource type.
      */
    var RecoveryPoints: js.UndefOr[RecoveryPointByResourceList] = js.undefined
  }
  
  trait ListRestoreJobsInput extends js.Object {
    /**
      * The maximum number of items to be returned.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListRestoreJobsOutput extends js.Object {
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An array of objects that contain detailed information about jobs to restore saved resources.
      */
    var RestoreJobs: js.UndefOr[RestoreJobsList] = js.undefined
  }
  
  trait ListTagsInput extends js.Object {
    /**
      * The maximum number of items to be returned.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the type of resource. Valid targets for ListTags are recovery points, backup plans, and backup vaults.
      */
    var ResourceArn: ARN
  }
  
  trait ListTagsOutput extends js.Object {
    /**
      * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
      */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * To help organize your resources, you can assign your own metadata to the resources you create. Each tag is a key-value pair.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait Metadata
    extends /* key */ org.scalablytyped.runtime.StringDictionary[MetadataValue]
  
  trait ProtectedResource extends js.Object {
    /**
      * The date and time a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The value of LastBackupTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var LastBackupTime: js.UndefOr[timestamp] = js.undefined
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
      */
    var ResourceArn: js.UndefOr[ARN] = js.undefined
    /**
      * The type of AWS resource; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
      */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  trait PutBackupVaultAccessPolicyInput extends js.Object {
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: BackupVaultName
    /**
      * The backup vault access policy document in JSON format.
      */
    var Policy: js.UndefOr[IAMPolicy] = js.undefined
  }
  
  trait PutBackupVaultNotificationsInput extends js.Object {
    /**
      * An array of events that indicate the status of jobs to back up resources to the backup vault.
      */
    var BackupVaultEvents: BackupVaultEvents
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: BackupVaultName
    /**
      * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events; for example, arn:aws:sns:us-west-2:111122223333:MyVaultTopic.
      */
    var SNSTopicArn: ARN
  }
  
  trait RecoveryPointByBackupVault extends js.Object {
    /**
      * The size, in bytes, of a backup.
      */
    var BackupSizeInBytes: js.UndefOr[Long] = js.undefined
    /**
      * An ARN that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
      */
    var BackupVaultArn: js.UndefOr[ARN] = js.undefined
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined
    /**
      * A CalculatedLifecycle object containing DeleteAt and MoveToColdStorageAt timestamps.
      */
    var CalculatedLifecycle: js.UndefOr[CalculatedLifecycle] = js.undefined
    /**
      * The date and time a job to restore a recovery point is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CompletionDate: js.UndefOr[timestamp] = js.undefined
    /**
      * Contains identifying information about the creation of a recovery point, including the BackupPlanArn, BackupPlanId, BackupPlanVersion, and BackupRuleId of the backup plan that is used to create it.
      */
    var CreatedBy: js.UndefOr[RecoveryPointCreator] = js.undefined
    /**
      * The date and time a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * The server-side encryption key that is used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
      */
    var EncryptionKeyArn: js.UndefOr[ARN] = js.undefined
    /**
      * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
      */
    var IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
    /**
      * A Boolean value that is returned as TRUE if the specified recovery point is encrypted, or FALSE if the recovery point is not encrypted.
      */
    var IsEncrypted: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The date and time a recovery point was last restored, in Unix format and Coordinated Universal Time (UTC). The value of LastRestoreTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var LastRestoreTime: js.UndefOr[timestamp] = js.undefined
    /**
      * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
      */
    var Lifecycle: js.UndefOr[Lifecycle] = js.undefined
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
    /**
      * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
      */
    var ResourceArn: js.UndefOr[ARN] = js.undefined
    /**
      * The type of AWS resource saved as a recovery point; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
      */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * A status code specifying the state of the recovery point.
      */
    var Status: js.UndefOr[RecoveryPointStatus] = js.undefined
  }
  
  trait RecoveryPointByResource extends js.Object {
    /**
      * The size, in bytes, of a backup.
      */
    var BackupSizeBytes: js.UndefOr[Long] = js.undefined
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined
    /**
      * The date and time a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * The server-side encryption key that is used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
      */
    var EncryptionKeyArn: js.UndefOr[ARN] = js.undefined
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
    /**
      * A status code specifying the state of the recovery point.
      */
    var Status: js.UndefOr[RecoveryPointStatus] = js.undefined
  }
  
  trait RecoveryPointCreator extends js.Object {
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
      */
    var BackupPlanArn: js.UndefOr[ARN] = js.undefined
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Version IDs are unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. They cannot be edited.
      */
    var BackupPlanVersion: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Uniquely identifies a rule used to schedule the backup of a selection of resources.
      */
    var BackupRuleId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait RestoreJobsListMember extends js.Object {
    /**
      * The size, in bytes, of the restored resource.
      */
    var BackupSizeInBytes: js.UndefOr[Long] = js.undefined
    /**
      * The date and time a job to restore a recovery point is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CompletionDate: js.UndefOr[timestamp] = js.undefined
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
      */
    var CreatedResourceArn: js.UndefOr[ARN] = js.undefined
    /**
      * The date and time a restore job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * The amount of time in minutes that a job restoring a recovery point is expected to take.
      */
    var ExpectedCompletionTimeMinutes: js.UndefOr[Long] = js.undefined
    /**
      * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
      */
    var IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
    /**
      * Contains an estimated percentage complete of a job at the time the job status was queried.
      */
    var PercentDone: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
    /**
      * Uniquely identifies the job that restores a recovery point.
      */
    var RestoreJobId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A status code specifying the state of the job initiated by AWS Backup to restore a recovery point.
      */
    var Status: js.UndefOr[RestoreJobStatus] = js.undefined
    /**
      * A detailed message explaining the status of the job to restore a recovery point.
      */
    var StatusMessage: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait StartBackupJobInput extends js.Object {
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: BackupVaultName
    /**
      * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
      */
    var CompleteWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
    /**
      * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
      */
    var IamRoleArn: IAMRoleArn
    /**
      * A customer chosen string that can be used to distinguish between calls to StartBackupJob. Idempotency tokens time out after one hour. Therefore, if you call StartBackupJob multiple times with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only one backup job and initiates only one. If you change the idempotency token for each call, AWS Backup recognizes that you are requesting to start multiple backups.
      */
    var IdempotencyToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup will transition and expire backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
      */
    var Lifecycle: js.UndefOr[Lifecycle] = js.undefined
    /**
      * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair.
      */
    var RecoveryPointTags: js.UndefOr[Tags] = js.undefined
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
      */
    var ResourceArn: ARN
    /**
      * The amount of time in minutes before beginning a backup.
      */
    var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  }
  
  trait StartBackupJobOutput extends js.Object {
    /**
      * Uniquely identifies a request to AWS Backup to back up a resource.
      */
    var BackupJobId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The date and time that a backup job is started, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
  }
  
  trait StartRestoreJobInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
      */
    var IamRoleArn: IAMRoleArn
    /**
      * A customer chosen string that can be used to distinguish between calls to StartRestoreJob. Idempotency tokens time out after one hour. Therefore, if you call StartRestoreJob multiple times with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only one restore job and initiates only one. If you change the idempotency token for each call, AWS Backup recognizes that you are requesting to start multiple restores. 
      */
    var IdempotencyToken: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A set of metadata key-value pairs. Lists the metadata that the recovery point was created with.
      */
    var Metadata: Metadata
    /**
      * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: ARN
    /**
      * Starts a job to restore a recovery point for one of the following resources:    EBS for Amazon Elastic Block Store    SGW for AWS Storage Gateway    RDS for Amazon Relational Database Service    DDB for Amazon DynamoDB    EFS for Amazon Elastic File System  
      */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  trait StartRestoreJobOutput extends js.Object {
    /**
      * Uniquely identifies the job that restores a recovery point.
      */
    var RestoreJobId: js.UndefOr[RestoreJobId] = js.undefined
  }
  
  trait StopBackupJobInput extends js.Object {
    /**
      * Uniquely identifies a request to AWS Backup to back up a resource.
      */
    var BackupJobId: java.lang.String
  }
  
  trait TagResourceInput extends js.Object {
    /**
      * An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged resource.
      */
    var ResourceArn: ARN
    /**
      * Key-value pairs that are used to help organize your resources. You can assign your own metadata to the resources you create. 
      */
    var Tags: Tags
  }
  
  trait Tags
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TagValue]
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Backup plans are documents that contain information that AWS Backup uses to schedule tasks that create recovery points of resources. If you call CreateBackupPlan with a plan that already exists, the existing backupPlanId is returned.
      */
    def createBackupPlan(): awsDashSdkLib.libRequestMod.Request[CreateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBackupPlan(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBackupPlanOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Backup plans are documents that contain information that AWS Backup uses to schedule tasks that create recovery points of resources. If you call CreateBackupPlan with a plan that already exists, the existing backupPlanId is returned.
      */
    def createBackupPlan(params: CreateBackupPlanInput): awsDashSdkLib.libRequestMod.Request[CreateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBackupPlan(
      params: CreateBackupPlanInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBackupPlanOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a JSON document that specifies a set of resources to assign to a backup plan. Resources can be included by specifying patterns for a ListOfTags and selected Resources.  For example, consider the following patterns:    Resources: "arn:aws:ec2:region:account-id:volume/volume-id"     ConditionKey:"department"   ConditionValue:"finance"   ConditionType:"StringEquals"     ConditionKey:"importance"   ConditionValue:"critical"   ConditionType:"StringEquals"    Using these patterns would back up all Amazon Elastic Block Store (Amazon EBS) volumes that are tagged as "department=finance", "importance=critical", in addition to an EBS volume with the specified volume Id. Resources and conditions are additive in that all resources that match the pattern are selected. This shouldn't be confused with a logical AND, where all conditions must match. The matching patterns are logically 'put together using the OR operator. In other words, all patterns that match are selected for backup.
      */
    def createBackupSelection(): awsDashSdkLib.libRequestMod.Request[CreateBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBackupSelection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBackupSelectionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a JSON document that specifies a set of resources to assign to a backup plan. Resources can be included by specifying patterns for a ListOfTags and selected Resources.  For example, consider the following patterns:    Resources: "arn:aws:ec2:region:account-id:volume/volume-id"     ConditionKey:"department"   ConditionValue:"finance"   ConditionType:"StringEquals"     ConditionKey:"importance"   ConditionValue:"critical"   ConditionType:"StringEquals"    Using these patterns would back up all Amazon Elastic Block Store (Amazon EBS) volumes that are tagged as "department=finance", "importance=critical", in addition to an EBS volume with the specified volume Id. Resources and conditions are additive in that all resources that match the pattern are selected. This shouldn't be confused with a logical AND, where all conditions must match. The matching patterns are logically 'put together using the OR operator. In other words, all patterns that match are selected for backup.
      */
    def createBackupSelection(params: CreateBackupSelectionInput): awsDashSdkLib.libRequestMod.Request[CreateBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBackupSelection(
      params: CreateBackupSelectionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBackupSelectionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a logical container where backups are stored. A CreateBackupVault request includes a name, optionally one or more resource tags, an encryption key, and a request ID.  Sensitive data, such as passport numbers, should not be included the name of a backup vault. 
      */
    def createBackupVault(): awsDashSdkLib.libRequestMod.Request[CreateBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBackupVault(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBackupVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a logical container where backups are stored. A CreateBackupVault request includes a name, optionally one or more resource tags, an encryption key, and a request ID.  Sensitive data, such as passport numbers, should not be included the name of a backup vault. 
      */
    def createBackupVault(params: CreateBackupVaultInput): awsDashSdkLib.libRequestMod.Request[CreateBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBackupVault(
      params: CreateBackupVaultInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBackupVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a backup plan. A backup plan can only be deleted after all associated selections of resources have been deleted. Deleting a backup plan deletes the current version of a backup plan. Previous versions, if any, will still exist.
      */
    def deleteBackupPlan(): awsDashSdkLib.libRequestMod.Request[DeleteBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackupPlan(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBackupPlanOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a backup plan. A backup plan can only be deleted after all associated selections of resources have been deleted. Deleting a backup plan deletes the current version of a backup plan. Previous versions, if any, will still exist.
      */
    def deleteBackupPlan(params: DeleteBackupPlanInput): awsDashSdkLib.libRequestMod.Request[DeleteBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackupPlan(
      params: DeleteBackupPlanInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBackupPlanOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the resource selection associated with a backup plan that is specified by the SelectionId.
      */
    def deleteBackupSelection(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackupSelection(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the resource selection associated with a backup plan that is specified by the SelectionId.
      */
    def deleteBackupSelection(params: DeleteBackupSelectionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackupSelection(
      params: DeleteBackupSelectionInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the backup vault identified by its name. A vault can be deleted only if it is empty.
      */
    def deleteBackupVault(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackupVault(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the backup vault identified by its name. A vault can be deleted only if it is empty.
      */
    def deleteBackupVault(params: DeleteBackupVaultInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackupVault(
      params: DeleteBackupVaultInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the policy document that manages permissions on a backup vault.
      */
    def deleteBackupVaultAccessPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackupVaultAccessPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the policy document that manages permissions on a backup vault.
      */
    def deleteBackupVaultAccessPolicy(params: DeleteBackupVaultAccessPolicyInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackupVaultAccessPolicy(
      params: DeleteBackupVaultAccessPolicyInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes event notifications for the specified backup vault.
      */
    def deleteBackupVaultNotifications(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackupVaultNotifications(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes event notifications for the specified backup vault.
      */
    def deleteBackupVaultNotifications(params: DeleteBackupVaultNotificationsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackupVaultNotifications(
      params: DeleteBackupVaultNotificationsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the recovery point specified by a recovery point ID.
      */
    def deleteRecoveryPoint(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRecoveryPoint(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the recovery point specified by a recovery point ID.
      */
    def deleteRecoveryPoint(params: DeleteRecoveryPointInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRecoveryPoint(
      params: DeleteRecoveryPointInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata associated with creating a backup of a resource.
      */
    def describeBackupJob(): awsDashSdkLib.libRequestMod.Request[DescribeBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBackupJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBackupJobOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata associated with creating a backup of a resource.
      */
    def describeBackupJob(params: DescribeBackupJobInput): awsDashSdkLib.libRequestMod.Request[DescribeBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBackupJob(
      params: DescribeBackupJobInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBackupJobOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata about a backup vault specified by its name.
      */
    def describeBackupVault(): awsDashSdkLib.libRequestMod.Request[DescribeBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBackupVault(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBackupVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata about a backup vault specified by its name.
      */
    def describeBackupVault(params: DescribeBackupVaultInput): awsDashSdkLib.libRequestMod.Request[DescribeBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBackupVault(
      params: DescribeBackupVaultInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBackupVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a saved resource, including the last time it was backed-up, its Amazon Resource Name (ARN), and the AWS service type of the saved resource.
      */
    def describeProtectedResource(): awsDashSdkLib.libRequestMod.Request[DescribeProtectedResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeProtectedResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeProtectedResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeProtectedResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a saved resource, including the last time it was backed-up, its Amazon Resource Name (ARN), and the AWS service type of the saved resource.
      */
    def describeProtectedResource(params: DescribeProtectedResourceInput): awsDashSdkLib.libRequestMod.Request[DescribeProtectedResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeProtectedResource(
      params: DescribeProtectedResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeProtectedResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeProtectedResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata associated with a recovery point, including ID, status, encryption, and lifecycle.
      */
    def describeRecoveryPoint(): awsDashSdkLib.libRequestMod.Request[DescribeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRecoveryPoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRecoveryPointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata associated with a recovery point, including ID, status, encryption, and lifecycle.
      */
    def describeRecoveryPoint(params: DescribeRecoveryPointInput): awsDashSdkLib.libRequestMod.Request[DescribeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRecoveryPoint(
      params: DescribeRecoveryPointInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRecoveryPointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRecoveryPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata associated with a restore job that is specified by a job ID.
      */
    def describeRestoreJob(): awsDashSdkLib.libRequestMod.Request[DescribeRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRestoreJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRestoreJobOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata associated with a restore job that is specified by a job ID.
      */
    def describeRestoreJob(params: DescribeRestoreJobInput): awsDashSdkLib.libRequestMod.Request[DescribeRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRestoreJob(
      params: DescribeRestoreJobInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRestoreJobOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the backup plan that is specified by the plan ID as a backup template.
      */
    def exportBackupPlanTemplate(): awsDashSdkLib.libRequestMod.Request[ExportBackupPlanTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def exportBackupPlanTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExportBackupPlanTemplateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExportBackupPlanTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the backup plan that is specified by the plan ID as a backup template.
      */
    def exportBackupPlanTemplate(params: ExportBackupPlanTemplateInput): awsDashSdkLib.libRequestMod.Request[ExportBackupPlanTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def exportBackupPlanTemplate(
      params: ExportBackupPlanTemplateInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExportBackupPlanTemplateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExportBackupPlanTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the body of a backup plan in JSON format, in addition to plan metadata.
      */
    def getBackupPlan(): awsDashSdkLib.libRequestMod.Request[GetBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBackupPlan(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBackupPlanOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the body of a backup plan in JSON format, in addition to plan metadata.
      */
    def getBackupPlan(params: GetBackupPlanInput): awsDashSdkLib.libRequestMod.Request[GetBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBackupPlan(
      params: GetBackupPlanInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBackupPlanOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a valid JSON document specifying a backup plan or an error.
      */
    def getBackupPlanFromJSON(): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromJSONOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBackupPlanFromJSON(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBackupPlanFromJSONOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromJSONOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a valid JSON document specifying a backup plan or an error.
      */
    def getBackupPlanFromJSON(params: GetBackupPlanFromJSONInput): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromJSONOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBackupPlanFromJSON(
      params: GetBackupPlanFromJSONInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBackupPlanFromJSONOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromJSONOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the template specified by its templateId as a backup plan.
      */
    def getBackupPlanFromTemplate(): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBackupPlanFromTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBackupPlanFromTemplateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the template specified by its templateId as a backup plan.
      */
    def getBackupPlanFromTemplate(params: GetBackupPlanFromTemplateInput): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBackupPlanFromTemplate(
      params: GetBackupPlanFromTemplateInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBackupPlanFromTemplateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBackupPlanFromTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns selection metadata and a document in JSON format that specifies a list of resources that are associated with a backup plan.
      */
    def getBackupSelection(): awsDashSdkLib.libRequestMod.Request[GetBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBackupSelection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBackupSelectionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns selection metadata and a document in JSON format that specifies a list of resources that are associated with a backup plan.
      */
    def getBackupSelection(params: GetBackupSelectionInput): awsDashSdkLib.libRequestMod.Request[GetBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBackupSelection(
      params: GetBackupSelectionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBackupSelectionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBackupSelectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the access policy document that is associated with the named backup vault.
      */
    def getBackupVaultAccessPolicy(): awsDashSdkLib.libRequestMod.Request[GetBackupVaultAccessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBackupVaultAccessPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBackupVaultAccessPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBackupVaultAccessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the access policy document that is associated with the named backup vault.
      */
    def getBackupVaultAccessPolicy(params: GetBackupVaultAccessPolicyInput): awsDashSdkLib.libRequestMod.Request[GetBackupVaultAccessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBackupVaultAccessPolicy(
      params: GetBackupVaultAccessPolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBackupVaultAccessPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBackupVaultAccessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns event notifications for the specified backup vault.
      */
    def getBackupVaultNotifications(): awsDashSdkLib.libRequestMod.Request[GetBackupVaultNotificationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBackupVaultNotifications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBackupVaultNotificationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBackupVaultNotificationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns event notifications for the specified backup vault.
      */
    def getBackupVaultNotifications(params: GetBackupVaultNotificationsInput): awsDashSdkLib.libRequestMod.Request[GetBackupVaultNotificationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBackupVaultNotifications(
      params: GetBackupVaultNotificationsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBackupVaultNotificationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBackupVaultNotificationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns two sets of metadata key-value pairs. The first set lists the metadata that the recovery point was created with. The second set lists the metadata key-value pairs that are required to restore the recovery point. These sets can be the same, or the restore metadata set can contain different values if the target service to be restored has changed since the recovery point was created and now requires additional or different information in order to be restored.
      */
    def getRecoveryPointRestoreMetadata(): awsDashSdkLib.libRequestMod.Request[GetRecoveryPointRestoreMetadataOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRecoveryPointRestoreMetadata(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRecoveryPointRestoreMetadataOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRecoveryPointRestoreMetadataOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns two sets of metadata key-value pairs. The first set lists the metadata that the recovery point was created with. The second set lists the metadata key-value pairs that are required to restore the recovery point. These sets can be the same, or the restore metadata set can contain different values if the target service to be restored has changed since the recovery point was created and now requires additional or different information in order to be restored.
      */
    def getRecoveryPointRestoreMetadata(params: GetRecoveryPointRestoreMetadataInput): awsDashSdkLib.libRequestMod.Request[GetRecoveryPointRestoreMetadataOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRecoveryPointRestoreMetadata(
      params: GetRecoveryPointRestoreMetadataInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRecoveryPointRestoreMetadataOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRecoveryPointRestoreMetadataOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the AWS resource types supported by AWS Backup.
      */
    def getSupportedResourceTypes(): awsDashSdkLib.libRequestMod.Request[GetSupportedResourceTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSupportedResourceTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSupportedResourceTypesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSupportedResourceTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata about your backup jobs.
      */
    def listBackupJobs(): awsDashSdkLib.libRequestMod.Request[ListBackupJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBackupJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBackupJobsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBackupJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata about your backup jobs.
      */
    def listBackupJobs(params: ListBackupJobsInput): awsDashSdkLib.libRequestMod.Request[ListBackupJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBackupJobs(
      params: ListBackupJobsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBackupJobsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBackupJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata of your saved backup plan templates, including the template ID, name, and the creation and deletion dates.
      */
    def listBackupPlanTemplates(): awsDashSdkLib.libRequestMod.Request[ListBackupPlanTemplatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBackupPlanTemplates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBackupPlanTemplatesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBackupPlanTemplatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata of your saved backup plan templates, including the template ID, name, and the creation and deletion dates.
      */
    def listBackupPlanTemplates(params: ListBackupPlanTemplatesInput): awsDashSdkLib.libRequestMod.Request[ListBackupPlanTemplatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBackupPlanTemplates(
      params: ListBackupPlanTemplatesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBackupPlanTemplatesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBackupPlanTemplatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns version metadata of your backup plans, including Amazon Resource Names (ARNs), backup plan IDs, creation and deletion dates, plan names, and version IDs.
      */
    def listBackupPlanVersions(): awsDashSdkLib.libRequestMod.Request[ListBackupPlanVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBackupPlanVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBackupPlanVersionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBackupPlanVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns version metadata of your backup plans, including Amazon Resource Names (ARNs), backup plan IDs, creation and deletion dates, plan names, and version IDs.
      */
    def listBackupPlanVersions(params: ListBackupPlanVersionsInput): awsDashSdkLib.libRequestMod.Request[ListBackupPlanVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBackupPlanVersions(
      params: ListBackupPlanVersionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBackupPlanVersionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBackupPlanVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata of your saved backup plans, including Amazon Resource Names (ARNs), plan IDs, creation and deletion dates, version IDs, plan names, and creator request IDs.
      */
    def listBackupPlans(): awsDashSdkLib.libRequestMod.Request[ListBackupPlansOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBackupPlans(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBackupPlansOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBackupPlansOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata of your saved backup plans, including Amazon Resource Names (ARNs), plan IDs, creation and deletion dates, version IDs, plan names, and creator request IDs.
      */
    def listBackupPlans(params: ListBackupPlansInput): awsDashSdkLib.libRequestMod.Request[ListBackupPlansOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBackupPlans(
      params: ListBackupPlansInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBackupPlansOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBackupPlansOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array containing metadata of the resources associated with the target backup plan.
      */
    def listBackupSelections(): awsDashSdkLib.libRequestMod.Request[ListBackupSelectionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBackupSelections(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBackupSelectionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBackupSelectionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array containing metadata of the resources associated with the target backup plan.
      */
    def listBackupSelections(params: ListBackupSelectionsInput): awsDashSdkLib.libRequestMod.Request[ListBackupSelectionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBackupSelections(
      params: ListBackupSelectionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBackupSelectionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBackupSelectionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of recovery point storage containers along with information about them.
      */
    def listBackupVaults(): awsDashSdkLib.libRequestMod.Request[ListBackupVaultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBackupVaults(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBackupVaultsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBackupVaultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of recovery point storage containers along with information about them.
      */
    def listBackupVaults(params: ListBackupVaultsInput): awsDashSdkLib.libRequestMod.Request[ListBackupVaultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBackupVaults(
      params: ListBackupVaultsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBackupVaultsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBackupVaultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of resources successfully backed up by AWS Backup, including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
      */
    def listProtectedResources(): awsDashSdkLib.libRequestMod.Request[ListProtectedResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listProtectedResources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListProtectedResourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListProtectedResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of resources successfully backed up by AWS Backup, including the time the resource was saved, an Amazon Resource Name (ARN) of the resource, and a resource type.
      */
    def listProtectedResources(params: ListProtectedResourcesInput): awsDashSdkLib.libRequestMod.Request[ListProtectedResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listProtectedResources(
      params: ListProtectedResourcesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListProtectedResourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListProtectedResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns detailed information about the recovery points stored in a backup vault.
      */
    def listRecoveryPointsByBackupVault(): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRecoveryPointsByBackupVault(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRecoveryPointsByBackupVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns detailed information about the recovery points stored in a backup vault.
      */
    def listRecoveryPointsByBackupVault(params: ListRecoveryPointsByBackupVaultInput): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRecoveryPointsByBackupVault(
      params: ListRecoveryPointsByBackupVaultInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRecoveryPointsByBackupVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByBackupVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns detailed information about recovery points of the type specified by a resource Amazon Resource Name (ARN).
      */
    def listRecoveryPointsByResource(): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRecoveryPointsByResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRecoveryPointsByResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns detailed information about recovery points of the type specified by a resource Amazon Resource Name (ARN).
      */
    def listRecoveryPointsByResource(params: ListRecoveryPointsByResourceInput): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRecoveryPointsByResource(
      params: ListRecoveryPointsByResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRecoveryPointsByResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRecoveryPointsByResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of jobs that AWS Backup initiated to restore a saved resource, including metadata about the recovery process.
      */
    def listRestoreJobs(): awsDashSdkLib.libRequestMod.Request[ListRestoreJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRestoreJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRestoreJobsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRestoreJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of jobs that AWS Backup initiated to restore a saved resource, including metadata about the recovery process.
      */
    def listRestoreJobs(params: ListRestoreJobsInput): awsDashSdkLib.libRequestMod.Request[ListRestoreJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRestoreJobs(
      params: ListRestoreJobsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRestoreJobsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRestoreJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.
      */
    def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.
      */
    def listTags(params: ListTagsInput): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTags(
      params: ListTagsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets a resource-based policy that is used to manage access permissions on the target backup vault. Requires a backup vault name and an access policy document in JSON format.
      */
    def putBackupVaultAccessPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBackupVaultAccessPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets a resource-based policy that is used to manage access permissions on the target backup vault. Requires a backup vault name and an access policy document in JSON format.
      */
    def putBackupVaultAccessPolicy(params: PutBackupVaultAccessPolicyInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBackupVaultAccessPolicy(
      params: PutBackupVaultAccessPolicyInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Turns on notifications on a backup vault for the specified topic and events.
      */
    def putBackupVaultNotifications(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBackupVaultNotifications(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Turns on notifications on a backup vault for the specified topic and events.
      */
    def putBackupVaultNotifications(params: PutBackupVaultNotificationsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBackupVaultNotifications(
      params: PutBackupVaultNotificationsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts a job to create a one-time backup of the specified resource.
      */
    def startBackupJob(): awsDashSdkLib.libRequestMod.Request[StartBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startBackupJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartBackupJobOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts a job to create a one-time backup of the specified resource.
      */
    def startBackupJob(params: StartBackupJobInput): awsDashSdkLib.libRequestMod.Request[StartBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startBackupJob(
      params: StartBackupJobInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartBackupJobOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartBackupJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Recovers the saved resource identified by an Amazon Resource Name (ARN).  If the resource ARN is included in the request, then the last complete backup of that resource is recovered. If the ARN of a recovery point is supplied, then that recovery point is restored.
      */
    def startRestoreJob(): awsDashSdkLib.libRequestMod.Request[StartRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startRestoreJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartRestoreJobOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Recovers the saved resource identified by an Amazon Resource Name (ARN).  If the resource ARN is included in the request, then the last complete backup of that resource is recovered. If the ARN of a recovery point is supplied, then that recovery point is restored.
      */
    def startRestoreJob(params: StartRestoreJobInput): awsDashSdkLib.libRequestMod.Request[StartRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startRestoreJob(
      params: StartRestoreJobInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartRestoreJobOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartRestoreJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attempts to cancel a job to create a one-time backup of a resource.
      */
    def stopBackupJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopBackupJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attempts to cancel a job to create a one-time backup of a resource.
      */
    def stopBackupJob(params: StopBackupJobInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopBackupJob(
      params: StopBackupJobInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns a set of key-value pairs to a recovery point, backup plan, or backup vault identified by an Amazon Resource Name (ARN).
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns a set of key-value pairs to a recovery point, backup plan, or backup vault identified by an Amazon Resource Name (ARN).
      */
    def tagResource(params: TagResourceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a set of key-value pairs from a recovery point, backup plan, or backup vault identified by an Amazon Resource Name (ARN)
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a set of key-value pairs from a recovery point, backup plan, or backup vault identified by an Amazon Resource Name (ARN)
      */
    def untagResource(params: UntagResourceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the body of a saved backup plan identified by its backupPlanId with the input document in JSON format. The new version is uniquely identified by a VersionId.
      */
    def updateBackupPlan(): awsDashSdkLib.libRequestMod.Request[UpdateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateBackupPlan(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBackupPlanOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the body of a saved backup plan identified by its backupPlanId with the input document in JSON format. The new version is uniquely identified by a VersionId.
      */
    def updateBackupPlan(params: UpdateBackupPlanInput): awsDashSdkLib.libRequestMod.Request[UpdateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateBackupPlan(
      params: UpdateBackupPlanInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBackupPlanOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBackupPlanOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the transition lifecycle of a recovery point. The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
      */
    def updateRecoveryPointLifecycle(): awsDashSdkLib.libRequestMod.Request[UpdateRecoveryPointLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRecoveryPointLifecycle(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRecoveryPointLifecycleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRecoveryPointLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the transition lifecycle of a recovery point. The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
      */
    def updateRecoveryPointLifecycle(params: UpdateRecoveryPointLifecycleInput): awsDashSdkLib.libRequestMod.Request[UpdateRecoveryPointLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRecoveryPointLifecycle(
      params: UpdateRecoveryPointLifecycleInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRecoveryPointLifecycleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRecoveryPointLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceInput extends js.Object {
    /**
      * An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged resource.
      */
    var ResourceArn: ARN
    /**
      * A list of keys to identify which key-value tags to remove from a resource.
      */
    var TagKeyList: TagKeyList
  }
  
  trait UpdateBackupPlanInput extends js.Object {
    /**
      * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
      */
    var BackupPlan: BackupPlanInput
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: java.lang.String
  }
  
  trait UpdateBackupPlanOutput extends js.Object {
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
      */
    var BackupPlanArn: js.UndefOr[ARN] = js.undefined
    /**
      * Uniquely identifies a backup plan.
      */
    var BackupPlanId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The date and time a backup plan is updated, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
      */
    var CreationDate: js.UndefOr[timestamp] = js.undefined
    /**
      * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version Ids cannot be edited.
      */
    var VersionId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait UpdateRecoveryPointLifecycleInput extends js.Object {
    /**
      * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
      */
    var BackupVaultName: BackupVaultName
    /**
      * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
      */
    var Lifecycle: js.UndefOr[Lifecycle] = js.undefined
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: ARN
  }
  
  trait UpdateRecoveryPointLifecycleOutput extends js.Object {
    /**
      * An ARN that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
      */
    var BackupVaultArn: js.UndefOr[ARN] = js.undefined
    /**
      * A CalculatedLifecycle object containing DeleteAt and MoveToColdStorageAt timestamps.
      */
    var CalculatedLifecycle: js.UndefOr[CalculatedLifecycle] = js.undefined
    /**
      * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
      */
    var Lifecycle: js.UndefOr[Lifecycle] = js.undefined
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
      */
    var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
  }
  
  trait _BackupJobState extends js.Object
  
  trait _BackupVaultEvent extends js.Object
  
  trait _RecoveryPointStatus extends js.Object
  
  trait _RestoreJobStatus extends js.Object
  
  trait _StorageClass extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ARN = java.lang.String
  type BackupJobState = _BackupJobState | java.lang.String
  type BackupJobsList = js.Array[BackupJob]
  type BackupPlanName = java.lang.String
  type BackupPlanTemplatesList = js.Array[BackupPlanTemplatesListMember]
  type BackupPlanVersionsList = js.Array[BackupPlansListMember]
  type BackupPlansList = js.Array[BackupPlansListMember]
  type BackupRuleName = java.lang.String
  type BackupRules = js.Array[BackupRule]
  type BackupRulesInput = js.Array[BackupRuleInput]
  type BackupSelectionName = java.lang.String
  type BackupSelectionsList = js.Array[BackupSelectionsListMember]
  type BackupVaultEvent = _BackupVaultEvent | java.lang.String
  type BackupVaultEvents = js.Array[BackupVaultEvent]
  type BackupVaultList = js.Array[BackupVaultListMember]
  type BackupVaultName = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConditionKey = java.lang.String
  type ConditionType = awsDashSdkLib.awsDashSdkLibStrings.STRINGEQUALS | java.lang.String
  type ConditionValue = java.lang.String
  type CronExpression = java.lang.String
  type IAMPolicy = java.lang.String
  type IAMRoleArn = java.lang.String
  type ListOfTags = js.Array[Condition]
  type Long = scala.Double
  type MaxResults = scala.Double
  type MetadataKey = java.lang.String
  type MetadataValue = java.lang.String
  type ProtectedResourcesList = js.Array[ProtectedResource]
  type RecoveryPointByBackupVaultList = js.Array[RecoveryPointByBackupVault]
  type RecoveryPointByResourceList = js.Array[RecoveryPointByResource]
  type RecoveryPointStatus = _RecoveryPointStatus | java.lang.String
  type ResourceArns = js.Array[ARN]
  type ResourceType = java.lang.String
  type ResourceTypes = js.Array[ResourceType]
  type RestoreJobId = java.lang.String
  type RestoreJobStatus = _RestoreJobStatus | java.lang.String
  type RestoreJobsList = js.Array[RestoreJobsListMember]
  type StorageClass = _StorageClass | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[java.lang.String]
  type TagValue = java.lang.String
  type WindowMinutes = scala.Double
  type apiVersion = _apiVersion | java.lang.String
  type long = scala.Double
  type timestamp = stdLib.Date
}


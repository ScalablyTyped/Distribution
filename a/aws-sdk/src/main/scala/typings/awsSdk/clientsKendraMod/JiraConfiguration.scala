package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JiraConfiguration extends StObject {
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira attachments to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For more information, see  Mapping data source fields. The Jira data source field names must exist in your Jira custom metadata.
    */
  var AttachmentFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira comments to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For more information, see  Mapping data source fields. The Jira data source field names must exist in your Jira custom metadata.
    */
  var CommentFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of regular expression patterns to exclude certain file paths, file names, and file types in your Jira data source. Files that match the patterns are excluded from the index. Files that don’t match the patterns are included in the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence and the file isn't included in the index.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain file paths, file names, and file types in your Jira data source. Files that match the patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence and the file isn't included in the index.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira issues to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For more information, see  Mapping data source fields. The Jira data source field names must exist in your Jira custom metadata.
    */
  var IssueFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * Specify whether to crawl comments, attachments, and work logs. You can specify one or more of these options.
    */
  var IssueSubEntityFilter: js.UndefOr[typings.awsSdk.clientsKendraMod.IssueSubEntityFilter] = js.undefined
  
  /**
    * Specify which issue types to crawl in your Jira data source. You can specify one or more of these options to crawl.
    */
  var IssueType: js.UndefOr[typings.awsSdk.clientsKendraMod.IssueType] = js.undefined
  
  /**
    * The URL of the Jira account. For example, company.atlassian.net or https://jira.company.com. You can find your Jira account URL in the URL of your profile page for Jira desktop.
    */
  var JiraAccountUrl: typings.awsSdk.clientsKendraMod.JiraAccountUrl
  
  /**
    * Specify which projects to crawl in your Jira data source. You can specify one or more Jira project IDs.
    */
  var Project: js.UndefOr[typings.awsSdk.clientsKendraMod.Project] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira projects to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For more information, see  Mapping data source fields. The Jira data source field names must exist in your Jira custom metadata.
    */
  var ProjectFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a secret in Secrets Manager contains the key-value pairs required to connect to your Jira data source. The secret must contain a JSON structure with the following keys:   jiraId—The Jira username.   jiraCredentials—The Jira API token. For more information on creating an API token in Jira, see  Authentication for a Jira data source.  
    */
  var SecretArn: typings.awsSdk.clientsKendraMod.SecretArn
  
  /**
    * Specify which statuses to crawl in your Jira data source. You can specify one or more of these options to crawl.
    */
  var Status: js.UndefOr[JiraStatus] = js.undefined
  
  /**
    *  TRUE to use the Jira change log to determine which documents require updating in the index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to scan all of your documents in Jira.
    */
  var UseChangeLog: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configuration information for an Amazon Virtual Private Cloud to connect to your Jira. Your Jira account must reside inside your VPC.
    */
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira work logs to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For more information, see  Mapping data source fields. The Jira data source field names must exist in your Jira custom metadata.
    */
  var WorkLogFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
}
object JiraConfiguration {
  
  inline def apply(JiraAccountUrl: JiraAccountUrl, SecretArn: SecretArn): JiraConfiguration = {
    val __obj = js.Dynamic.literal(JiraAccountUrl = JiraAccountUrl.asInstanceOf[js.Any], SecretArn = SecretArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[JiraConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JiraConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAttachmentFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "AttachmentFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setAttachmentFieldMappingsUndefined: Self = StObject.set(x, "AttachmentFieldMappings", js.undefined)
    
    inline def setAttachmentFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "AttachmentFieldMappings", js.Array(value*))
    
    inline def setCommentFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "CommentFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setCommentFieldMappingsUndefined: Self = StObject.set(x, "CommentFieldMappings", js.undefined)
    
    inline def setCommentFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "CommentFieldMappings", js.Array(value*))
    
    inline def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    inline def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value*))
    
    inline def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    inline def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value*))
    
    inline def setIssueFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "IssueFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setIssueFieldMappingsUndefined: Self = StObject.set(x, "IssueFieldMappings", js.undefined)
    
    inline def setIssueFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "IssueFieldMappings", js.Array(value*))
    
    inline def setIssueSubEntityFilter(value: IssueSubEntityFilter): Self = StObject.set(x, "IssueSubEntityFilter", value.asInstanceOf[js.Any])
    
    inline def setIssueSubEntityFilterUndefined: Self = StObject.set(x, "IssueSubEntityFilter", js.undefined)
    
    inline def setIssueSubEntityFilterVarargs(value: IssueSubEntity*): Self = StObject.set(x, "IssueSubEntityFilter", js.Array(value*))
    
    inline def setIssueType(value: IssueType): Self = StObject.set(x, "IssueType", value.asInstanceOf[js.Any])
    
    inline def setIssueTypeUndefined: Self = StObject.set(x, "IssueType", js.undefined)
    
    inline def setIssueTypeVarargs(value: String*): Self = StObject.set(x, "IssueType", js.Array(value*))
    
    inline def setJiraAccountUrl(value: JiraAccountUrl): Self = StObject.set(x, "JiraAccountUrl", value.asInstanceOf[js.Any])
    
    inline def setProject(value: Project): Self = StObject.set(x, "Project", value.asInstanceOf[js.Any])
    
    inline def setProjectFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "ProjectFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setProjectFieldMappingsUndefined: Self = StObject.set(x, "ProjectFieldMappings", js.undefined)
    
    inline def setProjectFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "ProjectFieldMappings", js.Array(value*))
    
    inline def setProjectUndefined: Self = StObject.set(x, "Project", js.undefined)
    
    inline def setProjectVarargs(value: String*): Self = StObject.set(x, "Project", js.Array(value*))
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: JiraStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStatusVarargs(value: String*): Self = StObject.set(x, "Status", js.Array(value*))
    
    inline def setUseChangeLog(value: Boolean): Self = StObject.set(x, "UseChangeLog", value.asInstanceOf[js.Any])
    
    inline def setUseChangeLogUndefined: Self = StObject.set(x, "UseChangeLog", js.undefined)
    
    inline def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
    
    inline def setWorkLogFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "WorkLogFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setWorkLogFieldMappingsUndefined: Self = StObject.set(x, "WorkLogFieldMappings", js.undefined)
    
    inline def setWorkLogFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "WorkLogFieldMappings", js.Array(value*))
  }
}

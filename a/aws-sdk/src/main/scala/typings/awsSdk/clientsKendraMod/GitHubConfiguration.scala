package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitHubConfiguration extends StObject {
  
  /**
    * A list of regular expression patterns to exclude certain file names in your GitHub repository or repositories. File names that match the patterns are excluded from the index. File names that don't match the patterns are included in the index. If a file matches both an exclusion and inclusion pattern, the exclusion pattern takes precedence and the file isn't included in the index.
    */
  var ExclusionFileNamePatterns: js.UndefOr[StringList] = js.undefined
  
  /**
    * A list of regular expression patterns to exclude certain file types in your GitHub repository or repositories. File types that match the patterns are excluded from the index. File types that don't match the patterns are included in the index. If a file matches both an exclusion and inclusion pattern, the exclusion pattern takes precedence and the file isn't included in the index.
    */
  var ExclusionFileTypePatterns: js.UndefOr[StringList] = js.undefined
  
  /**
    * A list of regular expression patterns to exclude certain folder names in your GitHub repository or repositories. Folder names that match the patterns are excluded from the index. Folder names that don't match the patterns are included in the index. If a folder matches both an exclusion and inclusion pattern, the exclusion pattern takes precedence and the folder isn't included in the index.
    */
  var ExclusionFolderNamePatterns: js.UndefOr[StringList] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of GitHub commits to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to GitHub fields. For more information, see Mapping data source fields. The GitHub data source field names must exist in your GitHub custom metadata.
    */
  var GitHubCommitConfigurationFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * Configuration information to include certain types of GitHub content. You can configure to index repository files only, or also include issues and pull requests, comments, and comment attachments.
    */
  var GitHubDocumentCrawlProperties: js.UndefOr[typings.awsSdk.clientsKendraMod.GitHubDocumentCrawlProperties] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of GitHub issue attachments to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to GitHub fields. For more information, see Mapping data source fields. The GitHub data source field names must exist in your GitHub custom metadata.
    */
  var GitHubIssueAttachmentConfigurationFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of GitHub issue comments to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to GitHub fields. For more information, see Mapping data source fields. The GitHub data source field names must exist in your GitHub custom metadata.
    */
  var GitHubIssueCommentConfigurationFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of GitHub issues to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to GitHub fields. For more information, see Mapping data source fields. The GitHub data source field names must exist in your GitHub custom metadata.
    */
  var GitHubIssueDocumentConfigurationFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of GitHub pull request comments to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to GitHub fields. For more information, see Mapping data source fields. The GitHub data source field names must exist in your GitHub custom metadata.
    */
  var GitHubPullRequestCommentConfigurationFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of GitHub pull request attachments to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to GitHub fields. For more information, see Mapping data source fields. The GitHub data source field names must exist in your GitHub custom metadata.
    */
  var GitHubPullRequestDocumentAttachmentConfigurationFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of GitHub pull requests to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to GitHub fields. For more information, see Mapping data source fields. The GitHub data source field names must exist in your GitHub custom metadata.
    */
  var GitHubPullRequestDocumentConfigurationFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map GitHub repository attributes or field names to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to GitHub fields. For more information, see Mapping data source fields. The GitHub data source field names must exist in your GitHub custom metadata.
    */
  var GitHubRepositoryConfigurationFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain file names in your GitHub repository or repositories. File names that match the patterns are included in the index. File names that don't match the patterns are excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't included in the index.
    */
  var InclusionFileNamePatterns: js.UndefOr[StringList] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain file types in your GitHub repository or repositories. File types that match the patterns are included in the index. File types that don't match the patterns are excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't included in the index.
    */
  var InclusionFileTypePatterns: js.UndefOr[StringList] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain folder names in your GitHub repository or repositories. Folder names that match the patterns are included in the index. Folder names that don't match the patterns are excluded from the index. If a folder matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the folder isn't included in the index.
    */
  var InclusionFolderNamePatterns: js.UndefOr[StringList] = js.undefined
  
  /**
    * Configuration information to connect to GitHub Enterprise Server (on premises).
    */
  var OnPremiseConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.OnPremiseConfiguration] = js.undefined
  
  /**
    * A list of names of the specific repositories you want to index.
    */
  var RepositoryFilter: js.UndefOr[RepositoryNames] = js.undefined
  
  /**
    * Configuration information to connect to GitHub Enterprise Cloud (SaaS).
    */
  var SaaSConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.SaaSConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect to your GitHub. The secret must contain a JSON structure with the following keys:   githubToken—The access token created in GitHub. For more information on creating a token in GitHub, see Authentication for a GitHub data source.  
    */
  var SecretArn: typings.awsSdk.clientsKendraMod.SecretArn
  
  /**
    * The type of GitHub service you want to connect to—GitHub Enterprise Cloud (SaaS) or GitHub Enterprise Server (on premises).
    */
  var Type: js.UndefOr[typings.awsSdk.clientsKendraMod.Type] = js.undefined
  
  /**
    *  TRUE to use the GitHub change log to determine which documents require updating in the index. Depending on the GitHub change log's size, it may take longer for Amazon Kendra to use the change log than to scan all of your documents in GitHub.
    */
  var UseChangeLog: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configuration information of an Amazon Virtual Private Cloud to connect to your GitHub. For more information, see Configuring a VPC.
    */
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
}
object GitHubConfiguration {
  
  inline def apply(SecretArn: SecretArn): GitHubConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitHubConfiguration]
  }
  
  extension [Self <: GitHubConfiguration](x: Self) {
    
    inline def setExclusionFileNamePatterns(value: StringList): Self = StObject.set(x, "ExclusionFileNamePatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionFileNamePatternsUndefined: Self = StObject.set(x, "ExclusionFileNamePatterns", js.undefined)
    
    inline def setExclusionFileNamePatternsVarargs(value: String*): Self = StObject.set(x, "ExclusionFileNamePatterns", js.Array(value*))
    
    inline def setExclusionFileTypePatterns(value: StringList): Self = StObject.set(x, "ExclusionFileTypePatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionFileTypePatternsUndefined: Self = StObject.set(x, "ExclusionFileTypePatterns", js.undefined)
    
    inline def setExclusionFileTypePatternsVarargs(value: String*): Self = StObject.set(x, "ExclusionFileTypePatterns", js.Array(value*))
    
    inline def setExclusionFolderNamePatterns(value: StringList): Self = StObject.set(x, "ExclusionFolderNamePatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionFolderNamePatternsUndefined: Self = StObject.set(x, "ExclusionFolderNamePatterns", js.undefined)
    
    inline def setExclusionFolderNamePatternsVarargs(value: String*): Self = StObject.set(x, "ExclusionFolderNamePatterns", js.Array(value*))
    
    inline def setGitHubCommitConfigurationFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "GitHubCommitConfigurationFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setGitHubCommitConfigurationFieldMappingsUndefined: Self = StObject.set(x, "GitHubCommitConfigurationFieldMappings", js.undefined)
    
    inline def setGitHubCommitConfigurationFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "GitHubCommitConfigurationFieldMappings", js.Array(value*))
    
    inline def setGitHubDocumentCrawlProperties(value: GitHubDocumentCrawlProperties): Self = StObject.set(x, "GitHubDocumentCrawlProperties", value.asInstanceOf[js.Any])
    
    inline def setGitHubDocumentCrawlPropertiesUndefined: Self = StObject.set(x, "GitHubDocumentCrawlProperties", js.undefined)
    
    inline def setGitHubIssueAttachmentConfigurationFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "GitHubIssueAttachmentConfigurationFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setGitHubIssueAttachmentConfigurationFieldMappingsUndefined: Self = StObject.set(x, "GitHubIssueAttachmentConfigurationFieldMappings", js.undefined)
    
    inline def setGitHubIssueAttachmentConfigurationFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "GitHubIssueAttachmentConfigurationFieldMappings", js.Array(value*))
    
    inline def setGitHubIssueCommentConfigurationFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "GitHubIssueCommentConfigurationFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setGitHubIssueCommentConfigurationFieldMappingsUndefined: Self = StObject.set(x, "GitHubIssueCommentConfigurationFieldMappings", js.undefined)
    
    inline def setGitHubIssueCommentConfigurationFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "GitHubIssueCommentConfigurationFieldMappings", js.Array(value*))
    
    inline def setGitHubIssueDocumentConfigurationFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "GitHubIssueDocumentConfigurationFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setGitHubIssueDocumentConfigurationFieldMappingsUndefined: Self = StObject.set(x, "GitHubIssueDocumentConfigurationFieldMappings", js.undefined)
    
    inline def setGitHubIssueDocumentConfigurationFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "GitHubIssueDocumentConfigurationFieldMappings", js.Array(value*))
    
    inline def setGitHubPullRequestCommentConfigurationFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "GitHubPullRequestCommentConfigurationFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setGitHubPullRequestCommentConfigurationFieldMappingsUndefined: Self = StObject.set(x, "GitHubPullRequestCommentConfigurationFieldMappings", js.undefined)
    
    inline def setGitHubPullRequestCommentConfigurationFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "GitHubPullRequestCommentConfigurationFieldMappings", js.Array(value*))
    
    inline def setGitHubPullRequestDocumentAttachmentConfigurationFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "GitHubPullRequestDocumentAttachmentConfigurationFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setGitHubPullRequestDocumentAttachmentConfigurationFieldMappingsUndefined: Self = StObject.set(x, "GitHubPullRequestDocumentAttachmentConfigurationFieldMappings", js.undefined)
    
    inline def setGitHubPullRequestDocumentAttachmentConfigurationFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "GitHubPullRequestDocumentAttachmentConfigurationFieldMappings", js.Array(value*))
    
    inline def setGitHubPullRequestDocumentConfigurationFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "GitHubPullRequestDocumentConfigurationFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setGitHubPullRequestDocumentConfigurationFieldMappingsUndefined: Self = StObject.set(x, "GitHubPullRequestDocumentConfigurationFieldMappings", js.undefined)
    
    inline def setGitHubPullRequestDocumentConfigurationFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "GitHubPullRequestDocumentConfigurationFieldMappings", js.Array(value*))
    
    inline def setGitHubRepositoryConfigurationFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "GitHubRepositoryConfigurationFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setGitHubRepositoryConfigurationFieldMappingsUndefined: Self = StObject.set(x, "GitHubRepositoryConfigurationFieldMappings", js.undefined)
    
    inline def setGitHubRepositoryConfigurationFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "GitHubRepositoryConfigurationFieldMappings", js.Array(value*))
    
    inline def setInclusionFileNamePatterns(value: StringList): Self = StObject.set(x, "InclusionFileNamePatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionFileNamePatternsUndefined: Self = StObject.set(x, "InclusionFileNamePatterns", js.undefined)
    
    inline def setInclusionFileNamePatternsVarargs(value: String*): Self = StObject.set(x, "InclusionFileNamePatterns", js.Array(value*))
    
    inline def setInclusionFileTypePatterns(value: StringList): Self = StObject.set(x, "InclusionFileTypePatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionFileTypePatternsUndefined: Self = StObject.set(x, "InclusionFileTypePatterns", js.undefined)
    
    inline def setInclusionFileTypePatternsVarargs(value: String*): Self = StObject.set(x, "InclusionFileTypePatterns", js.Array(value*))
    
    inline def setInclusionFolderNamePatterns(value: StringList): Self = StObject.set(x, "InclusionFolderNamePatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionFolderNamePatternsUndefined: Self = StObject.set(x, "InclusionFolderNamePatterns", js.undefined)
    
    inline def setInclusionFolderNamePatternsVarargs(value: String*): Self = StObject.set(x, "InclusionFolderNamePatterns", js.Array(value*))
    
    inline def setOnPremiseConfiguration(value: OnPremiseConfiguration): Self = StObject.set(x, "OnPremiseConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOnPremiseConfigurationUndefined: Self = StObject.set(x, "OnPremiseConfiguration", js.undefined)
    
    inline def setRepositoryFilter(value: RepositoryNames): Self = StObject.set(x, "RepositoryFilter", value.asInstanceOf[js.Any])
    
    inline def setRepositoryFilterUndefined: Self = StObject.set(x, "RepositoryFilter", js.undefined)
    
    inline def setRepositoryFilterVarargs(value: RepositoryName*): Self = StObject.set(x, "RepositoryFilter", js.Array(value*))
    
    inline def setSaaSConfiguration(value: SaaSConfiguration): Self = StObject.set(x, "SaaSConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSaaSConfigurationUndefined: Self = StObject.set(x, "SaaSConfiguration", js.undefined)
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUseChangeLog(value: Boolean): Self = StObject.set(x, "UseChangeLog", value.asInstanceOf[js.Any])
    
    inline def setUseChangeLogUndefined: Self = StObject.set(x, "UseChangeLog", js.undefined)
    
    inline def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}

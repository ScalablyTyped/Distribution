package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlackConfiguration extends StObject {
  
  /**
    *  TRUE to index bot messages from your Slack workspace team.
    */
  var CrawlBotMessage: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE to exclude archived messages to index from your Slack workspace team.
    */
  var ExcludeArchived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of regular expression patterns to exclude certain attached files in your Slack workspace team. Files that match the patterns are excluded from the index. Files that don’t match the patterns are included in the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't included in the index.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map Slack data source attributes or field names to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Slack fields. For more information, see Mapping data source fields. The Slack data source field names must exist in your Slack custom metadata.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain attached files in your Slack workspace team. Files that match the patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't included in the index.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * The number of hours for change log to look back from when you last synchronized your data. You can look back up to 7 days or 168 hours. Change log updates your index only if new content was added since you last synced your data. Updated or deleted content from before you last synced does not get updated in your index. To capture updated or deleted content before you last synced, set the LookBackPeriod to the number of hours you want change log to look back.
    */
  var LookBackPeriod: js.UndefOr[typings.awsSdk.clientsKendraMod.LookBackPeriod] = js.undefined
  
  /**
    * The list of private channel names from your Slack workspace team. You use this if you want to index specific private channels, not all private channels. You can also use regular expression patterns to filter private channels.
    */
  var PrivateChannelFilter: js.UndefOr[typings.awsSdk.clientsKendraMod.PrivateChannelFilter] = js.undefined
  
  /**
    * The list of public channel names to index from your Slack workspace team. You use this if you want to index specific public channels, not all public channels. You can also use regular expression patterns to filter public channels.
    */
  var PublicChannelFilter: js.UndefOr[typings.awsSdk.clientsKendraMod.PublicChannelFilter] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect to your Slack workspace team. The secret must contain a JSON structure with the following keys:   slackToken—The user or bot token created in Slack. For more information on creating a token in Slack, see Authentication for a Slack data source.  
    */
  var SecretArn: typings.awsSdk.clientsKendraMod.SecretArn
  
  /**
    * The date to start crawling your data from your Slack workspace team. The date must follow this format: yyyy-mm-dd.
    */
  var SinceCrawlDate: typings.awsSdk.clientsKendraMod.SinceCrawlDate
  
  /**
    * Specify whether to index public channels, private channels, group messages, and direct messages. You can specify one or more of these options.
    */
  var SlackEntityList: typings.awsSdk.clientsKendraMod.SlackEntityList
  
  /**
    * The identifier of the team in the Slack workspace. For example, T0123456789. You can find your team ID in the URL of the main page of your Slack workspace. When you log in to Slack via a browser, you are directed to the URL of the main page. For example, https://app.slack.com/client/T0123456789/....
    */
  var TeamId: typings.awsSdk.clientsKendraMod.TeamId
  
  /**
    *  TRUE to use the Slack change log to determine which documents require updating in the index. Depending on the Slack change log's size, it may take longer for Amazon Kendra to use the change log than to scan all of your documents in Slack.
    */
  var UseChangeLog: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configuration information for an Amazon Virtual Private Cloud to connect to your Slack. For more information, see Configuring a VPC.
    */
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
}
object SlackConfiguration {
  
  inline def apply(
    SecretArn: SecretArn,
    SinceCrawlDate: SinceCrawlDate,
    SlackEntityList: SlackEntityList,
    TeamId: TeamId
  ): SlackConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any], SinceCrawlDate = SinceCrawlDate.asInstanceOf[js.Any], SlackEntityList = SlackEntityList.asInstanceOf[js.Any], TeamId = TeamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlackConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlackConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCrawlBotMessage(value: Boolean): Self = StObject.set(x, "CrawlBotMessage", value.asInstanceOf[js.Any])
    
    inline def setCrawlBotMessageUndefined: Self = StObject.set(x, "CrawlBotMessage", js.undefined)
    
    inline def setExcludeArchived(value: Boolean): Self = StObject.set(x, "ExcludeArchived", value.asInstanceOf[js.Any])
    
    inline def setExcludeArchivedUndefined: Self = StObject.set(x, "ExcludeArchived", js.undefined)
    
    inline def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    inline def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value*))
    
    inline def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    inline def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    inline def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value*))
    
    inline def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    inline def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value*))
    
    inline def setLookBackPeriod(value: LookBackPeriod): Self = StObject.set(x, "LookBackPeriod", value.asInstanceOf[js.Any])
    
    inline def setLookBackPeriodUndefined: Self = StObject.set(x, "LookBackPeriod", js.undefined)
    
    inline def setPrivateChannelFilter(value: PrivateChannelFilter): Self = StObject.set(x, "PrivateChannelFilter", value.asInstanceOf[js.Any])
    
    inline def setPrivateChannelFilterUndefined: Self = StObject.set(x, "PrivateChannelFilter", js.undefined)
    
    inline def setPrivateChannelFilterVarargs(value: String*): Self = StObject.set(x, "PrivateChannelFilter", js.Array(value*))
    
    inline def setPublicChannelFilter(value: PublicChannelFilter): Self = StObject.set(x, "PublicChannelFilter", value.asInstanceOf[js.Any])
    
    inline def setPublicChannelFilterUndefined: Self = StObject.set(x, "PublicChannelFilter", js.undefined)
    
    inline def setPublicChannelFilterVarargs(value: String*): Self = StObject.set(x, "PublicChannelFilter", js.Array(value*))
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSinceCrawlDate(value: SinceCrawlDate): Self = StObject.set(x, "SinceCrawlDate", value.asInstanceOf[js.Any])
    
    inline def setSlackEntityList(value: SlackEntityList): Self = StObject.set(x, "SlackEntityList", value.asInstanceOf[js.Any])
    
    inline def setSlackEntityListVarargs(value: SlackEntity*): Self = StObject.set(x, "SlackEntityList", js.Array(value*))
    
    inline def setTeamId(value: TeamId): Self = StObject.set(x, "TeamId", value.asInstanceOf[js.Any])
    
    inline def setUseChangeLog(value: Boolean): Self = StObject.set(x, "UseChangeLog", value.asInstanceOf[js.Any])
    
    inline def setUseChangeLogUndefined: Self = StObject.set(x, "UseChangeLog", js.undefined)
    
    inline def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}

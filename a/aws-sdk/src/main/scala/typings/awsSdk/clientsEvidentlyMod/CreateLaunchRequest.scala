package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLaunchRequest extends StObject {
  
  /**
    * An optional description for the launch.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * An array of structures that contains the feature and variations that are to be used for the launch.
    */
  var groups: LaunchGroupConfigList
  
  /**
    * An array of structures that define the metrics that will be used to monitor the launch performance.
    */
  var metricMonitors: js.UndefOr[MetricMonitorConfigList] = js.undefined
  
  /**
    * The name for the new launch.
    */
  var name: LaunchName
  
  /**
    * The name or ARN of the project that you want to create the launch in.
    */
  var project: ProjectRef
  
  /**
    * When Evidently assigns a particular user session to a launch, it must use a randomization ID to determine which variation the user session is served. This randomization ID is a combination of the entity ID and randomizationSalt. If you omit randomizationSalt, Evidently uses the launch name as the randomizationSalt.
    */
  var randomizationSalt: js.UndefOr[RandomizationSalt] = js.undefined
  
  /**
    * An array of structures that define the traffic allocation percentages among the feature variations during each step of the launch.
    */
  var scheduledSplitsConfig: js.UndefOr[ScheduledSplitsLaunchConfig] = js.undefined
  
  /**
    * Assigns one or more tags (key-value pairs) to the launch. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters.  &lt;p&gt;You can associate as many as 50 tags with a launch.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateLaunchRequest {
  
  inline def apply(groups: LaunchGroupConfigList, name: LaunchName, project: ProjectRef): CreateLaunchRequest = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLaunchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLaunchRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroups(value: LaunchGroupConfigList): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: LaunchGroupConfig*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setMetricMonitors(value: MetricMonitorConfigList): Self = StObject.set(x, "metricMonitors", value.asInstanceOf[js.Any])
    
    inline def setMetricMonitorsUndefined: Self = StObject.set(x, "metricMonitors", js.undefined)
    
    inline def setMetricMonitorsVarargs(value: MetricMonitorConfig*): Self = StObject.set(x, "metricMonitors", js.Array(value*))
    
    inline def setName(value: LaunchName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRandomizationSalt(value: RandomizationSalt): Self = StObject.set(x, "randomizationSalt", value.asInstanceOf[js.Any])
    
    inline def setRandomizationSaltUndefined: Self = StObject.set(x, "randomizationSalt", js.undefined)
    
    inline def setScheduledSplitsConfig(value: ScheduledSplitsLaunchConfig): Self = StObject.set(x, "scheduledSplitsConfig", value.asInstanceOf[js.Any])
    
    inline def setScheduledSplitsConfigUndefined: Self = StObject.set(x, "scheduledSplitsConfig", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}

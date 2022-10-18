package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComposeEnvironmentsMessage extends StObject {
  
  /**
    * The name of the application to which the specified source bundles belong.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  
  /**
    * The name of the group to which the target environments belong. Specify a group name only if the environment name defined in each target environment's manifest ends with a + (plus) character. See Environment Manifest (env.yaml) for details.
    */
  var GroupName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.GroupName] = js.undefined
  
  /**
    * A list of version labels, specifying one or more application source bundles that belong to the target application. Each source bundle must include an environment manifest that specifies the name of the environment and the name of the solution stack to use, and optionally can specify environment links to create.
    */
  var VersionLabels: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.VersionLabels] = js.undefined
}
object ComposeEnvironmentsMessage {
  
  inline def apply(): ComposeEnvironmentsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposeEnvironmentsMessage]
  }
  
  extension [Self <: ComposeEnvironmentsMessage](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "ApplicationName", js.undefined)
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setVersionLabels(value: VersionLabels): Self = StObject.set(x, "VersionLabels", value.asInstanceOf[js.Any])
    
    inline def setVersionLabelsUndefined: Self = StObject.set(x, "VersionLabels", js.undefined)
    
    inline def setVersionLabelsVarargs(value: VersionLabel*): Self = StObject.set(x, "VersionLabels", js.Array(value*))
  }
}

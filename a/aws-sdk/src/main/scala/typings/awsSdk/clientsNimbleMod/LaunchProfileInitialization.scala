package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchProfileInitialization extends StObject {
  
  /**
    * A LaunchProfileInitializationActiveDirectory resource.
    */
  var activeDirectory: js.UndefOr[LaunchProfileInitializationActiveDirectory] = js.undefined
  
  /**
    * The EC2 security groups that control access to the studio component.
    */
  var ec2SecurityGroupIds: js.UndefOr[LaunchProfileSecurityGroupIdList] = js.undefined
  
  /**
    * The launch profile ID.
    */
  var launchProfileId: js.UndefOr[LaunchProfileId] = js.undefined
  
  /**
    * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
    */
  var launchProfileProtocolVersion: js.UndefOr[LaunchProfileProtocolVersion] = js.undefined
  
  /**
    * The launch purpose.
    */
  var launchPurpose: js.UndefOr[LaunchPurpose] = js.undefined
  
  /**
    * The name for the launch profile.
    */
  var name: js.UndefOr[LaunchProfileName] = js.undefined
  
  /**
    * The platform of the launch platform, either WINDOWS or LINUX.
    */
  var platform: js.UndefOr[LaunchProfilePlatform] = js.undefined
  
  /**
    * The system initializtion scripts.
    */
  var systemInitializationScripts: js.UndefOr[LaunchProfileInitializationScriptList] = js.undefined
  
  /**
    * The user initializtion scripts.
    */
  var userInitializationScripts: js.UndefOr[LaunchProfileInitializationScriptList] = js.undefined
}
object LaunchProfileInitialization {
  
  inline def apply(): LaunchProfileInitialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchProfileInitialization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchProfileInitialization] (val x: Self) extends AnyVal {
    
    inline def setActiveDirectory(value: LaunchProfileInitializationActiveDirectory): Self = StObject.set(x, "activeDirectory", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryUndefined: Self = StObject.set(x, "activeDirectory", js.undefined)
    
    inline def setEc2SecurityGroupIds(value: LaunchProfileSecurityGroupIdList): Self = StObject.set(x, "ec2SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setEc2SecurityGroupIdsUndefined: Self = StObject.set(x, "ec2SecurityGroupIds", js.undefined)
    
    inline def setEc2SecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "ec2SecurityGroupIds", js.Array(value*))
    
    inline def setLaunchProfileId(value: LaunchProfileId): Self = StObject.set(x, "launchProfileId", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileIdUndefined: Self = StObject.set(x, "launchProfileId", js.undefined)
    
    inline def setLaunchProfileProtocolVersion(value: LaunchProfileProtocolVersion): Self = StObject.set(x, "launchProfileProtocolVersion", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileProtocolVersionUndefined: Self = StObject.set(x, "launchProfileProtocolVersion", js.undefined)
    
    inline def setLaunchPurpose(value: LaunchPurpose): Self = StObject.set(x, "launchPurpose", value.asInstanceOf[js.Any])
    
    inline def setLaunchPurposeUndefined: Self = StObject.set(x, "launchPurpose", js.undefined)
    
    inline def setName(value: LaunchProfileName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlatform(value: LaunchProfilePlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setSystemInitializationScripts(value: LaunchProfileInitializationScriptList): Self = StObject.set(x, "systemInitializationScripts", value.asInstanceOf[js.Any])
    
    inline def setSystemInitializationScriptsUndefined: Self = StObject.set(x, "systemInitializationScripts", js.undefined)
    
    inline def setSystemInitializationScriptsVarargs(value: LaunchProfileInitializationScript*): Self = StObject.set(x, "systemInitializationScripts", js.Array(value*))
    
    inline def setUserInitializationScripts(value: LaunchProfileInitializationScriptList): Self = StObject.set(x, "userInitializationScripts", value.asInstanceOf[js.Any])
    
    inline def setUserInitializationScriptsUndefined: Self = StObject.set(x, "userInitializationScripts", js.undefined)
    
    inline def setUserInitializationScriptsVarargs(value: LaunchProfileInitializationScript*): Self = StObject.set(x, "userInitializationScripts", js.Array(value*))
  }
}

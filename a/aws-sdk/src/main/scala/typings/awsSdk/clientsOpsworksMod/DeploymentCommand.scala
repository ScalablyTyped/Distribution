package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentCommand extends StObject {
  
  /**
    * The arguments of those commands that take arguments. It should be set to a JSON object with the following format:  {"arg_name1" : ["value1", "value2", ...], "arg_name2" : ["value1", "value2", ...], ...}  The update_dependencies command takes two arguments:    upgrade_os_to - Specifies the desired Amazon Linux version for instances whose OS you want to upgrade, such as Amazon Linux 2016.09. You must also set the allow_reboot argument to true.    allow_reboot - Specifies whether to allow AWS OpsWorks Stacks to reboot the instances if necessary, after installing the updates. This argument can be set to either true or false. The default value is false.   For example, to upgrade an instance to Amazon Linux 2016.09, set Args to the following.   { "upgrade_os_to":["Amazon Linux 2016.09"], "allow_reboot":["true"] }  
    */
  var Args: js.UndefOr[DeploymentCommandArgs] = js.undefined
  
  /**
    * Specifies the operation. You can specify only one command. For stacks, the following commands are available:    execute_recipes: Execute one or more recipes. To specify the recipes, set an Args parameter named recipes to the list of recipes to be executed. For example, to execute phpapp::appsetup, set Args to {"recipes":["phpapp::appsetup"]}.    install_dependencies: Install the stack's dependencies.    update_custom_cookbooks: Update the stack's custom cookbooks.    update_dependencies: Update the stack's dependencies.    The update_dependencies and install_dependencies commands are supported only for Linux instances. You can run the commands successfully on Windows instances, but they do nothing.  For apps, the following commands are available:    deploy: Deploy an app. Ruby on Rails apps have an optional Args parameter named migrate. Set Args to {"migrate":["true"]} to migrate the database. The default setting is {"migrate":["false"]}.    rollback Roll the app back to the previous version. When you update an app, AWS OpsWorks Stacks stores the previous version, up to a maximum of five versions. You can use this command to roll an app back as many as four versions.    start: Start the app's web or application server.    stop: Stop the app's web or application server.    restart: Restart the app's web or application server.    undeploy: Undeploy the app.  
    */
  var Name: DeploymentCommandName
}
object DeploymentCommand {
  
  inline def apply(Name: DeploymentCommandName): DeploymentCommand = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentCommand] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: DeploymentCommandArgs): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "Args", js.undefined)
    
    inline def setName(value: DeploymentCommandName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

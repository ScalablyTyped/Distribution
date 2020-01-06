package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppRequest extends js.Object {
  /**
    * A Source object that specifies the app repository.
    */
  var AppSource: js.UndefOr[Source] = js.native
  /**
    * One or more user-defined key/value pairs to be added to the stack attributes.
    */
  var Attributes: js.UndefOr[AppAttributes] = js.native
  /**
    * The app's data source.
    */
  var DataSources: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.DataSources] = js.native
  /**
    * A description of the app.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The app virtual host settings, with multiple domains separated by commas. For example: 'www.example.com, example.com' 
    */
  var Domains: js.UndefOr[Strings] = js.native
  /**
    * Whether to enable SSL for the app.
    */
  var EnableSsl: js.UndefOr[Boolean] = js.native
  /**
    * An array of EnvironmentVariable objects that specify environment variables to be associated with the app. After you deploy the app, these variables are defined on the associated app server instance. For more information, see  Environment Variables. There is no specific limit on the number of environment variables. However, the size of the associated data structure - which includes the variables' names, values, and protected flag values - cannot exceed 20 KB. This limit should accommodate most if not all use cases. Exceeding it will cause an exception with the message, "Environment: is too large (maximum is 20KB)."  If you have specified one or more environment variables, you cannot modify the stack's Chef version. 
    */
  var Environment: js.UndefOr[EnvironmentVariables] = js.native
  /**
    * The app name.
    */
  var Name: String = js.native
  /**
    * The app's short name.
    */
  var Shortname: js.UndefOr[String] = js.native
  /**
    * An SslConfiguration object with the SSL configuration.
    */
  var SslConfiguration: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.SslConfiguration] = js.native
  /**
    * The stack ID.
    */
  var StackId: String = js.native
  /**
    * The app type. Each supported type is associated with a particular layer. For example, PHP applications are associated with a PHP layer. AWS OpsWorks Stacks deploys an application to those instances that are members of the corresponding layer. If your app isn't one of the standard types, or you prefer to implement your own Deploy recipes, specify other.
    */
  var Type: AppType = js.native
}

object CreateAppRequest {
  @scala.inline
  def apply(
    Name: String,
    StackId: String,
    Type: AppType,
    AppSource: Source = null,
    Attributes: AppAttributes = null,
    DataSources: DataSources = null,
    Description: String = null,
    Domains: Strings = null,
    EnableSsl: js.UndefOr[scala.Boolean] = js.undefined,
    Environment: EnvironmentVariables = null,
    Shortname: String = null,
    SslConfiguration: SslConfiguration = null
  ): CreateAppRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (AppSource != null) __obj.updateDynamic("AppSource")(AppSource.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (DataSources != null) __obj.updateDynamic("DataSources")(DataSources.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Domains != null) __obj.updateDynamic("Domains")(Domains.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableSsl)) __obj.updateDynamic("EnableSsl")(EnableSsl.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (Shortname != null) __obj.updateDynamic("Shortname")(Shortname.asInstanceOf[js.Any])
    if (SslConfiguration != null) __obj.updateDynamic("SslConfiguration")(SslConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
}


package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAppRequest extends js.Object {
  /**
    * A Source object that specifies the app repository.
    */
  var AppSource: js.UndefOr[Source] = js.undefined
  /**
    * One or more user-defined key/value pairs to be added to the stack attributes.
    */
  var Attributes: js.UndefOr[AppAttributes] = js.undefined
  /**
    * The app's data source.
    */
  var DataSources: js.UndefOr[DataSources] = js.undefined
  /**
    * A description of the app.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The app virtual host settings, with multiple domains separated by commas. For example: 'www.example.com, example.com' 
    */
  var Domains: js.UndefOr[Strings] = js.undefined
  /**
    * Whether to enable SSL for the app.
    */
  var EnableSsl: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of EnvironmentVariable objects that specify environment variables to be associated with the app. After you deploy the app, these variables are defined on the associated app server instance. For more information, see  Environment Variables. There is no specific limit on the number of environment variables. However, the size of the associated data structure - which includes the variables' names, values, and protected flag values - cannot exceed 10 KB (10240 Bytes). This limit should accommodate most if not all use cases. Exceeding it will cause an exception with the message, "Environment: is too large (maximum is 10KB)."  This parameter is supported only by Chef 11.10 stacks. If you have specified one or more environment variables, you cannot modify the stack's Chef version. 
    */
  var Environment: js.UndefOr[EnvironmentVariables] = js.undefined
  /**
    * The app name.
    */
  var Name: String
  /**
    * The app's short name.
    */
  var Shortname: js.UndefOr[String] = js.undefined
  /**
    * An SslConfiguration object with the SSL configuration.
    */
  var SslConfiguration: js.UndefOr[SslConfiguration] = js.undefined
  /**
    * The stack ID.
    */
  var StackId: String
  /**
    * The app type. Each supported type is associated with a particular layer. For example, PHP applications are associated with a PHP layer. AWS OpsWorks Stacks deploys an application to those instances that are members of the corresponding layer. If your app isn't one of the standard types, or you prefer to implement your own Deploy recipes, specify other.
    */
  var Type: AppType
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
    EnableSsl: js.UndefOr[Boolean] = js.undefined,
    Environment: EnvironmentVariables = null,
    Shortname: String = null,
    SslConfiguration: SslConfiguration = null
  ): CreateAppRequest = {
    val __obj = js.Dynamic.literal(Name = Name, StackId = StackId, Type = Type.asInstanceOf[js.Any])
    if (AppSource != null) __obj.updateDynamic("AppSource")(AppSource)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (DataSources != null) __obj.updateDynamic("DataSources")(DataSources)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Domains != null) __obj.updateDynamic("Domains")(Domains)
    if (!js.isUndefined(EnableSsl)) __obj.updateDynamic("EnableSsl")(EnableSsl)
    if (Environment != null) __obj.updateDynamic("Environment")(Environment)
    if (Shortname != null) __obj.updateDynamic("Shortname")(Shortname)
    if (SslConfiguration != null) __obj.updateDynamic("SslConfiguration")(SslConfiguration)
    __obj.asInstanceOf[CreateAppRequest]
  }
}


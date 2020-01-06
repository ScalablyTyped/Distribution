package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[String] = js.native
  /**
    * A Source object that describes the app repository.
    */
  var AppSource: js.UndefOr[Source] = js.native
  /**
    * The stack attributes.
    */
  var Attributes: js.UndefOr[AppAttributes] = js.native
  /**
    * When the app was created.
    */
  var CreatedAt: js.UndefOr[String] = js.native
  /**
    * The app's data sources.
    */
  var DataSources: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.DataSources] = js.native
  /**
    * A description of the app.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The app vhost settings with multiple domains separated by commas. For example: 'www.example.com, example.com' 
    */
  var Domains: js.UndefOr[Strings] = js.native
  /**
    * Whether to enable SSL for the app.
    */
  var EnableSsl: js.UndefOr[Boolean] = js.native
  /**
    * An array of EnvironmentVariable objects that specify environment variables to be associated with the app. After you deploy the app, these variables are defined on the associated app server instances. For more information, see  Environment Variables.   There is no specific limit on the number of environment variables. However, the size of the associated data structure - which includes the variable names, values, and protected flag values - cannot exceed 20 KB. This limit should accommodate most if not all use cases, but if you do exceed it, you will cause an exception (API) with an "Environment: is too large (maximum is 20 KB)" message. 
    */
  var Environment: js.UndefOr[EnvironmentVariables] = js.native
  /**
    * The app name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The app's short name.
    */
  var Shortname: js.UndefOr[String] = js.native
  /**
    * An SslConfiguration object with the SSL configuration.
    */
  var SslConfiguration: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.SslConfiguration] = js.native
  /**
    * The app stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
  /**
    * The app type.
    */
  var Type: js.UndefOr[AppType] = js.native
}

object App {
  @scala.inline
  def apply(
    AppId: String = null,
    AppSource: Source = null,
    Attributes: AppAttributes = null,
    CreatedAt: String = null,
    DataSources: DataSources = null,
    Description: String = null,
    Domains: Strings = null,
    EnableSsl: js.UndefOr[scala.Boolean] = js.undefined,
    Environment: EnvironmentVariables = null,
    Name: String = null,
    Shortname: String = null,
    SslConfiguration: SslConfiguration = null,
    StackId: String = null,
    Type: AppType = null
  ): App = {
    val __obj = js.Dynamic.literal()
    if (AppId != null) __obj.updateDynamic("AppId")(AppId.asInstanceOf[js.Any])
    if (AppSource != null) __obj.updateDynamic("AppSource")(AppSource.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (DataSources != null) __obj.updateDynamic("DataSources")(DataSources.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Domains != null) __obj.updateDynamic("Domains")(Domains.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableSsl)) __obj.updateDynamic("EnableSsl")(EnableSsl.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Shortname != null) __obj.updateDynamic("Shortname")(Shortname.asInstanceOf[js.Any])
    if (SslConfiguration != null) __obj.updateDynamic("SslConfiguration")(SslConfiguration.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}


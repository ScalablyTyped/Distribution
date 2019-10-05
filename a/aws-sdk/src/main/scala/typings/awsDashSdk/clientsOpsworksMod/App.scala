package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[String] = js.undefined
  /**
    * A Source object that describes the app repository.
    */
  var AppSource: js.UndefOr[Source] = js.undefined
  /**
    * The stack attributes.
    */
  var Attributes: js.UndefOr[AppAttributes] = js.undefined
  /**
    * When the app was created.
    */
  var CreatedAt: js.UndefOr[String] = js.undefined
  /**
    * The app's data sources.
    */
  var DataSources: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.DataSources] = js.undefined
  /**
    * A description of the app.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The app vhost settings with multiple domains separated by commas. For example: 'www.example.com, example.com' 
    */
  var Domains: js.UndefOr[Strings] = js.undefined
  /**
    * Whether to enable SSL for the app.
    */
  var EnableSsl: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of EnvironmentVariable objects that specify environment variables to be associated with the app. After you deploy the app, these variables are defined on the associated app server instances. For more information, see  Environment Variables.   There is no specific limit on the number of environment variables. However, the size of the associated data structure - which includes the variable names, values, and protected flag values - cannot exceed 20 KB. This limit should accommodate most if not all use cases, but if you do exceed it, you will cause an exception (API) with an "Environment: is too large (maximum is 20 KB)" message. 
    */
  var Environment: js.UndefOr[EnvironmentVariables] = js.undefined
  /**
    * The app name.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The app's short name.
    */
  var Shortname: js.UndefOr[String] = js.undefined
  /**
    * An SslConfiguration object with the SSL configuration.
    */
  var SslConfiguration: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.SslConfiguration] = js.undefined
  /**
    * The app stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
  /**
    * The app type.
    */
  var Type: js.UndefOr[AppType] = js.undefined
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
    if (AppId != null) __obj.updateDynamic("AppId")(AppId)
    if (AppSource != null) __obj.updateDynamic("AppSource")(AppSource)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (DataSources != null) __obj.updateDynamic("DataSources")(DataSources)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Domains != null) __obj.updateDynamic("Domains")(Domains)
    if (!js.isUndefined(EnableSsl)) __obj.updateDynamic("EnableSsl")(EnableSsl)
    if (Environment != null) __obj.updateDynamic("Environment")(Environment)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Shortname != null) __obj.updateDynamic("Shortname")(Shortname)
    if (SslConfiguration != null) __obj.updateDynamic("SslConfiguration")(SslConfiguration)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}


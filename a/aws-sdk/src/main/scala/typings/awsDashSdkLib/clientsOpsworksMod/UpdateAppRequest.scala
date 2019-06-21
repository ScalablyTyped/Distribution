package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAppRequest extends js.Object {
  /**
    * The app ID.
    */
  var AppId: String
  /**
    * A Source object that specifies the app repository.
    */
  var AppSource: js.UndefOr[Source] = js.undefined
  /**
    * One or more user-defined key/value pairs to be added to the stack attributes.
    */
  var Attributes: js.UndefOr[AppAttributes] = js.undefined
  /**
    * The app's data sources.
    */
  var DataSources: js.UndefOr[DataSources] = js.undefined
  /**
    * A description of the app.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The app's virtual host settings, with multiple domains separated by commas. For example: 'www.example.com, example.com' 
    */
  var Domains: js.UndefOr[Strings] = js.undefined
  /**
    * Whether SSL is enabled for the app.
    */
  var EnableSsl: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of EnvironmentVariable objects that specify environment variables to be associated with the app. After you deploy the app, these variables are defined on the associated app server instances.For more information, see  Environment Variables. There is no specific limit on the number of environment variables. However, the size of the associated data structure - which includes the variables' names, values, and protected flag values - cannot exceed 20 KB. This limit should accommodate most if not all use cases. Exceeding it will cause an exception with the message, "Environment: is too large (maximum is 20 KB)."  If you have specified one or more environment variables, you cannot modify the stack's Chef version. 
    */
  var Environment: js.UndefOr[EnvironmentVariables] = js.undefined
  /**
    * The app name.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * An SslConfiguration object with the SSL configuration.
    */
  var SslConfiguration: js.UndefOr[SslConfiguration] = js.undefined
  /**
    * The app type.
    */
  var Type: js.UndefOr[AppType] = js.undefined
}

object UpdateAppRequest {
  @scala.inline
  def apply(
    AppId: String,
    AppSource: Source = null,
    Attributes: AppAttributes = null,
    DataSources: DataSources = null,
    Description: String = null,
    Domains: Strings = null,
    EnableSsl: js.UndefOr[Boolean] = js.undefined,
    Environment: EnvironmentVariables = null,
    Name: String = null,
    SslConfiguration: SslConfiguration = null,
    Type: AppType = null
  ): UpdateAppRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId)
    if (AppSource != null) __obj.updateDynamic("AppSource")(AppSource)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (DataSources != null) __obj.updateDynamic("DataSources")(DataSources)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Domains != null) __obj.updateDynamic("Domains")(Domains)
    if (!js.isUndefined(EnableSsl)) __obj.updateDynamic("EnableSsl")(EnableSsl)
    if (Environment != null) __obj.updateDynamic("Environment")(Environment)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SslConfiguration != null) __obj.updateDynamic("SslConfiguration")(SslConfiguration)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppRequest]
  }
}


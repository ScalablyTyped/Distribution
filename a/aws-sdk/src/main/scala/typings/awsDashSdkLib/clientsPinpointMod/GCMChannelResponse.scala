package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GCMChannelResponse extends js.Object {
  /**
    * The unique identifier for the application that the GCM channel applies to.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The date and time when the GCM channel was enabled.
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * The API key, also referred to as a server key, that you received from Google to communicate with Google services.
    */
  var Credential: __string
  /**
    * Specifies whether the GCM channel is enabled for the application.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[__boolean] = js.undefined
  /**
    * (Deprecated) An identifier for the GCM channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * Specifies whether the GCM channel is archived.
    */
  var IsArchived: js.UndefOr[__boolean] = js.undefined
  /**
    * The user who last modified the GCM channel.
    */
  var LastModifiedBy: js.UndefOr[__string] = js.undefined
  /**
    * The date and time when the GCM channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
  /**
    * The type of messaging or notification platform for the channel. For the GCM channel, this value is GCM.
    */
  var Platform: __string
  /**
    * The current version of the GCM channel.
    */
  var Version: js.UndefOr[__integer] = js.undefined
}

object GCMChannelResponse {
  @scala.inline
  def apply(
    Credential: __string,
    Platform: __string,
    ApplicationId: __string = null,
    CreationDate: __string = null,
    Enabled: js.UndefOr[__boolean] = js.undefined,
    HasCredential: js.UndefOr[__boolean] = js.undefined,
    Id: __string = null,
    IsArchived: js.UndefOr[__boolean] = js.undefined,
    LastModifiedBy: __string = null,
    LastModifiedDate: __string = null,
    Version: js.UndefOr[__integer] = js.undefined
  ): GCMChannelResponse = {
    val __obj = js.Dynamic.literal(Credential = Credential, Platform = Platform)
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (!js.isUndefined(HasCredential)) __obj.updateDynamic("HasCredential")(HasCredential)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(IsArchived)) __obj.updateDynamic("IsArchived")(IsArchived)
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[GCMChannelResponse]
  }
}


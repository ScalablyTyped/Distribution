package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/chime", "Chime")
@js.native
object ChimeNs extends js.Object {
  trait Account extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: String
    /**
      * The Amazon Chime account type. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
      */
    var AccountType: js.UndefOr[AccountType] = js.undefined
    /**
      * The AWS account ID.
      */
    var AwsAccountId: String
    /**
      * The Amazon Chime account creation timestamp, in ISO 8601 format.
      */
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    /**
      * The default license for the Amazon Chime account.
      */
    var DefaultLicense: js.UndefOr[License] = js.undefined
    /**
      * The Amazon Chime account name.
      */
    var Name: String
    /**
      * Supported licenses for the Amazon Chime account.
      */
    var SupportedLicenses: js.UndefOr[LicenseList] = js.undefined
  }
  
  trait AccountSettings extends js.Object {
    /**
      * Setting that stops or starts remote control of shared screens during meetings.
      */
    var DisableRemoteControl: js.UndefOr[Boolean] = js.undefined
    /**
      * Setting that allows meeting participants to choose the Call me at a phone number option. For more information, see Join a Meeting without the Amazon Chime App.
      */
    var EnableDialOut: js.UndefOr[Boolean] = js.undefined
  }
  
  trait AssociatePhoneNumberWithUserRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: String
    /**
      * The phone number, in E.164 format.
      */
    var E164PhoneNumber: awsDashSdkLib.clientsChimeMod.ChimeNs.E164PhoneNumber
    /**
      * The user ID.
      */
    var UserId: String
  }
  
  trait AssociatePhoneNumberWithUserResponse extends js.Object
  
  trait AssociatePhoneNumbersWithVoiceConnectorRequest extends js.Object {
    /**
      * List of phone numbers, in E.164 format.
      */
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait AssociatePhoneNumbersWithVoiceConnectorResponse extends js.Object {
    /**
      * If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned, along with error codes and error messages.
      */
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
  }
  
  trait BatchDeletePhoneNumberRequest extends js.Object {
    /**
      * List of phone number IDs.
      */
    var PhoneNumberIds: NonEmptyStringList
  }
  
  trait BatchDeletePhoneNumberResponse extends js.Object {
    /**
      * If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned, along with error codes and error messages.
      */
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
  }
  
  trait BatchSuspendUserRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The request containing the user IDs to suspend.
      */
    var UserIdList: awsDashSdkLib.clientsChimeMod.ChimeNs.UserIdList
  }
  
  trait BatchSuspendUserResponse extends js.Object {
    /**
      * If the BatchSuspendUser action fails for one or more of the user IDs in the request, a list of the user IDs is returned, along with error codes and error messages.
      */
    var UserErrors: js.UndefOr[UserErrorList] = js.undefined
  }
  
  trait BatchUnsuspendUserRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The request containing the user IDs to unsuspend.
      */
    var UserIdList: awsDashSdkLib.clientsChimeMod.ChimeNs.UserIdList
  }
  
  trait BatchUnsuspendUserResponse extends js.Object {
    /**
      * If the BatchUnsuspendUser action fails for one or more of the user IDs in the request, a list of the user IDs is returned, along with error codes and error messages.
      */
    var UserErrors: js.UndefOr[UserErrorList] = js.undefined
  }
  
  trait BatchUpdatePhoneNumberRequest extends js.Object {
    /**
      * The request containing the phone number IDs and product types to update.
      */
    var UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList
  }
  
  trait BatchUpdatePhoneNumberResponse extends js.Object {
    /**
      * If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned, along with error codes and error messages.
      */
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
  }
  
  trait BatchUpdateUserRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The request containing the user IDs and details to update.
      */
    var UpdateUserRequestItems: UpdateUserRequestItemList
  }
  
  trait BatchUpdateUserResponse extends js.Object {
    /**
      * If the BatchUpdateUser action fails for one or more of the user IDs in the request, a list of the user IDs is returned, along with error codes and error messages.
      */
    var UserErrors: js.UndefOr[UserErrorList] = js.undefined
  }
  
  trait BusinessCallingSettings extends js.Object {
    /**
      * The Amazon S3 bucket designated for call detail record storage.
      */
    var CdrBucket: js.UndefOr[String] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateAccountRequest extends js.Object {
    /**
      * The name of the Amazon Chime account.
      */
    var Name: AccountName
  }
  
  trait CreateAccountResponse extends js.Object {
    /**
      * The Amazon Chime account details.
      */
    var Account: js.UndefOr[Account] = js.undefined
  }
  
  trait CreatePhoneNumberOrderRequest extends js.Object {
    /**
      * List of phone numbers, in E.164 format.
      */
    var E164PhoneNumbers: E164PhoneNumberList
    /**
      * The phone number product type.
      */
    var ProductType: PhoneNumberProductType
  }
  
  trait CreatePhoneNumberOrderResponse extends js.Object {
    /**
      * The phone number order details.
      */
    var PhoneNumberOrder: js.UndefOr[PhoneNumberOrder] = js.undefined
  }
  
  trait CreateVoiceConnectorRequest extends js.Object {
    /**
      * The name of the Amazon Chime Voice Connector.
      */
    var Name: VoiceConnectorName
    /**
      * When enabled, requires encryption for the Amazon Chime Voice Connector.
      */
    var RequireEncryption: Boolean
  }
  
  trait CreateVoiceConnectorResponse extends js.Object {
    /**
      * The Amazon Chime Voice Connector details.
      */
    var VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
  }
  
  trait Credential extends js.Object {
    /**
      * The RFC2617 compliant password associated with the SIP credentials, in US-ASCII format.
      */
    var Password: js.UndefOr[SensitiveString] = js.undefined
    /**
      * The RFC2617 compliant user name associated with the SIP credentials, in US-ASCII format.
      */
    var Username: js.UndefOr[SensitiveString] = js.undefined
  }
  
  trait DeleteAccountRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
  }
  
  trait DeleteAccountResponse extends js.Object
  
  trait DeletePhoneNumberRequest extends js.Object {
    /**
      * The phone number ID.
      */
    var PhoneNumberId: String
  }
  
  trait DeleteVoiceConnectorOriginationRequest extends js.Object {
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait DeleteVoiceConnectorRequest extends js.Object {
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait DeleteVoiceConnectorTerminationCredentialsRequest extends js.Object {
    /**
      * The RFC2617 compliant username associated with the SIP credentials, in US-ASCII format.
      */
    var Usernames: js.UndefOr[SensitiveStringList] = js.undefined
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait DeleteVoiceConnectorTerminationRequest extends js.Object {
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait DisassociatePhoneNumberFromUserRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: String
    /**
      * The user ID.
      */
    var UserId: String
  }
  
  trait DisassociatePhoneNumberFromUserResponse extends js.Object
  
  trait DisassociatePhoneNumbersFromVoiceConnectorRequest extends js.Object {
    /**
      * List of phone numbers, in E.164 format.
      */
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait DisassociatePhoneNumbersFromVoiceConnectorResponse extends js.Object {
    /**
      * If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned, along with error codes and error messages.
      */
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
  }
  
  trait GetAccountRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
  }
  
  trait GetAccountResponse extends js.Object {
    /**
      * The Amazon Chime account details.
      */
    var Account: js.UndefOr[Account] = js.undefined
  }
  
  trait GetAccountSettingsRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
  }
  
  trait GetAccountSettingsResponse extends js.Object {
    /**
      * The Amazon Chime account settings.
      */
    var AccountSettings: js.UndefOr[AccountSettings] = js.undefined
  }
  
  trait GetGlobalSettingsResponse extends js.Object {
    /**
      * The Amazon Chime Business Calling settings.
      */
    var BusinessCalling: js.UndefOr[BusinessCallingSettings] = js.undefined
    /**
      * The Amazon Chime Voice Connector settings.
      */
    var VoiceConnector: js.UndefOr[VoiceConnectorSettings] = js.undefined
  }
  
  trait GetPhoneNumberOrderRequest extends js.Object {
    /**
      * The ID for the phone number order.
      */
    var PhoneNumberOrderId: GuidString
  }
  
  trait GetPhoneNumberOrderResponse extends js.Object {
    /**
      * The phone number order details.
      */
    var PhoneNumberOrder: js.UndefOr[PhoneNumberOrder] = js.undefined
  }
  
  trait GetPhoneNumberRequest extends js.Object {
    /**
      * The phone number ID.
      */
    var PhoneNumberId: String
  }
  
  trait GetPhoneNumberResponse extends js.Object {
    /**
      * The phone number details.
      */
    var PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
  }
  
  trait GetUserRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The user ID.
      */
    var UserId: NonEmptyString
  }
  
  trait GetUserResponse extends js.Object {
    /**
      * The user details.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  trait GetUserSettingsRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: String
    /**
      * The user ID.
      */
    var UserId: String
  }
  
  trait GetUserSettingsResponse extends js.Object {
    /**
      * The user settings.
      */
    var UserSettings: js.UndefOr[UserSettings] = js.undefined
  }
  
  trait GetVoiceConnectorOriginationRequest extends js.Object {
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait GetVoiceConnectorOriginationResponse extends js.Object {
    /**
      * The origination setting details.
      */
    var Origination: js.UndefOr[Origination] = js.undefined
  }
  
  trait GetVoiceConnectorRequest extends js.Object {
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait GetVoiceConnectorResponse extends js.Object {
    /**
      * The Amazon Chime Voice Connector details.
      */
    var VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
  }
  
  trait GetVoiceConnectorTerminationHealthRequest extends js.Object {
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait GetVoiceConnectorTerminationHealthResponse extends js.Object {
    /**
      * The termination health details.
      */
    var TerminationHealth: js.UndefOr[TerminationHealth] = js.undefined
  }
  
  trait GetVoiceConnectorTerminationRequest extends js.Object {
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait GetVoiceConnectorTerminationResponse extends js.Object {
    /**
      * The termination setting details.
      */
    var Termination: js.UndefOr[Termination] = js.undefined
  }
  
  trait Invite extends js.Object {
    /**
      * The email address to which the invite is sent.
      */
    var EmailAddress: js.UndefOr[EmailAddress] = js.undefined
    /**
      * The status of the invite email.
      */
    var EmailStatus: js.UndefOr[EmailStatus] = js.undefined
    /**
      * The invite ID.
      */
    var InviteId: js.UndefOr[String] = js.undefined
    /**
      * The status of the invite.
      */
    var Status: js.UndefOr[InviteStatus] = js.undefined
  }
  
  trait InviteUsersRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The user email addresses to which to send the invite.
      */
    var UserEmailList: awsDashSdkLib.clientsChimeMod.ChimeNs.UserEmailList
  }
  
  trait InviteUsersResponse extends js.Object {
    /**
      * The invite details.
      */
    var Invites: js.UndefOr[InviteList] = js.undefined
  }
  
  trait ListAccountsRequest extends js.Object {
    /**
      * The maximum number of results to return in a single call. Defaults to 100.
      */
    var MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined
    /**
      * Amazon Chime account name prefix with which to filter results.
      */
    var Name: js.UndefOr[AccountName] = js.undefined
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * User email address with which to filter results.
      */
    var UserEmail: js.UndefOr[EmailAddress] = js.undefined
  }
  
  trait ListAccountsResponse extends js.Object {
    /**
      * List of Amazon Chime accounts and account details.
      */
    var Accounts: js.UndefOr[AccountList] = js.undefined
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListPhoneNumberOrdersRequest extends js.Object {
    /**
      * The maximum number of results to return in a single call.
      */
    var MaxResults: js.UndefOr[ResultMax] = js.undefined
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListPhoneNumberOrdersResponse extends js.Object {
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The phone number order details.
      */
    var PhoneNumberOrders: js.UndefOr[PhoneNumberOrderList] = js.undefined
  }
  
  trait ListPhoneNumbersRequest extends js.Object {
    /**
      * The filter to use to limit the number of results.
      */
    var FilterName: js.UndefOr[PhoneNumberAssociationName] = js.undefined
    /**
      * The value to use for the filter.
      */
    var FilterValue: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of results to return in a single call.
      */
    var MaxResults: js.UndefOr[ResultMax] = js.undefined
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The phone number product type.
      */
    var ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
    /**
      * The phone number status.
      */
    var Status: js.UndefOr[PhoneNumberStatus] = js.undefined
  }
  
  trait ListPhoneNumbersResponse extends js.Object {
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The phone number details.
      */
    var PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined
  }
  
  trait ListUsersRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The maximum number of results to return in a single call. Defaults to 100.
      */
    var MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Optional. The user email address used to filter results. Maximum 1.
      */
    var UserEmail: js.UndefOr[EmailAddress] = js.undefined
  }
  
  trait ListUsersResponse extends js.Object {
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * List of users and user details.
      */
    var Users: js.UndefOr[UserList] = js.undefined
  }
  
  trait ListVoiceConnectorTerminationCredentialsRequest extends js.Object {
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait ListVoiceConnectorTerminationCredentialsResponse extends js.Object {
    /**
      * A list of user names.
      */
    var Usernames: js.UndefOr[SensitiveStringList] = js.undefined
  }
  
  trait ListVoiceConnectorsRequest extends js.Object {
    /**
      * The maximum number of results to return in a single call.
      */
    var MaxResults: js.UndefOr[ResultMax] = js.undefined
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListVoiceConnectorsResponse extends js.Object {
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The details of the Amazon Chime Voice Connectors.
      */
    var VoiceConnectors: js.UndefOr[VoiceConnectorList] = js.undefined
  }
  
  trait LogoutUserRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The user ID.
      */
    var UserId: NonEmptyString
  }
  
  trait LogoutUserResponse extends js.Object
  
  trait OrderedPhoneNumber extends js.Object {
    /**
      * The phone number, in E.164 format.
      */
    var E164PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
    /**
      * The phone number status.
      */
    var Status: js.UndefOr[OrderedPhoneNumberStatus] = js.undefined
  }
  
  trait Origination extends js.Object {
    /**
      * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
      */
    var Disabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum value of 20.
      */
    var Routes: js.UndefOr[OriginationRouteList] = js.undefined
  }
  
  trait OriginationRoute extends js.Object {
    /**
      * The FODN or IP address to contact for origination traffic.
      */
    var Host: js.UndefOr[String] = js.undefined
    /**
      * The designated origination route port. Defaults to 5060.
      */
    var Port: js.UndefOr[Port] = js.undefined
    /**
      * The priority associated with the host, with 1 being the highest priority. Higher priority hosts are attempted first.
      */
    var Priority: js.UndefOr[OriginationRoutePriority] = js.undefined
    /**
      * The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP protocol by default.
      */
    var Protocol: js.UndefOr[OriginationRouteProtocol] = js.undefined
    /**
      * The weight associated with the host. If hosts are equal in priority, calls are distributed among them based on their relative weight.
      */
    var Weight: js.UndefOr[OriginationRouteWeight] = js.undefined
  }
  
  trait PhoneNumber extends js.Object {
    /**
      * The phone number associations.
      */
    var Associations: js.UndefOr[PhoneNumberAssociationList] = js.undefined
    /**
      * The phone number capabilities.
      */
    var Capabilities: js.UndefOr[PhoneNumberCapabilities] = js.undefined
    /**
      * The phone number creation timestamp, in ISO 8601 format.
      */
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    /**
      * The deleted phone number timestamp, in ISO 8601 format.
      */
    var DeletionTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    /**
      * The phone number, in E.164 format.
      */
    var E164PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
    /**
      * The phone number ID.
      */
    var PhoneNumberId: js.UndefOr[String] = js.undefined
    /**
      * The phone number product type.
      */
    var ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
    /**
      * The phone number status.
      */
    var Status: js.UndefOr[PhoneNumberStatus] = js.undefined
    /**
      * The updated phone number timestamp, in ISO 8601 format.
      */
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  }
  
  trait PhoneNumberAssociation extends js.Object {
    /**
      * The timestamp of the phone number association, in ISO 8601 format.
      */
    var AssociatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    /**
      * Defines the association with an Amazon Chime account ID, user ID, or Amazon Chime Voice Connector ID.
      */
    var Name: js.UndefOr[PhoneNumberAssociationName] = js.undefined
    /**
      * Contains the ID for the entity specified in Name.
      */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  trait PhoneNumberCapabilities extends js.Object {
    /**
      * Allows or denies inbound calling for the specified phone number.
      */
    var InboundCall: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * Allows or denies inbound MMS messaging for the specified phone number.
      */
    var InboundMMS: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * Allows or denies inbound SMS messaging for the specified phone number.
      */
    var InboundSMS: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * Allows or denies outbound calling for the specified phone number.
      */
    var OutboundCall: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * Allows or denies outbound MMS messaging for the specified phone number.
      */
    var OutboundMMS: js.UndefOr[NullableBoolean] = js.undefined
    /**
      * Allows or denies outbound SMS messaging for the specified phone number.
      */
    var OutboundSMS: js.UndefOr[NullableBoolean] = js.undefined
  }
  
  trait PhoneNumberError extends js.Object {
    /**
      * The error code.
      */
    var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
      * The error message.
      */
    var ErrorMessage: js.UndefOr[String] = js.undefined
    /**
      * The phone number ID for which the action failed.
      */
    var PhoneNumberId: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait PhoneNumberOrder extends js.Object {
    /**
      * The phone number order creation timestamp, in ISO 8601 format.
      */
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    /**
      * The ordered phone number details, such as the phone number in E.164 format and the phone number status.
      */
    var OrderedPhoneNumbers: js.UndefOr[OrderedPhoneNumberList] = js.undefined
    /**
      * The phone number order ID.
      */
    var PhoneNumberOrderId: js.UndefOr[GuidString] = js.undefined
    /**
      * The phone number order product type.
      */
    var ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
    /**
      * The status of the phone number order.
      */
    var Status: js.UndefOr[PhoneNumberOrderStatus] = js.undefined
    /**
      * The updated phone number order timestamp, in ISO 8601 format.
      */
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  }
  
  trait PutVoiceConnectorOriginationRequest extends js.Object {
    /**
      * The origination setting details to add.
      */
    var Origination: awsDashSdkLib.clientsChimeMod.ChimeNs.Origination
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait PutVoiceConnectorOriginationResponse extends js.Object {
    /**
      * The updated origination setting details.
      */
    var Origination: js.UndefOr[Origination] = js.undefined
  }
  
  trait PutVoiceConnectorTerminationCredentialsRequest extends js.Object {
    /**
      * The termination SIP credentials.
      */
    var Credentials: js.UndefOr[CredentialList] = js.undefined
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait PutVoiceConnectorTerminationRequest extends js.Object {
    /**
      * The termination setting details to add.
      */
    var Termination: awsDashSdkLib.clientsChimeMod.ChimeNs.Termination
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait PutVoiceConnectorTerminationResponse extends js.Object {
    /**
      * The updated termination setting details.
      */
    var Termination: js.UndefOr[Termination] = js.undefined
  }
  
  trait ResetPersonalPINRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The user ID.
      */
    var UserId: NonEmptyString
  }
  
  trait ResetPersonalPINResponse extends js.Object {
    /**
      * The user details and new personal meeting PIN.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  trait RestorePhoneNumberRequest extends js.Object {
    /**
      * The phone number.
      */
    var PhoneNumberId: NonEmptyString
  }
  
  trait RestorePhoneNumberResponse extends js.Object {
    /**
      * The phone number details.
      */
    var PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
  }
  
  trait SearchAvailablePhoneNumbersRequest extends js.Object {
    /**
      * The area code used to filter results.
      */
    var AreaCode: js.UndefOr[String] = js.undefined
    /**
      * The city used to filter results.
      */
    var City: js.UndefOr[String] = js.undefined
    /**
      * The country used to filter results.
      */
    var Country: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of results to return in a single call.
      */
    var MaxResults: js.UndefOr[PhoneNumberMaxResults] = js.undefined
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The state used to filter results.
      */
    var State: js.UndefOr[String] = js.undefined
  }
  
  trait SearchAvailablePhoneNumbersResponse extends js.Object {
    /**
      * List of phone numbers, in E.164 format.
      */
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined
  }
  
  trait TelephonySettings extends js.Object {
    /**
      * Allows or denies inbound calling.
      */
    var InboundCalling: Boolean
    /**
      * Allows or denies outbound calling.
      */
    var OutboundCalling: Boolean
    /**
      * Allows or denies SMS messaging.
      */
    var SMS: Boolean
  }
  
  trait Termination extends js.Object {
    /**
      * The countries to which calls are allowed.
      */
    var CallingRegions: js.UndefOr[CallingRegionList] = js.undefined
    /**
      * The IP addresses allowed to make calls, in CIDR format.
      */
    var CidrAllowedList: js.UndefOr[StringList] = js.undefined
    /**
      * The limit on calls per second. Max value based on account service limit. Default value of 1.
      */
    var CpsLimit: js.UndefOr[CpsLimit] = js.undefined
    /**
      * The default caller ID phone number.
      */
    var DefaultPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
    /**
      * When termination settings are disabled, outbound calls can not be made.
      */
    var Disabled: js.UndefOr[Boolean] = js.undefined
  }
  
  trait TerminationHealth extends js.Object {
    /**
      * The source IP address.
      */
    var Source: js.UndefOr[String] = js.undefined
    /**
      * The timestamp, in ISO 8601 format.
      */
    var Timestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Associates a phone number with the specified Amazon Chime user.
      */
    def associatePhoneNumberWithUser(): awsDashSdkLib.libRequestMod.Request[AssociatePhoneNumberWithUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associatePhoneNumberWithUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociatePhoneNumberWithUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociatePhoneNumberWithUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a phone number with the specified Amazon Chime user.
      */
    def associatePhoneNumberWithUser(params: AssociatePhoneNumberWithUserRequest): awsDashSdkLib.libRequestMod.Request[AssociatePhoneNumberWithUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associatePhoneNumberWithUser(
      params: AssociatePhoneNumberWithUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociatePhoneNumberWithUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociatePhoneNumberWithUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a phone number with the specified Amazon Chime Voice Connector.
      */
    def associatePhoneNumbersWithVoiceConnector(): awsDashSdkLib.libRequestMod.Request[
        AssociatePhoneNumbersWithVoiceConnectorResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def associatePhoneNumbersWithVoiceConnector(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociatePhoneNumbersWithVoiceConnectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        AssociatePhoneNumbersWithVoiceConnectorResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Associates a phone number with the specified Amazon Chime Voice Connector.
      */
    def associatePhoneNumbersWithVoiceConnector(params: AssociatePhoneNumbersWithVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[
        AssociatePhoneNumbersWithVoiceConnectorResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def associatePhoneNumbersWithVoiceConnector(
      params: AssociatePhoneNumbersWithVoiceConnectorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociatePhoneNumbersWithVoiceConnectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        AssociatePhoneNumbersWithVoiceConnectorResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Moves phone numbers into the Deletion queue. Phone numbers must be disassociated from any users or Amazon Chime Voice Connectors before they can be deleted. Phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.
      */
    def batchDeletePhoneNumber(): awsDashSdkLib.libRequestMod.Request[BatchDeletePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchDeletePhoneNumber(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeletePhoneNumberResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeletePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Moves phone numbers into the Deletion queue. Phone numbers must be disassociated from any users or Amazon Chime Voice Connectors before they can be deleted. Phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.
      */
    def batchDeletePhoneNumber(params: BatchDeletePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[BatchDeletePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchDeletePhoneNumber(
      params: BatchDeletePhoneNumberRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeletePhoneNumberResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeletePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Users suspended from a Team account are dissociated from the account, but they can continue to use Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them to the Team account again. You can use the InviteUsers action to do so. Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and can no longer sign in. To remove the suspension from suspended EnterpriseLWA account users, use the BatchUnsuspendUser action.  To sign out users without suspending them, use the LogoutUser action.
      */
    def batchSuspendUser(): awsDashSdkLib.libRequestMod.Request[BatchSuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchSuspendUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchSuspendUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchSuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Users suspended from a Team account are dissociated from the account, but they can continue to use Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them to the Team account again. You can use the InviteUsers action to do so. Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and can no longer sign in. To remove the suspension from suspended EnterpriseLWA account users, use the BatchUnsuspendUser action.  To sign out users without suspending them, use the LogoutUser action.
      */
    def batchSuspendUser(params: BatchSuspendUserRequest): awsDashSdkLib.libRequestMod.Request[BatchSuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchSuspendUser(
      params: BatchSuspendUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchSuspendUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchSuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime EnterpriseLWA account. Only users on EnterpriseLWA accounts can be unsuspended using this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Previously suspended users who are unsuspended using this action are returned to Registered status. Users who are not previously suspended are ignored.
      */
    def batchUnsuspendUser(): awsDashSdkLib.libRequestMod.Request[BatchUnsuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchUnsuspendUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchUnsuspendUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchUnsuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime EnterpriseLWA account. Only users on EnterpriseLWA accounts can be unsuspended using this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Previously suspended users who are unsuspended using this action are returned to Registered status. Users who are not previously suspended are ignored.
      */
    def batchUnsuspendUser(params: BatchUnsuspendUserRequest): awsDashSdkLib.libRequestMod.Request[BatchUnsuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchUnsuspendUser(
      params: BatchUnsuspendUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchUnsuspendUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchUnsuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates phone number product types. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector product types.
      */
    def batchUpdatePhoneNumber(): awsDashSdkLib.libRequestMod.Request[BatchUpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchUpdatePhoneNumber(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchUpdatePhoneNumberResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchUpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates phone number product types. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector product types.
      */
    def batchUpdatePhoneNumber(params: BatchUpdatePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[BatchUpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchUpdatePhoneNumber(
      params: BatchUpdatePhoneNumberRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchUpdatePhoneNumberResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchUpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates user details within the UpdateUserRequestItem object for up to 20 users for the specified Amazon Chime account. Currently, only LicenseType updates are supported for this action.
      */
    def batchUpdateUser(): awsDashSdkLib.libRequestMod.Request[BatchUpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchUpdateUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchUpdateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchUpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates user details within the UpdateUserRequestItem object for up to 20 users for the specified Amazon Chime account. Currently, only LicenseType updates are supported for this action.
      */
    def batchUpdateUser(params: BatchUpdateUserRequest): awsDashSdkLib.libRequestMod.Request[BatchUpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchUpdateUser(
      params: BatchUpdateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchUpdateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchUpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon Chime account under the administrator's AWS account. Only Team account types are currently supported for this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
      */
    def createAccount(): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAccount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon Chime account under the administrator's AWS account. Only Team account types are currently supported for this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
      */
    def createAccount(params: CreateAccountRequest): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAccount(
      params: CreateAccountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector product types.
      */
    def createPhoneNumberOrder(): awsDashSdkLib.libRequestMod.Request[CreatePhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPhoneNumberOrder(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePhoneNumberOrderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector product types.
      */
    def createPhoneNumberOrder(params: CreatePhoneNumberOrderRequest): awsDashSdkLib.libRequestMod.Request[CreatePhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPhoneNumberOrder(
      params: CreatePhoneNumberOrderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePhoneNumberOrderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon Chime Voice Connector under the administrator's AWS account. Enabling CreateVoiceConnectorRequest$RequireEncryption configures your Amazon Chime Voice Connector to use TLS transport for SIP signaling and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted outbound calls are blocked.
      */
    def createVoiceConnector(): awsDashSdkLib.libRequestMod.Request[CreateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVoiceConnector(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVoiceConnectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon Chime Voice Connector under the administrator's AWS account. Enabling CreateVoiceConnectorRequest$RequireEncryption configures your Amazon Chime Voice Connector to use TLS transport for SIP signaling and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted outbound calls are blocked.
      */
    def createVoiceConnector(params: CreateVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[CreateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVoiceConnector(
      params: CreateVoiceConnectorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVoiceConnectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified Amazon Chime account. You must suspend all users before deleting a Team account. You can use the BatchSuspendUser action to do so. For EnterpriseLWA and EnterpriseAD accounts, you must release the claimed domains for your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are suspended. Deleted accounts appear in your Disabled accounts list for 90 days. To restore a deleted account from your Disabled accounts list, you must contact AWS Support. After 90 days, deleted accounts are permanently removed from your Disabled accounts list.
      */
    def deleteAccount(): awsDashSdkLib.libRequestMod.Request[DeleteAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAccount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified Amazon Chime account. You must suspend all users before deleting a Team account. You can use the BatchSuspendUser action to do so. For EnterpriseLWA and EnterpriseAD accounts, you must release the claimed domains for your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are suspended. Deleted accounts appear in your Disabled accounts list for 90 days. To restore a deleted account from your Disabled accounts list, you must contact AWS Support. After 90 days, deleted accounts are permanently removed from your Disabled accounts list.
      */
    def deleteAccount(params: DeleteAccountRequest): awsDashSdkLib.libRequestMod.Request[DeleteAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAccount(
      params: DeleteAccountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Moves the specified phone number into the Deletion queue. A phone number must be disassociated from any users or Amazon Chime Voice Connectors before it can be deleted. Deleted phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.
      */
    def deletePhoneNumber(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePhoneNumber(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Moves the specified phone number into the Deletion queue. A phone number must be disassociated from any users or Amazon Chime Voice Connectors before it can be deleted. Deleted phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.
      */
    def deletePhoneNumber(params: DeletePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePhoneNumber(
      params: DeletePhoneNumberRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified Amazon Chime Voice Connector. Any phone numbers assigned to the Amazon Chime Voice Connector must be unassigned from it before it can be deleted.
      */
    def deleteVoiceConnector(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVoiceConnector(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified Amazon Chime Voice Connector. Any phone numbers assigned to the Amazon Chime Voice Connector must be unassigned from it before it can be deleted.
      */
    def deleteVoiceConnector(params: DeleteVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVoiceConnector(
      params: DeleteVoiceConnectorRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the origination settings for the specified Amazon Chime Voice Connector.
      */
    def deleteVoiceConnectorOrigination(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVoiceConnectorOrigination(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the origination settings for the specified Amazon Chime Voice Connector.
      */
    def deleteVoiceConnectorOrigination(params: DeleteVoiceConnectorOriginationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVoiceConnectorOrigination(
      params: DeleteVoiceConnectorOriginationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the termination settings for the specified Amazon Chime Voice Connector.
      */
    def deleteVoiceConnectorTermination(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVoiceConnectorTermination(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the termination settings for the specified Amazon Chime Voice Connector.
      */
    def deleteVoiceConnectorTermination(params: DeleteVoiceConnectorTerminationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVoiceConnectorTermination(
      params: DeleteVoiceConnectorTerminationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
      */
    def deleteVoiceConnectorTerminationCredentials(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVoiceConnectorTerminationCredentials(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
      */
    def deleteVoiceConnectorTerminationCredentials(params: DeleteVoiceConnectorTerminationCredentialsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVoiceConnectorTerminationCredentials(
      params: DeleteVoiceConnectorTerminationCredentialsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the primary provisioned phone number from the specified Amazon Chime user.
      */
    def disassociatePhoneNumberFromUser(): awsDashSdkLib.libRequestMod.Request[DisassociatePhoneNumberFromUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociatePhoneNumberFromUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociatePhoneNumberFromUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociatePhoneNumberFromUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the primary provisioned phone number from the specified Amazon Chime user.
      */
    def disassociatePhoneNumberFromUser(params: DisassociatePhoneNumberFromUserRequest): awsDashSdkLib.libRequestMod.Request[DisassociatePhoneNumberFromUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociatePhoneNumberFromUser(
      params: DisassociatePhoneNumberFromUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociatePhoneNumberFromUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociatePhoneNumberFromUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the specified phone number from the specified Amazon Chime Voice Connector.
      */
    def disassociatePhoneNumbersFromVoiceConnector(): awsDashSdkLib.libRequestMod.Request[
        DisassociatePhoneNumbersFromVoiceConnectorResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def disassociatePhoneNumbersFromVoiceConnector(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociatePhoneNumbersFromVoiceConnectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DisassociatePhoneNumbersFromVoiceConnectorResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Disassociates the specified phone number from the specified Amazon Chime Voice Connector.
      */
    def disassociatePhoneNumbersFromVoiceConnector(params: DisassociatePhoneNumbersFromVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[
        DisassociatePhoneNumbersFromVoiceConnectorResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def disassociatePhoneNumbersFromVoiceConnector(
      params: DisassociatePhoneNumbersFromVoiceConnectorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociatePhoneNumbersFromVoiceConnectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DisassociatePhoneNumbersFromVoiceConnectorResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
      */
    def getAccount(): awsDashSdkLib.libRequestMod.Request[GetAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
      */
    def getAccount(params: GetAccountRequest): awsDashSdkLib.libRequestMod.Request[GetAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccount(
      params: GetAccountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dial out settings. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
      */
    def getAccountSettings(): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccountSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dial out settings. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
      */
    def getAccountSettings(params: GetAccountSettingsRequest): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccountSettings(
      params: GetAccountSettingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon Chime Voice Connector settings.
      */
    def getGlobalSettings(): awsDashSdkLib.libRequestMod.Request[GetGlobalSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGlobalSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetGlobalSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetGlobalSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
      */
    def getPhoneNumber(): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPhoneNumber(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPhoneNumberResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
      */
    def getPhoneNumber(params: GetPhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPhoneNumber(
      params: GetPhoneNumberRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPhoneNumberResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details for the specified phone number order, such as order creation timestamp, phone numbers in E.164 format, product type, and order status.
      */
    def getPhoneNumberOrder(): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPhoneNumberOrder(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPhoneNumberOrderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details for the specified phone number order, such as order creation timestamp, phone numbers in E.164 format, product type, and order status.
      */
    def getPhoneNumberOrder(params: GetPhoneNumberOrderRequest): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPhoneNumberOrder(
      params: GetPhoneNumberOrderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPhoneNumberOrderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting PIN. To retrieve user details with an email address instead of a user ID, use the ListUsers action, and then filter by email address.
      */
    def getUser(): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getUser(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetUserResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting PIN. To retrieve user details with an email address instead of a user ID, use the ListUsers action, and then filter by email address.
      */
    def getUser(params: GetUserRequest): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getUser(
      params: GetUserRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetUserResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves settings for the specified user ID, such as any associated phone number settings.
      */
    def getUserSettings(): awsDashSdkLib.libRequestMod.Request[GetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getUserSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUserSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves settings for the specified user ID, such as any associated phone number settings.
      */
    def getUserSettings(params: GetUserSettingsRequest): awsDashSdkLib.libRequestMod.Request[GetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getUserSettings(
      params: GetUserSettingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUserSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details for the specified Amazon Chime Voice Connector, such as timestamps, name, outbound host, and encryption requirements.
      */
    def getVoiceConnector(): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVoiceConnector(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVoiceConnectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves details for the specified Amazon Chime Voice Connector, such as timestamps, name, outbound host, and encryption requirements.
      */
    def getVoiceConnector(params: GetVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVoiceConnector(
      params: GetVoiceConnectorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVoiceConnectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves origination setting details for the specified Amazon Chime Voice Connector.
      */
    def getVoiceConnectorOrigination(): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVoiceConnectorOrigination(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVoiceConnectorOriginationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves origination setting details for the specified Amazon Chime Voice Connector.
      */
    def getVoiceConnectorOrigination(params: GetVoiceConnectorOriginationRequest): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVoiceConnectorOrigination(
      params: GetVoiceConnectorOriginationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVoiceConnectorOriginationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves termination setting details for the specified Amazon Chime Voice Connector.
      */
    def getVoiceConnectorTermination(): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVoiceConnectorTermination(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVoiceConnectorTerminationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves termination setting details for the specified Amazon Chime Voice Connector.
      */
    def getVoiceConnectorTermination(params: GetVoiceConnectorTerminationRequest): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVoiceConnectorTermination(
      params: GetVoiceConnectorTerminationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVoiceConnectorTerminationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the last time a SIP OPTIONS ping was received from your SIP infrastructure for the specified Amazon Chime Voice Connector.
      */
    def getVoiceConnectorTerminationHealth(): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationHealthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVoiceConnectorTerminationHealth(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVoiceConnectorTerminationHealthResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationHealthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about the last time a SIP OPTIONS ping was received from your SIP infrastructure for the specified Amazon Chime Voice Connector.
      */
    def getVoiceConnectorTerminationHealth(params: GetVoiceConnectorTerminationHealthRequest): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationHealthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVoiceConnectorTerminationHealth(
      params: GetVoiceConnectorTerminationHealthRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVoiceConnectorTerminationHealthResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationHealthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sends email invites to as many as 50 users, inviting them to the specified Amazon Chime Team account. Only Team account types are currently supported for this action. 
      */
    def inviteUsers(): awsDashSdkLib.libRequestMod.Request[InviteUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def inviteUsers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InviteUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InviteUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sends email invites to as many as 50 users, inviting them to the specified Amazon Chime Team account. Only Team account types are currently supported for this action. 
      */
    def inviteUsers(params: InviteUsersRequest): awsDashSdkLib.libRequestMod.Request[InviteUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def inviteUsers(
      params: InviteUsersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InviteUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InviteUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address, which returns one account result.
      */
    def listAccounts(): awsDashSdkLib.libRequestMod.Request[ListAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAccounts(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAccountsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address, which returns one account result.
      */
    def listAccounts(params: ListAccountsRequest): awsDashSdkLib.libRequestMod.Request[ListAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAccounts(
      params: ListAccountsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAccountsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the phone number orders for the administrator's Amazon Chime account.
      */
    def listPhoneNumberOrders(): awsDashSdkLib.libRequestMod.Request[ListPhoneNumberOrdersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPhoneNumberOrders(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPhoneNumberOrdersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPhoneNumberOrdersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the phone number orders for the administrator's Amazon Chime account.
      */
    def listPhoneNumberOrders(params: ListPhoneNumberOrdersRequest): awsDashSdkLib.libRequestMod.Request[ListPhoneNumberOrdersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPhoneNumberOrders(
      params: ListPhoneNumberOrdersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPhoneNumberOrdersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPhoneNumberOrdersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, or Amazon Chime Voice Connector.
      */
    def listPhoneNumbers(): awsDashSdkLib.libRequestMod.Request[ListPhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPhoneNumbers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPhoneNumbersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, or Amazon Chime Voice Connector.
      */
    def listPhoneNumbers(params: ListPhoneNumbersRequest): awsDashSdkLib.libRequestMod.Request[ListPhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPhoneNumbers(
      params: ListPhoneNumbersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPhoneNumbersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the users that belong to the specified Amazon Chime account. You can specify an email address to list only the user that the email address belongs to.
      */
    def listUsers(): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUsers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the users that belong to the specified Amazon Chime account. You can specify an email address to list only the user that the email address belongs to.
      */
    def listUsers(params: ListUsersRequest): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUsers(
      params: ListUsersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the SIP credentials for the specified Amazon Chime Voice Connector.
      */
    def listVoiceConnectorTerminationCredentials(): awsDashSdkLib.libRequestMod.Request[
        ListVoiceConnectorTerminationCredentialsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def listVoiceConnectorTerminationCredentials(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVoiceConnectorTerminationCredentialsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        ListVoiceConnectorTerminationCredentialsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Lists the SIP credentials for the specified Amazon Chime Voice Connector.
      */
    def listVoiceConnectorTerminationCredentials(params: ListVoiceConnectorTerminationCredentialsRequest): awsDashSdkLib.libRequestMod.Request[
        ListVoiceConnectorTerminationCredentialsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def listVoiceConnectorTerminationCredentials(
      params: ListVoiceConnectorTerminationCredentialsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVoiceConnectorTerminationCredentialsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        ListVoiceConnectorTerminationCredentialsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Lists the Amazon Chime Voice Connectors for the administrator's AWS account.
      */
    def listVoiceConnectors(): awsDashSdkLib.libRequestMod.Request[ListVoiceConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVoiceConnectors(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVoiceConnectorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVoiceConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Amazon Chime Voice Connectors for the administrator's AWS account.
      */
    def listVoiceConnectors(params: ListVoiceConnectorsRequest): awsDashSdkLib.libRequestMod.Request[ListVoiceConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVoiceConnectors(
      params: ListVoiceConnectorsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVoiceConnectorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVoiceConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Logs out the specified user from all of the devices they are currently logged into.
      */
    def logoutUser(): awsDashSdkLib.libRequestMod.Request[LogoutUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def logoutUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ LogoutUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[LogoutUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Logs out the specified user from all of the devices they are currently logged into.
      */
    def logoutUser(params: LogoutUserRequest): awsDashSdkLib.libRequestMod.Request[LogoutUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def logoutUser(
      params: LogoutUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ LogoutUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[LogoutUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds origination settings for the specified Amazon Chime Voice Connector.
      */
    def putVoiceConnectorOrigination(): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putVoiceConnectorOrigination(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutVoiceConnectorOriginationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds origination settings for the specified Amazon Chime Voice Connector.
      */
    def putVoiceConnectorOrigination(params: PutVoiceConnectorOriginationRequest): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putVoiceConnectorOrigination(
      params: PutVoiceConnectorOriginationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutVoiceConnectorOriginationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds termination settings for the specified Amazon Chime Voice Connector.
      */
    def putVoiceConnectorTermination(): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putVoiceConnectorTermination(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutVoiceConnectorTerminationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds termination settings for the specified Amazon Chime Voice Connector.
      */
    def putVoiceConnectorTermination(params: PutVoiceConnectorTerminationRequest): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putVoiceConnectorTermination(
      params: PutVoiceConnectorTerminationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutVoiceConnectorTerminationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds termination SIP credentials for the specified Amazon Chime Voice Connector.
      */
    def putVoiceConnectorTerminationCredentials(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putVoiceConnectorTerminationCredentials(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds termination SIP credentials for the specified Amazon Chime Voice Connector.
      */
    def putVoiceConnectorTerminationCredentials(params: PutVoiceConnectorTerminationCredentialsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putVoiceConnectorTerminationCredentials(
      params: PutVoiceConnectorTerminationCredentialsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the User object with the updated personal meeting PIN.
      */
    def resetPersonalPIN(): awsDashSdkLib.libRequestMod.Request[ResetPersonalPINResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resetPersonalPIN(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResetPersonalPINResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResetPersonalPINResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the User object with the updated personal meeting PIN.
      */
    def resetPersonalPIN(params: ResetPersonalPINRequest): awsDashSdkLib.libRequestMod.Request[ResetPersonalPINResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resetPersonalPIN(
      params: ResetPersonalPINRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResetPersonalPINResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResetPersonalPINResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Moves a phone number from the Deletion queue back into the phone number Inventory.
      */
    def restorePhoneNumber(): awsDashSdkLib.libRequestMod.Request[RestorePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restorePhoneNumber(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestorePhoneNumberResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestorePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Moves a phone number from the Deletion queue back into the phone number Inventory.
      */
    def restorePhoneNumber(params: RestorePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[RestorePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restorePhoneNumber(
      params: RestorePhoneNumberRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestorePhoneNumberResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestorePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches phone numbers that can be ordered.
      */
    def searchAvailablePhoneNumbers(): awsDashSdkLib.libRequestMod.Request[SearchAvailablePhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchAvailablePhoneNumbers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchAvailablePhoneNumbersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchAvailablePhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches phone numbers that can be ordered.
      */
    def searchAvailablePhoneNumbers(params: SearchAvailablePhoneNumbersRequest): awsDashSdkLib.libRequestMod.Request[SearchAvailablePhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchAvailablePhoneNumbers(
      params: SearchAvailablePhoneNumbersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchAvailablePhoneNumbersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchAvailablePhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates account details for the specified Amazon Chime account. Currently, only account name updates are supported for this action.
      */
    def updateAccount(): awsDashSdkLib.libRequestMod.Request[UpdateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAccount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates account details for the specified Amazon Chime account. Currently, only account name updates are supported for this action.
      */
    def updateAccount(params: UpdateAccountRequest): awsDashSdkLib.libRequestMod.Request[UpdateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAccount(
      params: UpdateAccountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared screens, or for the dial-out option. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
      */
    def updateAccountSettings(): awsDashSdkLib.libRequestMod.Request[UpdateAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAccountSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAccountSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared screens, or for the dial-out option. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
      */
    def updateAccountSettings(params: UpdateAccountSettingsRequest): awsDashSdkLib.libRequestMod.Request[UpdateAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAccountSettings(
      params: UpdateAccountSettingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAccountSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon Chime Voice Connector settings.
      */
    def updateGlobalSettings(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGlobalSettings(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon Chime Voice Connector settings.
      */
    def updateGlobalSettings(params: UpdateGlobalSettingsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGlobalSettings(
      params: UpdateGlobalSettingsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates phone number details, such as product type, for the specified phone number ID.
      */
    def updatePhoneNumber(): awsDashSdkLib.libRequestMod.Request[UpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePhoneNumber(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePhoneNumberResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates phone number details, such as product type, for the specified phone number ID.
      */
    def updatePhoneNumber(params: UpdatePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[UpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePhoneNumber(
      params: UpdatePhoneNumberRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePhoneNumberResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates user details for a specified user ID. Currently, only LicenseType updates are supported for this action.
      */
    def updateUser(): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates user details for a specified user ID. Currently, only LicenseType updates are supported for this action.
      */
    def updateUser(params: UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUser(
      params: UpdateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the settings for the specified user, such as phone number settings.
      */
    def updateUserSettings(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUserSettings(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the settings for the specified user, such as phone number settings.
      */
    def updateUserSettings(params: UpdateUserSettingsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUserSettings(
      params: UpdateUserSettingsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates details for the specified Amazon Chime Voice Connector.
      */
    def updateVoiceConnector(): awsDashSdkLib.libRequestMod.Request[UpdateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateVoiceConnector(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVoiceConnectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates details for the specified Amazon Chime Voice Connector.
      */
    def updateVoiceConnector(params: UpdateVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[UpdateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateVoiceConnector(
      params: UpdateVoiceConnectorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateVoiceConnectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateAccountRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The new name for the specified Amazon Chime account.
      */
    var Name: js.UndefOr[AccountName] = js.undefined
  }
  
  trait UpdateAccountResponse extends js.Object {
    /**
      * The updated Amazon Chime account details.
      */
    var Account: js.UndefOr[Account] = js.undefined
  }
  
  trait UpdateAccountSettingsRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The Amazon Chime account settings to update.
      */
    var AccountSettings: awsDashSdkLib.clientsChimeMod.ChimeNs.AccountSettings
  }
  
  trait UpdateAccountSettingsResponse extends js.Object
  
  trait UpdateGlobalSettingsRequest extends js.Object {
    /**
      * The Amazon Chime Business Calling settings.
      */
    var BusinessCalling: BusinessCallingSettings
    /**
      * The Amazon Chime Voice Connector settings.
      */
    var VoiceConnector: VoiceConnectorSettings
  }
  
  trait UpdatePhoneNumberRequest extends js.Object {
    /**
      * The phone number ID.
      */
    var PhoneNumberId: String
    /**
      * The product type.
      */
    var ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
  }
  
  trait UpdatePhoneNumberRequestItem extends js.Object {
    /**
      * The phone number ID to update.
      */
    var PhoneNumberId: NonEmptyString
    /**
      * The product type to update.
      */
    var ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
  }
  
  trait UpdatePhoneNumberResponse extends js.Object {
    /**
      * The updated phone number details.
      */
    var PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
  }
  
  trait UpdateUserRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The user license type to update. This must be a supported license type for the Amazon Chime account that the user belongs to.
      */
    var LicenseType: js.UndefOr[License] = js.undefined
    /**
      * The user ID.
      */
    var UserId: NonEmptyString
  }
  
  trait UpdateUserRequestItem extends js.Object {
    /**
      * The user license type.
      */
    var LicenseType: js.UndefOr[License] = js.undefined
    /**
      * The user ID.
      */
    var UserId: NonEmptyString
  }
  
  trait UpdateUserResponse extends js.Object {
    /**
      * The updated user details.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  trait UpdateUserSettingsRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: String
    /**
      * The user ID.
      */
    var UserId: String
    /**
      * The user settings to update.
      */
    var UserSettings: awsDashSdkLib.clientsChimeMod.ChimeNs.UserSettings
  }
  
  trait UpdateVoiceConnectorRequest extends js.Object {
    /**
      * The name of the Amazon Chime Voice Connector.
      */
    var Name: VoiceConnectorName
    /**
      * When enabled, requires encryption for the Amazon Chime Voice Connector.
      */
    var RequireEncryption: Boolean
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: NonEmptyString
  }
  
  trait UpdateVoiceConnectorResponse extends js.Object {
    /**
      * The Amazon Chime Voice Connector details.
      */
    var VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
  }
  
  trait User extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: js.UndefOr[String] = js.undefined
    /**
      * The display name of the user.
      */
    var DisplayName: js.UndefOr[SensitiveString] = js.undefined
    /**
      * Date and time when the user is invited to the Amazon Chime account, in ISO 8601 format.
      */
    var InvitedOn: js.UndefOr[Iso8601Timestamp] = js.undefined
    /**
      * The license type for the user.
      */
    var LicenseType: js.UndefOr[License] = js.undefined
    /**
      * The user's personal meeting PIN.
      */
    var PersonalPIN: js.UndefOr[String] = js.undefined
    /**
      * The primary email address of the user.
      */
    var PrimaryEmail: js.UndefOr[EmailAddress] = js.undefined
    /**
      * The primary phone number associated with the user.
      */
    var PrimaryProvisionedNumber: js.UndefOr[SensitiveString] = js.undefined
    /**
      * Date and time when the user is registered, in ISO 8601 format.
      */
    var RegisteredOn: js.UndefOr[Iso8601Timestamp] = js.undefined
    /**
      * The user ID.
      */
    var UserId: String
    /**
      * The user invite status.
      */
    var UserInvitationStatus: js.UndefOr[InviteStatus] = js.undefined
    /**
      * The user registration status.
      */
    var UserRegistrationStatus: js.UndefOr[RegistrationStatus] = js.undefined
  }
  
  trait UserError extends js.Object {
    /**
      * The error code.
      */
    var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
      * The error message.
      */
    var ErrorMessage: js.UndefOr[String] = js.undefined
    /**
      * The user ID for which the action failed.
      */
    var UserId: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait UserSettings extends js.Object {
    /**
      * The telephony settings associated with the user.
      */
    var Telephony: TelephonySettings
  }
  
  trait VoiceConnector extends js.Object {
    /**
      * The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
      */
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    /**
      * The name of the Amazon Chime Voice Connector.
      */
    var Name: js.UndefOr[VoiceConnectorName] = js.undefined
    /**
      * The outbound host name for the Amazon Chime Voice Connector.
      */
    var OutboundHostName: js.UndefOr[String] = js.undefined
    /**
      * Designates whether encryption is required for the Amazon Chime Voice Connector.
      */
    var RequireEncryption: js.UndefOr[Boolean] = js.undefined
    /**
      * The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
      */
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    /**
      * The Amazon Chime Voice Connector ID.
      */
    var VoiceConnectorId: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait VoiceConnectorSettings extends js.Object {
    /**
      * The Amazon S3 bucket designated for call detail record storage.
      */
    var CdrBucket: js.UndefOr[String] = js.undefined
  }
  
  trait _AccountType extends js.Object
  
  trait _EmailStatus extends js.Object
  
  trait _ErrorCode extends js.Object
  
  trait _InviteStatus extends js.Object
  
  trait _License extends js.Object
  
  trait _OrderedPhoneNumberStatus extends js.Object
  
  trait _OriginationRouteProtocol extends js.Object
  
  trait _PhoneNumberAssociationName extends js.Object
  
  trait _PhoneNumberOrderStatus extends js.Object
  
  trait _PhoneNumberProductType extends js.Object
  
  trait _PhoneNumberStatus extends js.Object
  
  trait _RegistrationStatus extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AccountList = js.Array[Account]
  type AccountName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Team
    - awsDashSdkLib.awsDashSdkLibStrings.EnterpriseDirectory
    - awsDashSdkLib.awsDashSdkLibStrings.EnterpriseLWA
    - awsDashSdkLib.awsDashSdkLibStrings.EnterpriseOIDC
    - java.lang.String
  */
  type AccountType = _AccountType | java.lang.String
  type Boolean = scala.Boolean
  type CallingRegion = java.lang.String
  type CallingRegionList = js.Array[CallingRegion]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CpsLimit = scala.Double
  type CredentialList = js.Array[Credential]
  type E164PhoneNumber = java.lang.String
  type E164PhoneNumberList = js.Array[E164PhoneNumber]
  type EmailAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NotSent
    - awsDashSdkLib.awsDashSdkLibStrings.Sent
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type EmailStatus = _EmailStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Unauthorized
    - awsDashSdkLib.awsDashSdkLibStrings.Forbidden
    - awsDashSdkLib.awsDashSdkLibStrings.NotFound
    - awsDashSdkLib.awsDashSdkLibStrings.BadRequest
    - awsDashSdkLib.awsDashSdkLibStrings.Conflict
    - awsDashSdkLib.awsDashSdkLibStrings.ServiceFailure
    - awsDashSdkLib.awsDashSdkLibStrings.ServiceUnavailable
    - awsDashSdkLib.awsDashSdkLibStrings.Unprocessable
    - awsDashSdkLib.awsDashSdkLibStrings.Throttled
    - awsDashSdkLib.awsDashSdkLibStrings.PreconditionFailed
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | java.lang.String
  type GuidString = java.lang.String
  type InviteList = js.Array[Invite]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.Accepted
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type InviteStatus = _InviteStatus | java.lang.String
  type Iso8601Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Basic
    - awsDashSdkLib.awsDashSdkLibStrings.Plus
    - awsDashSdkLib.awsDashSdkLibStrings.Pro
    - awsDashSdkLib.awsDashSdkLibStrings.ProTrial
    - java.lang.String
  */
  type License = _License | java.lang.String
  type LicenseList = js.Array[License]
  type NonEmptyString = java.lang.String
  type NonEmptyStringList = js.Array[String]
  type NullableBoolean = scala.Boolean
  type OrderedPhoneNumberList = js.Array[OrderedPhoneNumber]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Processing
    - awsDashSdkLib.awsDashSdkLibStrings.Acquired
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type OrderedPhoneNumberStatus = _OrderedPhoneNumberStatus | java.lang.String
  type OriginationRouteList = js.Array[OriginationRoute]
  type OriginationRoutePriority = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TCP
    - awsDashSdkLib.awsDashSdkLibStrings.UDP
    - java.lang.String
  */
  type OriginationRouteProtocol = _OriginationRouteProtocol | java.lang.String
  type OriginationRouteWeight = scala.Double
  type PhoneNumberAssociationList = js.Array[PhoneNumberAssociation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AccountId
    - awsDashSdkLib.awsDashSdkLibStrings.UserId
    - awsDashSdkLib.awsDashSdkLibStrings.VoiceConnectorId
    - java.lang.String
  */
  type PhoneNumberAssociationName = _PhoneNumberAssociationName | java.lang.String
  type PhoneNumberErrorList = js.Array[PhoneNumberError]
  type PhoneNumberList = js.Array[PhoneNumber]
  type PhoneNumberMaxResults = scala.Double
  type PhoneNumberOrderList = js.Array[PhoneNumberOrder]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Processing
    - awsDashSdkLib.awsDashSdkLibStrings.Successful
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Partial
    - java.lang.String
  */
  type PhoneNumberOrderStatus = _PhoneNumberOrderStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BusinessCalling
    - awsDashSdkLib.awsDashSdkLibStrings.VoiceConnector
    - java.lang.String
  */
  type PhoneNumberProductType = _PhoneNumberProductType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AcquireInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.AcquireFailed
    - awsDashSdkLib.awsDashSdkLibStrings.Unassigned
    - awsDashSdkLib.awsDashSdkLibStrings.Assigned
    - awsDashSdkLib.awsDashSdkLibStrings.ReleaseInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.ReleaseFailed
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteFailed
    - java.lang.String
  */
  type PhoneNumberStatus = _PhoneNumberStatus | java.lang.String
  type Port = scala.Double
  type ProfileServiceMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Unregistered
    - awsDashSdkLib.awsDashSdkLibStrings.Registered
    - awsDashSdkLib.awsDashSdkLibStrings.Suspended
    - java.lang.String
  */
  type RegistrationStatus = _RegistrationStatus | java.lang.String
  type ResultMax = scala.Double
  type SensitiveString = java.lang.String
  type SensitiveStringList = js.Array[SensitiveString]
  type String = java.lang.String
  type StringList = js.Array[String]
  type UpdatePhoneNumberRequestItemList = js.Array[UpdatePhoneNumberRequestItem]
  type UpdateUserRequestItemList = js.Array[UpdateUserRequestItem]
  type UserEmailList = js.Array[EmailAddress]
  type UserErrorList = js.Array[UserError]
  type UserIdList = js.Array[NonEmptyString]
  type UserList = js.Array[User]
  type VoiceConnectorList = js.Array[VoiceConnector]
  type VoiceConnectorName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-05-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}


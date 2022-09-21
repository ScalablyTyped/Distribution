package typings.awsSdk.amplifybackendMod

import typings.awsSdk.awsSdkStrings.COGNITO
import typings.awsSdk.awsSdkStrings.S3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REQUIRE_DIGIT
  - typings.awsSdk.awsSdkStrings.REQUIRE_LOWERCASE
  - typings.awsSdk.awsSdkStrings.REQUIRE_SYMBOL
  - typings.awsSdk.awsSdkStrings.REQUIRE_UPPERCASE
  - java.lang.String
*/
type AdditionalConstraintsElement = _AdditionalConstraintsElement | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER_POOL_ONLY
  - typings.awsSdk.awsSdkStrings.IDENTITY_POOL_AND_USER_POOL
  - java.lang.String
*/
type AuthResources = _AuthResources | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READ
  - typings.awsSdk.awsSdkStrings.CREATE_AND_UPDATE
  - typings.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type AuthenticatedElement = _AuthenticatedElement | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EMAIL
  - typings.awsSdk.awsSdkStrings.SMS
  - java.lang.String
*/
type DeliveryMethod = _DeliveryMethod | String

type ListOfAdditionalConstraintsElement = js.Array[AdditionalConstraintsElement]

type ListOfAuthenticatedElement = js.Array[AuthenticatedElement]

type ListOfBackendAPIAuthType = js.Array[BackendAPIAuthType]

type ListOfBackendJobRespObj = js.Array[BackendJobRespObj]

type ListOfMfaTypesElement = js.Array[MfaTypesElement]

type ListOfOAuthScopesElement = js.Array[OAuthScopesElement]

type ListOfRequiredSignUpAttributesElement = js.Array[RequiredSignUpAttributesElement]

type ListOfS3BucketInfo = js.Array[S3BucketInfo]

type ListOfString = js.Array[string]

type ListOfUnAuthenticatedElement = js.Array[UnAuthenticatedElement]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ON
  - typings.awsSdk.awsSdkStrings.OFF
  - typings.awsSdk.awsSdkStrings.OPTIONAL
  - java.lang.String
*/
type MFAMode = _MFAMode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SMS
  - typings.awsSdk.awsSdkStrings.TOTP
  - java.lang.String
*/
type MfaTypesElement = _MfaTypesElement | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.API_KEY
  - typings.awsSdk.awsSdkStrings.AWS_IAM
  - typings.awsSdk.awsSdkStrings.AMAZON_COGNITO_USER_POOLS
  - typings.awsSdk.awsSdkStrings.OPENID_CONNECT
  - java.lang.String
*/
type Mode = _Mode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CODE
  - typings.awsSdk.awsSdkStrings.IMPLICIT
  - java.lang.String
*/
type OAuthGrantType = _OAuthGrantType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PHONE
  - typings.awsSdk.awsSdkStrings.EMAIL
  - typings.awsSdk.awsSdkStrings.OPENID
  - typings.awsSdk.awsSdkStrings.PROFILE
  - typings.awsSdk.awsSdkStrings.AWS_COGNITO_SIGNIN_USER_ADMIN
  - java.lang.String
*/
type OAuthScopesElement = _OAuthScopesElement | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADDRESS
  - typings.awsSdk.awsSdkStrings.BIRTHDATE
  - typings.awsSdk.awsSdkStrings.EMAIL
  - typings.awsSdk.awsSdkStrings.FAMILY_NAME
  - typings.awsSdk.awsSdkStrings.GENDER
  - typings.awsSdk.awsSdkStrings.GIVEN_NAME
  - typings.awsSdk.awsSdkStrings.LOCALE
  - typings.awsSdk.awsSdkStrings.MIDDLE_NAME
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.NICKNAME
  - typings.awsSdk.awsSdkStrings.PHONE_NUMBER
  - typings.awsSdk.awsSdkStrings.PICTURE
  - typings.awsSdk.awsSdkStrings.PREFERRED_USERNAME
  - typings.awsSdk.awsSdkStrings.PROFILE
  - typings.awsSdk.awsSdkStrings.UPDATED_AT
  - typings.awsSdk.awsSdkStrings.WEBSITE
  - typings.awsSdk.awsSdkStrings.ZONE_INFO
  - java.lang.String
*/
type RequiredSignUpAttributesElement = _RequiredSignUpAttributesElement | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OPTIMISTIC_CONCURRENCY
  - typings.awsSdk.awsSdkStrings.LAMBDA
  - typings.awsSdk.awsSdkStrings.AUTOMERGE
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ResolutionStrategy = _ResolutionStrategy | String

type Service = COGNITO | String

type ServiceName = S3 | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EMAIL
  - typings.awsSdk.awsSdkStrings.EMAIL_AND_PHONE_NUMBER
  - typings.awsSdk.awsSdkStrings.PHONE_NUMBER
  - typings.awsSdk.awsSdkStrings.USERNAME
  - java.lang.String
*/
type SignInMethod = _SignInMethod | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LATEST
  - typings.awsSdk.awsSdkStrings.STALE
  - java.lang.String
*/
type Status = _Status | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READ
  - typings.awsSdk.awsSdkStrings.CREATE_AND_UPDATE
  - typings.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type UnAuthenticatedElement = _UnAuthenticatedElement | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-08-11`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type boolean = Boolean

type double = Double

type integerMin1Max25 = Double

type string = String

package typings.auth0

import typings.auth0.mod.AuthMethod
import typings.auth0.mod.ClientAppType
import typings.auth0.mod.CustomDomainStatus
import typings.auth0.mod.CustomDomainType
import typings.auth0.mod.DeleteDeleteMultifactorParamsProvider
import typings.auth0.mod.EnrollmentStatus
import typings.auth0.mod.Grant
import typings.auth0.mod.JobFormat
import typings.auth0.mod.JobStatus
import typings.auth0.mod.LogEventTypeCode
import typings.auth0.mod.SendType
import typings.auth0.mod.Strategy
import typings.auth0.mod.UnlinkAccountsParamsProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auth0Strings {
  
  @js.native
  sealed trait HS256 extends StObject
  inline def HS256: HS256 = "HS256".asInstanceOf[HS256]
  
  @js.native
  sealed trait RS256 extends StObject
  inline def RS256: RS256 = "RS256".asInstanceOf[RS256]
  
  @js.native
  sealed trait access_token extends StObject
  inline def access_token: access_token = "access_token".asInstanceOf[access_token]
  
  @js.native
  sealed trait access_token_authz extends StObject
  inline def access_token_authz: access_token_authz = "access_token_authz".asInstanceOf[access_token_authz]
  
  @js.native
  sealed trait ad
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def ad: ad = "ad".asInstanceOf[ad]
  
  @js.native
  sealed trait adfs
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def adfs: adfs = "adfs".asInstanceOf[adfs]
  
  @js.native
  sealed trait admin_update_launch
    extends StObject
       with LogEventTypeCode
  inline def admin_update_launch: admin_update_launch = "admin_update_launch".asInstanceOf[admin_update_launch]
  
  @js.native
  sealed trait amazon
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def amazon: amazon = "amazon".asInstanceOf[amazon]
  
  @js.native
  sealed trait aol
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def aol: aol = "aol".asInstanceOf[aol]
  
  @js.native
  sealed trait api_limit
    extends StObject
       with LogEventTypeCode
  inline def api_limit: api_limit = "api_limit".asInstanceOf[api_limit]
  
  @js.native
  sealed trait auth0
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def auth0: auth0 = "auth0".asInstanceOf[auth0]
  
  @js.native
  sealed trait `auth0-adldap`
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def `auth0-adldap`: `auth0-adldap` = "auth0-adldap".asInstanceOf[`auth0-adldap`]
  
  @js.native
  sealed trait `auth0-oidc`
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def `auth0-oidc`: `auth0-oidc` = "auth0-oidc".asInstanceOf[`auth0-oidc`]
  
  @js.native
  sealed trait auth0_managed_certs
    extends StObject
       with CustomDomainType
  inline def auth0_managed_certs: auth0_managed_certs = "auth0_managed_certs".asInstanceOf[auth0_managed_certs]
  
  @js.native
  sealed trait authentication
    extends StObject
       with AuthMethod
  inline def authentication: authentication = "authentication".asInstanceOf[authentication]
  
  @js.native
  sealed trait authorization_code
    extends StObject
       with Grant
  inline def authorization_code: authorization_code = "authorization_code".asInstanceOf[authorization_code]
  
  @js.native
  sealed trait baidu
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def baidu: baidu = "baidu".asInstanceOf[baidu]
  
  @js.native
  sealed trait bitbucket
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def bitbucket: bitbucket = "bitbucket".asInstanceOf[bitbucket]
  
  @js.native
  sealed trait bitly
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def bitly: bitly = "bitly".asInstanceOf[bitly]
  
  @js.native
  sealed trait box
    extends StObject
       with ClientAppType
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def box: box = "box".asInstanceOf[box]
  
  @js.native
  sealed trait client_credentials
    extends StObject
       with Grant
  inline def client_credentials: client_credentials = "client_credentials".asInstanceOf[client_credentials]
  
  @js.native
  sealed trait cloudbees
    extends StObject
       with ClientAppType
  inline def cloudbees: cloudbees = "cloudbees".asInstanceOf[cloudbees]
  
  @js.native
  sealed trait cls
    extends StObject
       with LogEventTypeCode
  inline def cls: cls = "cls".asInstanceOf[cls]
  
  @js.native
  sealed trait code
    extends StObject
       with SendType
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait completed
    extends StObject
       with JobStatus
  inline def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait concur
    extends StObject
       with ClientAppType
  inline def concur: concur = "concur".asInstanceOf[concur]
  
  @js.native
  sealed trait confirmed
    extends StObject
       with EnrollmentStatus
  inline def confirmed: confirmed = "confirmed".asInstanceOf[confirmed]
  
  @js.native
  sealed trait cs
    extends StObject
       with LogEventTypeCode
  inline def cs: cs = "cs".asInstanceOf[cs]
  
  @js.native
  sealed trait csv
    extends StObject
       with JobFormat
  inline def csv: csv = "csv".asInstanceOf[csv]
  
  @js.native
  sealed trait custom
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait daccount
    extends StObject
       with Strategy
  inline def daccount: daccount = "daccount".asInstanceOf[daccount]
  
  @js.native
  sealed trait depnote
    extends StObject
       with LogEventTypeCode
  inline def depnote: depnote = "depnote".asInstanceOf[depnote]
  
  @js.native
  sealed trait disabled
    extends StObject
       with CustomDomainStatus
  inline def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait dropbox
    extends StObject
       with ClientAppType
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def dropbox: dropbox = "dropbox".asInstanceOf[dropbox]
  
  @js.native
  sealed trait du
    extends StObject
       with LogEventTypeCode
  inline def du: du = "du".asInstanceOf[du]
  
  @js.native
  sealed trait duo
    extends StObject
       with DeleteDeleteMultifactorParamsProvider
  inline def duo: duo = "duo".asInstanceOf[duo]
  
  @js.native
  sealed trait dwolla
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def dwolla: dwolla = "dwolla".asInstanceOf[dwolla]
  
  @js.native
  sealed trait echosign
    extends StObject
       with ClientAppType
  inline def echosign: echosign = "echosign".asInstanceOf[echosign]
  
  @js.native
  sealed trait egnyte
    extends StObject
       with ClientAppType
  inline def egnyte: egnyte = "egnyte".asInstanceOf[egnyte]
  
  @js.native
  sealed trait email
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait evernote
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def evernote: evernote = "evernote".asInstanceOf[evernote]
  
  @js.native
  sealed trait `evernote-sandbox`
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def `evernote-sandbox`: `evernote-sandbox` = "evernote-sandbox".asInstanceOf[`evernote-sandbox`]
  
  @js.native
  sealed trait exact
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def exact: exact = "exact".asInstanceOf[exact]
  
  @js.native
  sealed trait f
    extends StObject
       with LogEventTypeCode
  inline def f: f = "f".asInstanceOf[f]
  
  @js.native
  sealed trait facebook
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def facebook: facebook = "facebook".asInstanceOf[facebook]
  
  @js.native
  sealed trait failed
    extends StObject
       with JobStatus
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait fapi
    extends StObject
       with LogEventTypeCode
  inline def fapi: fapi = "fapi".asInstanceOf[fapi]
  
  @js.native
  sealed trait fc
    extends StObject
       with LogEventTypeCode
  inline def fc: fc = "fc".asInstanceOf[fc]
  
  @js.native
  sealed trait fce
    extends StObject
       with LogEventTypeCode
  inline def fce: fce = "fce".asInstanceOf[fce]
  
  @js.native
  sealed trait fco
    extends StObject
       with LogEventTypeCode
  inline def fco: fco = "fco".asInstanceOf[fco]
  
  @js.native
  sealed trait fcoa
    extends StObject
       with LogEventTypeCode
  inline def fcoa: fcoa = "fcoa".asInstanceOf[fcoa]
  
  @js.native
  sealed trait fcp
    extends StObject
       with LogEventTypeCode
  inline def fcp: fcp = "fcp".asInstanceOf[fcp]
  
  @js.native
  sealed trait fcph
    extends StObject
       with LogEventTypeCode
  inline def fcph: fcph = "fcph".asInstanceOf[fcph]
  
  @js.native
  sealed trait fcpn
    extends StObject
       with LogEventTypeCode
  inline def fcpn: fcpn = "fcpn".asInstanceOf[fcpn]
  
  @js.native
  sealed trait fcpr
    extends StObject
       with LogEventTypeCode
  inline def fcpr: fcpr = "fcpr".asInstanceOf[fcpr]
  
  @js.native
  sealed trait fcpro
    extends StObject
       with LogEventTypeCode
  inline def fcpro: fcpro = "fcpro".asInstanceOf[fcpro]
  
  @js.native
  sealed trait fcu
    extends StObject
       with LogEventTypeCode
  inline def fcu: fcu = "fcu".asInstanceOf[fcu]
  
  @js.native
  sealed trait fd
    extends StObject
       with LogEventTypeCode
  inline def fd: fd = "fd".asInstanceOf[fd]
  
  @js.native
  sealed trait fdeac
    extends StObject
       with LogEventTypeCode
  inline def fdeac: fdeac = "fdeac".asInstanceOf[fdeac]
  
  @js.native
  sealed trait fdeaz
    extends StObject
       with LogEventTypeCode
  inline def fdeaz: fdeaz = "fdeaz".asInstanceOf[fdeaz]
  
  @js.native
  sealed trait fdecc
    extends StObject
       with LogEventTypeCode
  inline def fdecc: fdecc = "fdecc".asInstanceOf[fdecc]
  
  @js.native
  sealed trait fdu
    extends StObject
       with LogEventTypeCode
  inline def fdu: fdu = "fdu".asInstanceOf[fdu]
  
  @js.native
  sealed trait feacft
    extends StObject
       with LogEventTypeCode
  inline def feacft: feacft = "feacft".asInstanceOf[feacft]
  
  @js.native
  sealed trait feccft
    extends StObject
       with LogEventTypeCode
  inline def feccft: feccft = "feccft".asInstanceOf[feccft]
  
  @js.native
  sealed trait fede
    extends StObject
       with LogEventTypeCode
  inline def fede: fede = "fede".asInstanceOf[fede]
  
  @js.native
  sealed trait fens
    extends StObject
       with LogEventTypeCode
  inline def fens: fens = "fens".asInstanceOf[fens]
  
  @js.native
  sealed trait feoobft
    extends StObject
       with LogEventTypeCode
  inline def feoobft: feoobft = "feoobft".asInstanceOf[feoobft]
  
  @js.native
  sealed trait feotpft
    extends StObject
       with LogEventTypeCode
  inline def feotpft: feotpft = "feotpft".asInstanceOf[feotpft]
  
  @js.native
  sealed trait fepft
    extends StObject
       with LogEventTypeCode
  inline def fepft: fepft = "fepft".asInstanceOf[fepft]
  
  @js.native
  sealed trait fepotpft
    extends StObject
       with LogEventTypeCode
  inline def fepotpft: fepotpft = "fepotpft".asInstanceOf[fepotpft]
  
  @js.native
  sealed trait fercft
    extends StObject
       with LogEventTypeCode
  inline def fercft: fercft = "fercft".asInstanceOf[fercft]
  
  @js.native
  sealed trait ferrt
    extends StObject
       with LogEventTypeCode
  inline def ferrt: ferrt = "ferrt".asInstanceOf[ferrt]
  
  @js.native
  sealed trait fertft
    extends StObject
       with LogEventTypeCode
  inline def fertft: fertft = "fertft".asInstanceOf[fertft]
  
  @js.native
  sealed trait fi
    extends StObject
       with LogEventTypeCode
  inline def fi: fi = "fi".asInstanceOf[fi]
  
  @js.native
  sealed trait fitbit
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def fitbit: fitbit = "fitbit".asInstanceOf[fitbit]
  
  @js.native
  sealed trait flickr
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def flickr: flickr = "flickr".asInstanceOf[flickr]
  
  @js.native
  sealed trait flo
    extends StObject
       with LogEventTypeCode
  inline def flo: flo = "flo".asInstanceOf[flo]
  
  @js.native
  sealed trait fn
    extends StObject
       with LogEventTypeCode
  inline def fn: fn = "fn".asInstanceOf[fn]
  
  @js.native
  sealed trait fp
    extends StObject
       with LogEventTypeCode
  inline def fp: fp = "fp".asInstanceOf[fp]
  
  @js.native
  sealed trait fs
    extends StObject
       with LogEventTypeCode
  inline def fs: fs = "fs".asInstanceOf[fs]
  
  @js.native
  sealed trait fsa
    extends StObject
       with LogEventTypeCode
  inline def fsa: fsa = "fsa".asInstanceOf[fsa]
  
  @js.native
  sealed trait fu
    extends StObject
       with LogEventTypeCode
  inline def fu: fu = "fu".asInstanceOf[fu]
  
  @js.native
  sealed trait fui
    extends StObject
       with LogEventTypeCode
  inline def fui: fui = "fui".asInstanceOf[fui]
  
  @js.native
  sealed trait fv
    extends StObject
       with LogEventTypeCode
  inline def fv: fv = "fv".asInstanceOf[fv]
  
  @js.native
  sealed trait fvr
    extends StObject
       with LogEventTypeCode
  inline def fvr: fvr = "fvr".asInstanceOf[fvr]
  
  @js.native
  sealed trait gd_auth_failed
    extends StObject
       with LogEventTypeCode
  inline def gd_auth_failed: gd_auth_failed = "gd_auth_failed".asInstanceOf[gd_auth_failed]
  
  @js.native
  sealed trait gd_auth_rejected
    extends StObject
       with LogEventTypeCode
  inline def gd_auth_rejected: gd_auth_rejected = "gd_auth_rejected".asInstanceOf[gd_auth_rejected]
  
  @js.native
  sealed trait gd_auth_succeed
    extends StObject
       with LogEventTypeCode
  inline def gd_auth_succeed: gd_auth_succeed = "gd_auth_succeed".asInstanceOf[gd_auth_succeed]
  
  @js.native
  sealed trait gd_enrollment_complete
    extends StObject
       with LogEventTypeCode
  inline def gd_enrollment_complete: gd_enrollment_complete = "gd_enrollment_complete".asInstanceOf[gd_enrollment_complete]
  
  @js.native
  sealed trait gd_otp_rate_limit_exceed
    extends StObject
       with LogEventTypeCode
  inline def gd_otp_rate_limit_exceed: gd_otp_rate_limit_exceed = "gd_otp_rate_limit_exceed".asInstanceOf[gd_otp_rate_limit_exceed]
  
  @js.native
  sealed trait gd_recovery_failed
    extends StObject
       with LogEventTypeCode
  inline def gd_recovery_failed: gd_recovery_failed = "gd_recovery_failed".asInstanceOf[gd_recovery_failed]
  
  @js.native
  sealed trait gd_recovery_rate_limit_exceed
    extends StObject
       with LogEventTypeCode
  inline def gd_recovery_rate_limit_exceed: gd_recovery_rate_limit_exceed = "gd_recovery_rate_limit_exceed".asInstanceOf[gd_recovery_rate_limit_exceed]
  
  @js.native
  sealed trait gd_recovery_succeed
    extends StObject
       with LogEventTypeCode
  inline def gd_recovery_succeed: gd_recovery_succeed = "gd_recovery_succeed".asInstanceOf[gd_recovery_succeed]
  
  @js.native
  sealed trait gd_send_pn
    extends StObject
       with LogEventTypeCode
  inline def gd_send_pn: gd_send_pn = "gd_send_pn".asInstanceOf[gd_send_pn]
  
  @js.native
  sealed trait gd_send_sms
    extends StObject
       with LogEventTypeCode
  inline def gd_send_sms: gd_send_sms = "gd_send_sms".asInstanceOf[gd_send_sms]
  
  @js.native
  sealed trait gd_send_sms_failure
    extends StObject
       with LogEventTypeCode
  inline def gd_send_sms_failure: gd_send_sms_failure = "gd_send_sms_failure".asInstanceOf[gd_send_sms_failure]
  
  @js.native
  sealed trait gd_send_voice
    extends StObject
       with LogEventTypeCode
  inline def gd_send_voice: gd_send_voice = "gd_send_voice".asInstanceOf[gd_send_voice]
  
  @js.native
  sealed trait gd_send_voice_failure
    extends StObject
       with LogEventTypeCode
  inline def gd_send_voice_failure: gd_send_voice_failure = "gd_send_voice_failure".asInstanceOf[gd_send_voice_failure]
  
  @js.native
  sealed trait gd_start_auth
    extends StObject
       with LogEventTypeCode
  inline def gd_start_auth: gd_start_auth = "gd_start_auth".asInstanceOf[gd_start_auth]
  
  @js.native
  sealed trait gd_start_enroll
    extends StObject
       with LogEventTypeCode
  inline def gd_start_enroll: gd_start_enroll = "gd_start_enroll".asInstanceOf[gd_start_enroll]
  
  @js.native
  sealed trait gd_tenant_update
    extends StObject
       with LogEventTypeCode
  inline def gd_tenant_update: gd_tenant_update = "gd_tenant_update".asInstanceOf[gd_tenant_update]
  
  @js.native
  sealed trait gd_unenroll
    extends StObject
       with LogEventTypeCode
  inline def gd_unenroll: gd_unenroll = "gd_unenroll".asInstanceOf[gd_unenroll]
  
  @js.native
  sealed trait gd_update_device_account
    extends StObject
       with LogEventTypeCode
  inline def gd_update_device_account: gd_update_device_account = "gd_update_device_account".asInstanceOf[gd_update_device_account]
  
  @js.native
  sealed trait github
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def github: github = "github".asInstanceOf[github]
  
  @js.native
  sealed trait `google-apps`
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def `google-apps`: `google-apps` = "google-apps".asInstanceOf[`google-apps`]
  
  @js.native
  sealed trait `google-authenticator`
    extends StObject
       with DeleteDeleteMultifactorParamsProvider
  inline def `google-authenticator`: `google-authenticator` = "google-authenticator".asInstanceOf[`google-authenticator`]
  
  @js.native
  sealed trait `google-oauth2`
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def `google-oauth2`: `google-oauth2` = "google-oauth2".asInstanceOf[`google-oauth2`]
  
  @js.native
  sealed trait guardian
    extends StObject
       with AuthMethod
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def guardian: guardian = "guardian".asInstanceOf[guardian]
  
  @js.native
  sealed trait `implicit`
    extends StObject
       with Grant
  inline def `implicit`: `implicit` = "implicit".asInstanceOf[`implicit`]
  
  @js.native
  sealed trait instagram
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def instagram: instagram = "instagram".asInstanceOf[instagram]
  
  @js.native
  sealed trait ip
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def ip: ip = "ip".asInstanceOf[ip]
  
  @js.native
  sealed trait json
    extends StObject
       with JobFormat
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait limit_delegation
    extends StObject
       with LogEventTypeCode
  inline def limit_delegation: limit_delegation = "limit_delegation".asInstanceOf[limit_delegation]
  
  @js.native
  sealed trait limit_mu
    extends StObject
       with LogEventTypeCode
  inline def limit_mu: limit_mu = "limit_mu".asInstanceOf[limit_mu]
  
  @js.native
  sealed trait limit_sul
    extends StObject
       with LogEventTypeCode
  inline def limit_sul: limit_sul = "limit_sul".asInstanceOf[limit_sul]
  
  @js.native
  sealed trait limit_wc
    extends StObject
       with LogEventTypeCode
  inline def limit_wc: limit_wc = "limit_wc".asInstanceOf[limit_wc]
  
  @js.native
  sealed trait line
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait link
    extends StObject
       with SendType
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait linkedin
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def linkedin: linkedin = "linkedin".asInstanceOf[linkedin]
  
  @js.native
  sealed trait mfar
    extends StObject
       with LogEventTypeCode
  inline def mfar: mfar = "mfar".asInstanceOf[mfar]
  
  @js.native
  sealed trait mgmt_api_read
    extends StObject
       with LogEventTypeCode
  inline def mgmt_api_read: mgmt_api_read = "mgmt_api_read".asInstanceOf[mgmt_api_read]
  
  @js.native
  sealed trait miicard
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def miicard: miicard = "miicard".asInstanceOf[miicard]
  
  @js.native
  sealed trait mscrm
    extends StObject
       with ClientAppType
  inline def mscrm: mscrm = "mscrm".asInstanceOf[mscrm]
  
  @js.native
  sealed trait native
    extends StObject
       with ClientAppType
  inline def native: native = "native".asInstanceOf[native]
  
  @js.native
  sealed trait newrelic
    extends StObject
       with ClientAppType
  inline def newrelic: newrelic = "newrelic".asInstanceOf[newrelic]
  
  @js.native
  sealed trait non_interactive
    extends StObject
       with ClientAppType
  inline def non_interactive: non_interactive = "non_interactive".asInstanceOf[non_interactive]
  
  @js.native
  sealed trait oauth1
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def oauth1: oauth1 = "oauth1".asInstanceOf[oauth1]
  
  @js.native
  sealed trait oauth2
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def oauth2: oauth2 = "oauth2".asInstanceOf[oauth2]
  
  @js.native
  sealed trait office365
    extends StObject
       with ClientAppType
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def office365: office365 = "office365".asInstanceOf[office365]
  
  @js.native
  sealed trait oidc
    extends StObject
       with Strategy
  inline def oidc: oidc = "oidc".asInstanceOf[oidc]
  
  @js.native
  sealed trait password
    extends StObject
       with Grant
  inline def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait paypal
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def paypal: paypal = "paypal".asInstanceOf[paypal]
  
  @js.native
  sealed trait `paypal-sandbox`
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def `paypal-sandbox`: `paypal-sandbox` = "paypal-sandbox".asInstanceOf[`paypal-sandbox`]
  
  @js.native
  sealed trait pending
    extends StObject
       with CustomDomainStatus
       with EnrollmentStatus
       with JobStatus
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait pending_verification
    extends StObject
       with CustomDomainStatus
  inline def pending_verification: pending_verification = "pending_verification".asInstanceOf[pending_verification]
  
  @js.native
  sealed trait pingfederate
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def pingfederate: pingfederate = "pingfederate".asInstanceOf[pingfederate]
  
  @js.native
  sealed trait pla
    extends StObject
       with LogEventTypeCode
  inline def pla: pla = "pla".asInstanceOf[pla]
  
  @js.native
  sealed trait planningcenter
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def planningcenter: planningcenter = "planningcenter".asInstanceOf[planningcenter]
  
  @js.native
  sealed trait processing
    extends StObject
       with JobStatus
  inline def processing: processing = "processing".asInstanceOf[processing]
  
  @js.native
  sealed trait public_key extends StObject
  inline def public_key: public_key = "public_key".asInstanceOf[public_key]
  
  @js.native
  sealed trait pwd_leak
    extends StObject
       with LogEventTypeCode
  inline def pwd_leak: pwd_leak = "pwd_leak".asInstanceOf[pwd_leak]
  
  @js.native
  sealed trait ready
    extends StObject
       with CustomDomainStatus
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait refresh_token
    extends StObject
       with Grant
  inline def refresh_token: refresh_token = "refresh_token".asInstanceOf[refresh_token]
  
  @js.native
  sealed trait regular_web
    extends StObject
       with ClientAppType
  inline def regular_web: regular_web = "regular_web".asInstanceOf[regular_web]
  
  @js.native
  sealed trait renren
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def renren: renren = "renren".asInstanceOf[renren]
  
  @js.native
  sealed trait rms
    extends StObject
       with ClientAppType
  inline def rms: rms = "rms".asInstanceOf[rms]
  
  @js.native
  sealed trait rotating_refresh_token extends StObject
  inline def rotating_refresh_token: rotating_refresh_token = "rotating_refresh_token".asInstanceOf[rotating_refresh_token]
  
  @js.native
  sealed trait s
    extends StObject
       with LogEventTypeCode
  inline def s: s = "s".asInstanceOf[s]
  
  @js.native
  sealed trait salesforce
    extends StObject
       with ClientAppType
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def salesforce: salesforce = "salesforce".asInstanceOf[salesforce]
  
  @js.native
  sealed trait `salesforce-community`
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def `salesforce-community`: `salesforce-community` = "salesforce-community".asInstanceOf[`salesforce-community`]
  
  @js.native
  sealed trait `salesforce-sandbox`
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def `salesforce-sandbox`: `salesforce-sandbox` = "salesforce-sandbox".asInstanceOf[`salesforce-sandbox`]
  
  @js.native
  sealed trait samlp
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def samlp: samlp = "samlp".asInstanceOf[samlp]
  
  @js.native
  sealed trait sapi
    extends StObject
       with LogEventTypeCode
  inline def sapi: sapi = "sapi".asInstanceOf[sapi]
  
  @js.native
  sealed trait sce
    extends StObject
       with LogEventTypeCode
  inline def sce: sce = "sce".asInstanceOf[sce]
  
  @js.native
  sealed trait scoa
    extends StObject
       with LogEventTypeCode
  inline def scoa: scoa = "scoa".asInstanceOf[scoa]
  
  @js.native
  sealed trait scp
    extends StObject
       with LogEventTypeCode
  inline def scp: scp = "scp".asInstanceOf[scp]
  
  @js.native
  sealed trait scph
    extends StObject
       with LogEventTypeCode
  inline def scph: scph = "scph".asInstanceOf[scph]
  
  @js.native
  sealed trait scpn
    extends StObject
       with LogEventTypeCode
  inline def scpn: scpn = "scpn".asInstanceOf[scpn]
  
  @js.native
  sealed trait scpr
    extends StObject
       with LogEventTypeCode
  inline def scpr: scpr = "scpr".asInstanceOf[scpr]
  
  @js.native
  sealed trait scu
    extends StObject
       with LogEventTypeCode
  inline def scu: scu = "scu".asInstanceOf[scu]
  
  @js.native
  sealed trait sd
    extends StObject
       with LogEventTypeCode
  inline def sd: sd = "sd".asInstanceOf[sd]
  
  @js.native
  sealed trait sdu
    extends StObject
       with LogEventTypeCode
  inline def sdu: sdu = "sdu".asInstanceOf[sdu]
  
  @js.native
  sealed trait seacft
    extends StObject
       with LogEventTypeCode
  inline def seacft: seacft = "seacft".asInstanceOf[seacft]
  
  @js.native
  sealed trait seccft
    extends StObject
       with LogEventTypeCode
  inline def seccft: seccft = "seccft".asInstanceOf[seccft]
  
  @js.native
  sealed trait sede
    extends StObject
       with LogEventTypeCode
  inline def sede: sede = "sede".asInstanceOf[sede]
  
  @js.native
  sealed trait self_managed_certs
    extends StObject
       with CustomDomainType
  inline def self_managed_certs: self_managed_certs = "self_managed_certs".asInstanceOf[self_managed_certs]
  
  @js.native
  sealed trait sens
    extends StObject
       with LogEventTypeCode
  inline def sens: sens = "sens".asInstanceOf[sens]
  
  @js.native
  sealed trait sentry
    extends StObject
       with ClientAppType
  inline def sentry: sentry = "sentry".asInstanceOf[sentry]
  
  @js.native
  sealed trait seoobft
    extends StObject
       with LogEventTypeCode
  inline def seoobft: seoobft = "seoobft".asInstanceOf[seoobft]
  
  @js.native
  sealed trait seotpft
    extends StObject
       with LogEventTypeCode
  inline def seotpft: seotpft = "seotpft".asInstanceOf[seotpft]
  
  @js.native
  sealed trait sepft
    extends StObject
       with LogEventTypeCode
  inline def sepft: sepft = "sepft".asInstanceOf[sepft]
  
  @js.native
  sealed trait sercft
    extends StObject
       with LogEventTypeCode
  inline def sercft: sercft = "sercft".asInstanceOf[sercft]
  
  @js.native
  sealed trait sertft
    extends StObject
       with LogEventTypeCode
  inline def sertft: sertft = "sertft".asInstanceOf[sertft]
  
  @js.native
  sealed trait sharepoint
    extends StObject
       with ClientAppType
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def sharepoint: sharepoint = "sharepoint".asInstanceOf[sharepoint]
  
  @js.native
  sealed trait shopify
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def shopify: shopify = "shopify".asInstanceOf[shopify]
  
  @js.native
  sealed trait si
    extends StObject
       with LogEventTypeCode
  inline def si: si = "si".asInstanceOf[si]
  
  @js.native
  sealed trait slack
    extends StObject
       with ClientAppType
  inline def slack: slack = "slack".asInstanceOf[slack]
  
  @js.native
  sealed trait slo
    extends StObject
       with LogEventTypeCode
  inline def slo: slo = "slo".asInstanceOf[slo]
  
  @js.native
  sealed trait sms
    extends StObject
       with AuthMethod
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def sms: sms = "sms".asInstanceOf[sms]
  
  @js.native
  sealed trait soundcloud
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def soundcloud: soundcloud = "soundcloud".asInstanceOf[soundcloud]
  
  @js.native
  sealed trait spa
    extends StObject
       with ClientAppType
  inline def spa: spa = "spa".asInstanceOf[spa]
  
  @js.native
  sealed trait springcm
    extends StObject
       with ClientAppType
  inline def springcm: springcm = "springcm".asInstanceOf[springcm]
  
  @js.native
  sealed trait srrt
    extends StObject
       with LogEventTypeCode
  inline def srrt: srrt = "srrt".asInstanceOf[srrt]
  
  @js.native
  sealed trait ss
    extends StObject
       with LogEventTypeCode
  inline def ss: ss = "ss".asInstanceOf[ss]
  
  @js.native
  sealed trait ssa
    extends StObject
       with LogEventTypeCode
  inline def ssa: ssa = "ssa".asInstanceOf[ssa]
  
  @js.native
  sealed trait sui
    extends StObject
       with LogEventTypeCode
  inline def sui: sui = "sui".asInstanceOf[sui]
  
  @js.native
  sealed trait sv
    extends StObject
       with LogEventTypeCode
  inline def sv: sv = "sv".asInstanceOf[sv]
  
  @js.native
  sealed trait svr
    extends StObject
       with LogEventTypeCode
  inline def svr: svr = "svr".asInstanceOf[svr]
  
  @js.native
  sealed trait sys_os_update_end
    extends StObject
       with LogEventTypeCode
  inline def sys_os_update_end: sys_os_update_end = "sys_os_update_end".asInstanceOf[sys_os_update_end]
  
  @js.native
  sealed trait sys_os_update_start
    extends StObject
       with LogEventTypeCode
  inline def sys_os_update_start: sys_os_update_start = "sys_os_update_start".asInstanceOf[sys_os_update_start]
  
  @js.native
  sealed trait sys_update_end
    extends StObject
       with LogEventTypeCode
  inline def sys_update_end: sys_update_end = "sys_update_end".asInstanceOf[sys_update_end]
  
  @js.native
  sealed trait sys_update_start
    extends StObject
       with LogEventTypeCode
  inline def sys_update_start: sys_update_start = "sys_update_start".asInstanceOf[sys_update_start]
  
  @js.native
  sealed trait thecity
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def thecity: thecity = "thecity".asInstanceOf[thecity]
  
  @js.native
  sealed trait `thecity-sandbox`
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def `thecity-sandbox`: `thecity-sandbox` = "thecity-sandbox".asInstanceOf[`thecity-sandbox`]
  
  @js.native
  sealed trait thirtysevensignals
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def thirtysevensignals: thirtysevensignals = "thirtysevensignals".asInstanceOf[thirtysevensignals]
  
  @js.native
  sealed trait twitter
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def twitter: twitter = "twitter".asInstanceOf[twitter]
  
  @js.native
  sealed trait txt extends StObject
  inline def txt: txt = "txt".asInstanceOf[txt]
  
  @js.native
  sealed trait ublkdu
    extends StObject
       with LogEventTypeCode
  inline def ublkdu: ublkdu = "ublkdu".asInstanceOf[ublkdu]
  
  @js.native
  sealed trait untappd
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def untappd: untappd = "untappd".asInstanceOf[untappd]
  
  @js.native
  sealed trait users_export extends StObject
  inline def users_export: users_export = "users_export".asInstanceOf[users_export]
  
  @js.native
  sealed trait users_import extends StObject
  inline def users_import: users_import = "users_import".asInstanceOf[users_import]
  
  @js.native
  sealed trait verification_email extends StObject
  inline def verification_email: verification_email = "verification_email".asInstanceOf[verification_email]
  
  @js.native
  sealed trait vkontakte
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def vkontakte: vkontakte = "vkontakte".asInstanceOf[vkontakte]
  
  @js.native
  sealed trait w
    extends StObject
       with LogEventTypeCode
  inline def w: w = "w".asInstanceOf[w]
  
  @js.native
  sealed trait waad
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def waad: waad = "waad".asInstanceOf[waad]
  
  @js.native
  sealed trait weibo
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def weibo: weibo = "weibo".asInstanceOf[weibo]
  
  @js.native
  sealed trait windowslive
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def windowslive: windowslive = "windowslive".asInstanceOf[windowslive]
  
  @js.native
  sealed trait wordpress
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def wordpress: wordpress = "wordpress".asInstanceOf[wordpress]
  
  @js.native
  sealed trait yahoo
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def yahoo: yahoo = "yahoo".asInstanceOf[yahoo]
  
  @js.native
  sealed trait yammer
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def yammer: yammer = "yammer".asInstanceOf[yammer]
  
  @js.native
  sealed trait yandex
    extends StObject
       with Strategy
       with UnlinkAccountsParamsProvider
  inline def yandex: yandex = "yandex".asInstanceOf[yandex]
  
  @js.native
  sealed trait zendesk
    extends StObject
       with ClientAppType
  inline def zendesk: zendesk = "zendesk".asInstanceOf[zendesk]
  
  @js.native
  sealed trait zoom
    extends StObject
       with ClientAppType
  inline def zoom: zoom = "zoom".asInstanceOf[zoom]
}

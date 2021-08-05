package typings.auth0

import typings.auth0.mod.ClientAppType
import typings.auth0.mod.CustomDomainStatus
import typings.auth0.mod.CustomDomainType
import typings.auth0.mod.DeleteDeleteMultifactorParamsProvider
import typings.auth0.mod.Grant
import typings.auth0.mod.JobFormat
import typings.auth0.mod.JobStatus
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
  sealed trait self_managed_certs
    extends StObject
       with CustomDomainType
  inline def self_managed_certs: self_managed_certs = "self_managed_certs".asInstanceOf[self_managed_certs]
  
  @js.native
  sealed trait sentry
    extends StObject
       with ClientAppType
  inline def sentry: sentry = "sentry".asInstanceOf[sentry]
  
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
  sealed trait slack
    extends StObject
       with ClientAppType
  inline def slack: slack = "slack".asInstanceOf[slack]
  
  @js.native
  sealed trait sms
    extends StObject
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

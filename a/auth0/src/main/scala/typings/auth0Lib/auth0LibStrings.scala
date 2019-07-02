package typings
package auth0Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object auth0LibStrings {
  @js.native
  sealed trait HS256 extends js.Object
  
  @js.native
  sealed trait RS256 extends js.Object
  
  @js.native
  sealed trait ad
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait adfs
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait amazon
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait aol
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait auth0
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait `auth0-adldap`
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait `auth0-oidc`
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait authorization_code
    extends auth0Lib.auth0Mod.Grant
  
  @js.native
  sealed trait baidu
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait bitbucket
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait bitly
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait box
    extends auth0Lib.auth0Mod.ClientAppType
       with auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait client_credentials
    extends auth0Lib.auth0Mod.Grant
  
  @js.native
  sealed trait cloudbees
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait code
    extends auth0Lib.auth0Mod.SendType
  
  @js.native
  sealed trait completed
    extends auth0Lib.auth0Mod.JobStatus
  
  @js.native
  sealed trait concur
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait csv
    extends auth0Lib.auth0Mod.JobFormat
  
  @js.native
  sealed trait custom
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait daccount
    extends auth0Lib.auth0Mod.Strategy
  
  @js.native
  sealed trait dropbox
    extends auth0Lib.auth0Mod.ClientAppType
       with auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait duo
    extends auth0Lib.auth0Mod.DeleteDeleteMultifactorParamsProvider
  
  @js.native
  sealed trait dwolla
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait echosign
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait egnyte
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait email
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait evernote
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait `evernote-sandbox`
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait exact
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait facebook
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait failed
    extends auth0Lib.auth0Mod.JobStatus
  
  @js.native
  sealed trait fitbit
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait flickr
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait github
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait `google-apps`
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait `google-authenticator`
    extends auth0Lib.auth0Mod.DeleteDeleteMultifactorParamsProvider
  
  @js.native
  sealed trait `google-oauth2`
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait guardian
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait `implicit`
    extends auth0Lib.auth0Mod.Grant
  
  @js.native
  sealed trait instagram
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait ip
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait json
    extends auth0Lib.auth0Mod.JobFormat
  
  @js.native
  sealed trait link
    extends auth0Lib.auth0Mod.SendType
  
  @js.native
  sealed trait linkedin
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait miicard
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait mscrm
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait native
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait newrelic
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait non_interactive
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait oauth1
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait oauth2
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait office365
    extends auth0Lib.auth0Mod.ClientAppType
       with auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait password
    extends auth0Lib.auth0Mod.Grant
  
  @js.native
  sealed trait paypal
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait `paypal-sandbox`
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait pending
    extends auth0Lib.auth0Mod.JobStatus
  
  @js.native
  sealed trait pingfederate
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait planningcenter
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait processing
    extends auth0Lib.auth0Mod.JobStatus
  
  @js.native
  sealed trait refresh_token
    extends auth0Lib.auth0Mod.Grant
  
  @js.native
  sealed trait regular_web
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait renren
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait rms
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait salesforce
    extends auth0Lib.auth0Mod.ClientAppType
       with auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait `salesforce-community`
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait `salesforce-sandbox`
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait samlp
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait scope extends js.Object
  
  @js.native
  sealed trait sentry
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait sharepoint
    extends auth0Lib.auth0Mod.ClientAppType
       with auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait shopify
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait slack
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait sms
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait soundcloud
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait spa
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait springcm
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait thecity
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait `thecity-sandbox`
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait thirtysevensignals
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait twitter
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait untappd
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait users_export extends js.Object
  
  @js.native
  sealed trait users_import extends js.Object
  
  @js.native
  sealed trait verification_email extends js.Object
  
  @js.native
  sealed trait vkontakte
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait waad
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait weibo
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait windowslive
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait wordpress
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait yahoo
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait yammer
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait yandex
    extends auth0Lib.auth0Mod.Strategy
       with auth0Lib.auth0Mod.UnlinkAccountsParamsProvider
  
  @js.native
  sealed trait zendesk
    extends auth0Lib.auth0Mod.ClientAppType
  
  @js.native
  sealed trait zoom
    extends auth0Lib.auth0Mod.ClientAppType
  
  @scala.inline
  def HS256: HS256 = "HS256".asInstanceOf[HS256]
  @scala.inline
  def RS256: RS256 = "RS256".asInstanceOf[RS256]
  @scala.inline
  def ad: ad = "ad".asInstanceOf[ad]
  @scala.inline
  def adfs: adfs = "adfs".asInstanceOf[adfs]
  @scala.inline
  def amazon: amazon = "amazon".asInstanceOf[amazon]
  @scala.inline
  def aol: aol = "aol".asInstanceOf[aol]
  @scala.inline
  def auth0: auth0 = "auth0".asInstanceOf[auth0]
  @scala.inline
  def `auth0-adldap`: `auth0-adldap` = "auth0-adldap".asInstanceOf[`auth0-adldap`]
  @scala.inline
  def `auth0-oidc`: `auth0-oidc` = "auth0-oidc".asInstanceOf[`auth0-oidc`]
  @scala.inline
  def authorization_code: authorization_code = "authorization_code".asInstanceOf[authorization_code]
  @scala.inline
  def baidu: baidu = "baidu".asInstanceOf[baidu]
  @scala.inline
  def bitbucket: bitbucket = "bitbucket".asInstanceOf[bitbucket]
  @scala.inline
  def bitly: bitly = "bitly".asInstanceOf[bitly]
  @scala.inline
  def box: box = "box".asInstanceOf[box]
  @scala.inline
  def client_credentials: client_credentials = "client_credentials".asInstanceOf[client_credentials]
  @scala.inline
  def cloudbees: cloudbees = "cloudbees".asInstanceOf[cloudbees]
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  @scala.inline
  def concur: concur = "concur".asInstanceOf[concur]
  @scala.inline
  def csv: csv = "csv".asInstanceOf[csv]
  @scala.inline
  def custom: custom = "custom".asInstanceOf[custom]
  @scala.inline
  def daccount: daccount = "daccount".asInstanceOf[daccount]
  @scala.inline
  def dropbox: dropbox = "dropbox".asInstanceOf[dropbox]
  @scala.inline
  def duo: duo = "duo".asInstanceOf[duo]
  @scala.inline
  def dwolla: dwolla = "dwolla".asInstanceOf[dwolla]
  @scala.inline
  def echosign: echosign = "echosign".asInstanceOf[echosign]
  @scala.inline
  def egnyte: egnyte = "egnyte".asInstanceOf[egnyte]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def evernote: evernote = "evernote".asInstanceOf[evernote]
  @scala.inline
  def `evernote-sandbox`: `evernote-sandbox` = "evernote-sandbox".asInstanceOf[`evernote-sandbox`]
  @scala.inline
  def exact: exact = "exact".asInstanceOf[exact]
  @scala.inline
  def facebook: facebook = "facebook".asInstanceOf[facebook]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def fitbit: fitbit = "fitbit".asInstanceOf[fitbit]
  @scala.inline
  def flickr: flickr = "flickr".asInstanceOf[flickr]
  @scala.inline
  def github: github = "github".asInstanceOf[github]
  @scala.inline
  def `google-apps`: `google-apps` = "google-apps".asInstanceOf[`google-apps`]
  @scala.inline
  def `google-authenticator`: `google-authenticator` = "google-authenticator".asInstanceOf[`google-authenticator`]
  @scala.inline
  def `google-oauth2`: `google-oauth2` = "google-oauth2".asInstanceOf[`google-oauth2`]
  @scala.inline
  def guardian: guardian = "guardian".asInstanceOf[guardian]
  @scala.inline
  def `implicit`: `implicit` = "implicit".asInstanceOf[`implicit`]
  @scala.inline
  def instagram: instagram = "instagram".asInstanceOf[instagram]
  @scala.inline
  def ip: ip = "ip".asInstanceOf[ip]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  @scala.inline
  def linkedin: linkedin = "linkedin".asInstanceOf[linkedin]
  @scala.inline
  def miicard: miicard = "miicard".asInstanceOf[miicard]
  @scala.inline
  def mscrm: mscrm = "mscrm".asInstanceOf[mscrm]
  @scala.inline
  def native: native = "native".asInstanceOf[native]
  @scala.inline
  def newrelic: newrelic = "newrelic".asInstanceOf[newrelic]
  @scala.inline
  def non_interactive: non_interactive = "non_interactive".asInstanceOf[non_interactive]
  @scala.inline
  def oauth1: oauth1 = "oauth1".asInstanceOf[oauth1]
  @scala.inline
  def oauth2: oauth2 = "oauth2".asInstanceOf[oauth2]
  @scala.inline
  def office365: office365 = "office365".asInstanceOf[office365]
  @scala.inline
  def password: password = "password".asInstanceOf[password]
  @scala.inline
  def paypal: paypal = "paypal".asInstanceOf[paypal]
  @scala.inline
  def `paypal-sandbox`: `paypal-sandbox` = "paypal-sandbox".asInstanceOf[`paypal-sandbox`]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def pingfederate: pingfederate = "pingfederate".asInstanceOf[pingfederate]
  @scala.inline
  def planningcenter: planningcenter = "planningcenter".asInstanceOf[planningcenter]
  @scala.inline
  def processing: processing = "processing".asInstanceOf[processing]
  @scala.inline
  def refresh_token: refresh_token = "refresh_token".asInstanceOf[refresh_token]
  @scala.inline
  def regular_web: regular_web = "regular_web".asInstanceOf[regular_web]
  @scala.inline
  def renren: renren = "renren".asInstanceOf[renren]
  @scala.inline
  def rms: rms = "rms".asInstanceOf[rms]
  @scala.inline
  def salesforce: salesforce = "salesforce".asInstanceOf[salesforce]
  @scala.inline
  def `salesforce-community`: `salesforce-community` = "salesforce-community".asInstanceOf[`salesforce-community`]
  @scala.inline
  def `salesforce-sandbox`: `salesforce-sandbox` = "salesforce-sandbox".asInstanceOf[`salesforce-sandbox`]
  @scala.inline
  def samlp: samlp = "samlp".asInstanceOf[samlp]
  @scala.inline
  def scope: scope = "scope".asInstanceOf[scope]
  @scala.inline
  def sentry: sentry = "sentry".asInstanceOf[sentry]
  @scala.inline
  def sharepoint: sharepoint = "sharepoint".asInstanceOf[sharepoint]
  @scala.inline
  def shopify: shopify = "shopify".asInstanceOf[shopify]
  @scala.inline
  def slack: slack = "slack".asInstanceOf[slack]
  @scala.inline
  def sms: sms = "sms".asInstanceOf[sms]
  @scala.inline
  def soundcloud: soundcloud = "soundcloud".asInstanceOf[soundcloud]
  @scala.inline
  def spa: spa = "spa".asInstanceOf[spa]
  @scala.inline
  def springcm: springcm = "springcm".asInstanceOf[springcm]
  @scala.inline
  def thecity: thecity = "thecity".asInstanceOf[thecity]
  @scala.inline
  def `thecity-sandbox`: `thecity-sandbox` = "thecity-sandbox".asInstanceOf[`thecity-sandbox`]
  @scala.inline
  def thirtysevensignals: thirtysevensignals = "thirtysevensignals".asInstanceOf[thirtysevensignals]
  @scala.inline
  def twitter: twitter = "twitter".asInstanceOf[twitter]
  @scala.inline
  def untappd: untappd = "untappd".asInstanceOf[untappd]
  @scala.inline
  def users_export: users_export = "users_export".asInstanceOf[users_export]
  @scala.inline
  def users_import: users_import = "users_import".asInstanceOf[users_import]
  @scala.inline
  def verification_email: verification_email = "verification_email".asInstanceOf[verification_email]
  @scala.inline
  def vkontakte: vkontakte = "vkontakte".asInstanceOf[vkontakte]
  @scala.inline
  def waad: waad = "waad".asInstanceOf[waad]
  @scala.inline
  def weibo: weibo = "weibo".asInstanceOf[weibo]
  @scala.inline
  def windowslive: windowslive = "windowslive".asInstanceOf[windowslive]
  @scala.inline
  def wordpress: wordpress = "wordpress".asInstanceOf[wordpress]
  @scala.inline
  def yahoo: yahoo = "yahoo".asInstanceOf[yahoo]
  @scala.inline
  def yammer: yammer = "yammer".asInstanceOf[yammer]
  @scala.inline
  def yandex: yandex = "yandex".asInstanceOf[yandex]
  @scala.inline
  def zendesk: zendesk = "zendesk".asInstanceOf[zendesk]
  @scala.inline
  def zoom: zoom = "zoom".asInstanceOf[zoom]
}


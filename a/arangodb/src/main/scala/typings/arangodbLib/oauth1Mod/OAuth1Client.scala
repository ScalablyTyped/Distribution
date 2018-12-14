package typings
package arangodbLib.oauth1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth1Client extends js.Object {
  def createSignedRequest(
    method: arangodbLib.ArangoDBNs.HttpMethod,
    url: java.lang.String,
    parameters: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String
  ): arangodbLib.Anon_Qs = js.native
  def createSignedRequest(
    method: arangodbLib.ArangoDBNs.HttpMethod,
    url: java.lang.String,
    parameters: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]],
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String
  ): arangodbLib.Anon_Qs = js.native
  def createSignedRequest(
    method: arangodbLib.ArangoDBNs.HttpMethod,
    url: java.lang.String,
    parameters: scala.Null,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String
  ): arangodbLib.Anon_Qs = js.native
  def exchangeRequestToken(oauth_token: java.lang.String, oauth_verifier: java.lang.String): js.Any = js.native
  def exchangeRequestToken(
    oauth_token: java.lang.String,
    oauth_verifier: java.lang.String,
    qs: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  ): js.Any = js.native
  def fetchActiveUser(oauth_token: java.lang.String, oauth_token_secret: java.lang.String): js.Any = js.native
  def fetchActiveUser(
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    qs: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  ): js.Any = js.native
  def fetchRequestToken(oauth_callback: java.lang.String): js.Any = js.native
  def fetchRequestToken(
    oauth_callback: java.lang.String,
    qs: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  ): js.Any = js.native
  def getAuthUrl(oauth_token: java.lang.String): java.lang.String = js.native
  def getAuthUrl(
    oauth_token: java.lang.String,
    qs: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  ): java.lang.String = js.native
}


package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofurl extends js.Object {
  var URL: org.scalablytyped.runtime.Instantiable1[/* input */ java.lang.String, adoneLib.glossesStdMod.urlNs.URL] = js.native
  var URLSearchParams: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.urlNs.URLSearchParams] = js.native
  def domainToASCII(domain: java.lang.String): java.lang.String = js.native
  def domainToUnicode(domain: java.lang.String): java.lang.String = js.native
  /**
    * This function ensures the correct decodings of percent-encoded characters as
    * well as ensuring a cross-platform valid absolute path string.
    * @param url The file URL string or URL object to convert to a path.
    */
  def fileURLToPath(url: java.lang.String): java.lang.String = js.native
  def fileURLToPath(url: nodeLib.urlMod.URL): java.lang.String = js.native
  def format(URL: nodeLib.urlMod.URL): java.lang.String = js.native
  def format(URL: nodeLib.urlMod.URL, options: nodeLib.urlMod.URLFormatOptions): java.lang.String = js.native
  def format(urlObject: java.lang.String): java.lang.String = js.native
  def format(urlObject: nodeLib.urlMod.UrlObject): java.lang.String = js.native
  def parse(urlStr: java.lang.String): nodeLib.urlMod.UrlWithStringQuery = js.native
  def parse(urlStr: java.lang.String, parseQueryString: adoneLib.adoneLibNumbers.`false`): nodeLib.urlMod.UrlWithStringQuery = js.native
  def parse(
    urlStr: java.lang.String,
    parseQueryString: adoneLib.adoneLibNumbers.`false`,
    slashesDenoteHost: scala.Boolean
  ): nodeLib.urlMod.UrlWithStringQuery = js.native
  def parse(urlStr: java.lang.String, parseQueryString: adoneLib.adoneLibNumbers.`true`): nodeLib.urlMod.UrlWithParsedQuery = js.native
  def parse(
    urlStr: java.lang.String,
    parseQueryString: adoneLib.adoneLibNumbers.`true`,
    slashesDenoteHost: scala.Boolean
  ): nodeLib.urlMod.UrlWithParsedQuery = js.native
  def parse(
    urlStr: java.lang.String,
    parseQueryString: js.UndefOr[scala.Nothing],
    slashesDenoteHost: scala.Boolean
  ): nodeLib.urlMod.UrlWithStringQuery = js.native
  def parse(urlStr: java.lang.String, parseQueryString: scala.Boolean): nodeLib.urlMod.Url = js.native
  def parse(urlStr: java.lang.String, parseQueryString: scala.Boolean, slashesDenoteHost: scala.Boolean): nodeLib.urlMod.Url = js.native
  /**
    * This function ensures that path is resolved absolutely, and that the URL
    * control characters are correctly encoded when converting into a File URL.
    * @param url The path to convert to a File URL.
    */
  def pathToFileURL(url: java.lang.String): nodeLib.urlMod.URL = js.native
  def resolve(from: java.lang.String, to: java.lang.String): java.lang.String = js.native
}


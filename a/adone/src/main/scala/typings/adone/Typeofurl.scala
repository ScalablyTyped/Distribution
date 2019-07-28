package typings.adone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.adone.adoneNumbers.`false`
import typings.adone.adoneNumbers.`true`
import typings.node.urlMod.URL
import typings.node.urlMod.URLFormatOptions
import typings.node.urlMod.Url
import typings.node.urlMod.UrlObject
import typings.node.urlMod.UrlWithParsedQuery
import typings.node.urlMod.UrlWithStringQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofurl extends js.Object {
  var URL: Instantiable1[/* input */ String, typings.adone.glossesStdMod.urlNs.URL] = js.native
  var URLSearchParams: Instantiable0[typings.adone.glossesStdMod.urlNs.URLSearchParams] = js.native
  def domainToASCII(domain: String): String = js.native
  def domainToUnicode(domain: String): String = js.native
  /**
    * This function ensures the correct decodings of percent-encoded characters as
    * well as ensuring a cross-platform valid absolute path string.
    * @param url The file URL string or URL object to convert to a path.
    */
  def fileURLToPath(url: String): String = js.native
  def fileURLToPath(url: URL): String = js.native
  def format(URL: URL): String = js.native
  def format(URL: URL, options: URLFormatOptions): String = js.native
  def format(urlObject: String): String = js.native
  def format(urlObject: UrlObject): String = js.native
  def parse(urlStr: String): UrlWithStringQuery = js.native
  def parse(urlStr: String, parseQueryString: js.UndefOr[scala.Nothing], slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
  def parse(urlStr: String, parseQueryString: Boolean): Url = js.native
  def parse(urlStr: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url = js.native
  @JSName("parse")
  def parse_false(urlStr: String, parseQueryString: `false`): UrlWithStringQuery = js.native
  @JSName("parse")
  def parse_false(urlStr: String, parseQueryString: `false`, slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
  @JSName("parse")
  def parse_true(urlStr: String, parseQueryString: `true`): UrlWithParsedQuery = js.native
  @JSName("parse")
  def parse_true(urlStr: String, parseQueryString: `true`, slashesDenoteHost: Boolean): UrlWithParsedQuery = js.native
  /**
    * This function ensures that path is resolved absolutely, and that the URL
    * control characters are correctly encoded when converting into a File URL.
    * @param url The path to convert to a File URL.
    */
  def pathToFileURL(url: String): URL = js.native
  def resolve(from: String, to: String): String = js.native
}


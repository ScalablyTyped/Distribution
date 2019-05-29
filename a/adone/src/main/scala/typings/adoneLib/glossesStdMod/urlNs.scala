package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "url")
@js.native
object urlNs extends js.Object {
  @js.native
  class URL protected ()
    extends nodeLib.urlMod.URL {
    def this(input: java.lang.String) = this()
    def this(input: java.lang.String, base: java.lang.String) = this()
    def this(input: java.lang.String, base: nodeLib.urlMod.URL) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends nodeLib.urlMod.URLSearchParams {
    def this(init: java.lang.String) = this()
    def this(init: js.Array[js.Tuple2[java.lang.String, java.lang.String]]) = this()
    def this(init: nodeLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]]) = this()
    def this(init: nodeLib.urlMod.URLSearchParams) = this()
    def this(init: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]]) = this()
  }
  
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
  def parse(
    urlStr: java.lang.String,
    parseQueryString: js.UndefOr[scala.Nothing],
    slashesDenoteHost: scala.Boolean
  ): nodeLib.urlMod.UrlWithStringQuery = js.native
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


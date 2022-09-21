package typings.autolinker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uriUtilsMod {
  
  @JSImport("autolinker/dist/commonjs/parser/uri-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("autolinker/dist/commonjs/parser/uri-utils", "domainNameCharRegex")
  @js.native
  val domainNameCharRegex: js.RegExp = js.native
  
  @JSImport("autolinker/dist/commonjs/parser/uri-utils", "httpSchemePrefixRe")
  @js.native
  val httpSchemePrefixRe: js.RegExp = js.native
  
  @JSImport("autolinker/dist/commonjs/parser/uri-utils", "httpSchemeRe")
  @js.native
  val httpSchemeRe: js.RegExp = js.native
  
  @JSImport("autolinker/dist/commonjs/parser/uri-utils", "invalidSchemeRe")
  @js.native
  val invalidSchemeRe: js.RegExp = js.native
  
  inline def isDomainLabelChar(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomainLabelChar")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDomainLabelStartChar(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomainLabelStartChar")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isKnownTld(tld: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKnownTld")(tld.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPathChar(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPathChar")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSchemeChar(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSchemeChar")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSchemeStartChar(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSchemeStartChar")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUrlSuffixStartChar(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlSuffixStartChar")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidIpV4Address(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidIpV4Address")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidSchemeUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidSchemeUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidTldMatch(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTldMatch")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("autolinker/dist/commonjs/parser/uri-utils", "schemeUrlRe")
  @js.native
  val schemeUrlRe: js.RegExp = js.native
  
  @JSImport("autolinker/dist/commonjs/parser/uri-utils", "tldUrlHostRe")
  @js.native
  val tldUrlHostRe: js.RegExp = js.native
  
  @JSImport("autolinker/dist/commonjs/parser/uri-utils", "urlSuffixAllowedSpecialCharsRe")
  @js.native
  val urlSuffixAllowedSpecialCharsRe: js.RegExp = js.native
  
  @JSImport("autolinker/dist/commonjs/parser/uri-utils", "urlSuffixNotAllowedAsLastCharRe")
  @js.native
  val urlSuffixNotAllowedAsLastCharRe: js.RegExp = js.native
  
  @JSImport("autolinker/dist/commonjs/parser/uri-utils", "urlSuffixStartCharsRe")
  @js.native
  val urlSuffixStartCharsRe: js.RegExp = js.native
  
  @JSImport("autolinker/dist/commonjs/parser/uri-utils", "urlSuffixedCharsNotAllowedAtEndRe")
  @js.native
  val urlSuffixedCharsNotAllowedAtEndRe: js.RegExp = js.native
}

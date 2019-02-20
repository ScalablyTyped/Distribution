package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uriNs {
  /**
    * translates between external and internal URI references.
    * @since OOo 2.0
    */
  type ExternalUriReferenceTranslator = XExternalUriReferenceTranslator
  /**
    * creates URI references.
    *
    * See [RFC   2396]{@link url="http://www.ietf.org/rfc/rfc2396.txt"} for a description of URI references and related terms.
    *
    * For parsing absolute URI references, this service tries to use a scheme-specific parser. Such a scheme-specific parser will typically enforce
    * additional restrictions during parsing, and will typically return objects that support extra, scheme-specific interfaces in addition to {@link
    * com.sun.star.uri.XUriReference} . If no such parser is found, and for relative URI references, a generic parser is used, which returns objects that
    * only support {@link com.sun.star.uri.XUriReference} .
    *
    * Locating a scheme-specific parser works as follows: A scheme consists of Latin capital letters "`A`" - "`Z`" , Latin small letters "`a`" - "`z`" ,
    * digits "`0`" - "`9`" , "`+`" , "`-`" , and "`.`" . A scheme  **s** is transformed into a string  **s**' character-by-character, by translating Latin
    * capital letters to their small counterparts, translating "`+`" to "`PLUS`" , "`-`" to "`HYPHEN`" , "`.`" to "`DOT`" , and copying Latin small letters
    * and digits unchanged. If the component context used while creating this `UriReferenceFactory` instance offers a service manager, and there is a
    * service available at that service manager whose name is the concatenation of "`com.sun.star.uri.UriSchemeParser_`" and **s**' , then that service is
    * used. It is an error if that service does not support {@link com.sun.star.uri.XUriSchemeParser} .
    * @since OOo 2.0
    */
  type UriReferenceFactory = XUriReferenceFactory
  /**
    * parses textual representations of absolute " vnd.sun.star.expand " URLs.
    *
    * The argument `scheme` of method {@link com.sun.star.uri.XUriSchemeParser.parse()} must always be equal to the `string``"vnd.sun.star.expand"` ,
    * ignoring case. The objects returned by {@link com.sun.star.uri.XUriSchemeParser.parse()} implement {@link
    * com.sun.star.uri.XVndSunStarExpandUrlReference} .
    *
    * This service is not intended to be instantiated directly by client code. Rather, it should be used indirectly through the {@link
    * com.sun.star.uri.UriReferenceFactory} service.
    * @since OOo 2.3
    */
  type UriSchemeParser_vndDOTsunDOTstarDOTexpand = XUriSchemeParser
  /**
    * parses textual representations of absolute " vnd.sun.star.script " URLs.
    *
    * The argument `scheme` of method {@link com.sun.star.uri.XUriSchemeParser.parse()} must always be equal to the `string``"vnd.sun.star.script"` ,
    * ignoring case. The objects returned by {@link com.sun.star.uri.XUriSchemeParser.parse()} implement {@link
    * com.sun.star.uri.XVndSunStarScriptUrlReference} .
    *
    * This service is not intended to be instantiated directly by client code. Rather, it should be used indirectly through the {@link
    * com.sun.star.uri.UriReferenceFactory} service.
    * @since OOo 2.0
    */
  type UriSchemeParser_vndDOTsunDOTstarDOTscript = XUriSchemeParser
  /**
    * creates " vnd.sun.star.pkg " URL references.
    * @since OOo 2.0
    */
  type VndSunStarPkgUrlReferenceFactory = XVndSunStarPkgUrlReferenceFactory
}

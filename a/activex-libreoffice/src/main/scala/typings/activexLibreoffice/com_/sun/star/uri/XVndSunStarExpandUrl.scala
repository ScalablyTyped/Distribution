package typings.activexLibreoffice.com_.sun.star.uri

import typings.activexLibreoffice.com_.sun.star.util.XMacroExpander
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents absolute " vnd.sun.star.expand " URLs.
  *
  * These URLs are of the form ;    **vnd-sun-star-expand-url** = `"VND.SUN.STAR.EXPAND:"`**opaque_part**;  where the **opaque_part** is an UTF-8 string
  * as described in [Bootstrap Arguments and Micro Deployment]{@link url="http://udk.openoffice.org/common/man/concept/micro_deployment.html"} . See [RFC
  *  2396]{@link url="http://www.ietf.org/rfc/rfc2396.txt"} , [RFC   2732]{@link url="http://www.ietf.org/rfc/rfc2732.txt"} , and [RFC   2234]{@link
  * url="http://www.ietf.org/rfc/rfc2234.txt"} for details.
  * @since OOo 2.3
  */
trait XVndSunStarExpandUrl extends js.Object {
  /**
    * returns the expanded content of this URL.
    * @param expander a macro expander; must not be `NULL` .
    * @returns the expanded content of this URL.
    * @throws com::sun::star::lang::IllegalArgumentException if calling {@link com.sun.star.util.XMacroExpander.expandMacros()} on `expander` raises any such e
    */
  def expand(expander: XMacroExpander): String
}

object XVndSunStarExpandUrl {
  @scala.inline
  def apply(expand: XMacroExpander => String): XVndSunStarExpandUrl = {
    val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand))
    __obj.asInstanceOf[XVndSunStarExpandUrl]
  }
}


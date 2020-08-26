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
@js.native
trait XVndSunStarExpandUrl extends js.Object {
  /**
    * returns the expanded content of this URL.
    * @param expander a macro expander; must not be `NULL` .
    * @returns the expanded content of this URL.
    * @throws com::sun::star::lang::IllegalArgumentException if calling {@link com.sun.star.util.XMacroExpander.expandMacros()} on `expander` raises any such e
    */
  def expand(expander: XMacroExpander): String = js.native
}

object XVndSunStarExpandUrl {
  @scala.inline
  def apply(expand: XMacroExpander => String): XVndSunStarExpandUrl = {
    val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand))
    __obj.asInstanceOf[XVndSunStarExpandUrl]
  }
  @scala.inline
  implicit class XVndSunStarExpandUrlOps[Self <: XVndSunStarExpandUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpand(value: XMacroExpander => String): Self = this.set("expand", js.Any.fromFunction1(value))
  }
  
}


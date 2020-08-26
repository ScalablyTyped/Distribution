package typings.activexLibreoffice.com_.sun.star.uri

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents absolute " vnd.sun.star.script " URLs.
  *
  * These URLs are of the form ;    **vnd-sun-star-script-url** = `"VND.SUN.STAR.SCRIPT:"`**name** [ `"?"`**parameter** *( `"&"`**parameter** )] ;
  * **name** = 1* **schar**;    **parameter** = **key**`"="`**value**;    **key** = 1* **schar**;    **value** = * **schar**;    **schar** =
  * **unreserved** / **escaped** / `"$"` / `"+"` / `","` / `":"` / `";"` / `"@"` / `"["` / `"]"`;  See [RFC   2396]{@link
  * url="http://www.ietf.org/rfc/rfc2396.txt"} , [RFC   2732]{@link url="http://www.ietf.org/rfc/rfc2732.txt"} , and [RFC   2234]{@link
  * url="http://www.ietf.org/rfc/rfc2234.txt"} for details.
  *
  * The names, keys, and values are arbitrary Unicode strings (non-empty Unicode strings in the case of names and keys), encoded as UTF-8 byte sequences.
  * It is an error if any of them does not represent a valid UTF-8 byte sequence. Keys are compared for equality character-by-character, without
  * considering case folding or normalization. There may be multiple parameters with equal keys.
  * @since OOo 2.0
  */
@js.native
trait XVndSunStarScriptUrl extends XInterface {
  /**
    * returns the name part of this URL.
    * @returns the non-escaped value of the name part.
    */
  var Name: String = js.native
  /**
    * returns the name part of this URL.
    * @returns the non-escaped value of the name part.
    */
  def getName(): String = js.native
  /**
    * returns the value of a parameter with a given key.
    * @param key a non-escaped key.
    * @returns the non-escaped value of the first parameter with the given key. If there is no parameter with the given key, or if `key` is an empty `string` ,
    */
  def getParameter(key: String): String = js.native
  /**
    * returns whether this URL has a parameter with a given key.
    * @param key a non-escaped key.
    * @returns `TRUE` if this URL has at least one parameter with the given key. In particular, if `key` is an empty `string` , `FALSE` is returned.
    */
  def hasParameter(key: String): Boolean = js.native
  /**
    * sets the name part of this URL.
    * @param name specifies the non-escaped new name part of the URL.
    * @since OOo 3.0
    * @throws com::sun::star::lang::IllegalArgumentException if name is empty
    */
  def setName(name: String): Unit = js.native
  /**
    * sets the value of a parameter with a given key.
    * @param key a non-escaped key
    * @param value the non-escaped value to be set for the parameter. If there already is a parameter with this key, the value of its first appearance will be
    * @since OOo 3.0
    * @throws com::sun::star::lang::IllegalArgumentException if key is empty
    */
  def setParameter(key: String, value: String): Unit = js.native
}

object XVndSunStarScriptUrl {
  @scala.inline
  def apply(
    Name: String,
    acquire: () => Unit,
    getName: () => String,
    getParameter: String => String,
    hasParameter: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setName: String => Unit,
    setParameter: (String, String) => Unit
  ): XVndSunStarScriptUrl = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getParameter = js.Any.fromFunction1(getParameter), hasParameter = js.Any.fromFunction1(hasParameter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setParameter = js.Any.fromFunction2(setParameter))
    __obj.asInstanceOf[XVndSunStarScriptUrl]
  }
  @scala.inline
  implicit class XVndSunStarScriptUrlOps[Self <: XVndSunStarScriptUrl] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParameter(value: String => String): Self = this.set("getParameter", js.Any.fromFunction1(value))
    @scala.inline
    def setHasParameter(value: String => Boolean): Self = this.set("hasParameter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetName(value: String => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
    @scala.inline
    def setSetParameter(value: (String, String) => Unit): Self = this.set("setParameter", js.Any.fromFunction2(value))
  }
  
}


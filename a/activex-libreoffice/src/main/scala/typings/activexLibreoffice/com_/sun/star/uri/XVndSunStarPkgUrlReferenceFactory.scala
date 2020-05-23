package typings.activexLibreoffice.com_.sun.star.uri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * creates " vnd.sun.star.pkg " URL references.
  * @since OOo 2.0
  */
trait XVndSunStarPkgUrlReferenceFactory extends js.Object {
  /**
    * creates a new " vnd.sun.star.pkg " URL reference.
    *
    * The returned URL reference has the given authority, an empty path, and no fragment.
    * @param authority the authority of the created URL reference; must not be `NULL` , and should be an absolute URI reference with no fragment
    * @returns a new " vnd.sun.star.pkg " URL reference, or `NULL` if the given authority is either not an absolute URI reference or has a fragment
    */
  def createVndSunStarPkgUrlReference(authority: XUriReference): XUriReference
}

object XVndSunStarPkgUrlReferenceFactory {
  @scala.inline
  def apply(createVndSunStarPkgUrlReference: XUriReference => XUriReference): XVndSunStarPkgUrlReferenceFactory = {
    val __obj = js.Dynamic.literal(createVndSunStarPkgUrlReference = js.Any.fromFunction1(createVndSunStarPkgUrlReference))
    __obj.asInstanceOf[XVndSunStarPkgUrlReferenceFactory]
  }
}


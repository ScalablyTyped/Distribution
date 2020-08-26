package typings.activexLibreoffice.com_.sun.star.uri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * creates " vnd.sun.star.pkg " URL references.
  * @since OOo 2.0
  */
@js.native
trait XVndSunStarPkgUrlReferenceFactory extends js.Object {
  /**
    * creates a new " vnd.sun.star.pkg " URL reference.
    *
    * The returned URL reference has the given authority, an empty path, and no fragment.
    * @param authority the authority of the created URL reference; must not be `NULL` , and should be an absolute URI reference with no fragment
    * @returns a new " vnd.sun.star.pkg " URL reference, or `NULL` if the given authority is either not an absolute URI reference or has a fragment
    */
  def createVndSunStarPkgUrlReference(authority: XUriReference): XUriReference = js.native
}

object XVndSunStarPkgUrlReferenceFactory {
  @scala.inline
  def apply(createVndSunStarPkgUrlReference: XUriReference => XUriReference): XVndSunStarPkgUrlReferenceFactory = {
    val __obj = js.Dynamic.literal(createVndSunStarPkgUrlReference = js.Any.fromFunction1(createVndSunStarPkgUrlReference))
    __obj.asInstanceOf[XVndSunStarPkgUrlReferenceFactory]
  }
  @scala.inline
  implicit class XVndSunStarPkgUrlReferenceFactoryOps[Self <: XVndSunStarPkgUrlReferenceFactory] (val x: Self) extends AnyVal {
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
    def setCreateVndSunStarPkgUrlReference(value: XUriReference => XUriReference): Self = this.set("createVndSunStarPkgUrlReference", js.Any.fromFunction1(value))
  }
  
}


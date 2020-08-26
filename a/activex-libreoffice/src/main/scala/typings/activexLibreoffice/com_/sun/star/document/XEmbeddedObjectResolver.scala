package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** this interface converts embedded object URLs from one URL space to another. */
@js.native
trait XEmbeddedObjectResolver extends XInterface {
  /** converts the given URL from the source URL namespace to the destination URL space of this instance. */
  def resolveEmbeddedObjectURL(aURL: String): String = js.native
}

object XEmbeddedObjectResolver {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    resolveEmbeddedObjectURL: String => String
  ): XEmbeddedObjectResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resolveEmbeddedObjectURL = js.Any.fromFunction1(resolveEmbeddedObjectURL))
    __obj.asInstanceOf[XEmbeddedObjectResolver]
  }
  @scala.inline
  implicit class XEmbeddedObjectResolverOps[Self <: XEmbeddedObjectResolver] (val x: Self) extends AnyVal {
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
    def setResolveEmbeddedObjectURL(value: String => String): Self = this.set("resolveEmbeddedObjectURL", js.Any.fromFunction1(value))
  }
  
}


package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** this interface converts graphic object URLs from one URL space to another. */
@js.native
trait XGraphicObjectResolver extends XInterface {
  /** converts the given URL from the source URL namespace to the destination URL space of this instance. */
  def resolveGraphicObjectURL(aURL: String): String = js.native
}

object XGraphicObjectResolver {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    resolveGraphicObjectURL: String => String
  ): XGraphicObjectResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resolveGraphicObjectURL = js.Any.fromFunction1(resolveGraphicObjectURL))
    __obj.asInstanceOf[XGraphicObjectResolver]
  }
  @scala.inline
  implicit class XGraphicObjectResolverOps[Self <: XGraphicObjectResolver] (val x: Self) extends AnyVal {
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
    def setResolveGraphicObjectURL(value: String => String): Self = this.set("resolveGraphicObjectURL", js.Any.fromFunction1(value))
  }
  
}


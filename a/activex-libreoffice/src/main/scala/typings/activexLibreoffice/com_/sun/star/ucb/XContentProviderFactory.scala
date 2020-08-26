package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a factory for a {@link XContentProvider} .
  * @author Kai Sommerfeld
  * @see XContentProvider
  * @version 1.0
  */
@js.native
trait XContentProviderFactory extends XInterface {
  /**
    * creates a {@link XContentProvider} implementation object.
    * @param Service the name of the UNO service to be used to create the implementation of the content provider.
    * @returns a content provider.
    */
  def createContentProvider(Service: String): XContentProvider = js.native
}

object XContentProviderFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createContentProvider: String => XContentProvider,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentProviderFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createContentProvider = js.Any.fromFunction1(createContentProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentProviderFactory]
  }
  @scala.inline
  implicit class XContentProviderFactoryOps[Self <: XContentProviderFactory] (val x: Self) extends AnyVal {
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
    def setCreateContentProvider(value: String => XContentProvider): Self = this.set("createContentProvider", js.Any.fromFunction1(value))
  }
  
}


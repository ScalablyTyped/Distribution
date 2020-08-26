package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by documents that can expand the contents of a summary on a {@link DrawPage} into a collection of {@link DrawPages} .
  * @deprecated Deprecated
  * @see XDrawPageSummarizer
  */
@js.native
trait XDrawPageExpander extends XInterface {
  /**
    * creates a collection of {@link DrawPages} from the summary inside the given {@link DrawPage} and adds them to the same model as the source {@link
    * DrawPage} .
    */
  def expand(xPage: XDrawPage): XDrawPages = js.native
}

object XDrawPageExpander {
  @scala.inline
  def apply(
    acquire: () => Unit,
    expand: XDrawPage => XDrawPages,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDrawPageExpander = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), expand = js.Any.fromFunction1(expand), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDrawPageExpander]
  }
  @scala.inline
  implicit class XDrawPageExpanderOps[Self <: XDrawPageExpander] (val x: Self) extends AnyVal {
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
    def setExpand(value: XDrawPage => XDrawPages): Self = this.set("expand", js.Any.fromFunction1(value))
  }
  
}


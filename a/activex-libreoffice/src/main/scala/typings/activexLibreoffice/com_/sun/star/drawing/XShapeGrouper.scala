package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the group/ungroup functionality. */
@js.native
trait XShapeGrouper extends XInterface {
  /**
    * groups the {@link Shapes} inside a collection.
    *
    * Grouping of objects in text documents works only if none of the objects has an anchor of type
    * com::sun::star::text::TextContentAnchorType::AS_CHARACTER
    *
    * .
    * @param xShapes the {@link Shapes} that will be grouped. They must all be inserted into the same {@link GenericDrawPage} .
    * @returns a newly created {@link GroupShape} that contains all {@link Shapes} from xShapes and is also added to the {@link GenericDrawPage} of the {@link S
    */
  def group(xShapes: XShapes): XShapeGroup = js.native
  /**
    * ungroups a given {@link GroupShape} .
    * @param aGroup moves all {@link Shapes} from this {@link GroupShape} to the parent {@link XShapes} of the {@link GroupShape} . The {@link GroupShape} is
    */
  def ungroup(aGroup: XShapeGroup): Unit = js.native
}

object XShapeGrouper {
  @scala.inline
  def apply(
    acquire: () => Unit,
    group: XShapes => XShapeGroup,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    ungroup: XShapeGroup => Unit
  ): XShapeGrouper = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), group = js.Any.fromFunction1(group), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), ungroup = js.Any.fromFunction1(ungroup))
    __obj.asInstanceOf[XShapeGrouper]
  }
  @scala.inline
  implicit class XShapeGrouperOps[Self <: XShapeGrouper] (val x: Self) extends AnyVal {
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
    def setGroup(value: XShapes => XShapeGroup): Self = this.set("group", js.Any.fromFunction1(value))
    @scala.inline
    def setUngroup(value: XShapeGroup => Unit): Self = this.set("ungroup", js.Any.fromFunction1(value))
  }
  
}


package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to represent a hyperlink or a group of hyperlinks.
  *
  * Single hyperlinks correspond to simple <a href> tags. Groups of hyperlinks are contained in client side image maps. Linked objects and anchors are
  * implementation dependent. This interface inherits the {@link XAccessibleAction} interface. Especially that interface's
  * XAccessibleAction::getActionCount() method is needed to obtain a maximum value for the indices passed to the {@link
  * XAccessibleHyperlink.getAccessibleActionAnchor()} and {@link XAccessibleHyperlink.getAccessibleActionObject()} methods.
  *
  * Furthermore, the object that implements this interface has to be connected implicitly or explicitly with an object that implements the the {@link
  * XAccessibleText} interface. The {@link XAccessibleHyperlink.getStartIndex()} and {@link XAccessibleHyperlink.getEndIndex()} methods return indices
  * with respect to the text exposed by that interface.
  * @since OOo 1.1.2
  */
trait XAccessibleHyperlink extends XAccessibleAction {
  /**
    * Returns the index at which the textual representation of the hyperlink (group) ends.
    *
    * The returned value relates to the {@link XAccessibleText} interface that owns this hyperlink.
    * @returns The index relates to the text exposed by the {@link XAccessibleText} interface.
    */
  val EndIndex: Double
  /**
    * Returns the index at which the textual representation of the hyperlink (group) starts.
    *
    * The returned value relates to the {@link XAccessibleText} interface that owns this hyperlink.
    * @returns The index relates to the text exposed by the {@link XAccessibleHypertext} interface.
    */
  val StartIndex: Double
  /**
    * Returns an object that represents the link anchor, as appropriate for that link.
    *
    * For an HTML link for example, this method would return the string enclosed by the &lt&a href> tag.
    * @param nIndex This index identifies the anchor when, as in the case of an image map, there is more than one link represented by this object. The valid m
    * @returns If the index is not valid then an exception is thrown. Otherwise it returns an implementation dependent value.
    */
  def getAccessibleActionAnchor(nIndex: Double): js.Any
  /**
    * Returns an object that represents the link anchor, as appropriate for that link.
    *
    * For an HTML link for example, this method would return the URL of the &lt&a href> tag.
    * @param nIndex This index identifies the action object when, as in the case of an image map, there is more than one link represented by this object. The
    * @returns If the index is not valid then an exception is thrown. Otherwise it returns an implementation dependent value.
    */
  def getAccessibleActionObject(nIndex: Double): js.Any
  /**
    * Returns the index at which the textual representation of the hyperlink (group) ends.
    *
    * The returned value relates to the {@link XAccessibleText} interface that owns this hyperlink.
    * @returns The index relates to the text exposed by the {@link XAccessibleText} interface.
    */
  def getEndIndex(): Double
  /**
    * Returns the index at which the textual representation of the hyperlink (group) starts.
    *
    * The returned value relates to the {@link XAccessibleText} interface that owns this hyperlink.
    * @returns The index relates to the text exposed by the {@link XAccessibleHypertext} interface.
    */
  def getStartIndex(): Double
  /**
    * Returns whether the document referenced by this links is still valid.
    *
    * This is a volatile state that may change without further warning like e.g. sending an appropriate event.
    * @returns Returns `TRUE` if the referenced document is still valid and `FALSE` otherwise.
    */
  def isValid(): Boolean
}

object XAccessibleHyperlink {
  @scala.inline
  def apply(
    AccessibleActionCount: Double,
    EndIndex: Double,
    StartIndex: Double,
    acquire: () => Unit,
    doAccessibleAction: Double => Boolean,
    getAccessibleActionAnchor: Double => js.Any,
    getAccessibleActionCount: () => Double,
    getAccessibleActionDescription: Double => String,
    getAccessibleActionKeyBinding: Double => XAccessibleKeyBinding,
    getAccessibleActionObject: Double => js.Any,
    getEndIndex: () => Double,
    getStartIndex: () => Double,
    isValid: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleHyperlink = {
    val __obj = js.Dynamic.literal(AccessibleActionCount = AccessibleActionCount.asInstanceOf[js.Any], EndIndex = EndIndex.asInstanceOf[js.Any], StartIndex = StartIndex.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), doAccessibleAction = js.Any.fromFunction1(doAccessibleAction), getAccessibleActionAnchor = js.Any.fromFunction1(getAccessibleActionAnchor), getAccessibleActionCount = js.Any.fromFunction0(getAccessibleActionCount), getAccessibleActionDescription = js.Any.fromFunction1(getAccessibleActionDescription), getAccessibleActionKeyBinding = js.Any.fromFunction1(getAccessibleActionKeyBinding), getAccessibleActionObject = js.Any.fromFunction1(getAccessibleActionObject), getEndIndex = js.Any.fromFunction0(getEndIndex), getStartIndex = js.Any.fromFunction0(getStartIndex), isValid = js.Any.fromFunction0(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleHyperlink]
  }
}


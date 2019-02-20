package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

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
  val EndIndex: scala.Double
  /**
    * Returns the index at which the textual representation of the hyperlink (group) starts.
    *
    * The returned value relates to the {@link XAccessibleText} interface that owns this hyperlink.
    * @returns The index relates to the text exposed by the {@link XAccessibleHypertext} interface.
    */
  val StartIndex: scala.Double
  /**
    * Returns an object that represents the link anchor, as appropriate for that link.
    *
    * For an HTML link for example, this method would return the string enclosed by the &lt&a href> tag.
    * @param nIndex This index identifies the anchor when, as in the case of an image map, there is more than one link represented by this object. The valid m
    * @returns If the index is not valid then an exception is thrown. Otherwise it returns an implementation dependent value.
    */
  def getAccessibleActionAnchor(nIndex: scala.Double): js.Any
  /**
    * Returns an object that represents the link anchor, as appropriate for that link.
    *
    * For an HTML link for example, this method would return the URL of the &lt&a href> tag.
    * @param nIndex This index identifies the action object when, as in the case of an image map, there is more than one link represented by this object. The
    * @returns If the index is not valid then an exception is thrown. Otherwise it returns an implementation dependent value.
    */
  def getAccessibleActionObject(nIndex: scala.Double): js.Any
  /**
    * Returns the index at which the textual representation of the hyperlink (group) ends.
    *
    * The returned value relates to the {@link XAccessibleText} interface that owns this hyperlink.
    * @returns The index relates to the text exposed by the {@link XAccessibleText} interface.
    */
  def getEndIndex(): scala.Double
  /**
    * Returns the index at which the textual representation of the hyperlink (group) starts.
    *
    * The returned value relates to the {@link XAccessibleText} interface that owns this hyperlink.
    * @returns The index relates to the text exposed by the {@link XAccessibleHypertext} interface.
    */
  def getStartIndex(): scala.Double
  /**
    * Returns whether the document referenced by this links is still valid.
    *
    * This is a volatile state that may change without further warning like e.g. sending an appropriate event.
    * @returns Returns `TRUE` if the referenced document is still valid and `FALSE` otherwise.
    */
  def isValid(): scala.Boolean
}


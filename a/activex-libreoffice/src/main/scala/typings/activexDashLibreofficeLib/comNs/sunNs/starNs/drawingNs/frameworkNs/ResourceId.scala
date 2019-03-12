package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link ResourceId} service provides several constructors for resource ids.
  *
  * They mainly differ in how the anchor is specified.
  */
trait ResourceId extends XResourceId {
  /**
    * Create a resource id that has no anchor.
    *
    * This constructor can be used to create resource ids for panes.
    */
  def create(sResourceURL: java.lang.String): scala.Unit
  /** Create an empty resource id. It does not specify a specific resource but describes the absence of one. */
  def createEmpty(): scala.Unit
  /** Create a resource id for an anchor that is given as {@link XResourceId} object. This is the most general of the constructor variants. */
  def createWithAnchor(sResourceURL: java.lang.String, xAnchor: XResourceId): scala.Unit
  /**
    * Create a resource id for a resource that is bound to an anchor that can be specified by a single URL.
    *
    * This constructor can be used to create resources ids for views where the anchor is a pane.
    */
  def createWithAnchorURL(sResourceURL: java.lang.String, sAnchorURL: java.lang.String): scala.Unit
}

object ResourceId {
  @scala.inline
  def apply(
    Anchor: XResourceId,
    AnchorURLs: stdLib.SafeArray[java.lang.String],
    FullResourceURL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL,
    ResourceTypePrefix: java.lang.String,
    ResourceURL: java.lang.String,
    clone: () => XResourceId,
    compareTo: XResourceId => scala.Double,
    create: java.lang.String => scala.Unit,
    createEmpty: () => scala.Unit,
    createWithAnchor: (java.lang.String, XResourceId) => scala.Unit,
    createWithAnchorURL: (java.lang.String, java.lang.String) => scala.Unit,
    getAnchor: () => XResourceId,
    getAnchorURLs: () => stdLib.SafeArray[java.lang.String],
    getFullResourceURL: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL,
    getResourceTypePrefix: () => java.lang.String,
    getResourceURL: () => java.lang.String,
    hasAnchor: () => scala.Boolean,
    isBoundTo: (XResourceId, AnchorBindingMode) => scala.Boolean,
    isBoundToURL: (java.lang.String, AnchorBindingMode) => scala.Boolean
  ): ResourceId = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorURLs = AnchorURLs, FullResourceURL = FullResourceURL, ResourceTypePrefix = ResourceTypePrefix, ResourceURL = ResourceURL, clone = js.Any.fromFunction0(clone), compareTo = js.Any.fromFunction1(compareTo), create = js.Any.fromFunction1(create), createEmpty = js.Any.fromFunction0(createEmpty), createWithAnchor = js.Any.fromFunction2(createWithAnchor), createWithAnchorURL = js.Any.fromFunction2(createWithAnchorURL), getAnchor = js.Any.fromFunction0(getAnchor), getAnchorURLs = js.Any.fromFunction0(getAnchorURLs), getFullResourceURL = js.Any.fromFunction0(getFullResourceURL), getResourceTypePrefix = js.Any.fromFunction0(getResourceTypePrefix), getResourceURL = js.Any.fromFunction0(getResourceURL), hasAnchor = js.Any.fromFunction0(hasAnchor), isBoundTo = js.Any.fromFunction2(isBoundTo), isBoundToURL = js.Any.fromFunction2(isBoundToURL))
  
    __obj.asInstanceOf[ResourceId]
  }
}


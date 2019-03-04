package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource id uses a set of URLs to unambiguously specify a resource of the drawing framework.
  *
  * Resources of the drawing framework are panes, views, tool bars, and command groups. One URL describes the type of the actual resource. A sequence of
  * URLs (typically one, sometimes two) specifies its anchor, the resource it is bound to. The anchor typically is a pane (for views), or it is empty (for
  * panes).
  *
  * The resource URL may be empty. In this case the anchor is empty, too. Such an empty resource id does not describe a resource but rather the absence of
  * one. Instead of an empty {@link XResourceId} object an empty reference can be used in many places.
  *
  * The resource URL may have arguments that are passed to the factory method on its creation. Arguments are only available through the {@link
  * getFullResourceURL()} . The {@link getResourceURL()} method strips them away.
  */
trait XResourceId extends js.Object {
  /** Return a new {@link XResourceId} that represents the anchor resource. */
  val Anchor: XResourceId
  /**
    * Return the, possibly empty, list of anchor URLs. The URLs are ordered so that the one in position 0 is the direct anchor of the resource, while the
    * one in position i+1 is the direct anchor of the one in position i.
    */
  val AnchorURLs: activexDashInteropLib.SafeArray[java.lang.String]
  /** Return an URL object of the resource URL that may contain arguments. */
  val FullResourceURL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL
  /** Return the type prefix of the resource URL. This includes all up to and including the second slash. */
  val ResourceTypePrefix: java.lang.String
  /** Return the URL of the resource. Arguments supplied on creation are stripped away. Use {@link getFullResourceURL()} to access them. */
  val ResourceURL: java.lang.String
  /**
    * Compare the called {@link XResourceId} object with the given one.
    *
    * The two resource ids A and B are compared so that if A<B (return value is -1) then either A and B are unrelated or A is a direct or indirect anchor of
    * B.
    *
    * The algorithm for this comparison is quite simple. It uses a double lexicographic ordering. On the lower level individual URLs are compared via the
    * lexicographic order defined on strings. On the higher level two resource ids are compared via a lexicographic order defined on the URLS. So when there
    * are two resource ids A1.A2 (A1 being the anchor of A2) and B1.B2 then A1.A2<B1.B2 when A1<B1 or A1==B1 and A2<B2. Resource ids may have different
    * lengths: A1 < B1.B2 when A1<B1 or A1==B1 (anchors first then resources linked to them.
    * @param xId The resource id to which the called resource id is compared.
    * @returns Returns 0 when the called resource id is equivalent to the given resource id. Returns `-1` or `+1` when the two compared resource ids differ.
    */
  def compareTo(xId: XResourceId): scala.Double
  /** Return a new {@link XResourceId} that represents the anchor resource. */
  def getAnchor(): XResourceId
  /**
    * Return the, possibly empty, list of anchor URLs. The URLs are ordered so that the one in position 0 is the direct anchor of the resource, while the
    * one in position i+1 is the direct anchor of the one in position i.
    */
  def getAnchorURLs(): activexDashInteropLib.SafeArray[java.lang.String]
  /** Return an URL object of the resource URL that may contain arguments. */
  def getFullResourceURL(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL
  /** Return the type prefix of the resource URL. This includes all up to and including the second slash. */
  def getResourceTypePrefix(): java.lang.String
  /** Return the URL of the resource. Arguments supplied on creation are stripped away. Use {@link getFullResourceURL()} to access them. */
  def getResourceURL(): java.lang.String
  /** Return whether there is a non-empty anchor URL. When this method returns `FALSE` then {@link getAnchorURLs()} will return an empty list. */
  def hasAnchor(): scala.Boolean
  /**
    * Return whether the anchor of the called resource id object represents the same resource as the given object.
    *
    * Note that not only the anchor of the given object is taken into account. The whole object, including the resource URL, is interpreted as anchor
    * resource.
    * @param xAnchorId The resource id of the anchor.
    * @param eMode This mode specifies how the called resource has to be bound to the given anchor in order to have this function return `TRUE` . If eMode is
    */
  def isBoundTo(xAnchorId: XResourceId, eMode: AnchorBindingMode): scala.Boolean
  /**
    * Return whether the anchor of the called resource id object represents the same resource as the given anchor URL. This is a convenience variant of the
    * {@link isBoundTo()} function that can also be seen as an optimization for the case that the anchor consists of exactly one URL.
    * @param AnchorURL The resource URL of the anchor.
    * @param eMode This mode specifies how the called resource has to be bound to the given anchor in order to have this function return. See the description
    */
  def isBoundToURL(AnchorURL: java.lang.String, eMode: AnchorBindingMode): scala.Boolean
}

object XResourceId {
  @scala.inline
  def apply(
    Anchor: XResourceId,
    AnchorURLs: activexDashInteropLib.SafeArray[java.lang.String],
    FullResourceURL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL,
    ResourceTypePrefix: java.lang.String,
    ResourceURL: java.lang.String,
    clone: js.Function0[XResourceId],
    compareTo: js.Function1[XResourceId, scala.Double],
    getAnchor: js.Function0[XResourceId],
    getAnchorURLs: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getFullResourceURL: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL],
    getResourceTypePrefix: js.Function0[java.lang.String],
    getResourceURL: js.Function0[java.lang.String],
    hasAnchor: js.Function0[scala.Boolean],
    isBoundTo: js.Function2[XResourceId, AnchorBindingMode, scala.Boolean],
    isBoundToURL: js.Function2[java.lang.String, AnchorBindingMode, scala.Boolean]
  ): XResourceId = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorURLs = AnchorURLs, FullResourceURL = FullResourceURL, ResourceTypePrefix = ResourceTypePrefix, ResourceURL = ResourceURL, clone = clone, compareTo = compareTo, getAnchor = getAnchor, getAnchorURLs = getAnchorURLs, getFullResourceURL = getFullResourceURL, getResourceTypePrefix = getResourceTypePrefix, getResourceURL = getResourceURL, hasAnchor = hasAnchor, isBoundTo = isBoundTo, isBoundToURL = isBoundToURL)
  
    __obj.asInstanceOf[XResourceId]
  }
}


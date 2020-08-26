package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.com_.sun.star.util.URL
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link ResourceId} service provides several constructors for resource ids.
  *
  * They mainly differ in how the anchor is specified.
  */
@js.native
trait ResourceId extends XResourceId {
  /**
    * Create a resource id that has no anchor.
    *
    * This constructor can be used to create resource ids for panes.
    */
  def create(sResourceURL: String): Unit = js.native
  /** Create an empty resource id. It does not specify a specific resource but describes the absence of one. */
  def createEmpty(): Unit = js.native
  /** Create a resource id for an anchor that is given as {@link XResourceId} object. This is the most general of the constructor variants. */
  def createWithAnchor(sResourceURL: String, xAnchor: XResourceId): Unit = js.native
  /**
    * Create a resource id for a resource that is bound to an anchor that can be specified by a single URL.
    *
    * This constructor can be used to create resources ids for views where the anchor is a pane.
    */
  def createWithAnchorURL(sResourceURL: String, sAnchorURL: String): Unit = js.native
}

object ResourceId {
  @scala.inline
  def apply(
    Anchor: XResourceId,
    AnchorURLs: SafeArray[String],
    FullResourceURL: URL,
    ResourceTypePrefix: String,
    ResourceURL: String,
    compareTo: XResourceId => Double,
    create: String => Unit,
    createEmpty: () => Unit,
    createWithAnchor: (String, XResourceId) => Unit,
    createWithAnchorURL: (String, String) => Unit,
    getAnchor: () => XResourceId,
    getAnchorURLs: () => SafeArray[String],
    getFullResourceURL: () => URL,
    getResourceTypePrefix: () => String,
    getResourceURL: () => String,
    hasAnchor: () => Boolean,
    isBoundTo: (XResourceId, AnchorBindingMode) => Boolean,
    isBoundToURL: (String, AnchorBindingMode) => Boolean
  ): ResourceId = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorURLs = AnchorURLs.asInstanceOf[js.Any], FullResourceURL = FullResourceURL.asInstanceOf[js.Any], ResourceTypePrefix = ResourceTypePrefix.asInstanceOf[js.Any], ResourceURL = ResourceURL.asInstanceOf[js.Any], compareTo = js.Any.fromFunction1(compareTo), create = js.Any.fromFunction1(create), createEmpty = js.Any.fromFunction0(createEmpty), createWithAnchor = js.Any.fromFunction2(createWithAnchor), createWithAnchorURL = js.Any.fromFunction2(createWithAnchorURL), getAnchor = js.Any.fromFunction0(getAnchor), getAnchorURLs = js.Any.fromFunction0(getAnchorURLs), getFullResourceURL = js.Any.fromFunction0(getFullResourceURL), getResourceTypePrefix = js.Any.fromFunction0(getResourceTypePrefix), getResourceURL = js.Any.fromFunction0(getResourceURL), hasAnchor = js.Any.fromFunction0(hasAnchor), isBoundTo = js.Any.fromFunction2(isBoundTo), isBoundToURL = js.Any.fromFunction2(isBoundToURL))
    __obj.asInstanceOf[ResourceId]
  }
  @scala.inline
  implicit class ResourceIdOps[Self <: ResourceId] (val x: Self) extends AnyVal {
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
    def setCreate(value: String => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateEmpty(value: () => Unit): Self = this.set("createEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateWithAnchor(value: (String, XResourceId) => Unit): Self = this.set("createWithAnchor", js.Any.fromFunction2(value))
    @scala.inline
    def setCreateWithAnchorURL(value: (String, String) => Unit): Self = this.set("createWithAnchorURL", js.Any.fromFunction2(value))
  }
  
}


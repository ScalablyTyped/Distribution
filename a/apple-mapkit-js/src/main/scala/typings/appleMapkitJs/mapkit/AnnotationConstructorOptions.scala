package typings.appleMapkitJs.mapkit

import typings.appleMapkitJs.anon.Height
import typings.std.DOMPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that contains options for initializing annotation features.
  */
@js.native
trait AnnotationConstructorOptions extends js.Object {
  /**
    * Accessibility text for the annotation.
    */
  var accessibilityLabel: js.UndefOr[String] = js.native
  /**
    * The offset in CSS pixels of the element from the bottom center.
    */
  var anchorOffset: js.UndefOr[DOMPoint] = js.native
  /**
    * A Boolean value that determines if the annotation should be animated.
    */
  var animates: js.UndefOr[Boolean] = js.native
  /**
    * A CSS animation that runs when the annotation appears on the map.
    */
  var appearanceAnimation: js.UndefOr[String] = js.native
  /**
    * A delegate that enables you to customize the annotation's callout.
    */
  var callout: js.UndefOr[AnnotationCalloutDelegate] = js.native
  /**
    * A Boolean value that determines whether a callout should be shown.
    */
  var calloutEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The offset in CSS pixels of a callout from the top center of the element.
    */
  var calloutOffset: js.UndefOr[DOMPoint] = js.native
  /**
    * An identifer used for grouping annotations into the same cluster.
    */
  var clusteringIdentifier: js.UndefOr[String] = js.native
  /**
    * A mode that determines the shape of the collision frame.
    */
  var collisionMode: js.UndefOr[String] = js.native
  /**
    * Data you define that is assigned to the annotation.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * A hint the map uses to prioritize displaying the annotation.
    */
  var displayPriority: js.UndefOr[Double] = js.native
  /**
    * A Boolean value that determines whether the user can drag the annotation.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value that determines whether the annotation responds to user
    * interaction.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value that determines whether the annotation is selected.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * The desired dimensions of the annotation, in CSS pixels.
    */
  var size: js.UndefOr[Height] = js.native
  /**
    * The text to display as a subtitle on the second line of an annotation's
    * callout.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * The text to display in the annotation's callout.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * A Boolean value that determines if the annotation is visible or hidden.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object AnnotationConstructorOptions {
  @scala.inline
  def apply(): AnnotationConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationConstructorOptions]
  }
  @scala.inline
  implicit class AnnotationConstructorOptionsOps[Self <: AnnotationConstructorOptions] (val x: Self) extends AnyVal {
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
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    @scala.inline
    def setAnchorOffset(value: DOMPoint): Self = this.set("anchorOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorOffset: Self = this.set("anchorOffset", js.undefined)
    @scala.inline
    def setAnimates(value: Boolean): Self = this.set("animates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimates: Self = this.set("animates", js.undefined)
    @scala.inline
    def setAppearanceAnimation(value: String): Self = this.set("appearanceAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearanceAnimation: Self = this.set("appearanceAnimation", js.undefined)
    @scala.inline
    def setCallout(value: AnnotationCalloutDelegate): Self = this.set("callout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallout: Self = this.set("callout", js.undefined)
    @scala.inline
    def setCalloutEnabled(value: Boolean): Self = this.set("calloutEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutEnabled: Self = this.set("calloutEnabled", js.undefined)
    @scala.inline
    def setCalloutOffset(value: DOMPoint): Self = this.set("calloutOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutOffset: Self = this.set("calloutOffset", js.undefined)
    @scala.inline
    def setClusteringIdentifier(value: String): Self = this.set("clusteringIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusteringIdentifier: Self = this.set("clusteringIdentifier", js.undefined)
    @scala.inline
    def setCollisionMode(value: String): Self = this.set("collisionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollisionMode: Self = this.set("collisionMode", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDisplayPriority(value: Double): Self = this.set("displayPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayPriority: Self = this.set("displayPriority", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSize(value: Height): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}


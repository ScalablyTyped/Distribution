package typings.amcharts.imagesSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/ImagesSettings", JSImport.Default)
@js.native
class default () extends ImagesSettings {
  /**
    * Opacity of the image.
    * @default 1
    */
  /* CompleteClass */
  override var alpha: Double = js.native
  /**
    * Text which is displayed in a roll-over balloon. You can use the following tags:
    * [[title]], [[description]], [[value]] and [[percent]]. [[title]]
    */
  /* CompleteClass */
  override var balloonText: String = js.native
  /**
    * Specifies if the image's center should be placed in the provided coordinates.
    * If false, top-left corner will be at provided coordinates.
    * @default true
    */
  /* CompleteClass */
  override var centered: Boolean = js.native
  /**
    * Color of image.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    * @default "#000000"
    */
  /* CompleteClass */
  override var color: String = js.native
  /**
    * Height of a description window.
    */
  /* CompleteClass */
  override var descriptionWindowHeight: Double = js.native
  /**
    * Width of a description window.
    * @default 250
    */
  /* CompleteClass */
  override var descriptionWindowWidth: Double = js.native
  /**
    * X position of a description window.
    */
  /* CompleteClass */
  override var descriptionWindowX: Double = js.native
  /**
    * Y position of a description window.
    */
  /* CompleteClass */
  override var descriptionWindowY: Double = js.native
  /**
    * Label color. #000000
    */
  /* CompleteClass */
  override var labelColor: String = js.native
  /**
    * Position of the label. Allowed values are: left, right, top, bottom and middle. right
    */
  /* CompleteClass */
  override var labelPosition: String = js.native
  /**
    * Label roll-over color. #00CC00
    */
  /* CompleteClass */
  override var labelRollOverColor: String = js.native
  /**
    * Font size of a label.
    * @default 11
    */
  /* CompleteClass */
  override var labelfontSize: String = js.native
  /**
    * Opacity of image outline.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    */
  /* CompleteClass */
  override var outlineAlpha: Double = js.native
  /**
    * Color of image outline.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    */
  /* CompleteClass */
  override var outlineColor: String = js.native
  /**
    * Thickness of image outline.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    * @default 1
    */
  /* CompleteClass */
  override var outlineThickness: Double = js.native
  /**
    * Color of image when hovered.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    */
  /* CompleteClass */
  override var rollOverColor: String = js.native
  /**
    * Scale of the image when hovered. Use value like 1.5 - 2 to enlarge image when user rolls-over it.
    * @default 1
    */
  /* CompleteClass */
  override var rollOverScale: Double = js.native
  /**
    * Scale of the image if it is selected. Use value like 1.5 - 2 to enlarge selected image.
    * @default 1
    */
  /* CompleteClass */
  override var selectedScale: Double = js.native
}


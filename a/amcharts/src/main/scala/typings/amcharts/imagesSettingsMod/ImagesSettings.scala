package typings.amcharts.imagesSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesSettings extends js.Object {
  /**
    * Opacity of the image.
    * @default 1
    */
  var alpha: Double
  /**
    * Text which is displayed in a roll-over balloon. You can use the following tags:
    * [[title]], [[description]], [[value]] and [[percent]]. [[title]]
    */
  var balloonText: String
  /**
    * Specifies if the image's center should be placed in the provided coordinates.
    * If false, top-left corner will be at provided coordinates.
    * @default true
    */
  var centered: Boolean
  /**
    * Color of image.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    * @default "#000000"
    */
  var color: String
  /**
    * Height of a description window.
    */
  var descriptionWindowHeight: Double
  /**
    * Width of a description window.
    * @default 250
    */
  var descriptionWindowWidth: Double
  /**
    * X position of a description window.
    */
  var descriptionWindowX: Double
  /**
    * Y position of a description window.
    */
  var descriptionWindowY: Double
  /**
    * Label color. #000000
    */
  var labelColor: String
  /**
    * Position of the label. Allowed values are: left, right, top, bottom and middle. right
    */
  var labelPosition: String
  /**
    * Label roll-over color. #00CC00
    */
  var labelRollOverColor: String
  /**
    * Font size of a label.
    * @default 11
    */
  var labelfontSize: String
  /**
    * Opacity of image outline.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    */
  var outlineAlpha: Double
  /**
    * Color of image outline.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    */
  var outlineColor: String
  /**
    * Thickness of image outline.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    * @default 1
    */
  var outlineThickness: Double
  /**
    * Color of image when hovered.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    */
  var rollOverColor: String
  /**
    * Scale of the image when hovered. Use value like 1.5 - 2 to enlarge image when user rolls-over it.
    * @default 1
    */
  var rollOverScale: Double
  /**
    * Scale of the image if it is selected. Use value like 1.5 - 2 to enlarge selected image.
    * @default 1
    */
  var selectedScale: Double
}

object ImagesSettings {
  @scala.inline
  def apply(
    alpha: Double,
    balloonText: String,
    centered: Boolean,
    color: String,
    descriptionWindowHeight: Double,
    descriptionWindowWidth: Double,
    descriptionWindowX: Double,
    descriptionWindowY: Double,
    labelColor: String,
    labelPosition: String,
    labelRollOverColor: String,
    labelfontSize: String,
    outlineAlpha: Double,
    outlineColor: String,
    outlineThickness: Double,
    rollOverColor: String,
    rollOverScale: Double,
    selectedScale: Double
  ): ImagesSettings = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], balloonText = balloonText.asInstanceOf[js.Any], centered = centered.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], descriptionWindowHeight = descriptionWindowHeight.asInstanceOf[js.Any], descriptionWindowWidth = descriptionWindowWidth.asInstanceOf[js.Any], descriptionWindowX = descriptionWindowX.asInstanceOf[js.Any], descriptionWindowY = descriptionWindowY.asInstanceOf[js.Any], labelColor = labelColor.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], labelRollOverColor = labelRollOverColor.asInstanceOf[js.Any], labelfontSize = labelfontSize.asInstanceOf[js.Any], outlineAlpha = outlineAlpha.asInstanceOf[js.Any], outlineColor = outlineColor.asInstanceOf[js.Any], outlineThickness = outlineThickness.asInstanceOf[js.Any], rollOverColor = rollOverColor.asInstanceOf[js.Any], rollOverScale = rollOverScale.asInstanceOf[js.Any], selectedScale = selectedScale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImagesSettings]
  }
}


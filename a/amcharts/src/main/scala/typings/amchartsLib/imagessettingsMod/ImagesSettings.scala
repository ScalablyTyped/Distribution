package typings
package amchartsLib.imagessettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesSettings extends js.Object {
  /**
    * Opacity of the image.
    * @default 1
    */
  var alpha: scala.Double
  /**
    * Text which is displayed in a roll-over balloon. You can use the following tags:
    * [[title]], [[description]], [[value]] and [[percent]]. [[title]]
    */
  var balloonText: java.lang.String
  /**
    * Specifies if the image's center should be placed in the provided coordinates.
    * If false, top-left corner will be at provided coordinates.
    * @default true
    */
  var centered: scala.Boolean
  /**
    * Color of image.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    * @default "#000000"
    */
  var color: java.lang.String
  /**
    * Height of a description window.
    */
  var descriptionWindowHeight: scala.Double
  /**
    * Width of a description window.
    * @default 250
    */
  var descriptionWindowWidth: scala.Double
  /**
    * X position of a description window.
    */
  var descriptionWindowX: scala.Double
  /**
    * Y position of a description window.
    */
  var descriptionWindowY: scala.Double
  /**
    * Label color. #000000
    */
  var labelColor: java.lang.String
  /**
    * Position of the label. Allowed values are: left, right, top, bottom and middle. right
    */
  var labelPosition: java.lang.String
  /**
    * Label roll-over color. #00CC00
    */
  var labelRollOverColor: java.lang.String
  /**
    * Font size of a label.
    * @default 11
    */
  var labelfontSize: java.lang.String
  /**
    * Opacity of image outline.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    */
  var outlineAlpha: scala.Double
  /**
    * Color of image outline.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    */
  var outlineColor: java.lang.String
  /**
    * Thickness of image outline.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    * @default 1
    */
  var outlineThickness: scala.Double
  /**
    * Color of image when hovered.
    * This will affect only predefined images (with "type" property set) and images with svgPath set.
    * This property won't affect bitmap images and loaded SVG images.
    */
  var rollOverColor: java.lang.String
  /**
    * Scale of the image when hovered. Use value like 1.5 - 2 to enlarge image when user rolls-over it.
    * @default 1
    */
  var rollOverScale: scala.Double
  /**
    * Scale of the image if it is selected. Use value like 1.5 - 2 to enlarge selected image.
    * @default 1
    */
  var selectedScale: scala.Double
}

object ImagesSettings {
  @scala.inline
  def apply(
    alpha: scala.Double,
    balloonText: java.lang.String,
    centered: scala.Boolean,
    color: java.lang.String,
    descriptionWindowHeight: scala.Double,
    descriptionWindowWidth: scala.Double,
    descriptionWindowX: scala.Double,
    descriptionWindowY: scala.Double,
    labelColor: java.lang.String,
    labelPosition: java.lang.String,
    labelRollOverColor: java.lang.String,
    labelfontSize: java.lang.String,
    outlineAlpha: scala.Double,
    outlineColor: java.lang.String,
    outlineThickness: scala.Double,
    rollOverColor: java.lang.String,
    rollOverScale: scala.Double,
    selectedScale: scala.Double
  ): ImagesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alpha")(alpha)
    __obj.updateDynamic("balloonText")(balloonText)
    __obj.updateDynamic("centered")(centered)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("descriptionWindowHeight")(descriptionWindowHeight)
    __obj.updateDynamic("descriptionWindowWidth")(descriptionWindowWidth)
    __obj.updateDynamic("descriptionWindowX")(descriptionWindowX)
    __obj.updateDynamic("descriptionWindowY")(descriptionWindowY)
    __obj.updateDynamic("labelColor")(labelColor)
    __obj.updateDynamic("labelPosition")(labelPosition)
    __obj.updateDynamic("labelRollOverColor")(labelRollOverColor)
    __obj.updateDynamic("labelfontSize")(labelfontSize)
    __obj.updateDynamic("outlineAlpha")(outlineAlpha)
    __obj.updateDynamic("outlineColor")(outlineColor)
    __obj.updateDynamic("outlineThickness")(outlineThickness)
    __obj.updateDynamic("rollOverColor")(rollOverColor)
    __obj.updateDynamic("rollOverScale")(rollOverScale)
    __obj.updateDynamic("selectedScale")(selectedScale)
    __obj.asInstanceOf[ImagesSettings]
  }
}


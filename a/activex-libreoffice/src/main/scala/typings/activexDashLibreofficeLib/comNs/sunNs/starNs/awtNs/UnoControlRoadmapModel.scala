package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlContainer} . */
trait UnoControlRoadmapModel
  extends UnoControlModel
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer {
  /** specifies the background color (RGB) of the control. The Default value is white */
  var BackgroundColor: scala.Double
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: scala.Double
  /** determines whether the control container is complete or not. If it is false than a non - interactive {@link RoadmapItem} is appended */
  var Complete: scala.Boolean
  /**
    * refers to the ID of the currently selected item. Initially this property is set to "-1" which is equal to "undefined" If the Roadmap Item that the
    * CurrentItemID refers to is removed the property "CurrentItemID" is set to -1
    */
  var CurrentItemID: scala.Double
  /**
    * specifies a graphic to be displayed on the control
    *
    * If this property is present, it interacts with the {@link ImageURL} in the following way: If {@link ImageURL} is set, {@link Graphic} will be reset to
    * an object as loaded from the given image URL, or `NULL` if {@link ImageURL} does not point to a valid image file.If {@link Graphic} is set, {@link
    * ImageURL} will be reset to an empty string.
    * @since OOo 2.1
    */
  var Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
  /** specifies the help text of the control. */
  var HelpText: java.lang.String
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String
  /**
    * specifies an URL to an image to use for the control. The image is placed in the lower right corner of the control
    * @see Graphic
    */
  var ImageURL: java.lang.String
  /**
    * determines whether the control is interactive or not.
    *
    * A roadmap control which is interactive allows selecting its items out-of-order, by simply clicking them.
    */
  var Interactive: scala.Boolean
  /** specifies whether the control will be printed with the document. */
  var Printable: scala.Boolean
  /** specifies the text displayed in the control. */
  var Text: java.lang.String
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
}


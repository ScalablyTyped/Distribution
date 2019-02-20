package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This abstract service is implemented by every page of a {@link DrawingDocument} .
  *
  * Example to create and insert a couple of LineShapes:
  *
  * {{program example here, see documentation}}
  */
trait GenericDrawPage
  extends XShapes
     with XShapeGrouper
     with XShapeCombiner
     with XShapeBinder
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** This is the border at the bottom. */
  var BorderBottom: scala.Double
  /** This is the border at the left. */
  var BorderLeft: scala.Double
  /** This is the border at the right. */
  var BorderRight: scala.Double
  /** This is the border at the top. */
  var BorderTop: scala.Double
  /** This is the height. */
  var Height: scala.Double
  /**
    * this property is true if the averaged background filling colors luminance is belove an application specified threshold value. This can be used to
    * determine the actual value of an auto color.
    */
  var IsBackgroundDark: scala.Boolean
  /**
    * this index access defines a navigation order for the top level shapes inside this page. By default this is equal to the index access of the slide
    * itself, making the z-order the default navigation order for top level shapes.
    */
  var NavigationOrder: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** This is the number of this page, starting with 1. */
  var Number: scala.Double
  /** This is the orientation of this page. */
  var Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperOrientation
  /**
    * this property stores xml attributes. They will be saved to and restored from automatic styles inside xml files.
    * @see com.sun.star.xml.AttributeContainer
    */
  var UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /** This is the width. */
  var Width: scala.Double
}


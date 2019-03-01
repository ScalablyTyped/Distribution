package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the service of shapes in a spreadsheet document */
trait Shape
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Shape {
  /**
    * contains the object where this shape is anchored on.
    *
    * Possible objects are {@link XSpreadsheet} and XCell.
    */
  var Anchor: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * contains the horizontal position of the object (1/100 mm).
    *
    * The position is relative to the anchor object.
    *
    * If the underlying table layout direction is left to right the position is the difference of the left top edge of the anchor object and the left top
    * edge of the drawing object.
    *
    * If the underlying table layout direction is right to left the position is the difference of the right top edge of the anchor object and the right top
    * edge of the drawing object.
    */
  var HoriOrientPosition: scala.Double
  /**
    * contains the vertical position of the object (1/100 mm).
    *
    * The position is relative to the anchor object.
    *
    * If the underlying table layout direction is left to right the position is the difference of the left top edge of the anchor object and the left top
    * edge of the drawing object.
    *
    * If the underlying table layout direction is right to left the position is the difference of the right top edge of the anchor object and the right top
    * edge of the drawing object.
    */
  var VertOrientPosition: scala.Double
}

object Shape {
  @scala.inline
  def apply(
    Anchor: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    GluePoints: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    HoriOrientPosition: scala.Double,
    Hyperlink: java.lang.String,
    InteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    LayerID: scala.Double,
    LayerName: java.lang.String,
    MoveProtect: scala.Boolean,
    Name: java.lang.String,
    NavigationOrder: scala.Double,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Printable: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RelativeHeight: scala.Double,
    RelativeHeightRelation: scala.Double,
    RelativeWidth: scala.Double,
    RelativeWidthRelation: scala.Double,
    ShapeType: java.lang.String,
    ShapeUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    SizeProtect: scala.Boolean,
    Style: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyle,
    Transformation: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HomogenMatrix3,
    VertOrientPosition: scala.Double,
    Visible: scala.Boolean,
    ZOrder: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    getDirectPropertyValuesTolerant: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[
        activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.GetDirectPropertyTolerantResult
      ]
    ],
    getGluePoints: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValuesTolerant: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.GetPropertyTolerantResult]
    ],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValuesTolerant: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.SetPropertyTolerantFailed]
    ],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Anchor")(Anchor)
    __obj.updateDynamic("GluePoints")(GluePoints)
    __obj.updateDynamic("HoriOrientPosition")(HoriOrientPosition)
    __obj.updateDynamic("Hyperlink")(Hyperlink)
    __obj.updateDynamic("InteropGrabBag")(InteropGrabBag)
    __obj.updateDynamic("LayerID")(LayerID)
    __obj.updateDynamic("LayerName")(LayerName)
    __obj.updateDynamic("MoveProtect")(MoveProtect)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NavigationOrder")(NavigationOrder)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("Printable")(Printable)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RelativeHeight")(RelativeHeight)
    __obj.updateDynamic("RelativeHeightRelation")(RelativeHeightRelation)
    __obj.updateDynamic("RelativeWidth")(RelativeWidth)
    __obj.updateDynamic("RelativeWidthRelation")(RelativeWidthRelation)
    __obj.updateDynamic("ShapeType")(ShapeType)
    __obj.updateDynamic("ShapeUserDefinedAttributes")(ShapeUserDefinedAttributes)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("SizeProtect")(SizeProtect)
    __obj.updateDynamic("Style")(Style)
    __obj.updateDynamic("Transformation")(Transformation)
    __obj.updateDynamic("VertOrientPosition")(VertOrientPosition)
    __obj.updateDynamic("Visible")(Visible)
    __obj.updateDynamic("ZOrder")(ZOrder)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getDirectPropertyValuesTolerant")(getDirectPropertyValuesTolerant)
    __obj.updateDynamic("getGluePoints")(getGluePoints)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getPropertyValuesTolerant")(getPropertyValuesTolerant)
    __obj.updateDynamic("getShapeType")(getShapeType)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPosition")(setPosition)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setPropertyValuesTolerant")(setPropertyValuesTolerant)
    __obj.updateDynamic("setSize")(setSize)
    __obj.asInstanceOf[Shape]
  }
}


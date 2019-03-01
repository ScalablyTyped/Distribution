package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies titles in a chart.
  *
  * In a chart there may be the following titles: the main title, the sub title, and axis titles of the x- and y-axis.
  */
trait ChartTitle
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Shape
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier {
  /**
    * If this property is `TRUE` the position is calculated by the application automatically. Setting this property to false will have no effect. Instead
    * use the interface {@link com.sun.star.drawing.XShape} to set a concrete position.
    */
  var AutomaticPosition: scala.Boolean
  /**
    * contains the text of the title.
    *
    * Note that you cannot change attributes of parts of a title, e.g., put one word in bold characters. All formatting affects the entire string.
    */
  var String: java.lang.String
  /**
    * specifies the rotation of the shape in 100th of degrees.
    *
    * Especially in three-dimensional charts, this property comes in handy if you want to align the axis titles with the axis, which are usually not
    * vertical or horizontal in the two-dimensional projection.
    */
  var TextRotation: scala.Double
}

object ChartTitle {
  @scala.inline
  def apply(
    AutomaticPosition: scala.Boolean,
    GluePoints: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
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
    String: java.lang.String,
    Style: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyle,
    TextRotation: scala.Double,
    Transformation: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HomogenMatrix3,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
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
  ): ChartTitle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutomaticPosition")(AutomaticPosition)
    __obj.updateDynamic("GluePoints")(GluePoints)
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
    __obj.updateDynamic("String")(String)
    __obj.updateDynamic("Style")(Style)
    __obj.updateDynamic("TextRotation")(TextRotation)
    __obj.updateDynamic("Transformation")(Transformation)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
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
    __obj.asInstanceOf[ChartTitle]
  }
}


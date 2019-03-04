package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is for a {@link Shape} which contains a control.
  * @see Shape
  * @see XControlShape
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XControlShape because var conflicts: Position, Size. Inlined Control, getControl, setControl */ trait ControlShape extends Shape {
  /**
    * returns the control model of this {@link Shape} .
    * @returns if there is already a control model assigned to this {@link ControlShape} , than its returned. Otherwise you get an empty reference.
    */
  var Control: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel
  /**
    * returns the control model of this {@link Shape} .
    * @returns if there is already a control model assigned to this {@link ControlShape} , than its returned. Otherwise you get an empty reference.
    */
  def getControl(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel
  /**
    * sets the control model for this {@link Shape} .
    * @param xControl this will be the new control model that is displayed with this shape. You may change the model more than once during the lifetime of a {
    */
  def setControl(xControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel): scala.Unit
}

object ControlShape {
  @scala.inline
  def apply(
    Control: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
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
    Style: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyle,
    Transformation: HomogenMatrix3,
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
    getControl: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel],
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
    setControl: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel, scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValuesTolerant: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.SetPropertyTolerantFailed]
    ],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): ControlShape = {
    val __obj = js.Dynamic.literal(Control = Control, GluePoints = GluePoints, Hyperlink = Hyperlink, InteropGrabBag = InteropGrabBag, LayerID = LayerID, LayerName = LayerName, MoveProtect = MoveProtect, Name = Name, NavigationOrder = NavigationOrder, Position = Position, Printable = Printable, PropertySetInfo = PropertySetInfo, RelativeHeight = RelativeHeight, RelativeHeightRelation = RelativeHeightRelation, RelativeWidth = RelativeWidth, RelativeWidthRelation = RelativeWidthRelation, ShapeType = ShapeType, ShapeUserDefinedAttributes = ShapeUserDefinedAttributes, Size = Size, SizeProtect = SizeProtect, Style = Style, Transformation = Transformation, Visible = Visible, ZOrder = ZOrder, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, dispose = dispose, getControl = getControl, getDirectPropertyValuesTolerant = getDirectPropertyValuesTolerant, getGluePoints = getGluePoints, getPosition = getPosition, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getPropertyValuesTolerant = getPropertyValuesTolerant, getShapeType = getShapeType, getSize = getSize, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setControl = setControl, setPosition = setPosition, setPropertyValue = setPropertyValue, setPropertyValuesTolerant = setPropertyValuesTolerant, setSize = setSize)
  
    __obj.asInstanceOf[ControlShape]
  }
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is for an OLE shape. */
trait OLE2Shape extends Shape {
  /**
    * If you get this property you get the CLSID of the OLE2 document stream contained in this OLE2 shape. If you set it, an empty OLE2 document stream with
    * this CLSID is created within this OLE2 shape.
    */
  var CLSID: java.lang.String
  /** This property returns `TRUE` for all OLE2 that are internal Office components. */
  var IsInternal: scala.Boolean
  /**
    * This is the model for the OLE2 inside this shape.
    *
    * This property returns an empty reference if the OLE2 is not an Office component.
    */
  var Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
  /** this is the internal storage name that keeps this OLE2 persist. */
  var PersistName: java.lang.String
}

object OLE2Shape {
  @scala.inline
  def apply(
    CLSID: java.lang.String,
    GluePoints: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    Hyperlink: java.lang.String,
    InteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    IsInternal: scala.Boolean,
    LayerID: scala.Double,
    LayerName: java.lang.String,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    MoveProtect: scala.Boolean,
    Name: java.lang.String,
    NavigationOrder: scala.Double,
    PersistName: java.lang.String,
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
  ): OLE2Shape = {
    val __obj = js.Dynamic.literal(CLSID = CLSID, GluePoints = GluePoints, Hyperlink = Hyperlink, InteropGrabBag = InteropGrabBag, IsInternal = IsInternal, LayerID = LayerID, LayerName = LayerName, Model = Model, MoveProtect = MoveProtect, Name = Name, NavigationOrder = NavigationOrder, PersistName = PersistName, Position = Position, Printable = Printable, PropertySetInfo = PropertySetInfo, RelativeHeight = RelativeHeight, RelativeHeightRelation = RelativeHeightRelation, RelativeWidth = RelativeWidth, RelativeWidthRelation = RelativeWidthRelation, ShapeType = ShapeType, ShapeUserDefinedAttributes = ShapeUserDefinedAttributes, Size = Size, SizeProtect = SizeProtect, Style = Style, Transformation = Transformation, Visible = Visible, ZOrder = ZOrder, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, dispose = dispose, getDirectPropertyValuesTolerant = getDirectPropertyValuesTolerant, getGluePoints = getGluePoints, getPosition = getPosition, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getPropertyValuesTolerant = getPropertyValuesTolerant, getShapeType = getShapeType, getSize = getSize, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPosition = setPosition, setPropertyValue = setPropertyValue, setPropertyValuesTolerant = setPropertyValuesTolerant, setSize = setSize)
  
    __obj.asInstanceOf[OLE2Shape]
  }
}


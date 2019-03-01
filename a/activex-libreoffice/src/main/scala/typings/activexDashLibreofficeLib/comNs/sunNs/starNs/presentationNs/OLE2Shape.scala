package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is implemented by the OLE2 presentation shape.
  *
  * {@link Presentation} shapes can be used in a presentation page layouts and their position and size is by default set by the presentation shapes on the
  * {@link com.sun.star.drawing.MasterPage} .
  */
trait OLE2Shape
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.OLE2Shape
     with Shape

object OLE2Shape {
  @scala.inline
  def apply(
    Bookmark: java.lang.String,
    CLSID: java.lang.String,
    DimColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    DimHide: scala.Boolean,
    DimPrevious: scala.Boolean,
    Effect: AnimationEffect,
    GluePoints: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    Hyperlink: java.lang.String,
    InteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    IsEmptyPresentationObject: scala.Boolean,
    IsInternal: scala.Boolean,
    IsPresentationObject: scala.Boolean,
    LayerID: scala.Double,
    LayerName: java.lang.String,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    MoveProtect: scala.Boolean,
    Name: java.lang.String,
    NavigationOrder: scala.Double,
    OnClick: ClickAction,
    PersistName: java.lang.String,
    PlayFull: scala.Boolean,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PresentationOrder: scala.Double,
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
    Sound: java.lang.String,
    SoundOn: scala.Boolean,
    Speed: AnimationSpeed,
    Style: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyle,
    TextEffect: AnimationEffect,
    Transformation: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HomogenMatrix3,
    Verb: scala.Double,
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bookmark")(Bookmark)
    __obj.updateDynamic("CLSID")(CLSID)
    __obj.updateDynamic("DimColor")(DimColor)
    __obj.updateDynamic("DimHide")(DimHide)
    __obj.updateDynamic("DimPrevious")(DimPrevious)
    __obj.updateDynamic("Effect")(Effect)
    __obj.updateDynamic("GluePoints")(GluePoints)
    __obj.updateDynamic("Hyperlink")(Hyperlink)
    __obj.updateDynamic("InteropGrabBag")(InteropGrabBag)
    __obj.updateDynamic("IsEmptyPresentationObject")(IsEmptyPresentationObject)
    __obj.updateDynamic("IsInternal")(IsInternal)
    __obj.updateDynamic("IsPresentationObject")(IsPresentationObject)
    __obj.updateDynamic("LayerID")(LayerID)
    __obj.updateDynamic("LayerName")(LayerName)
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("MoveProtect")(MoveProtect)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NavigationOrder")(NavigationOrder)
    __obj.updateDynamic("OnClick")(OnClick)
    __obj.updateDynamic("PersistName")(PersistName)
    __obj.updateDynamic("PlayFull")(PlayFull)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("PresentationOrder")(PresentationOrder)
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
    __obj.updateDynamic("Sound")(Sound)
    __obj.updateDynamic("SoundOn")(SoundOn)
    __obj.updateDynamic("Speed")(Speed)
    __obj.updateDynamic("Style")(Style)
    __obj.updateDynamic("TextEffect")(TextEffect)
    __obj.updateDynamic("Transformation")(Transformation)
    __obj.updateDynamic("Verb")(Verb)
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
    __obj.asInstanceOf[OLE2Shape]
  }
}


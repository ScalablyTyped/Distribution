package typings.activexWia

import typings.activexWia.WIA.CommonDialog
import typings.activexWia.WIA.DeviceManager
import typings.activexWia.WIA.ImageFile
import typings.activexWia.WIA.ImageProcess
import typings.activexWia.WIA.Rational
import typings.activexWia.WIA.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("WIA.CommonDialog")
  var WIADotCommonDialog: CommonDialog
  
  @JSName("WIA.DeviceManager")
  var WIADotDeviceManager: DeviceManager
  
  @JSName("WIA.ImageFile")
  var WIADotImageFile: ImageFile
  
  @JSName("WIA.ImageProcess")
  var WIADotImageProcess: ImageProcess
  
  @JSName("WIA.Rational")
  var WIADotRational: Rational
  
  /** Returns the specified item in the vector by position */
  @JSName("WIA.Vector")
  def WIADotVector(Index: Double): Any
  @JSName("WIA.Vector")
  var WIADotVector_Original: Vector[Any]
}
object ActiveXObjectNameMap {
  
  inline def apply(
    WIADotCommonDialog: CommonDialog,
    WIADotDeviceManager: DeviceManager,
    WIADotImageFile: ImageFile,
    WIADotImageProcess: ImageProcess,
    WIADotRational: Rational,
    WIADotVector: Vector[Any]
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("WIA.CommonDialog")(WIADotCommonDialog.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.DeviceManager")(WIADotDeviceManager.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.ImageFile")(WIADotImageFile.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.ImageProcess")(WIADotImageProcess.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.Rational")(WIADotRational.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.Vector")(WIADotVector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    inline def setWIADotCommonDialog(value: CommonDialog): Self = StObject.set(x, "WIA.CommonDialog", value.asInstanceOf[js.Any])
    
    inline def setWIADotDeviceManager(value: DeviceManager): Self = StObject.set(x, "WIA.DeviceManager", value.asInstanceOf[js.Any])
    
    inline def setWIADotImageFile(value: ImageFile): Self = StObject.set(x, "WIA.ImageFile", value.asInstanceOf[js.Any])
    
    inline def setWIADotImageProcess(value: ImageProcess): Self = StObject.set(x, "WIA.ImageProcess", value.asInstanceOf[js.Any])
    
    inline def setWIADotRational(value: Rational): Self = StObject.set(x, "WIA.Rational", value.asInstanceOf[js.Any])
    
    inline def setWIADotVector(value: Vector[Any]): Self = StObject.set(x, "WIA.Vector", value.asInstanceOf[js.Any])
  }
}
